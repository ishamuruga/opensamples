// package com.apstore.api.pos.apstoreposapi;


// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// import java.util.Arrays;
// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.web.servlet.MockMvc;

// import com.apstore.api.pos.apstoreposapi.api.PhoneController;
// import com.apstore.api.pos.apstoreposapi.model.Phone;
// import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;
// import com.apstore.api.pos.apstoreposapi.service.PhoneManager;

// @ExtendWith(SpringExtension.class)
// //@WebMvcTest(PhoneController.class)
// @SpringBootTest
// @AutoConfigureMockMvc
// @ComponentScan(basePackages = {"com.apstore.api.pos.apstoreposapi"})
// public class PhoneControllerTest {
    
//     @Autowired
//     MockMvc mockMvc;

//     @MockBean
//     private PhoneManager phoneManager;

//     // @MockBean
//     // private PhoneRepo phoneRepo;

//     // @InjectMocks
//     // private PhoneController phoneController;

//     @Test
//     public void test() throws Exception{

//         Phone p1 = new Phone(1,"p1");
//         Phone p2 = new Phone(2,"p2");
//         Phone p3 = new Phone(3,"p3");

//         List<Phone> phones = Arrays.asList(p1,p2,p3);

//         Mockito.when(phoneManager.fetchAll()).thenReturn(phones);

//         mockMvc.perform(get("/api/auth/phones")).andExpect(status().isOk());

//     }
    
// }
