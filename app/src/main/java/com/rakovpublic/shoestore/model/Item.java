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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (discountItem != item.discountItem) return false;
        if (idItem != item.idItem) return false;
        if (Double.compare(item.priceItem, priceItem) != 0) return false;
        if (descriptionItem != null ? !descriptionItem.equals(item.descriptionItem) : item.descriptionItem != null)
            return false;
        if (imageItem != null ? !imageItem.equals(item.imageItem) : item.imageItem != null)
            return false;
        if (nameItem != null ? !nameItem.equals(item.nameItem) : item.nameItem != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idItem;
        temp = Double.doubleToLongBits(priceItem);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (nameItem != null ? nameItem.hashCode() : 0);
        result = 31 * result + (descriptionItem != null ? descriptionItem.hashCode() : 0);
        result = 31 * result + (imageItem != null ? imageItem.hashCode() : 0);
        result = 31 * result + discountItem;
        return result;
    }
}
