package p000;

import com.google.googlex.gcam.InterleavedReadViewU8;

/* compiled from: PG */
/* renamed from: cay */
final class cay implements kov {
    /* renamed from: a */
    private final /* synthetic */ long f12095a;
    /* renamed from: b */
    private final /* synthetic */ hjo f12096b;
    /* renamed from: c */
    private final /* synthetic */ InterleavedReadViewU8 f12097c;
    /* renamed from: d */
    private final /* synthetic */ cau f12098d;

    cay(cau cau, long j, hjo hjo, InterleavedReadViewU8 interleavedReadViewU8) {
        this.f12098d = cau;
        this.f12095a = j;
        this.f12096b = hjo;
        this.f12097c = interleavedReadViewU8;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m891b(car.f22871a, "Error upsampling original image.");
        this.f12098d.m17239a(this.f12095a, this.f12097c, gdy.m2550c().mo7062a(), 0, cat.ORIGINAL, null, this.f12096b);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        this.f12098d.m17239a(this.f12095a, (InterleavedReadViewU8) jri.m13404b((InterleavedReadViewU8) obj), gdy.m2550c().mo7062a(), 0, cat.ORIGINAL, null, this.f12096b);
    }
}
