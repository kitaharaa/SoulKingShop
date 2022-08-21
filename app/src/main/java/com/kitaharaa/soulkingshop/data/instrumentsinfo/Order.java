package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Order details*/
@Entity(tableName = "orders")
public class Order {
    //Order ID
    @PrimaryKey(autoGenerate = true)
    public int orderId;

    //ID of user who made order
    public int userId;

    //Order date
    public long date;

    //Name of customer
    public String name;

    //Last name of customer
    public String lastName;

    //Customer email
    public String email;

    /*Constructor for inserting data*/
    public Order(int userId, long date, String name,
                 String lastName, String email) {
        this.userId = userId;
        this.date = date;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

}
