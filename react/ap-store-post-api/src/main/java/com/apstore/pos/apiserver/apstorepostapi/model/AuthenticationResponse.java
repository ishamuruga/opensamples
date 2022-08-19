package com.apstore.pos.apiserver.apstorepostapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class AuthenticationResponse {
    private String token;
}
