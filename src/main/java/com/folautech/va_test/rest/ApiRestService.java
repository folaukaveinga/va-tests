package com.folautech.va_test.rest;

import com.folautech.va_test.dto.RequestRONARequest;
import com.folautech.va_test.dto.RequestRONAResponse;

public interface ApiRestService {

    RequestRONAResponse createRonabRequest(RequestRONARequest requestRONARequest);

}
