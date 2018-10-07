package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fra */
final class fra implements fuw {
    /* renamed from: a */
    public static final String f18680a = bli.m887a("YuvImgSaver");
    /* renamed from: b */
    public final gfa f18681b;
    /* renamed from: c */
    public final Rect f18682c;
    /* renamed from: d */
    public final Executor f18683d = Executors.newSingleThreadExecutor(iel.m3778c("BckndYuvEx", 0));
    /* renamed from: e */
    private final axm f18684e;
    /* renamed from: f */
    private final fsr f18685f;

    fra(axm axm, gfa gfa, fyy fyy, fsr fsr) {
        this.f18684e = axm;
        this.f18681b = gfa;
        this.f18685f = fsr;
        this.f18682c = fyy.f5063e;
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        iqm a = this.f18684e.mo1836a();
        gfn frd = new frd(fwa.f4982b, a, fwa.f4981a.f4676c);
        gkr gkr = fwa.f4982b;
        fsr fsr = this.f18685f;
        return new fqf(new frb(this, gkr, a, frd, new fsq(fsr.f4926a, fss.SW_JPEG)));
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return ilq.m3876a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return fuy.m2452a();
    }

    /* renamed from: b */
    public final fux mo6917b(fwa fwa) {
        return mo6915a(fwa);
    }
}
