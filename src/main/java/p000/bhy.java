package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bhy */
public final class bhy implements iqo {
    /* renamed from: a */
    public static final String f11408a = bli.m887a("CdrPreviewStarter");
    /* renamed from: b */
    public final bhr f11409b;
    /* renamed from: c */
    public final bhu f11410c;
    /* renamed from: d */
    public final Object f11411d = new Object();
    /* renamed from: e */
    public boolean f11412e;
    /* renamed from: f */
    private final ijx f11413f;

    public bhy(bhr bhr, bhu bhu, ijx ijx) {
        this.f11409b = bhr;
        this.f11410c = bhu;
        this.f11413f = ijx;
        this.f11412e = false;
    }

    public final void close() {
        bli.m888a(f11408a, "close preview starter");
        synchronized (this.f11411d) {
            this.f11412e = true;
        }
    }

    /* renamed from: a */
    public final kpk mo12381a(bhj bhj, Surface surface, bhs bhs) {
        if (bhj == null || !surface.isValid()) {
            return kow.m13873a(null);
        }
        kpk d = kpw.m18486d();
        this.f11413f.execute(new bhz(this, d, bhj, surface, bhs));
        return d;
    }
}
