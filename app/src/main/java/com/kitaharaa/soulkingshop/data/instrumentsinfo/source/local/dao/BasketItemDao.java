package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.BasketItem;

import java.util.List;

@Dao
public interface BasketItemDao {
    @Query("SELECT * FROM basket_items")
    List<BasketItem> getBasketItemList();

    @Insert
    void insertBasketItem(BasketItem basketItem);

    @Update
    void updateBasketItem(BasketItem basketItem);

    @Delete
    void deleteBasketItem(BasketItem basketItem);
}
