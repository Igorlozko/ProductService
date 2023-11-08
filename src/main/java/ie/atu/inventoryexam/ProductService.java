package ie.atu.inventoryexam;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductClient productClient;
    public ProductService(ProductClient productClient){
        this.productclient = productClient;
    }

    public Productdetails adddata(){
        ProductDetails pd = ProductDetais.fetchdata();

    }



}
