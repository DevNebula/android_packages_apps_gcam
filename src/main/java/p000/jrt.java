package p000;

import com.google.android.vision.face.Face;

/* compiled from: PG */
/* renamed from: jrt */
final class jrt extends jrx {
    jrt() {
        super();
    }

    /* renamed from: a */
    public final Float mo13842a(Face face) {
        return Float.valueOf(face.getIsRightEyeOpenScore());
    }
}
