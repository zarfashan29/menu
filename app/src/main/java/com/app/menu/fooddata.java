package com.app.menu;

public class fooddata {
    private String itemTitle;
    private String itemDescription;
    private String itemPrice;
    private int itemImage;



    public fooddata(String itemTitle, String itemDescription, String itemPrice, int itemImage) {
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;

    }

    public fooddata() {

    }

    public String getItemTitle()
    {
        return itemTitle;
    }

    public String getItemDescription()
    {
        return itemDescription;
    }

    public String getItemPrice()
    {
        return itemPrice;
    }

    public int getItemImage()
    {
        return itemImage;
    }
}

