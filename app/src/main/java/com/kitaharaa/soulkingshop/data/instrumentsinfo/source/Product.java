package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Product {
    @PrimaryKey
    public int productId;

    public int categoryId;

    public String name;

    public float price;

    public String description;

    public String productCountry;

    public String color;

    public String material;

    //public ... year;

    public byte photo;


}
