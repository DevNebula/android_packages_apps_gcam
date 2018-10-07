package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fkx */
final class fkx implements fjl {
    /* renamed from: a */
    private final fjl f26353a;
    /* renamed from: b */
    private final fyd f26354b;

    fkx(fkw fkw, fjl fjl) {
        this.f26353a = fjl;
        this.f26354b = new fyd(fkw.f18387a);
    }

    public final void close() {
        this.f26353a.close();
        this.f26354b.close();
    }

    /* renamed from: d */
    public final int mo14895d() {
        return this.f26354b.mo13308e();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12344a() {
        fjj fjj = (fjj) this.f26353a.mo12344a();
        fyr d = this.f26354b.mo6950d();
        if (d != null) {
            return fma.m17700a(fjj, d);
        }
        throw new bbg();
    }

    /* renamed from: x_ */
    public final fhz mo6796x_() {
        return this.f26353a.mo6796x_();
    }

    /* renamed from: a */
    public final kpk mo14893a(int i) {
        kpk a = this.f26353a.mo14893a(i);
        kpk b = this.f26354b.mo13305b(i);
        return kow.m13877a(a, b);
    }

    /* renamed from: b */
    public final boolean mo12345b() {
        return this.f26353a.mo12345b();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12346c() {
        fjj fjj = (fjj) this.f26353a.mo12346c();
        if (fjj == null) {
            return null;
        }
        Object d = this.f26354b.mo6950d();
        jri.m13404b(d);
        return fma.m17700a(fjj, d);
    }

    /* renamed from: b */
    public final boolean mo14894b(int i) {
        if (this.f26354b.mo13307c(i)) {
            if (this.f26353a.mo14894b(i)) {
                return true;
            }
            fyd fyd = this.f26354b;
            if (i > 0) {
                int i2;
                int i3;
                ArrayList arrayList = new ArrayList();
                synchronized (fyd.f18891a) {
                    i2 = fyd.f18896f;
                    if (i > i2) {
                        i = i2;
                    }
                    fyd.f18896f = i2 - i;
                    int min = Math.min(fyd.f18894d.size(), i);
                    for (i3 = 0; i3 < min; i3++) {
                        arrayList.add((fyr) fyd.f18894d.remove());
                    }
                }
                fyd.mo13306b();
                int size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    i3 = i2 + 1;
                    ((fyr) arrayList.get(i2)).close();
                    i2 = i3;
                }
                synchronized (fyd.f18891a) {
                    fyd.f18895e.f24640b = Integer.valueOf(fyd.mo13309f());
                }
                fyd.f18895e.f24639a.m2973a();
            }
        }
        return false;
    }
}
