package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bic */
public final class bic implements iqo {
    /* renamed from: a */
    public static final String f11421a = bli.m887a("CdrRecReqStarter");
    /* renamed from: b */
    public final bhr f11422b;
    /* renamed from: c */
    public final bhu f11423c;
    /* renamed from: d */
    public final Surface f11424d;
    /* renamed from: e */
    public final Object f11425e = new Object();
    /* renamed from: f */
    public boolean f11426f;
    /* renamed from: g */
    private final ijx f11427g;

    public bic(bhr bhr, bhu bhu, ijx ijx, Surface surface) {
        this.f11422b = bhr;
        this.f11423c = bhu;
        this.f11427g = ijx;
        this.f11424d = surface;
    }

    public final void close() {
        synchronized (this.f11425e) {
            this.f11426f = true;
        }
    }

    /* renamed from: a */
    public final kpk mo12383a(bhj bhj, Surface surface, bhs bhs) {
        if (bhj == null) {
            return kow.m13873a(null);
        }
        kpk d = kpw.m18486d();
        this.f11427g.execute(new bid(this, surface, bhj, bhs, d));
        return d;
    }
}
