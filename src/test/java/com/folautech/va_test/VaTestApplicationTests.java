package com.folautech.va_test;

import com.folautech.va_test.dto.RequestRONARequest;
import com.folautech.va_test.rest.ApiRestService;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VaTestApplicationTests {

	@Autowired
	private ApiRestService apiRestService;

	private Faker faker = new Faker();

	@Test
	void contextLoads() {
		Address fakeAddress = faker.address();
		RequestRONARequest requestRONARequest = new RequestRONARequest();
		requestRONARequest.setAddressLineOne(fakeAddress.streetAddress());
		requestRONARequest.setAddressCity(fakeAddress.city());
		requestRONARequest.setAddressState(fakeAddress.state());
		requestRONARequest.setAddressZipcode(fakeAddress.zipCode());
		requestRONARequest.setAddressCountry(fakeAddress.country());
		requestRONARequest.setRequesterName(faker.name().firstName());


		apiRestService.createRonabRequest(requestRONARequest);
	}

}
