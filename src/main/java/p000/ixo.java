package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: ixo */
public final class ixo implements ixq {
    /* renamed from: a */
    public final float mo9163a(iwp iwp) {
        Integer num = (Integer) iwp.mo13730a(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return Float.NaN;
        }
        Object obj;
        int obj2;
        if (num.intValue() == 2) {
            obj2 = 1;
        } else if (num.intValue() != 3) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        return obj2 == null ? 0.0f : 1.0f;
    }
}
