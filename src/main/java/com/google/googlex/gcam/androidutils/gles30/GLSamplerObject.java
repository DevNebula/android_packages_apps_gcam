package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import java.io.Closeable;

/* compiled from: PG */
public class GLSamplerObject implements Closeable {
    /* renamed from: id */
    public final int f2678id;

    /* compiled from: PG */
    public final class CompareFunctions {
        public static final int ALWAYS = 519;
        public static final int EQUAL = 514;
        public static final int GEQUAL = 518;
        public static final int GREATER = 516;
        public static final int LEQUAL = 515;
        public static final int LESS = 513;
        public static final int NEVER = 512;
        public static final int NOTEQUAL = 517;

        private CompareFunctions() {
        }
    }

    /* compiled from: PG */
    public final class CompareModes {
        public static final int COMPARE_REF_TO_TEXTURE = 34894;
        public static final int NONE = 0;

        private CompareModes() {
        }
    }

    /* compiled from: PG */
    public final class FilterModes {
        public static final int LINEAR = 9729;
        public static final int LINEAR_MIPMAP_LINEAR = 9987;
        public static final int NEAREST = 9728;
        public static final int NEAREST_MIPMAP_LINEAR = 9986;
        public static final int NEAREST_MIPMAP_NEAREST = 9984;

        private FilterModes() {
        }
    }

    /* compiled from: PG */
    public final class WrapAxes {
        /* renamed from: R */
        public static final int f2675R = 32882;
        /* renamed from: S */
        public static final int f2676S = 10242;
        /* renamed from: T */
        public static final int f2677T = 10243;

        private WrapAxes() {
        }
    }

    /* compiled from: PG */
    public final class WrapModes {
        public static final int CLAMP_TO_EDGE = 33071;
        public static final int MIRRORED_REPEAT = 33648;
        public static final int REPEAT = 10497;

        private WrapModes() {
        }
    }

    public GLSamplerObject() {
        int[] iArr = new int[1];
        GLES30.glGenSamplers(1, iArr, 0);
        this.f2678id = iArr[0];
    }

    public void bind(int i) {
        GLES30.glBindSampler(i, this.f2678id);
    }

    public void close() {
        GLES30.glDeleteSamplers(1, new int[]{this.f2678id}, 0);
    }

    /* renamed from: id */
    public int mo5481id() {
        return this.f2678id;
    }

    public void setAllWrapModes(int i) {
        setWrapMode(WrapAxes.f2676S, i);
        setWrapMode(WrapAxes.f2677T, i);
        setWrapMode(WrapAxes.f2675R, i);
    }

    public void setCompareFunction(int i) {
        GLES30.glSamplerParameteri(this.f2678id, 34893, i);
    }

    public void setCompareMode(int i) {
        GLES30.glSamplerParameteri(this.f2678id, 34892, i);
    }

    public void setMagFilter(int i) {
        GLES30.glSamplerParameteri(this.f2678id, 10240, i);
    }

    public void setMaxLod(float f) {
        GLES30.glSamplerParameterf(this.f2678id, 33083, f);
    }

    public void setMinFilter(int i) {
        GLES30.glSamplerParameteri(this.f2678id, 10241, i);
    }

    public void setMinLod(float f) {
        GLES30.glSamplerParameterf(this.f2678id, 33082, f);
    }

    public void setMinMagFilters(int i) {
        setMinFilter(i);
        setMagFilter(i);
    }

    public void setMinMagFilters(int i, int i2) {
        setMinFilter(i);
        setMagFilter(i2);
    }

    public void setWrapMode(int i, int i2) {
        GLES30.glSamplerParameteri(this.f2678id, i, i2);
    }

    public void setWrapMode(int i, int i2, int i3) {
        setWrapMode(WrapAxes.f2676S, i);
        setWrapMode(WrapAxes.f2677T, i2);
        setWrapMode(WrapAxes.f2675R, i3);
    }

    public static void unbind(int i) {
        GLES30.glBindSampler(i, 0);
    }
}
