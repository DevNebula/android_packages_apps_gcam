package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.apps.refocus.image.BitmapNative;
import com.google.android.apps.refocus.image.DepthTransform;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.image.RangeInverseDepthTransform;
import com.google.android.apps.refocus.image.RangeLinearDepthTransform;

/* compiled from: PG */
/* renamed from: hrw */
public final class hrw {
    /* renamed from: d */
    private static final String f6893d = bli.m887a(GDepthUtil.DEPTH_PREFIX);
    /* renamed from: a */
    public String f6894a;
    /* renamed from: b */
    public byte[] f6895b;
    /* renamed from: c */
    public DepthTransform f6896c;

    /* renamed from: a */
    public static hrw m3371a(RGBZ rgbz) {
        if (rgbz == null || rgbz.getBitmap() == null || rgbz.getDepthTransform() == null) {
            bli.m891b(f6893d, "null rgbz passed to fromBitmap");
            return null;
        }
        hrw hrw = new hrw();
        hrw.f6896c = rgbz.getDepthTransform();
        hrw.f6894a = GDepthUtil.MIME_JPEG;
        hrw.f6895b = BitmapNative.encodeChannelAsJPEG(rgbz.getBitmap(), 3, 95);
        if (hrw.f6895b != null) {
            return hrw;
        }
        bli.m891b(f6893d, "null depthmap data in fromBitmap");
        return null;
    }

    /* renamed from: a */
    public static hrw m3372a(C0556wd c0556wd) {
        if (c0556wd == null) {
            return null;
        }
        GDepthUtil.initialize();
        hrw hrw = new hrw();
        try {
            hrw.f6894a = c0556wd.mo11458j(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.MIME);
            String str;
            String str2;
            String valueOf;
            if (GDepthUtil.MIME_PNG.equals(hrw.f6894a) || GDepthUtil.MIME_JPEG.equals(hrw.f6894a)) {
                hrw.f6895b = c0556wd.mo11453e(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, "Data");
                if (hrw.f6895b == null) {
                    bli.m891b(f6893d, "No GDepth data");
                    return null;
                }
                try {
                    float floatValue = c0556wd.mo11456h(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.NEAR).floatValue();
                    float floatValue2 = c0556wd.mo11456h(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.FAR).floatValue();
                    String j = c0556wd.mo11458j(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.FORMAT);
                    if (RangeInverseDepthTransform.FORMAT.equals(j)) {
                        hrw.f6896c = new RangeInverseDepthTransform(floatValue, floatValue2);
                    } else if (RangeLinearDepthTransform.FORMAT.equals(j)) {
                        hrw.f6896c = new RangeLinearDepthTransform(floatValue, floatValue2);
                    } else {
                        str = f6893d;
                        str2 = "Unknown GDepth format: ";
                        valueOf = String.valueOf(j);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m891b(str, valueOf);
                        return null;
                    }
                    return hrw;
                } catch (Exception e) {
                    bli.m891b(f6893d, e.toString());
                    return null;
                }
            }
            str = f6893d;
            str2 = "Unknown GDepth mime: ";
            valueOf = String.valueOf(hrw.f6894a);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m891b(str, valueOf);
            return null;
        } catch (Exception e2) {
            bli.m891b(f6893d, e2.toString());
            return null;
        }
    }
}
