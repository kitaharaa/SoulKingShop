package com.kitaharaa.soulkingshop.data;

import com.kitaharaa.soulkingshop.App;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.local.database.ShopDatabase;

public class DataSource {
    private static ShopDatabase database;

    public DataSource() {
        database = ShopDatabase.getInstance(App.getInstance());
    }
}
