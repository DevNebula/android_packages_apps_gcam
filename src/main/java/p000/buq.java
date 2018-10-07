package p000;

/* compiled from: PG */
/* renamed from: buq */
public final class buq implements buo {
    /* renamed from: a */
    private static final String f22856a = bli.m887a("ProcessingMedia");
    /* renamed from: b */
    private final eqi f22857b;
    /* renamed from: c */
    private hrd f22858c = hrd.INDETERMINATE;
    /* renamed from: d */
    private int f22859d = -1;
    /* renamed from: e */
    private boolean f22860e = false;
    /* renamed from: f */
    private agn f22861f;

    buq(eqi eqi) {
        this.f22857b = eqi;
    }

    public final synchronized void close() {
        this.f22861f = null;
    }

    /* renamed from: a */
    public final agn mo12427a() {
        return this.f22861f;
    }

    /* renamed from: b */
    public final eqi mo12430b() {
        return this.f22857b;
    }

    /* renamed from: c */
    public final hrd mo12431c() {
        return this.f22858c;
    }

    /* renamed from: d */
    public final int mo12432d() {
        return this.f22859d;
    }

    /* renamed from: e */
    public final boolean mo12433e() {
        return this.f22860e;
    }

    /* renamed from: a */
    public final synchronized void mo12429a(agn agn) {
        this.f22861f = agn;
        this.f22860e = true;
    }

    /* renamed from: a */
    public final void mo12428a(int i) {
        String str = f22856a;
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("updateProgressPercentage ");
        stringBuilder.append(i);
        bli.m888a(str, stringBuilder.toString());
        this.f22859d = Math.max(this.f22859d, Math.min(i, 100));
        if (this.f22859d > 0) {
            this.f22858c = hrd.DETERMINATE;
        }
    }
}
