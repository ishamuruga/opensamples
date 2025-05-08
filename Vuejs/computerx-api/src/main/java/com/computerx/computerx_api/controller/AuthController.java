package com.computerx.computerx_api.controller;

import java.util.Calendar;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computerx.computerx_api.dto.LoginRequest;
import com.computerx.computerx_api.dto.LoginResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin
public class AuthController extends BaseController {

    @PostMapping
    public ResponseEntity<LoginResponse> doLogin(@Valid @RequestBody LoginRequest req) {

        LoginResponse res = new LoginResponse();
        res.setTs(Calendar.getInstance());
        res.setEmail(req.getEmail());
        res.setStatus("200");

        if (req.getEmail().equals("admin@gmail.com")) {
            res.setAccessToken(UUID.randomUUID() + "");
            res.setRefreshToken(UUID.randomUUID() + "");

            res.setRoles(new String[] { "Admin", "Employee" });
            res.setStatus("200");
        } else if (req.getEmail().equals("user@gmail.com")) {
            res.setStatus("400");
        } else if (req.getEmail().equals("abcd@gmail.com")) {
            res.setStatus("500");
        }

        if (res.getStatus().equals("200")) {
            return new ResponseEntity<LoginResponse>(res, HttpStatus.OK);
        } else if (res.getStatus().equals("400")) {
            return new ResponseEntity<LoginResponse>(res, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<LoginResponse>(res, HttpStatus.BAD_GATEWAY);
        }

    }
}
