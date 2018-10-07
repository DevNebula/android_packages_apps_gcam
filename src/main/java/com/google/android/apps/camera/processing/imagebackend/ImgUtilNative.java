package com.google.android.apps.camera.processing.imagebackend;

import java.nio.ByteBuffer;
import p000.bli;

/* compiled from: PG */
public class ImgUtilNative {
    /* renamed from: a */
    private static final String f2581a = bli.m887a("ImgUtilNative");

    static {
        System.loadLibrary("jni_imgutil");
    }

    private static native float measureSharpnessOnEdgeGivenCropNative(int i, int i2, Object obj, int i3, int i4, int i5, int i6, int i7, int i8);

    /* renamed from: a */
    public static float m1353a(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, int i5, int i6, int i7, int i8) {
        bli.m894c(f2581a, String.format("Calculating sharpness metric on edge, image size = (%d, %d) pixel stride = %d row stride = %d cropRect = (%d, %d, %d, %d) ", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}));
        return measureSharpnessOnEdgeGivenCropNative(i, i2, byteBuffer, i3, i4, i5, i6, i7, i8);
    }
}
