package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jeh */
public final class jeh {
    /* renamed from: a */
    private static final int[] f8107a = new int[1];

    /* renamed from: a */
    public static int m4489a(int i) {
        GLES20.glGetIntegerv(i, f8107a, 0);
        return f8107a[0];
    }
}
