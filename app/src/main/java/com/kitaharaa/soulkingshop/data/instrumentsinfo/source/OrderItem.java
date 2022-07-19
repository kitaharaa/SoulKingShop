package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class OrderItem {
    @PrimaryKey
    public int orderItem;

    public int orderId;

    public int productId;

    public int quantity;
}
