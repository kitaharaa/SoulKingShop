package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Basket;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.BasketItem;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.Category;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.Discount;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.Order;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.OrderItem;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.BasketDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.BasketItemDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.CategoryDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.DiscountDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.OrderDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.OrderItemDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.ProductDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.UserDao;

@Database(entities = {User.class, Category.class, Basket.class,
        BasketItem.class, Product.class, Discount.class,
        Order.class, OrderItem.class}, version = 1)
public abstract class ShopDatabase extends RoomDatabase {
    public abstract UserDao userDao();
    public abstract CategoryDao categoryDao();
    public abstract BasketDao basketDao();
    public abstract BasketItemDao basketItemDao();
    public abstract ProductDao productDao();
    public abstract DiscountDao discountDao();
    public abstract OrderDao orderDao();
    public abstract OrderItemDao orderItem();

    private static ShopDatabase databaseInstance;
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "shop_database";

    public static ShopDatabase getInstance(Context context) {
        if (databaseInstance == null) {
            synchronized (LOCK) {
                databaseInstance = Room.databaseBuilder(context.getApplicationContext(),
                        ShopDatabase.class, ShopDatabase.DATABASE_NAME).allowMainThreadQueries()
                        .build();
            }
        }
        return databaseInstance;
    }
}
