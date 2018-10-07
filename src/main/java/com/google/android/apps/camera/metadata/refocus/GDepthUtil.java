package com.google.android.apps.camera.metadata.refocus;

import com.google.android.apps.refocus.image.RangeInverseDepthTransform;
import com.google.android.apps.refocus.image.RangeLinearDepthTransform;
import p000.C0556wd;
import p000.C0557we;
import p000.jri;
import p000.kqg;

/* compiled from: PG */
public class GDepthUtil {
    public static final String DEPTH_PREFIX = "GDepth";
    public static final String FAR = "Far";
    public static final String FORMAT = "Format";
    public static final String GOOGLE_DEPTH_NAMESPACE = "http://ns.google.com/photos/1.0/depthmap/";
    public static final String MIME = "Mime";
    public static final String MIME_JPEG = "image/jpeg";
    public static final String MIME_PNG = "image/png";
    public static final String NEAR = "Near";

    public static void initialize() {
        try {
            C0557we.f9955a.mo11459a(GOOGLE_DEPTH_NAMESPACE, DEPTH_PREFIX);
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }

    public static boolean isPresent(C0556wd c0556wd) {
        if (c0556wd == null) {
            return false;
        }
        C0556wd c0556wd2 = (C0556wd) jri.m13404b((Object) c0556wd);
        initialize();
        try {
            String j = c0556wd2.mo11458j(GOOGLE_DEPTH_NAMESPACE, FORMAT);
            if (!RangeInverseDepthTransform.FORMAT.equals(j) && !RangeLinearDepthTransform.FORMAT.equals(j)) {
                return false;
            }
            j = c0556wd2.mo11458j(GOOGLE_DEPTH_NAMESPACE, MIME);
            if (!MIME_PNG.equals(j) && !MIME_JPEG.equals(j)) {
                return false;
            }
            double doubleValue = c0556wd2.mo11456h(GOOGLE_DEPTH_NAMESPACE, NEAR).doubleValue();
            double doubleValue2 = c0556wd2.mo11456h(GOOGLE_DEPTH_NAMESPACE, FAR).doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || doubleValue <= 0.0d || doubleValue2 <= 0.0d) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
