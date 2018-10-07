package p000;

import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2016.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: hsy */
public final class hsy {
    /* renamed from: a */
    public static final Key f6966a;
    /* renamed from: b */
    public static final CaptureResult.Key f6967b;
    /* renamed from: c */
    private static final boolean f6968c = hsx.m3413a(hsx.f6964a, 1);
    /* renamed from: d */
    private static final boolean f6969d = hsx.m3413a(hsx.f6964a, 2);

    static {
        CaptureResult.Key key = null;
        Key key2 = f6968c ? ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : f6969d ? com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : null;
        f6966a = key2;
        if (f6968c) {
            key = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_SCENE_CHANGE;
        } else if (f6969d) {
            key = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_SCENE_CHANGE;
        }
        f6967b = key;
    }
}
