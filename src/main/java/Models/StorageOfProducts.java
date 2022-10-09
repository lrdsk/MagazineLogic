package Models;

import java.util.ArrayList;

public class StorageOfProducts implements AdministratorLogic{
    private ArrayList<Product> productsList;
    @Override
    public void showInfo(){
        if(!productsList.isEmpty()){
            for(Product product: getProductsList()){

            }
        }
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }
    public void addProductInList(Product product){
        productsList.add(product);
    }
}
