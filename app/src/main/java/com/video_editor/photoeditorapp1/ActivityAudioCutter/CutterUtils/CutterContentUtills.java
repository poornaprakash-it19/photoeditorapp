package com.video_editor.photoeditorapp1.ActivityAudioCutter.CutterUtils;

import android.database.Cursor;

public class CutterContentUtills {
    public static String getLong(Cursor cursor) {
        return String.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
    }
}
