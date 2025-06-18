package com.example.Game_Platform.Time;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {
    
    private final RestTemplate restTemplate = new RestTemplate();

    public Time getTime(String timezone) {
        String url = "https://timeapi.io/api/Time/current/zone?timeZone=" + timezone;
        return restTemplate.getForObject(url, Time.class);
    }
}
