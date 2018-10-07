package p000;

/* compiled from: PG */
/* renamed from: fpa */
public final class fpa implements fre {
    /* renamed from: a */
    public static final String f18549a = bli.m887a("FBImgSavr");
    /* renamed from: b */
    public final Object f18550b = new Object();
    /* renamed from: c */
    public final img f18551c = new img(new fpb(this));
    /* renamed from: d */
    public int f18552d;
    /* renamed from: e */
    private final fre f18553e;
    /* renamed from: f */
    private final fre f18554f;
    /* renamed from: g */
    private final ilp f18555g;

    public fpa(fre fre, fre fre2) {
        this.f18553e = fre;
        this.f18554f = fre2;
        this.f18555g = ilq.m3872a(ilq.m3875a(fre.mo6873b(), new fpc(fre, fre2)));
    }

    /* renamed from: a */
    final void mo13268a(Object obj, kpw kpw) {
        jri.m13404b(obj);
        synchronized (this.f18550b) {
            this.f18552d--;
        }
        kpw.mo15641a(obj);
        this.f18551c.m2973a();
    }

    /* renamed from: a */
    final /* synthetic */ Integer mo13267a() {
        Integer valueOf;
        synchronized (this.f18550b) {
            valueOf = Integer.valueOf(this.f18552d);
        }
        return valueOf;
    }

    /* renamed from: b */
    public final ilp mo6873b() {
        return this.f18555g;
    }

    /* renamed from: a */
    public final kpk mo6872a(Object obj) {
        Object obj2;
        synchronized (this.f18550b) {
            this.f18552d++;
        }
        kpk d = kpw.m18486d();
        if (((Integer) this.f18553e.mo6873b().mo13673b()).intValue() > 0) {
            kow.m13878a(this.f18553e.mo6872a(obj), new fpd(this, d, obj), kpq.f8776a);
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            mo13269b(obj, d);
        }
        this.f18551c.m2973a();
        return d;
    }

    /* renamed from: b */
    final void mo13269b(Object obj, kpw kpw) {
        kow.m13878a(this.f18554f.mo6872a(obj), new fpe(this, kpw), kpq.f8776a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18553e);
        String valueOf2 = String.valueOf(this.f18554f);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length());
        stringBuilder.append("FallbackSingleImageSaver{primary: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", secondary: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
