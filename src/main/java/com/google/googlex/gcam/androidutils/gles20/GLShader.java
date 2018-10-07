package com.google.googlex.gcam.androidutils.gles20;

import android.content.res.Resources;
import com.google.googlex.gcam.androidutils.AndroidUtilities;

/* compiled from: PG */
public class GLShader {
    /* renamed from: id */
    public final int f2670id;

    public GLShader(int i, Resources resources, int i2) {
        this(i, AndroidUtilities.readRawResource(resources, i2));
    }

    public GLShader(int i, String str) {
        this.f2670id = GLUtilities.loadShader(i, str);
    }

    public int getId() {
        return this.f2670id;
    }
}
