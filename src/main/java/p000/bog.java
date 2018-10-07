package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

/* compiled from: PG */
/* renamed from: bog */
public final class bog {
    /* renamed from: a */
    public final Context f1385a;
    /* renamed from: b */
    public final Object f1386b;
    /* renamed from: c */
    public final ServiceConnection f1387c;
    /* renamed from: d */
    public final kas f1388d;
    /* renamed from: e */
    public kaq f1389e;
    /* renamed from: f */
    public boi f1390f;
    /* renamed from: g */
    public final IBinder f1391g = new Binder();
    /* renamed from: h */
    public boolean f1392h;

    public bog(Context context) {
        this.f1385a = context;
        this.f1386b = new Object();
        this.f1388d = new kat(this);
        this.f1387c = new boh(this);
    }
}
