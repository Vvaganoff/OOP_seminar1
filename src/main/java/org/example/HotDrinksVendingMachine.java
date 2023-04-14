package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class HotDrinksVendingMachine implements VendingMachine, Iterable<HotDrink> {
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

    @Override
    public Iterator<HotDrink> iterator() {
        Iterator<HotDrink> it = new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < products.size();
            }

            @Override
            public HotDrink next() {
                return products.get(index++);
            }

        };
        return it;
    }

    @Override
    public void forEach(Consumer<? super HotDrink> action) {
        Iterable.super.forEach(action);
    }
}
