package com.t.currenyexchange.Interfaces;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.t.currenyexchange.Models.ExchangeOperation;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExchamgeOperationDao_Impl implements ExchamgeOperationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ExchangeOperation> __insertionAdapterOfExchangeOperation;

  private final EntityDeletionOrUpdateAdapter<ExchangeOperation> __deletionAdapterOfExchangeOperation;

  private final EntityDeletionOrUpdateAdapter<ExchangeOperation> __updateAdapterOfExchangeOperation;

  public ExchamgeOperationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExchangeOperation = new EntityInsertionAdapter<ExchangeOperation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ExchangeOperation` (`id`,`from`,`to`,`amount`,`amountresult`,`date`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExchangeOperation value) {
        stmt.bindLong(1, value.getId());
        if (value.getFrom() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFrom());
        }
        if (value.getTo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTo());
        }
        if (value.getAmount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAmount());
        }
        if (value.getAmountresult() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAmountresult());
        }
        stmt.bindLong(6, value.getDate());
      }
    };
    this.__deletionAdapterOfExchangeOperation = new EntityDeletionOrUpdateAdapter<ExchangeOperation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ExchangeOperation` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExchangeOperation value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfExchangeOperation = new EntityDeletionOrUpdateAdapter<ExchangeOperation>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ExchangeOperation` SET `id` = ?,`from` = ?,`to` = ?,`amount` = ?,`amountresult` = ?,`date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExchangeOperation value) {
        stmt.bindLong(1, value.getId());
        if (value.getFrom() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFrom());
        }
        if (value.getTo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTo());
        }
        if (value.getAmount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAmount());
        }
        if (value.getAmountresult() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAmountresult());
        }
        stmt.bindLong(6, value.getDate());
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public void insert(final ExchangeOperation task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExchangeOperation.insert(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ExchangeOperation task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfExchangeOperation.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final ExchangeOperation task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfExchangeOperation.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ExchangeOperation> getAll() {
    final String _sql = "SELECT * FROM exchangeoperation";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "from");
      final int _cursorIndexOfTo = CursorUtil.getColumnIndexOrThrow(_cursor, "to");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfAmountresult = CursorUtil.getColumnIndexOrThrow(_cursor, "amountresult");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<ExchangeOperation> _result = new ArrayList<ExchangeOperation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ExchangeOperation _item;
        _item = new ExchangeOperation();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpFrom;
        if (_cursor.isNull(_cursorIndexOfFrom)) {
          _tmpFrom = null;
        } else {
          _tmpFrom = _cursor.getString(_cursorIndexOfFrom);
        }
        _item.setFrom(_tmpFrom);
        final String _tmpTo;
        if (_cursor.isNull(_cursorIndexOfTo)) {
          _tmpTo = null;
        } else {
          _tmpTo = _cursor.getString(_cursorIndexOfTo);
        }
        _item.setTo(_tmpTo);
        final String _tmpAmount;
        if (_cursor.isNull(_cursorIndexOfAmount)) {
          _tmpAmount = null;
        } else {
          _tmpAmount = _cursor.getString(_cursorIndexOfAmount);
        }
        _item.setAmount(_tmpAmount);
        final String _tmpAmountresult;
        if (_cursor.isNull(_cursorIndexOfAmountresult)) {
          _tmpAmountresult = null;
        } else {
          _tmpAmountresult = _cursor.getString(_cursorIndexOfAmountresult);
        }
        _item.setAmountresult(_tmpAmountresult);
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        _item.setDate(_tmpDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ExchangeOperation> findByName(final String from, final String to, final Long date) {
    final String _sql = "SELECT * FROM exchangeoperation WHERE `from` LIKE ? || `to` LIKE ? ||`from` LIKE ? ||`to` LIKE ? AND'date' >= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    if (from == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, from);
    }
    _argIndex = 2;
    if (to == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, to);
    }
    _argIndex = 3;
    if (to == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, to);
    }
    _argIndex = 4;
    if (from == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, from);
    }
    _argIndex = 5;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, date);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "from");
      final int _cursorIndexOfTo = CursorUtil.getColumnIndexOrThrow(_cursor, "to");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfAmountresult = CursorUtil.getColumnIndexOrThrow(_cursor, "amountresult");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<ExchangeOperation> _result = new ArrayList<ExchangeOperation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ExchangeOperation _item;
        _item = new ExchangeOperation();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpFrom;
        if (_cursor.isNull(_cursorIndexOfFrom)) {
          _tmpFrom = null;
        } else {
          _tmpFrom = _cursor.getString(_cursorIndexOfFrom);
        }
        _item.setFrom(_tmpFrom);
        final String _tmpTo;
        if (_cursor.isNull(_cursorIndexOfTo)) {
          _tmpTo = null;
        } else {
          _tmpTo = _cursor.getString(_cursorIndexOfTo);
        }
        _item.setTo(_tmpTo);
        final String _tmpAmount;
        if (_cursor.isNull(_cursorIndexOfAmount)) {
          _tmpAmount = null;
        } else {
          _tmpAmount = _cursor.getString(_cursorIndexOfAmount);
        }
        _item.setAmount(_tmpAmount);
        final String _tmpAmountresult;
        if (_cursor.isNull(_cursorIndexOfAmountresult)) {
          _tmpAmountresult = null;
        } else {
          _tmpAmountresult = _cursor.getString(_cursorIndexOfAmountresult);
        }
        _item.setAmountresult(_tmpAmountresult);
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        _item.setDate(_tmpDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
