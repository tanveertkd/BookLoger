package com.example.baseplate.booklog.data;

import android.provider.BaseColumns;

public final class ContractHelper {
    private ContractHelper(){}

    public static final class BookEntry implements BaseColumns{
        public static final String TABLE_NAME = "booklog";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_BOOK_NAME = "product_name";
        public static final String COLUMN_BOOK_PRICE = "price";
        public static final String COLUMN_BOOK_QUANTITY = "quantity";
        public static final String COLUMN_BOOK_SUPPLIER_NAME = "supplier_name";
        public static final String COLUMN_BOOK_SUPPLIER_CONT_NO = "supplier_phone";
    }
}
