package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.OrderItem;

import java.util.List;

@Dao
public interface OrderItemDao {
    @Query("SELECT * FROM order_items")
    List<OrderItem> getOrderItemList();

    @Insert
    void insertOrderItem(OrderItem orderItem);

    @Update
    void updateOrderItem(OrderItem orderItem);

    @Delete
    void deleteOrderItem(OrderItem orderItem);
}
