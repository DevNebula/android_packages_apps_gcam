package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: flx */
final class flx implements fjn, ikz {
    /* renamed from: a */
    private final flg f24273a;
    /* renamed from: b */
    private final fhz f24274b;
    /* renamed from: c */
    private final iqo f24275c;

    flx(flg flg, fhz fhz, iqo iqo) {
        this.f24273a = flg;
        this.f24274b = fhz;
        this.f24275c = iqo;
    }

    public final void close() {
        this.f24275c.close();
    }

    /* renamed from: c */
    public final List mo13253c() {
        return this.f24273a.mo14898a();
    }

    /* renamed from: d */
    public final List mo13254d() {
        return this.f24273a.mo14899c();
    }

    /* renamed from: x_ */
    public final fhz mo6796x_() {
        return this.f24274b;
    }

    /* renamed from: t_ */
    public final String mo8597t_() {
        return "ResidualFrameStore";
    }
}
