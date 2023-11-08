package ie.atu.inventoryexam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductController productController){
        this.productService = productService;
    }
    @PostMapping("/product")
    public String addProduct()throws Exception, InterruptedException{
    }
}
