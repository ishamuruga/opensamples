package com.apstore.api.pos.apstoreposapi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.apstore.api.pos.apstoreposapi.api.PhoneController;
import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = PhoneController.class)
@WithMockUser
public class PhoneControllerTests {

    @Autowired
	private MockMvc mockMvc;

    @Autowired
    private PhoneRepo phoneRepo;

    public void phoneTest(){
        System.out.println("i am from Tests...");
        assertTrue(Boolean.TRUE);
    }
}
