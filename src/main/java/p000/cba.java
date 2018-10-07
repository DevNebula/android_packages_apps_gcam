package p000;

import com.google.googlex.gcam.InterleavedReadViewU8;

/* compiled from: PG */
/* renamed from: cba */
final class cba implements fow {
    /* renamed from: a */
    private final /* synthetic */ InterleavedReadViewU8 f12103a;
    /* renamed from: b */
    private final /* synthetic */ int f12104b;
    /* renamed from: c */
    private final /* synthetic */ cau f12105c;

    cba(cau cau, InterleavedReadViewU8 interleavedReadViewU8, int i) {
        this.f12105c = cau;
        this.f12103a = interleavedReadViewU8;
        this.f12104b = i;
    }

    /* renamed from: a */
    public final kpk mo6864a() {
        kpk d = kpw.m18486d();
        cau cau = this.f12105c;
        car car = cau.f25532n;
        car.f22875e.execute(new cas(car, this.f12103a, d, cau.f25521c, cau.f25522d, this.f12104b));
        return d;
    }

    /* renamed from: b */
    public final kpk mo6865b() {
        return kow.m13874a(new isr("RGB image couldn't be encoded into jpeg."));
    }
}
