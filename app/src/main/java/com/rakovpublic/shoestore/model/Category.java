package com.rakovpublic.shoestore.model;

import java.io.Serializable;

/**
 * Created by rakovskyi on 18.02.15.
 */

public class Category implements Serializable{
    private int idCategory;
    private String nameCategory;
    private String descriptionCategory;
    public Category(){

    }
    public Category(int idCategory, String nameCategory, String descriptionCategory, String pathToImageCategroy) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.descriptionCategory = descriptionCategory;
        this.pathToImageCategroy = pathToImageCategroy;
    }

    private String pathToImageCategroy;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }

    public String getPathToImageCategroy() {
        return pathToImageCategroy;
    }

    public void setPathToImageCategroy(String pathToImageCategroy) {
        this.pathToImageCategroy = pathToImageCategroy;
    }
}
