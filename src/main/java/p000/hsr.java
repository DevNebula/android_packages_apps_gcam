package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.DepthOfFieldOptions;
import com.google.android.apps.refocus.processing.FaceDetector;
import com.google.android.apps.refocus.processing.FocusSettings;

/* compiled from: PG */
/* renamed from: hsr */
public final class hsr extends Thread {
    /* renamed from: a */
    private final /* synthetic */ RGBZ f6952a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f6953b;
    /* renamed from: c */
    private final /* synthetic */ icu f6954c;

    public hsr(icu icu, RGBZ rgbz, Runnable runnable) {
        this.f6954c = icu;
        this.f6952a = rgbz;
        this.f6953b = runnable;
    }

    public final void run() {
        icu icu = this.f6954c;
        RGBZ rgbz = this.f6952a;
        icu.f20897h = new DepthOfFieldOptions(rgbz, 512);
        RGBZ rgbz2 = icu.f20897h.rgbz;
        if (rgbz2 == null || !rgbz2.hasDepthmap()) {
            icu.f20897h = null;
            icu.f20905p.countDown();
        } else {
            icu.f20898i = Bitmap.createBitmap(icu.f20897h.rgbz.getWidth(), icu.f20897h.rgbz.getHeight(), Config.ARGB_8888);
            icu.f20900k = new hsk(icu.f20897h.rgbz);
            if (rgbz.hasFocusSettings()) {
                icu.f20902m = rgbz.getFocusSettings();
            } else {
                icu.f20902m = FocusSettings.createDefault(new FaceDetector(icu.f20893d, icu.f20894e), icu.f20897h.rgbz, icu.f20900k);
            }
            hsk hsk = icu.f20900k;
            FocusSettings focusSettings = icu.f20902m;
            float f = focusSettings.focalDistance;
            float f2 = focusSettings.depthOfField;
            float f3 = focusSettings.blurAtInfinity;
            float a = hsk.mo8086a(f, f2);
            if (a != 0.0f) {
                f3 *= a;
            }
            icu.f20901l = f3;
            icu.f20905p.countDown();
            if (!rgbz.hasFocusSettings()) {
                icu.mo13629e();
            }
        }
        Runnable runnable = this.f6953b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
