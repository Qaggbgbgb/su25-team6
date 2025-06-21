import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
    @Bean
    public RestTemplate newTemplate(){
        return new RestTemplate();
    }
}
