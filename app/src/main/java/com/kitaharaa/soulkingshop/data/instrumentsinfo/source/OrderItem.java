package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product which was added to order*/
@Entity
public class OrderItem {
    @PrimaryKey
    public int orderItemId;

    public int orderId;

    public int productId;

    public int quantity;
}
