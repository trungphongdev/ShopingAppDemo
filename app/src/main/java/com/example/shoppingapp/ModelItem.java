package com.example.shoppingapp;

public class ModelItem {
    String name,price,sold;
    int img,imgstar;

    public int getImgstar() {
        return imgstar;
    }

    public void setImgstar(int imgstar) {
        this.imgstar = imgstar;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }


    public String getPrice() {
        return price;
    }

    public String getSold() {
        return sold;
    }

    public int getImg() {
        return img;
    }

    public ModelItem(String name,
                     String price, String sold, int img, int imgstar){
        this.name = name;

        this.price  = price;
        this.sold = sold;
        this.img = img;
        this.imgstar = imgstar;
    }
    public ModelItem(){}

}
