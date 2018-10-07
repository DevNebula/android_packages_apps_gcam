package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: auv */
public class auv extends fiw {
    /* renamed from: a */
    private final fcm f10829a;
    /* renamed from: b */
    private final fdu f10830b;

    public auv(fcm fcm, fdu fdu) {
        super((byte) 0);
        this.f10829a = fcm;
        this.f10830b = fdu;
    }

    /* renamed from: b */
    protected kbg mo12322b(iwp iwp) {
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) iwp.mo13730a(CaptureResult.CONTROL_AF_REGIONS);
        if (meteringRectangleArr == null || meteringRectangleArr.length <= 0) {
            return kau.f21835a;
        }
        MeteringRectangle meteringRectangle = meteringRectangleArr[0];
        if (meteringRectangle.getRect().isEmpty()) {
            return kau.f21835a;
        }
        return kbg.m4804c(fcj.m2296a().mo6747a(this.f10830b.mo6762a(meteringRectangle, (Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION))).mo6745a());
    }

    /* renamed from: a */
    protected boolean mo12321a(iwp iwp) {
        return false;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        int intValue = ((Integer) jri.m13404b((Integer) iwp.mo13730a(CaptureResult.CONTROL_AF_MODE))).intValue();
        Object obj = (gig) gig.f5466d.get(Integer.valueOf(intValue));
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("unknown metadata value: ");
            stringBuilder.append(intValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        gig gig = (gig) jri.m13404b(obj);
        int intValue2 = ((Integer) jri.m13404b((Integer) iwp.mo13730a(CaptureResult.CONTROL_AF_STATE))).intValue();
        obj = (gih) gih.f5479h.get(Integer.valueOf(intValue2));
        if (obj == null) {
            StringBuilder stringBuilder2 = new StringBuilder(35);
            stringBuilder2.append("unknown metadata value: ");
            stringBuilder2.append(intValue2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        Float f = (Float) jri.m13404b((Float) iwp.mo13730a(CaptureResult.LENS_FOCUS_DISTANCE));
        this.f10829a.mo8826a(new fcl(gig, (gih) jri.m13404b(obj), f.floatValue(), mo12321a(iwp), mo12322b(iwp)));
    }
}
