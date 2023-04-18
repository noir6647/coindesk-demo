package org.wits.coindesk.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.wits.coindesk.manager.CoindeskManager;
import org.wits.coindesk.model.dto.generated.CoindeskResponseDTO;

@Service
@RequiredArgsConstructor
public class CoindeskService {

    private final CoindeskManager coindeskManager;

    public CoindeskResponseDTO getCoindeskInfo() throws Exception {

        ObjectMapper Obj = new ObjectMapper();

        return Obj.readValue(coindeskManager.callCoindesk(), CoindeskResponseDTO.class);
    }
}
