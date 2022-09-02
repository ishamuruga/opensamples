package com.company.payment.api.mypaymentapi.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:error.properties")
@ConfigurationProperties(prefix = "mail") 
public class MyErrorConfiguration {
    
    private String hostName; 
    private int port; 
    private String from;


    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;
    private Map<String, String> errordetails;

    
    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }
    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }
    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }
    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }
    public String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public Map<String, String> getErrordetails() {
        return errordetails;
    }
    public void setErrordetails(Map<String, String> errordetails) {
        this.errordetails = errordetails;
    } 

    // @Value("#{${erros.details}}")
    // private Map<String,String> errorPacket;

    // public Map<String, String> getErrorPacket() {
    //     return errorPacket;
    // }

    // public void setErrorPacket(Map<String, String> errorPacket) {
    //     this.errorPacket = errorPacket;
    // }


    
}
