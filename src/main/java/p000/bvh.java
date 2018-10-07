package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* renamed from: bvh */
final class bvh implements kaw {
    /* renamed from: a */
    private final /* synthetic */ long f11832a;

    bvh(long j) {
        this.f11832a = j;
    }

    /* renamed from: a */
    private final kbg m7891a(SQLiteDatabase sQLiteDatabase) {
        kbg kbg = kau.f21835a;
        Cursor query = ((SQLiteDatabase) jri.m13404b((Object) sQLiteDatabase)).query("type_uri", bvf.f1651e, "media_store_id = ?", new String[]{String.valueOf(this.f11832a)}, null, null, null);
        try {
            kbg a;
            if (query.moveToFirst()) {
                a = bve.m1025a(query.getString(query.getColumnIndexOrThrow("special_type_id")));
            } else {
                a = kbg;
            }
            query.close();
            return a;
        } catch (IllegalArgumentException e) {
            query.close();
            return kbg;
        } catch (NullPointerException e2) {
            query.close();
            return kbg;
        } catch (Throwable th) {
            query.close();
        }
    }
}
