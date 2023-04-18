package org.wits.coindesk.service;

import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.wits.coindesk.dao.CurrencyDAO;
import org.wits.coindesk.manager.CoindeskManager;
import org.wits.coindesk.model.dto.entity.CurrencyEntity;
import org.wits.coindesk.model.dto.generated.BpiDTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BpiService {

    private final CoindeskManager coindeskManager;
    private final CurrencyDAO currencyDAO;

    public List<BpiDTO> getBpiInfo() throws Exception {

        JSONObject jsonObject = new JSONObject(coindeskManager.callCoindesk());
        Map<String, Object> bpiMap = jsonObject.getJSONObject("bpi").toMap();
        JSONObject timeMap = jsonObject.getJSONObject("time");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        List<BpiDTO> bpiDTOList = new ArrayList<>();

        bpiMap.forEach((k, v) -> {
            HashMap<String, String> value = (HashMap<String, String>) bpiMap.get(k);
            CurrencyEntity currencyEntity = currencyDAO.findByCode(k).get();
            bpiDTOList.add(
                new BpiDTO()
                    .code(k)
                    .nameCht(currencyEntity.getNameCht())
                    .rate(value.get("rate"))
                    .description(value.get("description"))
                    .updatedTimestamp(
                        LocalDateTime.parse(timeMap.get("updatedISO").toString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME).format(formatter)));
        });

        return bpiDTOList;
    }
}
