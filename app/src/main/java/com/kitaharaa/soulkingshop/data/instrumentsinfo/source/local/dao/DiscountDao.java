package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Discount;

import java.util.List;

@Dao
public interface DiscountDao {
    @Query("SELECT * FROM discounts")
    List<Discount> getDiscountList();

    @Insert
    void insertDiscount(Discount discount);

    @Update
    void updateDiscount(Discount discount);

    @Delete
    void deleteDiscount(Discount discount);
}
