package p000;

/* compiled from: PG */
/* renamed from: jtu */
public final class jtu extends jtq {
    /* renamed from: d */
    private final long f24805d = 1000000000;

    public jtu(jvx jvx) {
        super(jvx);
        jri.m13395a(true);
        jri.m13395a(true);
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        jzf jzc;
        synchronized (this.f21740c) {
            if (this.f21738a.isEmpty() || j < ((Long) this.f21738a.first()).longValue() || j > ((Long) this.f21738a.last()).longValue() + this.f24805d) {
                jzc = new jzc(0.0f);
            } else {
                jzc = new jzc(1.0f);
            }
        }
        return jzc;
    }
}
