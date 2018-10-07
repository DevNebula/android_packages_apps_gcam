package p000;

/* compiled from: PG */
/* renamed from: esq */
public final class esq implements eof, eoh, eth {
    /* renamed from: a */
    private final etc f24216a;
    /* renamed from: b */
    private volatile eti f24217b = eti.MICROVIDEO_MODE_OFF;
    /* renamed from: c */
    private final bmb f24218c;
    /* renamed from: d */
    private Runnable f24219d;
    /* renamed from: e */
    private Runnable f24220e;

    public esq(etc etc, bmb bmb) {
        this.f24216a = etc;
        this.f24218c = bmb;
    }

    /* renamed from: a */
    public final eti mo13180a() {
        return this.f24217b;
    }

    /* renamed from: g */
    public final void mo6368g() {
        this.f24216a.mo6587b((eth) this);
        mo13184c();
    }

    /* renamed from: h */
    public final void mo6370h() {
        this.f24216a.mo6582a((eth) this);
        this.f24216a.mo6584a(this.f24217b.mo6589a());
    }

    /* renamed from: a */
    public final void mo13181a(eti eti) {
        this.f24217b = eti;
        this.f24216a.mo6584a(eti.mo6589a());
        if (eti.mo6589a()) {
            switch (eti.ordinal()) {
                case 1:
                    this.f24216a.mo6583a(ezj.TRIMMING_MODE_AUTO);
                    return;
                case 2:
                    this.f24216a.mo6583a(ezj.TRIMMING_MODE_NEVER_DROP);
                    return;
                default:
                    String valueOf = String.valueOf(eti);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    stringBuilder.append("Unknown enabled microvideo mode: ");
                    stringBuilder.append(valueOf);
                    throw new RuntimeException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo13183b() {
        if (this.f24217b != eti.MICROVIDEO_MODE_OFF) {
            Runnable runnable = this.f24219d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: c */
    public final void mo13184c() {
        Runnable runnable = this.f24220e;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public final boolean mo13185d() {
        bsn bsn = this.f24218c.f1335a;
        return true;
    }

    /* renamed from: a */
    public final void mo13182a(Runnable runnable, Runnable runnable2) {
        this.f24219d = runnable;
        this.f24220e = runnable2;
    }
}
