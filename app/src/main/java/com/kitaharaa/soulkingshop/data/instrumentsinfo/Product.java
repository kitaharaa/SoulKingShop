package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product details*/
@Entity(tableName = "products")
public class Product {
    //ID of product
    @PrimaryKey(autoGenerate = true)
    public int productId;

    //ID of category that product belongs to
    public int categoryId;

    //Product name
    public String name;

    //Product price
    public float price;

    //Product description
    public String description;

    //Country that product is from
    public String productCountry;

    //Product color
    public String color;

    //Product material
    public String material;

    //Year of manufacture
    public double year;

    //Product photo
    public byte[] photo;

    /*Constructor for inserting data*/
    public Product(int categoryId, String name,
                   float price, String description,
                   String productCountry, String color,
                   String material, double year, byte[] photo) {
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.productCountry = productCountry;
        this.color = color;
        this.material = material;
        this.year = year;
        this.photo = photo;
    }

}
