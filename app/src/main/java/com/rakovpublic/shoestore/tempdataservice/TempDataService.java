package com.rakovpublic.shoestore.tempdataservice;


import com.rakovpublic.shoestore.model.Category;
import com.rakovpublic.shoestore.model.Item;
import com.rakovpublic.shoestore.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakovskyi on 18.02.15.
 */
public class TempDataService {
     private static List<Category> categories =new ArrayList<Category>();
     private static List<Item> items = new ArrayList<Item>();
    private static List<Message> messages= new ArrayList<Message>();
    static {
        categories.add(new Category(1,"Winter Shoes","","ic_launcher.png"));
        categories.add(new Category(2,"Summer Shoes","","ic_launcher.png"));
        categories.add(new Category(3,"Autumn Shoes","","ic_launcher.png"));
        categories.add(new Category(4,"Spring Shoes","","ic_launcher.png"));
        items.add(new Item(1,150,"black shoes","simple sfgshd",0,"ic_launcher.png"));
        items.add(new Item(2,350,"black shoes","simple sfgshd",10,"ic_launcher.png"));
        items.add(new Item(3,2450,"black shoes","simple sfgshd",20,"ic_launcher.png"));
        items.add(new Item(4,450,"black shoes","simple sfgshd",30,"ic_launcher.png"));
        items.add(new Item(5,650,"black shoes","simple sfgshd",0,"ic_launcher.png"));
        messages.add(new Message(1,"Registration message","You registered as Jon Doe",false));

    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static List<Item> getItems() {
        return items;
    }

    public static List<Category> getCategories() {
        return categories;
    }
}
