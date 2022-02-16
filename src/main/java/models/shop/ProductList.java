package models.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> addedProducts;

    public ProductList(){
        addedProducts =new ArrayList<>();
    }

    public void addProduct(Product product){
        addedProducts.add(product);
    }
    public boolean productAlreadyIn(Product product){
        if(addedProducts.isEmpty()){
            return false;
        }
        for (Product added: addedProducts)
            if (added.getProductName().equals(product.getProductName()))
                return true;
        return false;
    }

    public void increaseQuantity(Product product) {
        for(Product added: addedProducts){
            if(added.getProductName().equals(product.getProductName())){
                added.increaseAmount(product);
            }
        }
    }


    public List<Product> getAddedProducts() {
        return addedProducts;
    }
}