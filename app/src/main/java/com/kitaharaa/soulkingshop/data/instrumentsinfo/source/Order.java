package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Order {
    @PrimaryKey
    public int orderId;

    public int userId;

    //public ... date;

    public String name;

    public String lastName;

    public String email;
}
