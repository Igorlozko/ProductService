package ie.atu.inventoryexam;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductClient productClient;
    public ProductService(ProductClient, productClient){
        this.productClient = productClient;
    }

    public TodoProduct addData(){
        TodoProduct td = productClient.addData();
        System.out.println(td);
        try{
            Thread.sleep(2000);
        }Catch (InterruptedException e){
            e.printStackTrace();
        }
        return td
    }
}
