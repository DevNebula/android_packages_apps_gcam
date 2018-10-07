package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fxv */
public final class fxv implements fyt {
    /* renamed from: a */
    public final AtomicInteger f18887a = new AtomicInteger(0);

    /* renamed from: a */
    public final bbi mo6947a(int i) {
        iqo bbo = new bbo();
        for (int i2 = 0; i2 < i; i2++) {
            bbo.add(new fxx(this));
        }
        bbi d = bcp.m15005d();
        d.mo14558a(bbo);
        return d;
    }

    /* renamed from: a */
    public final iqo mo6948a() {
        return new fxw();
    }

    /* renamed from: c */
    public final ilp mo6949c() {
        return ilq.m3876a(Integer.valueOf(LfuScheduler.MAX_PRIORITY));
    }

    /* renamed from: d */
    public final fyr mo6950d() {
        return new fxx(this);
    }
}
