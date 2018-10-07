package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jed */
final class jed implements jeg {
    /* renamed from: a */
    private final /* synthetic */ String f21440a;
    /* renamed from: b */
    private final /* synthetic */ float f21441b;
    /* renamed from: c */
    private final /* synthetic */ float f21442c = 0.0f;
    /* renamed from: d */
    private final /* synthetic */ float f21443d;
    /* renamed from: e */
    private final /* synthetic */ float f21444e;

    jed(String str, float f, float f2) {
        this.f21440a = str;
        this.f21441b = f;
        this.f21443d = f2;
        this.f21444e = 1.0f;
    }

    /* renamed from: a */
    public final void mo9354a(jfc jfc) {
        GLES20.glUniform4f(jfc.mo15717a(this.f21440a), this.f21441b, 0.0f, this.f21443d, this.f21444e);
    }
}
