package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: dc */
public final class C0183dc {
    /* renamed from: c */
    private static C0183dc f3187c;
    /* renamed from: a */
    public final Object f3188a = new Object();
    /* renamed from: b */
    public final Handler f3189b = new Handler(Looper.getMainLooper(), new C0184dd(this));

    private C0183dc() {
    }

    /* renamed from: a */
    public static C0183dc m1622a() {
        if (f3187c == null) {
            f3187c = new C0183dc();
        }
        return f3187c;
    }
}
