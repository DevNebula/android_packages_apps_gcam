package p000;

import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: PG */
/* renamed from: ejp */
public final class ejp extends Exception {
    /* renamed from: a */
    private static final String f3894a = bli.m887a("OpenGLException");

    public ejp(String str) {
        super(str);
        bli.m892b(f3894a, str, this);
    }

    public ejp(String str, String str2) {
        super(str);
        String str3 = f3894a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" : ");
        stringBuilder.append(str2);
        bli.m892b(str3, stringBuilder.toString(), this);
    }

    /* renamed from: a */
    public static void m1849a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String gluErrorString = GLU.gluErrorString(glGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(gluErrorString).length());
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(gluErrorString);
            stringBuilder.append(" ");
            stringBuilder.append(glGetError);
            throw new ejp(stringBuilder.toString());
        }
    }
}
