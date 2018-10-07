package com.google.googlex.gcam.androidutils.gles20;

import android.opengl.GLES20;

/* compiled from: PG */
public class GLTexture implements AutoCloseable {
    /* renamed from: id */
    public final int f2671id;
    public final int internalFormat;
    public final int target;

    GLTexture(int i, int i2) {
        this.target = i;
        this.internalFormat = i2;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.f2671id = iArr[0];
    }

    public void bind() {
        GLES20.glBindTexture(this.target, this.f2671id);
    }

    public void close() {
        GLES20.glDeleteTextures(1, new int[]{this.f2671id}, 0);
    }

    /* renamed from: id */
    public int mo5414id() {
        return this.f2671id;
    }

    public int internalFormat() {
        return this.internalFormat;
    }

    public static int maxCombinedTextureImageUnits() {
        return GLUtilities.glGetInteger(35661);
    }

    public int target() {
        return this.target;
    }

    public void unbind() {
        GLES20.glBindTexture(this.target, 0);
    }
}
