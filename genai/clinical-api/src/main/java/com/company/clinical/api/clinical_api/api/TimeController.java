package com.company.clinical.api.clinical_api.api;

import java.util.Calendar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.clinical.api.clinical_api.dtos.TimeResponse;

@RestController
@RequestMapping("/api/time")
public class TimeController {
    
    @RequestMapping("/current")
    public ResponseEntity<TimeResponse> getCurrentTime() {
        TimeResponse timeResponse = new TimeResponse();
        String date = Calendar.getInstance().getTime().toString();
        timeResponse.setValue(date);
        // timeResponse.setValue(String.valueOf(System.currentTimeMillis()));
        System.out.println(timeResponse);
        return ResponseEntity.ok(timeResponse);
    }

}
