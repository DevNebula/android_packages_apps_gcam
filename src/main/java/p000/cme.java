package p000;

/* compiled from: PG */
/* renamed from: cme */
public final class cme {
    /* renamed from: a */
    private cre f2320a;

    public cme(cre cre) {
        this.f2320a = cre;
    }

    /* renamed from: a */
    public final cov mo2372a() {
        if (this.f2320a.mo5692e() != null && (this.f2320a.mo5692e() instanceof cou)) {
            return (cov) ((cou) this.f2320a.mo5692e()).f13139e;
        }
        throw new RuntimeException("Trying to show non-BurstItem item in the burst editor");
    }

    /* renamed from: a */
    public final cmf mo2371a(int i) {
        int b = mo2373b();
        if (i < 0 || i >= b) {
            String a;
            String str = "index";
            if (i < 0) {
                a = jri.m13393a("%s (%s) must not be negative", str, Integer.valueOf(i));
            } else if (b < 0) {
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("negative size: ");
                stringBuilder.append(b);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                a = jri.m13393a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(b));
            }
            throw new IndexOutOfBoundsException(a);
        }
        cov a2 = mo2372a();
        int size = a2.mo12884b().size();
        if (size == a2.mo12885c().size()) {
            return new cmf(cmg.BEST_ELEMENTS_THUMBNAIL, (cot) a2.mo12885c().get(i), i);
        }
        if (size == 0) {
            return new cmf(cmg.ALL_ELEMENTS_THUMBNAIL, (cot) a2.mo12885c().get(i), i);
        }
        size++;
        if (i == 0) {
            return new cmf(cmg.BEST_ELEMENTS_HEADER, null, 0);
        }
        int i2;
        if (i < size) {
            i2 = i - 1;
            return new cmf(cmg.BEST_ELEMENTS_THUMBNAIL, (cot) a2.mo12884b().get(i2), i2);
        } else if (i == size) {
            return new cmf(cmg.ALL_ELEMENTS_HEADER, null, 0);
        } else {
            i2 = (i - size) - 1;
            return new cmf(cmg.ALL_ELEMENTS_THUMBNAIL, (cot) a2.mo12885c().get(i2), i2);
        }
    }

    /* renamed from: b */
    public final int mo2373b() {
        cov a = mo2372a();
        int size = a.mo12884b().size();
        int size2 = a.mo12885c().size();
        return (size == size2 || size == 0) ? size2 : size2 + ((size + 1) + 1);
    }
}
