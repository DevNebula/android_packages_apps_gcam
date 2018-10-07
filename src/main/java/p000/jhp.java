package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: jhp */
public final class jhp implements jhm {
    /* renamed from: b */
    private final jhf f21513b;
    /* renamed from: c */
    private final kpw f21514c = kpw.m18486d();

    public jhp(jhf jhf) {
        this.f21513b = jhf;
    }

    /* renamed from: a */
    public final kpk mo9434a() {
        return this.f21514c;
    }

    /* renamed from: a */
    public final void mo9436a(jho jho) {
        this.f21513b.mo9430a(jho.f8205a, jho.f8206b);
        jho.close();
    }

    /* renamed from: a */
    public final void mo9435a(MediaFormat mediaFormat) {
        this.f21514c.mo15641a((Object) mediaFormat);
    }
}
