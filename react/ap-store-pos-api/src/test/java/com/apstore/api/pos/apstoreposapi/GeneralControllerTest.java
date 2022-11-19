package com.apstore.api.pos.apstoreposapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.apstore.api.pos.apstoreposapi.api.PhoneController;
import com.apstore.api.pos.apstoreposapi.model.Phone;
import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;
import com.apstore.api.pos.apstoreposapi.service.PhoneManager;

//
// @ExtendWith(SpringExtension.class)
// @WebMvcTest(value = PhoneController.class)
// @WithMockUser
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GeneralControllerTest {

    @Autowired
    private PhoneManager phoneManager;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("Subscription message service test ")
    public void phoneTest(){

        List<Phone> phones = phoneManager.fetchAll();

        System.out.println("#####################################################");
        assertEquals(phones.size(), 5);
    }

    //public void 

}
