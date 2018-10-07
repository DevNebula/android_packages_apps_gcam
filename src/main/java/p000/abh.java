package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: abh */
public abstract class abh {
    /* renamed from: a */
    private static final aby f123a = new aby("CamDvcInfChar");

    /* renamed from: a */
    public abstract int mo54a();

    /* renamed from: b */
    public abstract boolean mo56b();

    /* renamed from: c */
    public abstract boolean mo57c();

    /* renamed from: a */
    public final int mo55a(int i, boolean z) {
        int i2;
        if (i % 90 != 0) {
            abx.m87b(f123a, "Provided display orientation is not divisible by 90");
            i2 = 0;
        } else if (i >= 0 && i <= MediaDecoder.ROTATE_90_LEFT) {
            i2 = 1;
        } else {
            abx.m87b(f123a, "Provided display orientation is outside expected range");
            i2 = 0;
        }
        if (i2 == 0) {
            return 0;
        }
        if (mo57c()) {
            int a = (mo54a() + i) % 360;
            if (z) {
                return (360 - a) % 360;
            }
            return a;
        } else if (mo56b()) {
            return ((mo54a() - i) + 360) % 360;
        } else {
            abx.m87b(f123a, "Camera is facing unhandled direction");
            return 0;
        }
    }
}
