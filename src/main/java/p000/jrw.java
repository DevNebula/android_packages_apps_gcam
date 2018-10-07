package p000;

import com.google.android.vision.face.Face;

/* compiled from: PG */
/* renamed from: jrw */
final class jrw extends jrx {
    jrw() {
        super();
    }

    /* renamed from: a */
    public final Float mo13842a(Face face) {
        return Float.valueOf(face.getIsSmilingScore());
    }
}
