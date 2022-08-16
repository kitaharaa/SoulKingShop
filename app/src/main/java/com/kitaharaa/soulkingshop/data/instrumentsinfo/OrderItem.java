package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product which was added to order*/
@Entity(tableName = "order_items")
public class OrderItem {
    @PrimaryKey(autoGenerate = true)
    public int orderItemId;

    public int orderId;

    public int productId;

    public int quantity;

    public OrderItem(int orderId, int productId, int quantity) {
        this. orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
