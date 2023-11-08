package ie.atu.inventoryexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductController productController){
        this.productService = productService;
    }
    @PostMapping("/product")
    public String addProduct(@RequestBody ProductDetails productDetails){
        String confirm =productDetails.postDetails(productDetails);
        List<CompletableFuture<ProductDetails>>future = Complet
                String response = confirm ="" + productDetails;
                return response;

    }
    @GetMapping("/products-id")
    public String getProductById()throws Exception, InterruptedException{
        List<CompletableFuture<ProductDetails>>future = new ArrayList<>();
        CompletableFuture.supplyAsync(()->productService addData());
        futures.add(future);
        }
        CompletableFuture<Void>allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture([0]));
        allOf.get();
        return futures;

}
