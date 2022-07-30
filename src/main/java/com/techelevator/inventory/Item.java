package com.techelevator.inventory;

import java.math.BigDecimal;

public abstract class Item {

    private BigDecimal price;
    private String name;
    private String itemTypeMessage;
    private String slotLocation;
    private String itemType;

    //constructor
    public Item(String slotLocation, String itemTypeMessage){
        this.slotLocation = slotLocation;
        this.itemTypeMessage = itemTypeMessage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getItemTypeMessage() {
        return itemTypeMessage;
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

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
