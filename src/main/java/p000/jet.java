package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jet */
public final class jet extends jfa {
    /* renamed from: a */
    public final jfj f26726a;
    /* renamed from: b */
    public final int f26727b;
    /* renamed from: c */
    public int f26728c = 0;
    /* renamed from: d */
    public int f26729d = 0;
    /* renamed from: f */
    private final int f26730f;

    jet(jfj jfj, int i, int i2, int i3) {
        super(i);
        this.f26726a = jfj;
        this.f26727b = i2;
        this.f26730f = i3;
    }

    /* renamed from: b */
    public final void mo15715b() {
        if (jeh.m4489a(this.f26730f) != this.f26563e) {
            GLES20.glBindBuffer(this.f26727b, this.f26563e);
        }
    }

    public final void close() {
        int a = jeh.m4489a(this.f26730f);
        if (!(a == 0 || a == this.f26563e)) {
            GLES20.glBindBuffer(this.f26727b, 0);
        }
        GLES20.glDeleteBuffers(1, new int[]{this.f26563e}, 0);
    }

    public final String toString() {
        int i = this.f26563e;
        int i2 = this.f26727b;
        int i3 = this.f26730f;
        StringBuilder stringBuilder = new StringBuilder(78);
        stringBuilder.append("GLRawBuffer{handle=");
        stringBuilder.append(i);
        stringBuilder.append(", target=");
        stringBuilder.append(i2);
        stringBuilder.append(", bindingGetter=");
        stringBuilder.append(i3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
