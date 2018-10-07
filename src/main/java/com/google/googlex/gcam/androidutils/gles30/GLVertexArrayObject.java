package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import java.io.Closeable;

/* compiled from: PG */
public class GLVertexArrayObject implements Closeable {
    /* renamed from: id */
    public int f2683id;

    public GLVertexArrayObject() {
        int[] iArr = new int[1];
        GLES30.glGenVertexArrays(1, iArr, 0);
        this.f2683id = iArr[0];
    }

    public void attach(int i, int i2, int i3, boolean z, int i4, GLBufferObject gLBufferObject) {
        attach(i, i2, i3, z, i4, gLBufferObject, 0);
    }

    public void attach(int i, int i2, int i3, boolean z, int i4, GLBufferObject gLBufferObject, int i5) {
        gLBufferObject.bind();
        GLES30.glVertexAttribPointer(i, i2, i3, z, i4, i5);
        GLES30.glEnableVertexAttribArray(i);
    }

    public void bind() {
        GLES30.glBindVertexArray(this.f2683id);
    }

    public void close() {
        GLES30.glDeleteVertexArrays(1, new int[]{this.f2683id}, 0);
        this.f2683id = 0;
    }

    public void detach(int i) {
        GLES30.glDisableVertexAttribArray(i);
    }

    /* renamed from: id */
    public int mo5509id() {
        return this.f2683id;
    }

    public void unbind() {
        GLES30.glBindVertexArray(0);
    }
}
