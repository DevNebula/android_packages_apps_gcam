package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* renamed from: bvi */
final class bvi implements kaw {
    /* renamed from: a */
    private final /* synthetic */ ContentValues f11833a;

    bvi(ContentValues contentValues) {
        this.f11833a = contentValues;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        ((SQLiteDatabase) jri.m13404b((SQLiteDatabase) obj)).replace("type_uri", null, this.f11833a);
        return null;
    }
}
