package com.t.currenyexchange.Interfaces;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.t.currenyexchange.Models.ExchangeOperation;
@Database(entities = {ExchangeOperation.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ExchamgeOperationDao exchamgeOperationDao();
    private static AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "exchanges").allowMainThreadQueries().build();

            //Room.inMemoryDatabaseBuilder(context.getApplicationContext(),AppDatabase.class).allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
