package com.example.Game_Platform.Time;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// @Service
// public class TimeService {
    
//     private final RestTemplate restTemplate = new RestTemplate();

//     public Time getTime(String timezone) {
//         String url = "https://timeapi.io/api/Time/current/zone?timeZone=" + timezone;
//         return restTemplate.getForObject(url, Time.class);
    
//     }
// }
@Service
public class TimeService {
    
    private final RestTemplate restTemplate = new RestTemplate();

    public Time getTime(String timezone) {
        // Disabled actual API call to prevent slowing down the app
        // String url = "https://timeapi.io/api/Time/current/zone?timeZone=" + timezone;
        // return restTemplate.getForObject(url, Time.class);
        // Return mock data
        Time mockTime = new Time();
        mockTime.setHour(0);
        mockTime.setMinute(0);
        mockTime.setSeconds(0);
        return mockTime;
    }
}