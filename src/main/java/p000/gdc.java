package p000;

import com.google.googlex.gcam.GoudaImageCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;

/* compiled from: PG */
/* renamed from: gdc */
final class gdc extends GoudaImageCallback {
    /* renamed from: a */
    private final /* synthetic */ gdv f19064a;
    /* renamed from: b */
    private final /* synthetic */ boolean f19065b;
    /* renamed from: c */
    private final /* synthetic */ boolean f19066c;
    /* renamed from: d */
    private final /* synthetic */ boolean f19067d;
    /* renamed from: e */
    private final /* synthetic */ gcy f19068e;

    gdc(gcy gcy, gdv gdv, boolean z, boolean z2, boolean z3) {
        this.f19068e = gcy;
        this.f19064a = gdv;
        this.f19065b = z;
        this.f19066c = z2;
        this.f19067d = z3;
    }

    public final void RgbReady(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3) {
        String str4 = gcv.f19024a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
        stringBuilder.append("Gouda image (rgb): id = ");
        stringBuilder.append(j);
        stringBuilder.append(" description = ");
        stringBuilder.append(str);
        bli.m888a(str4, stringBuilder.toString());
        if (this.f19064a != null) {
            kbg findImageFromView = this.f19068e.f19045f.findImageFromView(interleavedReadViewU8);
            jri.m13405b(findImageFromView.mo9709b());
            if (((InterleavedImageU8) findImageFromView.mo9706a()).width() != 0 && ((InterleavedImageU8) findImageFromView.mo9706a()).height() != 0) {
                if (this.f19065b && this.f19068e.f19048i.f19028e.mo9709b()) {
                    gii gii = (gii) this.f19068e.f19048i.f19028e.mo9706a();
                    findImageFromView.mo9706a();
                    gii.mo7139a();
                }
                if (this.f19066c && this.f19067d) {
                    YuvWriteView yuvImage = new YuvImage(((InterleavedImageU8) findImageFromView.mo9706a()).width(), ((InterleavedImageU8) findImageFromView.mo9706a()).height(), 1);
                    YuvUtils.rgbToYuv((InterleavedReadViewU8) findImageFromView.mo9706a(), yuvImage);
                    this.f19064a.mo7058a(j, hjl.m3262a(yuvImage), gdy.m2550c().mo7064b(gcv.m11175a(str2)).mo7063a(gcv.m11175a(str3)).mo7062a(), str);
                    return;
                }
                this.f19064a.mo7058a(j, new hjl(kbg.m4804c((InterleavedReadViewU8) findImageFromView.mo9706a()), kau.f21835a), gdy.m2550c().mo7064b(gcv.m11175a(str2)).mo7063a(gcv.m11175a(str3)).mo7062a(), str);
            }
        }
    }

    public final void YuvReady(long j, YuvReadView yuvReadView, int i, String str, String str2, String str3) {
        String str4 = gcv.f19024a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
        stringBuilder.append("Gouda image (yuv): id = ");
        stringBuilder.append(j);
        stringBuilder.append(" description = ");
        stringBuilder.append(str);
        bli.m888a(str4, stringBuilder.toString());
        if (this.f19064a != null) {
            kbg findImageFromView = this.f19068e.f19046g.findImageFromView(yuvReadView);
            jri.m13405b(findImageFromView.mo9709b());
            this.f19064a.mo7058a(j, hjl.m3262a((YuvReadView) findImageFromView.mo9706a()), gdy.m2550c().mo7064b(gcv.m11175a(str2)).mo7063a(gcv.m11175a(str3)).mo7062a(), str);
        }
    }
}
