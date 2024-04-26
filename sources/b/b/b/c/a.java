package b.b.b.c;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.rp.rptool.util.c0;
import java.io.File;

public class a {
    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    public static Cursor c(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.rawQuery(str, (String[]) null);
        } catch (RuntimeException e) {
            c0.a(0, "RPDBHelper", "ealen test 数据库操作异常");
            e.printStackTrace();
            return null;
        }
    }

    public static SQLiteDatabase d() {
        return SQLiteDatabase.openOrCreateDatabase(b.f801b + File.separator + b.f800a, (SQLiteDatabase.CursorFactory) null);
    }
}
