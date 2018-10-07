package p000;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: fea */
public final class fea implements fde {
    /* renamed from: a */
    private final iqz f18154a;
    /* renamed from: b */
    private final ird f18155b;

    fea(ird ird, ira ira) {
        this.f18155b = ird;
        this.f18154a = ira.mo8854a("Simple3A");
    }

    /* renamed from: a */
    public final fdf mo6751a(fip fip, fdg fdg, fim fim) {
        fec fec = new fec(fip, fdg, new fio(fim), this.f18155b, this.f18154a);
        try {
            fio fio;
            fio fio2;
            fdx b;
            ird ird;
            String valueOf;
            StringBuilder stringBuilder;
            switch (fdg.f4707b.ordinal()) {
                case 1:
                case 2:
                    fio = new fio(fec.f18162e);
                    fio2 = new fio(fec.f18162e);
                    b = fec.mo13231b(fec.f18160c.f4707b, fio, fio2);
                    fec.f18161d.mo6816a(Collections.singletonList(fio2.mo6807a()), fiv.REPEATING);
                    fec.f18161d.mo6816a(Collections.singletonList(fio.mo6807a()), fiv.NON_REPEATING);
                    ird = fec.f18158a;
                    valueOf = String.valueOf(fec.f18160c.f4707b);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder.append("AF-");
                    stringBuilder.append(valueOf);
                    ird.mo8856a(stringBuilder.toString());
                    fec.f18163f = b.mo13229a().mo13731b();
                    fec.f18158a.mo8857b();
                    break;
            }
            switch (fdg.f4706a.ordinal()) {
                case 2:
                    fio = new fio(fec.f18162e);
                    fio2 = new fio(fec.f18162e);
                    b = fec.mo13230a(fec.f18160c.f4706a, fio, fio2);
                    fec.f18161d.mo6816a(Collections.singletonList(fio2.mo6807a()), fiv.REPEATING);
                    fec.f18161d.mo6816a(Collections.singletonList(fio.mo6807a()), fiv.NON_REPEATING);
                    ird = fec.f18158a;
                    valueOf = String.valueOf(fec.f18160c.f4706a);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder.append("AE-");
                    stringBuilder.append(valueOf);
                    ird.mo8856a(stringBuilder.toString());
                    fec.f18163f = b.mo13229a().mo13731b();
                    fec.f18158a.mo8857b();
                    break;
            }
            switch (fdg.f4708c.ordinal()) {
                case 2:
                    fio = new fio(fec.f18162e);
                    fdx a = fec.m10438a(null, fio);
                    fec.f18161d.mo6816a(Collections.singletonList(fio.mo6807a()), fiv.REPEATING);
                    ird = fec.f18158a;
                    String valueOf2 = String.valueOf(fec.f18160c.f4708c);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 4);
                    stringBuilder.append("AWB-");
                    stringBuilder.append(valueOf2);
                    ird.mo8856a(stringBuilder.toString());
                    fec.f18163f = a.mo13229a().mo13731b();
                    fec.f18158a.mo8857b();
                    break;
            }
            return fec;
        } catch (Throwable th) {
            fec.close();
        }
    }
}
