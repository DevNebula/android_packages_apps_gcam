package com.google.googlex.gcam.androidutils.gles30;

import android.content.res.Resources;
import android.opengl.GLES30;
import com.google.googlex.gcam.androidutils.AndroidUtilities;
import java.io.Closeable;

/* compiled from: PG */
public class GLShader implements Closeable {
    /* renamed from: id */
    public final int f2679id;

    /* compiled from: PG */
    public final class ShaderTypes {
        public static final int FRAGMENT_SHADER = 35632;
        public static final int VERTEX_SHADER = 35633;

        private ShaderTypes() {
        }
    }

    public GLShader(int i, Resources resources, int i2) {
        this(i, AndroidUtilities.readRawResource(resources, i2));
    }

    public GLShader(int i, String str) {
        this.f2679id = GLUtilities.loadShader(i, str);
    }

    public void close() {
        GLES30.glDeleteShader(this.f2679id);
    }

    public int getId() {
        return this.f2679id;
    }
}
