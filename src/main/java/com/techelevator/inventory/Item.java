package com.techelevator.inventory;

import java.math.BigDecimal;

public abstract class Item {

    private BigDecimal price;
    private String name;
    private String description;
    private String slotLocation;
    private String itemType;

    //constructor
    public Item(String slotLocation){
        this.slotLocation = slotLocation;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSlotLocation() {
        return slotLocation;
    }

    public String getItemType() {
        return itemType;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
