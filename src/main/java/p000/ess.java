package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: ess */
public class ess implements eyu {
    /* renamed from: a */
    public static final String f17747a = ess.class.getSimpleName();
    /* renamed from: b */
    private final eyu f17748b;
    /* renamed from: c */
    private final kpk f17749c;

    public ess(kpk kpk, fah fah, eyu eyu) {
        this.f17748b = eyu;
        this.f17749c = kpk;
    }

    /* renamed from: a */
    public final void mo6683a() {
        this.f17748b.mo6683a();
    }

    /* renamed from: a */
    public final void mo6684a(long j) {
        kow.m13878a(this.f17749c, new est(), kpq.f8776a);
        kpk kpk = this.f17749c;
        kow.m13878a(ezu.m2253a(kpk, 10000, new Handler(Looper.getMainLooper())), new ezs(kpk, new Throwable()), kpq.f8776a);
        this.f17748b.mo6684a(j);
    }
}
