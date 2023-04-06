package org.example;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{
    private final List<HotDrink> products;
    public HotDrinksVendingMachine(List<HotDrink> products) {
        this.products = products;
    }



    @Override
    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for(HotDrink product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && product.getVolume() == volume
                        && product.getTemperature() == temperature){
                    return product;
                }
            }

        }
        throw new IllegalStateException("Такой продукт не найден.");
    }
}
