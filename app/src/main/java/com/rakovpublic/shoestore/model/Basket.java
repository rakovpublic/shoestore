package com.rakovpublic.shoestore.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rakovskyi on 18.02.15.
 */
public class Basket {


    private Map<Item,Integer> items;
    private static Basket basket=null;
    private String comments;
    private Basket() {
        comments="";
        items= new HashMap<Item, Integer>();
    }

    public void addItemToBasket(Item item, int amount){
        items.put(item,amount);
    }
    public Basket getBasket(){
        if(basket ==null){
            basket= new Basket();
        }
        return  basket;
    }
    public Map <Item, Integer> getItemsInBasket(){
        return this.items;
    }
    public void clearBasket(){
        comments="";
        items.clear();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
