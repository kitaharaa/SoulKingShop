package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.kitaharaa.soulkingshop.App;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Basket;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Category;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Discount;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Order;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.OrderItem;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.UserProductLike;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.UserProductView;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.BasketDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.CategoryDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.DiscountDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.OrderDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.OrderItemDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.ProductDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.UserDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.UserProductLikeDao;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.dao.UserProductViewDao;

@Database(entities = {User.class, Category.class, Basket.class,
        UserProductView.class, UserProductLike.class,
        Product.class, Discount.class, Order.class,
        OrderItem.class}, version = 1)
public abstract class ShopDatabase extends RoomDatabase {
    public abstract UserDao userDao();
    public abstract CategoryDao categoryDao();
    public abstract BasketDao basketDao();
    public abstract UserProductViewDao userProductViewDao();
    public abstract UserProductLikeDao userProductLikeDao();
    public abstract ProductDao productDao();
    public abstract DiscountDao discountDao();
    public abstract OrderDao orderDao();
    public abstract OrderItemDao orderItem();

    private static ShopDatabase sInstance;

    public static ShopDatabase getInstance() {
        if (sInstance == null) {
            sInstance = Room.databaseBuilder(App.getInstance(), ShopDatabase.class, "ShopDatabase.db").build();
        }
        return sInstance;
    }
}
