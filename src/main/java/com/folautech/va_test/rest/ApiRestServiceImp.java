package com.folautech.va_test.rest;

import com.folautech.va_test.dto.RequestRONARequest;
import com.folautech.va_test.dto.RequestRONAResponse;
import com.folautech.va_test.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class ApiRestServiceImp implements ApiRestService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RequestRONAResponse createRonabRequest(RequestRONARequest requestRONARequest) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("token", EnvironmentParam.jwtToken);

        HttpEntity<String> entity = new HttpEntity<>(ObjectUtils.toJson(requestRONARequest), headers);

        Map<String, String> pathVariables = new HashMap<String, String>();

        String url = UriComponentsBuilder
                .fromHttpUrl(EnvironmentParam.getApiUrl()+"/ronabapi/processRonaRequest")
                .buildAndExpand(pathVariables).toUriString();

        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<RequestRONAResponse> response = null;
        RequestRONAResponse requestRONAB = null;
        try {

            response =
                    restTemplate.exchange(new URI(url), HttpMethod.POST, entity, RequestRONAResponse.class);

            requestRONAB = response.getBody();

            // log.info("authResponse: {}", ObjectUtils.toJson(authResponse));
        } catch (Exception e) {
            log.warn("Exception, msg: {}", e.getMessage());
            log.warn(ObjectUtils.toJson(response));
        }

        return requestRONAB;
    }
}
