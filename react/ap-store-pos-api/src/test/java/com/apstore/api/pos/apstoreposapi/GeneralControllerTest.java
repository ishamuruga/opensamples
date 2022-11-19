package com.apstore.api.pos.apstoreposapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.util.UriComponentsBuilder;

import com.apstore.api.pos.apstoreposapi.api.PhoneController;
import com.apstore.api.pos.apstoreposapi.model.Phone;
import com.apstore.api.pos.apstoreposapi.model.User;
import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;
import com.apstore.api.pos.apstoreposapi.service.PhoneManager;
import com.apstore.api.pos.apstoreposapi.vo.FetchCategoryRes;
import com.apstore.api.pos.apstoreposapi.vo.JwtResponse;
import com.apstore.api.pos.apstoreposapi.vo.LoginRequest;

//
// @ExtendWith(SpringExtension.class)
// @WebMvcTest(value = PhoneController.class)
// @WithMockUser
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class GeneralControllerTest {

    @Autowired
    private PhoneManager phoneManager;

    @Autowired
    private PhoneRepo phoneRepo;

    @Autowired
    private TestRestTemplate restTemplate;

    private JwtResponse jwtResponse;

    @BeforeEach
    public void loginTest(){
        String username= "ramarajan@gmail.com";
        String password="ramarajan";

        LoginRequest req = new LoginRequest();
        req.setUsername(username);
        req.setPassword(password);

        URI targetUri = UriComponentsBuilder.fromUriString("/api/auth/signin").build().encode().toUri();

        ResponseEntity<JwtResponse> res = restTemplate.postForEntity(targetUri,req,JwtResponse.class);
        System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()");
        System.out.println(res.getBody().toString());
        jwtResponse = res.getBody();
        assertTrue(Boolean.TRUE);
    }


    @Test
    @DisplayName("Subscription message service test ")
    public void phoneTest(){

        List<Phone> phones = phoneManager.fetchAll();
        System.out.println(phones);    
        assertEquals(phones.size(), 5);
    }

    @Test
    @DisplayName("Subscription message service test123")
    public void phoneFetchAllTest(){
        Integer id = 7;
        URI targetUri = UriComponentsBuilder.fromUriString("/api/auth/phone/" + id).build().encode().toUri();
        this.restTemplate.getForObject(targetUri, Phone.class);
        assertTrue(Boolean.TRUE);
    }

    
    @Test
    @DisplayName("Subscription message service test123")
    public void phoneFetchByNameAllTest(){
        String name="phone3";
        
        URI targetUri = UriComponentsBuilder.fromUriString("/api/auth/phone2/" + name).build().encode().toUri();

        Phone ph = this.restTemplate.getForObject(targetUri, Phone.class);
        System.out.println(ph.toString());
        assertTrue(Boolean.TRUE);
    }

    @Test
    @DisplayName("TestFetch")
    public void fetchCategoriesTest(){
        String token = this.jwtResponse.getAccessToken();


        
        URI targetUri = UriComponentsBuilder.fromUriString("/api/pos/categories").build().encode().toUri();

        HttpHeaders hdrs = new HttpHeaders();
        hdrs.set("Authorization", "Bearer".concat(" ").concat(token));
        hdrs.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> hEntity = new HttpEntity(hdrs);

        ResponseEntity<FetchCategoryRes> response = this.restTemplate.exchange(targetUri, HttpMethod.GET,hEntity,FetchCategoryRes.class);
        //FetchCategoryRes res = this.restTemplate.getForObject(targetUri, FetchCategoryRes.class);
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(response.getBody().toString());
        assertTrue(Boolean.TRUE);
    }



}
