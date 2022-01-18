package com.mycompany.api.mycompanyapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    
    @Value("${server.name}")
    private String servername;

    @Value("${app.name}")
    private String appname;


    public String getServername() {
        return servername;
    }
    public void setServername(String servername) {
        this.servername = servername;
    }
    public String getAppname() {
        return appname;
    }
    public void setAppname(String appname) {
        this.appname = appname;
    }

    
}
