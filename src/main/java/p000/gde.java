package p000;

import com.google.googlex.gcam.GoudaImageCallback;
import com.google.googlex.gcam.InterleavedReadViewU8;

/* compiled from: PG */
/* renamed from: gde */
final class gde extends GoudaImageCallback {
    /* renamed from: a */
    private final /* synthetic */ gdv f19071a;
    /* renamed from: b */
    private final /* synthetic */ gcy f19072b;

    gde(gcy gcy, gdv gdv) {
        this.f19072b = gcy;
        this.f19071a = gdv;
    }

    public final void RgbReady(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3) {
        String str4 = gcv.f19024a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("Gouda debug image (rgb): id = ");
        stringBuilder.append(j);
        stringBuilder.append(" description = ");
        stringBuilder.append(str);
        bli.m888a(str4, stringBuilder.toString());
        if (this.f19071a != null) {
            kbg findImageFromView = this.f19072b.f19047h.findImageFromView(interleavedReadViewU8);
            jri.m13405b(findImageFromView.mo9709b());
            gdv gdv = this.f19071a;
            InterleavedReadViewU8 interleavedReadViewU82 = (InterleavedReadViewU8) findImageFromView.mo9706a();
            gdy a = gdy.m2550c().mo7064b(gcv.m11175a(str2)).mo7063a(gcv.m11175a(str3)).mo7062a();
            hjo a2 = gdv.f5338b.f25519a.mo7912a();
            cau cau = gdv.f5338b;
            cau.m17239a(r4, interleavedReadViewU82, a, cau.f25542x = cau.f25542x + 1, cat.DEBUG, str, a2);
        }
    }
}
