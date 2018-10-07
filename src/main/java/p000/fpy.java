package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fpy */
final class fpy implements fuw {
    /* renamed from: a */
    public static final String f18612a = bli.m887a("JpegImgBESaver");
    /* renamed from: b */
    public final Executor f18613b = Executors.newSingleThreadExecutor(iel.m3778c("BckndJpegEx", 0));
    /* renamed from: c */
    public final Rect f18614c;
    /* renamed from: d */
    private final axm f18615d;
    /* renamed from: e */
    private final gfa f18616e;

    fpy(axm axm, gfa gfa, fyy fyy) {
        this.f18615d = axm;
        this.f18616e = gfa;
        this.f18614c = fyy.f5063e;
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        return new fqf(new fpz(this, fwa.f4982b, this.f18615d.mo1836a(), this.f18616e, new fqa(fwa.f4982b, fwa.f4981a.f4676c)));
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return ilq.m3876a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return new fuy(C0252go.f5851ax);
    }

    /* renamed from: b */
    public final fux mo6917b(fwa fwa) {
        return mo6915a(fwa);
    }
}
