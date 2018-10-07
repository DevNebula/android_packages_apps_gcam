package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fzb */
public final class fzb implements kaw {
    fzb() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        fzd fzd = (fzd) obj;
        return fds.m10417a(Arrays.asList(new fin[]{new fin(CaptureRequest.SCALER_CROP_REGION, fzd.f5066a), new fin(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(fzd.f5067b))}));
    }

    /* renamed from: a */
    public static int m11105a(iqp iqp, iqp iqp2) {
        int min = Math.min(iqp.f7695a / iqp2.f7695a, iqp.f7696b / iqp2.f7696b);
        if (min <= 0) {
            return 1;
        }
        while (min > 0) {
            if (fzb.m11106a(iqp.f7695a, min) && fzb.m11106a(iqp.f7696b, min)) {
                return min;
            }
            min--;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m11106a(int i, int i2) {
        return i % (i2 + i2) == 0;
    }
}
