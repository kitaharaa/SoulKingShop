package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Basket;

import java.util.List;

@Dao
public interface BasketDao {
    @Query("SELECT * FROM baskets")
    List<Basket> getBasketList();

    @Insert
    void insertBasket(Basket basket);

    @Update
    void updateBasket(Basket basket);

    @Delete
    void deleteBasket(Basket basket);
}
