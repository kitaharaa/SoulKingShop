package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product discount and offer time*/
@Entity(tableName = "discounts")
public class Discount {
    //Discount ID
    @PrimaryKey(autoGenerate = true)
    public int discountId;

    //ID of product that has discount
    public int productId;

    //Discount amount
    public int percent;

    //Start of the discount
    public long dateFrom;

    //End of the discount
    public long dateTo;

    /*Constructor for inserting data*/
    public Discount(int productId, int percent,
                    long dateFrom, long dateTo) {
        this.productId = productId;
        this.percent = percent;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}
