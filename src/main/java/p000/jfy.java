package p000;

import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: jfy */
public final class jfy extends jgh implements jgc {
    /* renamed from: a */
    private final MediaFormat f21458a;
    /* renamed from: b */
    private final jhf f21459b;
    /* renamed from: c */
    private Handler f21460c = null;
    /* renamed from: d */
    private jgm f21461d;

    jfy(MediaFormat mediaFormat, jhf jhf) {
        this.f21458a = mediaFormat;
        this.f21459b = jhf;
        this.f21461d = new jgm(jgk.f8175b);
    }

    /* renamed from: a */
    public final /* synthetic */ jgb mo9396a() {
        return (jgb) super.mo9406c();
    }

    /* renamed from: d */
    private final jgb m13056d() {
        try {
            jgm jgm = this.f21461d;
            jgm.f8176a = new jgi(jgm.f8176a, this.f21459b);
            return new jgb(this.f21458a, this.f21459b, this.f21461d.f8176a, this.f21460c);
        } catch (Throwable th) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not build track encoder", th);
        }
    }
}
