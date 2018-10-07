package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ezu */
public final class ezu {
    /* renamed from: a */
    private static final String f4616a = bli.m887a("TimedFutures");

    /* renamed from: a */
    public static kpk m2253a(kpk kpk, long j, Handler handler) {
        Object obj = new Object();
        kpk d = kpw.m18486d();
        Throwable th = new Throwable();
        handler.postDelayed(new ezv(obj, d, th), j);
        kpk.mo10200a(new ezw(obj, d, th, kpk), kpq.f8776a);
        return d;
    }

    /* renamed from: a */
    static final /* synthetic */ void m2255a(Object obj, kpw kpw, Throwable th, kpk kpk) {
        synchronized (obj) {
            if (kpw.isDone()) {
                bli.m892b(f4616a, "Value arriving for future timed out previously", th);
                return;
            }
            kpw.mo15644b(kpk);
        }
    }
}
