package ie.atu.inventoryexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class InventoryExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryExamApplication.class, args);
    }

}
