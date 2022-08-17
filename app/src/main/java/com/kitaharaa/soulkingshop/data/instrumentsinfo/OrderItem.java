package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product which was added to order*/
@Entity(tableName = "order_items")
public class OrderItem {
    //ID of item that was added to order
    @PrimaryKey(autoGenerate = true)
    public int orderItemId;

    //ID of order that orderItem belongs to
    public int orderId;

    //ID of product that was added to order
    public int productId;

    //Product quantity
    public int quantity;

    /*Constructor for inserting data*/
    public OrderItem(int orderId, int productId, int quantity) {
        this. orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
