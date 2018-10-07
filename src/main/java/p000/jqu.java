package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: jqu */
public class jqu implements jqt {
    /* renamed from: a */
    private final jrj f21659a;
    /* renamed from: b */
    private final jqo f21660b;

    public jqu(jqo jqo, jrj jrj) {
        jri.m13404b((Object) jqo);
        jri.m13404b((Object) jrj);
        this.f21660b = jqo;
        this.f21659a = jrj;
    }

    /* renamed from: a */
    public final void mo9532a(long j, Bitmap bitmap, boolean z) {
        jri.m13404b((Object) bitmap);
        this.f21659a.mo9538a(j, new jqx(this.f21660b.mo9530a("summary", bitmap)), z);
    }

    /* renamed from: a */
    public final void mo9531a() {
    }
}
