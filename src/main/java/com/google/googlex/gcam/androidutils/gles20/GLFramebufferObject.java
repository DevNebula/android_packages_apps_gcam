package com.google.googlex.gcam.androidutils.gles20;

import android.opengl.GLES20;

/* compiled from: PG */
public class GLFramebufferObject implements AutoCloseable {
    /* renamed from: id */
    public int f2668id;

    public GLFramebufferObject() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.f2668id = iArr[0];
    }

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.f2668id);
    }

    public void close() {
        GLES20.glDeleteFramebuffers(1, new int[]{this.f2668id}, 0);
    }

    public boolean isComplete() {
        return GLES20.glCheckFramebufferStatus(36160) == 36053;
    }

    public static void unbindAll() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
