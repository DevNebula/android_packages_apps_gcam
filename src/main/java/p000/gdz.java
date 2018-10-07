package p000;

/* compiled from: PG */
/* renamed from: gdz */
public final class gdz {
    /* renamed from: a */
    private kbg f5345a;
    /* renamed from: b */
    private kbg f5346b;

    gdz(byte b) {
        this();
        this.f5345a = kau.f21835a;
        this.f5346b = kau.f21835a;
    }

    /* renamed from: a */
    public final gdy mo7062a() {
        return new gdi(this.f5345a, this.f5346b);
    }

    /* renamed from: a */
    public final gdz mo7063a(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null extended");
        }
        this.f5346b = kbg;
        return this;
    }

    /* renamed from: b */
    public final gdz mo7064b(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null main");
        }
        this.f5345a = kbg;
        return this;
    }
}
