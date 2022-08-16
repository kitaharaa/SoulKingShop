package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Order details*/
@Entity(tableName = "orders")
public class Order {
    @PrimaryKey(autoGenerate = true)
    public int orderId;

    public int userId;

    public long date;

    public String name;

    public String lastName;

    public String email;

    public Order(int userId, long date, String name,
                 String lastName, String email) {
        this.userId = userId;
        this.date = date;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

}
