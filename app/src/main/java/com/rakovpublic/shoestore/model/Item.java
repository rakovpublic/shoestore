package com.rakovpublic.shoestore.model;

/**
 * Created by rakovskyi on 18.02.15.
 */
public class Item {
    private int idItem;
    private double priceItem;
    private String nameItem;
    private String descriptionItem;
    private String imageItem;
    private int discountItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Item(int idItem, double priceItem, String nameItem, String descriptionItem, int discountItem,String imageItem) {
        this.idItem = idItem;
        this.priceItem = priceItem;
        this.nameItem = nameItem;
        this.descriptionItem = descriptionItem;
        this.discountItem = discountItem;
        this.imageItem= imageItem;
    }

    public Item() {

    }

    public String getImageItem() {
        return imageItem;
    }

    public void setImageItem(String imageItem) {
        this.imageItem = imageItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public int getDiscountItem() {
        return discountItem;
    }

    public void setDiscountItem(int discountItem) {
        this.discountItem = discountItem;
    }
    public int getPriceWithDiscount(){
        return (int)(priceItem - ((priceItem/100)*discountItem));
    }
}
