package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product category*/
@Entity(tableName = "categories")
public class Category {
    @PrimaryKey(autoGenerate = true)
    public int categoryId;

    public String name;

    public byte[] picture;

    public Category(String name, byte[] picture) {
        this.name = name;
        this.picture = picture;
    }
}
