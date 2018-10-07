package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.Tuning;

/* compiled from: PG */
/* renamed from: bzs */
public final class bzs {
    /* renamed from: a */
    public final Tuning f1788a;
    /* renamed from: b */
    public final fvj f1789b;

    bzs(Tuning tuning, iwp iwp) {
        jri.m13404b((Object) iwp);
        this.f1788a = (Tuning) jri.m13404b((Object) tuning);
        Object obj = (Face[]) iwp.mo13730a(CaptureResult.STATISTICS_FACES);
        Object obj2 = (Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION);
        jri.m13404b(obj);
        jri.m13404b(obj2);
        this.f1789b = new fvj(obj, obj2);
    }
}
