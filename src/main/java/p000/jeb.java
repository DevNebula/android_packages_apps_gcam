package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jeb */
final class jeb implements jeg {
    /* renamed from: a */
    private final /* synthetic */ String f21438a;
    /* renamed from: b */
    private final /* synthetic */ float[] f21439b;

    jeb(String str, float[] fArr) {
        this.f21438a = str;
        this.f21439b = fArr;
    }

    /* renamed from: a */
    public final void mo9354a(jfc jfc) {
        GLES20.glUniformMatrix4fv(jfc.mo15717a(this.f21438a), 0, false, this.f21439b, 0);
    }
}
