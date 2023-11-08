package ie.atu.inventoryexam;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AckMsg {
    public String ackMsg(ProductDetails productDetails){
        String message ="Thank you";
        return message;
    }
}
