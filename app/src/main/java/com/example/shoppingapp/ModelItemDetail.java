package com.example.shoppingapp;

public class ModelItemDetail {
    String name,discount,firstPrice,price,sold;
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

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setFirstPrice(String firstPrice) {
        this.firstPrice = firstPrice;
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

    public String getDiscount() {
        return discount;
    }

    public String getFirstPrice() {
        return firstPrice;
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

    public ModelItemDetail(String name, String discount, String firstPrice,
                           String price, String sold, int img, int imgstar){
        this.name = name;
        this.discount = discount;
        this.firstPrice = firstPrice;
        this.price  = price;
        this.sold = sold;
        this.img = img;
        this.imgstar = imgstar;
    }
    public ModelItemDetail(){}

}
