package org.wits.coindesk.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.wits.coindesk.dao.CurrencyDAO;
import org.wits.coindesk.model.dto.entity.CurrencyEntity;
import org.wits.coindesk.model.dto.generated.CurrencyCreateRequestDTO;
import org.wits.coindesk.model.dto.generated.CurrencyDTO;
import org.wits.coindesk.model.dto.generated.CurrencyUpdateRequestDTO;
import org.wits.coindesk.utils.TimeUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyDAO currencyDAO;

    public void createCurrency(CurrencyCreateRequestDTO currencyCreateRequestDTO) {
        CurrencyEntity currencyEntity = new CurrencyEntity();

        currencyEntity.setCode(currencyCreateRequestDTO.getCode());
        currencyEntity.setNameCht(currencyCreateRequestDTO.getNameCht());

        currencyDAO.save(currencyEntity);
    }

    public CurrencyDTO updateCurrency(String code, CurrencyUpdateRequestDTO currencyUpdateRequestDTO) throws Exception {
        CurrencyEntity currencyEntity = currencyDAO.findByCode(code)
            .orElseThrow(() -> new Exception("Bad Request"));

        currencyEntity.setNameCht(currencyUpdateRequestDTO.getNameCht());

        currencyEntity = currencyDAO.save(currencyEntity);

        CurrencyDTO currencyDTO = new CurrencyDTO();
        currencyDTO
            .oid(currencyEntity.getOid())
            .code(currencyEntity.getCode())
            .nameCht(currencyEntity.getNameCht())
            .createdTimestamp(TimeUtils.toUTCMilliseconds(currencyEntity.getCreatedTimestamp()))
            .updatedTimestamp(TimeUtils.toUTCMilliseconds(currencyEntity.getUpdatedTimestamp()));

        return currencyDTO;
    }

    public CurrencyDTO getCurrency(String code) {
        CurrencyEntity currencyEntity = currencyDAO.findByCode(code).get();

        if (currencyEntity != null) {
            return new CurrencyDTO()
                .oid(currencyEntity.getOid())
                .code(currencyEntity.getCode())
                .nameCht(currencyEntity.getNameCht())
                .createdTimestamp(TimeUtils.toUTCMilliseconds(currencyEntity.getCreatedTimestamp()))
                .updatedTimestamp(TimeUtils.toUTCMilliseconds(currencyEntity.getUpdatedTimestamp()));
        } else {
            return new CurrencyDTO();
        }
    }

    public List<CurrencyDTO> getAllCurrency() {

        List<CurrencyEntity> currencyEntityList = currencyDAO.findAll();

        List<CurrencyDTO> currencyDTOList = currencyEntityList.stream().map(
            currencyEntity -> new CurrencyDTO()
                .oid(currencyEntity.getOid())
                .code(currencyEntity.getCode())
                .nameCht(currencyEntity.getNameCht())
                .createdTimestamp(TimeUtils.toUTCMilliseconds(currencyEntity.getCreatedTimestamp()))
                .updatedTimestamp(TimeUtils.toUTCMilliseconds(currencyEntity.getUpdatedTimestamp()))
        ).collect(Collectors.toList());

        return currencyDTOList;
    }

    public void deleteCurrency(String code) {
        currencyDAO.deleteByCode(code);
    }
}
