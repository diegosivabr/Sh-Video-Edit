package com.tec.videoedit.audiocutter.util;

import android.database.Cursor;

public class ContentUtill {
    public static String getLong(Cursor cursor) {
        return String.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
    }
}
