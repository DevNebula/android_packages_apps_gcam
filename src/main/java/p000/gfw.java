package p000;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: gfw */
public class gfw {
    /* renamed from: b */
    public final iwz f5387b;
    /* renamed from: c */
    public final iqm f5388c;
    /* renamed from: d */
    public final kpk f5389d;
    /* renamed from: e */
    public final grg f5390e;
    /* renamed from: f */
    public final Rect f5391f;
    /* renamed from: g */
    public final long f5392g;
    /* renamed from: h */
    public final ExifInterface f5393h;

    public gfw(iwz iwz, iqm iqm, kpk kpk) {
        this(iwz, iqm, kpk, new Rect(0, 0, iwz.mo13745g(), iwz.mo13742d()));
    }

    public gfw(iwz iwz, iqm iqm, kpk kpk, Rect rect) {
        this(iwz, iqm, kpk, rect, iwz.mo13744f(), null, null);
    }

    public gfw(iwz iwz, iqm iqm, kpk kpk, Rect rect, long j, ExifInterface exifInterface, grg grg) {
        this.f5387b = iwz;
        this.f5388c = iqm;
        this.f5389d = kpk;
        this.f5391f = rect;
        this.f5392g = j;
        this.f5393h = exifInterface;
        this.f5390e = grg;
    }

    public gfw(iwz iwz, iqm iqm, kpk kpk, Rect rect, ExifInterface exifInterface, grg grg) {
        this(iwz, iqm, kpk, rect, iwz.mo13744f(), exifInterface, grg);
    }
}
