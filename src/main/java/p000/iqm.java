package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.view.Display;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: iqm */
public enum iqm {
    CLOCKWISE_0(0),
    CLOCKWISE_90(90),
    CLOCKWISE_180(MediaDecoder.ROTATE_180),
    CLOCKWISE_270(MediaDecoder.ROTATE_90_LEFT);
    
    /* renamed from: e */
    public final int f7692e;

    private iqm(int i) {
        this.f7692e = i;
    }

    /* renamed from: a */
    public static iqm m4095a(int i) {
        switch (i) {
            case -1:
                return CLOCKWISE_0;
            case 0:
                return CLOCKWISE_0;
            case 90:
                return CLOCKWISE_90;
            case MediaDecoder.ROTATE_180 /*180*/:
                return CLOCKWISE_180;
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return CLOCKWISE_270;
            default:
                int abs = (((Math.abs(i / 360) * 360) + 360) + i) % 360;
                if (abs > 315 || abs <= 45) {
                    return CLOCKWISE_0;
                }
                if (abs > 45 && abs <= ScriptIntrinsicBLAS.RsBlas_ztrmm) {
                    return CLOCKWISE_90;
                }
                if (abs <= ScriptIntrinsicBLAS.RsBlas_ztrmm || abs > XmpUtil.M_APP1) {
                    return CLOCKWISE_270;
                }
                return CLOCKWISE_180;
        }
    }

    /* renamed from: a */
    public static iqm m4096a(Display display) {
        return iqm.m4098c(display.getRotation());
    }

    /* renamed from: b */
    public static iqm m4097b(int i) {
        return iqm.m4095a((360 - i) % 360);
    }

    /* renamed from: c */
    public static iqm m4098c(int i) {
        switch (i) {
            case 0:
                return iqm.m4097b(0);
            case 1:
                return iqm.m4097b(90);
            case 2:
                return iqm.m4097b(MediaDecoder.ROTATE_180);
            case 3:
                return iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
            default:
                return CLOCKWISE_0;
        }
    }

    /* renamed from: a */
    public final int mo8806a() {
        return (360 - this.f7692e) % 360;
    }
}
