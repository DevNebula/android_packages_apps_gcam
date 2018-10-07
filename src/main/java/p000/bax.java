package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bax */
public final class bax {
    /* renamed from: a */
    public final Executor f1079a;
    /* renamed from: b */
    public ird f1080b;
    /* renamed from: c */
    public iqz f1081c;
    /* renamed from: d */
    public iks f1082d;
    /* renamed from: e */
    private final kpw f1083e = kpw.m18486d();
    /* renamed from: f */
    private kpk f1084f = this.f1083e;

    private bax(Executor executor) {
        this.f1079a = executor;
    }

    /* renamed from: a */
    public final kpk mo1890a() {
        boolean z = false;
        if (!(this.f1083e.isDone() || this.f1083e.isCancelled())) {
            z = true;
        }
        jri.m13405b(z);
        if (!(this.f1082d == null && this.f1081c == null)) {
            kow.m13878a(this.f1084f, new bba(this), kpq.f8776a);
        }
        this.f1083e.mo15641a(Boolean.valueOf(true));
        return this.f1084f;
    }

    /* renamed from: a */
    public final bax mo1889a(kwk kwk, String str) {
        iqz iqz = this.f1081c;
        if (iqz != null) {
            String valueOf = String.valueOf(str);
            String str2 = "Futures.transform: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            iqz.mo8832b(valueOf);
        }
        this.f1084f = kny.m18476a(this.f1084f, new bay(this, str, kwk), this.f1079a);
        iqz iqz2 = this.f1081c;
        if (iqz2 != null) {
            bbz.m812a(iqz2, this.f1084f, String.valueOf(str).concat(" complete."), String.valueOf(str).concat(" failed!"));
        }
        return this;
    }

    /* renamed from: b */
    public final bax mo1891b(kwk kwk, String str) {
        kow.m13878a(this.f1084f, new baz(this, str, kwk), this.f1079a);
        return this;
    }

    /* renamed from: a */
    public static bax m805a(Executor executor) {
        return new bax(executor);
    }
}
