package p000;

import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jtq */
public abstract class jtq implements jtv {
    /* renamed from: a */
    public final TreeSet f21738a = new TreeSet();
    /* renamed from: b */
    public final TreeSet f21739b = new TreeSet();
    /* renamed from: c */
    public final Object f21740c = new Object();
    /* renamed from: d */
    private final jvx f21741d;
    /* renamed from: e */
    private final jtr f21742e = new jtr(this);

    public jtq(jvx jvx) {
        jri.m13404b((Object) jvx);
        this.f21741d = jvx;
        this.f21741d.mo15057a(this.f21742e);
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
    }

    /* renamed from: a */
    public final void mo9555a() {
        synchronized (this.f21740c) {
            this.f21738a.clear();
            this.f21739b.clear();
        }
    }
}
