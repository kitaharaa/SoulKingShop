package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product discount and offer time*/
@Entity(tableName = "discounts")
public class Discount {
    @PrimaryKey(autoGenerate = true)
    public int discountId;

    public int productId;

    public int percent;

    public long dateFrom;

    public long dateTo;

    public Discount(int productId, int percent,
                    long dateFrom, long dateTo) {
        this.productId = productId;
        this.percent = percent;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}
