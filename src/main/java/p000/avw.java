package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: avw */
public final class avw extends aue {
    /* renamed from: a */
    private final fdu f25497a;

    public avw(fcm fcm, fdu fdu) {
        super(fcm, fdu);
        this.f25497a = fdu;
    }

    /* renamed from: b */
    protected final kbg mo12322b(iwp iwp) {
        boolean z;
        boolean z2 = true;
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) jri.m13404b((MeteringRectangle[]) iwp.mo13730a(CaptureResult.CONTROL_AF_REGIONS));
        if (meteringRectangleArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        MeteringRectangle meteringRectangle = meteringRectangleArr[0];
        if (meteringRectangle.getRect().isEmpty()) {
            return kau.f21835a;
        }
        PointF a = this.f25497a.mo6762a(meteringRectangle, (Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION));
        int[] iArr = (int[]) jri.m13404b((int[]) iwp.mo13730a(hsz.f6979g));
        if (iArr.length <= 0) {
            z2 = false;
        }
        jri.m13395a(z2);
        return kbg.m4804c(fcj.m2296a().mo6747a(a).mo6746a(iArr[0]).mo6745a());
    }
}
