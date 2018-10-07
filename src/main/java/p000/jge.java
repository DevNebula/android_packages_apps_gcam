package p000;

import android.media.MediaFormat;

/* renamed from: jge */
final /* synthetic */ class jge implements kaw {
    /* renamed from: a */
    private final jgd f21464a;
    /* renamed from: b */
    private final MediaFormat f21465b;
    /* renamed from: c */
    private final kpw f21466c;

    jge(jgd jgd, MediaFormat mediaFormat, kpw kpw) {
        this.f21464a = jgd;
        this.f21465b = mediaFormat;
        this.f21466c = kpw;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        jgd jgd = this.f21464a;
        MediaFormat mediaFormat = this.f21465b;
        kpw kpw = this.f21466c;
        jgb jgb = (jgb) obj;
        jgd.f8162a.add(jgb);
        kpw.mo15644b(kny.m18475a(jgb.f21463b, new jgf(mediaFormat), kpq.f8776a));
        return jgb;
    }
}
