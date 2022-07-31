package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product discount and offer time*/
@Entity
public class Discount {
    @PrimaryKey
    public int discountId;

    public int productId;

    public int percent;

    public long dateFrom;

    public long dateTo;
}
