package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fky */
final class fky implements fjn, ikz {
    /* renamed from: a */
    private final fjn f24267a;
    /* renamed from: b */
    private final fyt f24268b;

    fky(fjn fjn, fkw fkw) {
        this.f24267a = fjn;
        this.f24268b = fkw.f18387a;
    }

    public final void close() {
        this.f24267a.close();
    }

    /* renamed from: c */
    public final List mo13253c() {
        List<fjj> c = this.f24267a.mo13253c();
        List arrayList = new ArrayList(c.size());
        for (fjj fjj : c) {
            fyr d = this.f24268b.mo6950d();
            if (d != null) {
                arrayList.add(fma.m17700a(fjj, d));
            } else {
                fjj.mo1896a();
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo13254d() {
        List<fjj> d = this.f24267a.mo13254d();
        List arrayList = new ArrayList(d.size());
        for (fjj fjj : d) {
            fyr d2 = this.f24268b.mo6950d();
            if (d2 != null) {
                arrayList.add(fma.m17701b(fjj, d2));
            } else {
                fjj.mo1896a();
            }
        }
        return arrayList;
    }

    /* renamed from: x_ */
    public final fhz mo6796x_() {
        return this.f24267a.mo6796x_();
    }

    /* renamed from: t_ */
    public final String mo8597t_() {
        return "ResidualFrameStoreWrapper";
    }
}
