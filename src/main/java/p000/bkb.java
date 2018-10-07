package p000;

import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: bkb */
final class bkb implements ixd {
    /* renamed from: a */
    private final /* synthetic */ TimerTask f11485a;
    /* renamed from: b */
    private final /* synthetic */ kpw f11486b;
    /* renamed from: c */
    private final /* synthetic */ bjz f11487c;

    bkb(bjz bjz, TimerTask timerTask, kpw kpw) {
        this.f11487c = bjz;
        this.f11485a = timerTask;
        this.f11486b = kpw;
    }

    /* renamed from: a */
    public final void mo9148a() {
        this.f11485a.cancel();
        Object b = this.f11487c.f22796f.mo13748b();
        if (b == null) {
            this.f11486b.mo15642a(new RuntimeException("Image is not available."));
            return;
        }
        boolean z;
        jri.m13404b(b);
        if (b.mo13741c() == 256) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        this.f11486b.mo15641a(b);
    }
}
