import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ThirdPartyApiService {

    private final RestTemplate restTemplate;

    public ThirdPartyApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchDataFromThirdPartyApi() {
        String apiUrl = "https://sandbox.paypal.com"; // Replace with your API URL
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
