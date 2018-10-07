package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* renamed from: bhs */
public final class bhs extends fiw {
    /* renamed from: d */
    private static final String f11399d = bli.m887a("CdrCamCapCallback");
    /* renamed from: a */
    public final kpw f11400a = kpw.m18486d();
    /* renamed from: b */
    public int f11401b = 0;
    /* renamed from: c */
    public final ConcurrentLinkedQueue f11402c = new ConcurrentLinkedQueue();
    /* renamed from: e */
    private final Surface f11403e;
    /* renamed from: f */
    private final iqt f11404f;
    /* renamed from: g */
    private final fiw f11405g;

    public bhs(Surface surface, iqt iqt, fiw fiw) {
        this.f11403e = surface;
        this.f11404f = iqt;
        this.f11405g = fiw;
    }

    /* renamed from: a */
    public final iqo mo12380a(fiw fiw) {
        this.f11402c.add(fiw);
        return new bht(this, fiw);
    }

    /* renamed from: a */
    public final void mo6823a(Surface surface, long j) {
        if (surface == this.f11403e) {
            this.f11401b++;
        }
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        if (!this.f11400a.isDone()) {
            this.f11400a.mo15641a(null);
        }
        Rect rect = (Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            this.f11404f.mo8826a(rect);
        }
        this.f11405g.mo6826a_(iwp);
        Iterator it = this.f11402c.iterator();
        while (it.hasNext()) {
            ((fiw) it.next()).mo6826a_(iwp);
        }
    }

    /* renamed from: a */
    public final void mo6825a(iwm iwm) {
        String str = f11399d;
        String valueOf = String.valueOf(iwm);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("onCaptureFailed ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
    }
}
