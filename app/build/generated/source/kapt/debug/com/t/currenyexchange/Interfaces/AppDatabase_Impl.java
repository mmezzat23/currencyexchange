package com.t.currenyexchange.Interfaces;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ExchamgeOperationDao _exchamgeOperationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ExchangeOperation` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `amount` TEXT NOT NULL, `amountresult` TEXT NOT NULL, `date` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3abf132b8dba7b22cec5f4e2cd035902')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ExchangeOperation`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExchangeOperation = new HashMap<String, TableInfo.Column>(6);
        _columnsExchangeOperation.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeOperation.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeOperation.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeOperation.put("amount", new TableInfo.Column("amount", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeOperation.put("amountresult", new TableInfo.Column("amountresult", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeOperation.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExchangeOperation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExchangeOperation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExchangeOperation = new TableInfo("ExchangeOperation", _columnsExchangeOperation, _foreignKeysExchangeOperation, _indicesExchangeOperation);
        final TableInfo _existingExchangeOperation = TableInfo.read(_db, "ExchangeOperation");
        if (! _infoExchangeOperation.equals(_existingExchangeOperation)) {
          return new RoomOpenHelper.ValidationResult(false, "ExchangeOperation(com.t.currenyexchange.Models.ExchangeOperation).\n"
                  + " Expected:\n" + _infoExchangeOperation + "\n"
                  + " Found:\n" + _existingExchangeOperation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3abf132b8dba7b22cec5f4e2cd035902", "231762a6c41ae174f21a97563c5198e5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ExchangeOperation");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ExchangeOperation`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ExchamgeOperationDao.class, ExchamgeOperationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ExchamgeOperationDao exchamgeOperationDao() {
    if (_exchamgeOperationDao != null) {
      return _exchamgeOperationDao;
    } else {
      synchronized(this) {
        if(_exchamgeOperationDao == null) {
          _exchamgeOperationDao = new ExchamgeOperationDao_Impl(this);
        }
        return _exchamgeOperationDao;
      }
    }
  }
}
