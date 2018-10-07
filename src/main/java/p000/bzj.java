package p000;

import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.PdImageCallback;

/* compiled from: PG */
/* renamed from: bzj */
final class bzj extends PdImageCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12047a;
    /* renamed from: b */
    private final /* synthetic */ bze f12048b;

    bzj(bze bze, bzx bzx) {
        this.f12048b = bze;
        this.f12047a = bzx;
    }

    public final void ImageReady(int i, InterleavedReadViewU16 interleavedReadViewU16) {
        boolean z;
        kbg image = this.f12048b.f1777p.getImage();
        if (this.f12048b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        jri.m13406b(image.mo9709b(), (Object) "PdImageCallback::ImageReady() was invoked but corresponding client allocator's image is absent.");
        bli.m888a(bze.f1762a, String.format(null, "Merged PD image ready (shotId = %d)", new Object[]{Integer.valueOf(i)}));
        jri.m13406b(this.f12047a.mo2238e().mo9709b(), (Object) "Got PD with no callback present");
        Object obj = (InterleavedReadViewU16) image.mo9706a();
        ((cae) this.f12047a.mo2238e().mo9706a()).f1817a.mo15641a(obj);
    }

    public final void MergePdFailed(int i) {
        boolean z;
        String str = bze.f1762a;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(i);
        bli.m898e(str, String.format(null, "MergePD failed (shotId = %d)", objArr));
        if (this.f12048b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        jri.m13406b(this.f12047a.mo2238e().mo9709b(), (Object) "Got PD with no callback present");
        cae cae = (cae) this.f12047a.mo2238e().mo9706a();
        blr blr = new blr(String.format(null, "MergePD failed (shotId = %d)", new Object[]{r4}));
        cae.mo2245a();
    }
}
