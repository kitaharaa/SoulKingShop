package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product details*/
@Entity(tableName = "products")
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int productId;

    public int categoryId;

    public String name;

    public float price;

    public String description;

    public String productCountry;

    public String color;

    public String material;

    public double year;

    public byte[] photo;

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
