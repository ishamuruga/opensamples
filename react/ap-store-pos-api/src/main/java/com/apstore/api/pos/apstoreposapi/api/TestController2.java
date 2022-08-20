package com.apstore.api.pos.apstoreposapi.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/pos")
public class TestController2 {
    @GetMapping("/all")
    public String allAccess() {
      return "Public Content.";
    }
  
    @GetMapping("/user1")
    public String userAccess() {
      return "User Content.";
    }
  
    @GetMapping("/mod1")
    public String moderatorAccess() {
      return "Moderator Board.";
    }
  
    @GetMapping("/admin1")
    public String adminAccess() {
      return "Admin Board.";
    }
}
