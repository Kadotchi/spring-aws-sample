package kadotchi.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAwsSampleApplication implements ApplicationRunner {

     @Value("${process.type}")
     private String processType;

    public static void main(String[] args) {
        SpringApplication.run(SpringAwsSampleApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(processType);
        System.out.println("Hello World!!");
    }
}
