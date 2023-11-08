package ie.atu.inventoryexam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name ="Product-service", url ="http/localhost:8080")
public interface ProductClient {
    @PostMapping("/product")
    ProductDetails addProduct(@RequestBody ProductDetails productDetails);
    @GetMapping("/products-id")
    ProductDetails getProduct(@RequestBody ProductDetails productDetails);
}
