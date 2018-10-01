package com.sample.common.icecreams;

public class StrawberryIceCream implements IceCream {

    private Long price;
    private Integer calories;

    public StrawberryIceCream(Long price, Integer calories){
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String getIceCreamName() {
        return IceCreamCategory.STRAWBERRY_ICECREAM;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public Integer getCalories() {
        return calories;
    }
}
