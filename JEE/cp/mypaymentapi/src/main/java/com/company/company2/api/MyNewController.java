package com.company.company2.api;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class MyNewController {
    @GetMapping(value = "/init")
    public ResponseEntity<String> getNames(){
        String[] names = {"name4","name7","name9"};

        String res = Arrays.toString(names);

        return new ResponseEntity<String>(res,HttpStatus.OK);
    }
}
