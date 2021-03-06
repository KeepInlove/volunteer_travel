package yqc.volunteer_travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = "yqc.volunteer_travel")
@EnableCaching
public class VolunteerTravelApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolunteerTravelApplication.class, args);
    }

}
