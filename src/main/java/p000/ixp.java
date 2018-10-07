package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: ixp */
public final class ixp implements ixq {
    /* renamed from: a */
    public final float mo9163a(iwp iwp) {
        Face[] faceArr = (Face[]) iwp.mo13730a(CaptureResult.STATISTICS_FACES);
        return faceArr != null ? (float) faceArr.length : Float.NaN;
    }
}
