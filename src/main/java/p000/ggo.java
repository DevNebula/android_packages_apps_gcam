package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: ggo */
final class ggo extends ggx {
    /* renamed from: a */
    public final /* synthetic */ ggt f24356a;
    /* renamed from: b */
    public final /* synthetic */ ggt f24357b;
    /* renamed from: i */
    private final /* synthetic */ byte[] f24358i;
    /* renamed from: j */
    private final /* synthetic */ int[] f24359j;
    /* renamed from: k */
    private final /* synthetic */ kpk f24360k;

    ggo(ggr ggr, int i, byte[] bArr, ggt ggt, int[] iArr, ggt ggt2, kpk kpk) {
        this.f24358i = bArr;
        this.f24356a = ggt;
        this.f24359j = iArr;
        this.f24357b = ggt2;
        this.f24360k = kpk;
        super(ggr, i);
    }

    public final void run() {
        byte[] bArr = this.f24358i;
        ggt ggt = this.f24356a;
        byte[] a = ggx.m11279a(bArr, ggt.f5410c, ggt.f5409b, this.f24359j);
        mo13352a(this.f5403e, this.f24357b, a, C0252go.f5825aX);
        ExifInterface a2 = mo13350a(kau.f21835a, this.f24357b, this.f24360k);
        ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7366a(a2);
        get get = this.f5406h;
        ggt ggt2 = this.f24357b;
        kow.m13878a(glx.m11389a(get, a, ggt2.f5410c, ggt2.f5409b, ggt2.f5408a.f7692e, a2), new ggp(this), kpq.f8776a);
        if (this.f24360k.isDone()) {
            try {
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7371a((iwp) this.f24360k.get());
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
            } catch (InterruptedException e) {
                bli.m891b(ggn.f24354a, "CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
            } catch (ExecutionException e2) {
                bli.m898e(ggn.f24354a, "CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
            } catch (Throwable th) {
                Throwable th2 = th;
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
            }
        } else {
            bli.m898e(ggn.f24354a, "CaptureResults unavailable to photoCaptureDoneEvent event.");
            ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
        }
    }
}
