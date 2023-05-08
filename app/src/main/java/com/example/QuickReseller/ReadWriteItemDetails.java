package com.example.QuickReseller;

public class ReadWriteItemDetails {
    public   String name,description,price,Image_url,mobile,date;

    public ReadWriteItemDetails(String name, String description, String price, String image_url, String mobile,String date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.Image_url = image_url;
        this.mobile = mobile;
        this.date=date;
    }
    public ReadWriteItemDetails(){

    }
}
