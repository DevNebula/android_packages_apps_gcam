package p000;

/* compiled from: PG */
/* renamed from: etw */
public final class etw implements jgx {
    /* renamed from: a */
    private final jgx f17800a;

    public etw(jgx jgx) {
        this.f17800a = jgx;
    }

    /* renamed from: a */
    public final jhf mo9414a(jhe jhe) {
        Object obj = 1;
        jhf a = this.f17800a.mo9414a(jhe);
        String string = jhe.f8199b.getString("mime");
        if (!(string.startsWith("video/") || string.startsWith("audio/"))) {
            obj = null;
        }
        return obj != null ? jgn.m13076a(a) : a;
    }

    /* renamed from: a */
    public final void mo9415a() {
        this.f17800a.mo9415a();
    }

    /* renamed from: b */
    public final kpk mo9416b() {
        return this.f17800a.mo9416b();
    }
}
