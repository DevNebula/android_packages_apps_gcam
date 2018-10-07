package p000;

/* compiled from: PG */
/* renamed from: awt */
public final class awt implements aws, eoc, eof, eoh, eoj, eok {
    /* renamed from: a */
    public static final String f10959a = bli.m887a("ActivityLifetime");
    /* renamed from: b */
    public final Object f10960b = new Object();
    /* renamed from: c */
    public final bam f10961c;
    /* renamed from: d */
    public ikb f10962d = this.f10961c.mo1881a(this.f10963e);
    /* renamed from: e */
    public ikb f10963e = this.f10961c.mo1882b(this.f10964f);
    /* renamed from: f */
    public ikb f10964f = this.f10961c.mo1880a();
    /* renamed from: g */
    public bcl f10965g = ((bcl) this.f10962d.mo8557a(new bcl()));
    /* renamed from: h */
    public bcl f10966h = ((bcl) this.f10963e.mo8557a(new bcl()));
    /* renamed from: i */
    public bcl f10967i = ((bcl) this.f10964f.mo8557a(new bcl()));

    private awt(bam bam) {
        this.f10961c = bam;
    }

    /* renamed from: a */
    public static awt m7169a(ivw ivw) {
        jri.m13404b((Object) ivw);
        jri.m13395a(ivw instanceof bam);
        return new awt((bam) ivw);
    }

    /* renamed from: a */
    public final iji mo1824a() {
        iji iji;
        synchronized (this.f10960b) {
            iji = this.f10964f;
        }
        return iji;
    }

    /* renamed from: b */
    public final iji mo1825b() {
        iji iji;
        synchronized (this.f10960b) {
            iji = this.f10963e;
        }
        return iji;
    }

    /* renamed from: c */
    public final boolean mo1826c() {
        boolean z;
        synchronized (this.f10960b) {
            z = this.f10965g.f11172a.get();
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo1827d() {
        boolean z;
        synchronized (this.f10960b) {
            z = this.f10967i.f11172a.get();
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo1828e() {
        boolean z;
        synchronized (this.f10960b) {
            z = this.f10966h.f11172a.get();
        }
        return z;
    }

    /* renamed from: f */
    public final void mo6365f() {
        synchronized (this.f10960b) {
            bli.m888a(f10959a, "onDestroy()");
            this.f10964f.close();
        }
    }

    /* renamed from: g */
    public final void mo6368g() {
        synchronized (this.f10960b) {
            bli.m888a(f10959a, "onPause()");
            this.f10962d.close();
        }
    }

    /* renamed from: h */
    public final void mo6370h() {
        synchronized (this.f10960b) {
            bli.m888a(f10959a, "onResume()");
            if (mo1826c()) {
                this.f10962d = this.f10961c.mo1881a(this.f10963e);
                this.f10965g = (bcl) this.f10962d.mo8557a(new bcl());
            }
        }
    }

    /* renamed from: i */
    public final void mo6372i() {
        synchronized (this.f10960b) {
            bli.m888a(f10959a, "onStart()");
            if (mo1828e()) {
                this.f10963e = this.f10961c.mo1882b(this.f10964f);
                this.f10966h = (bcl) this.f10963e.mo8557a(new bcl());
                this.f10962d = this.f10961c.mo1881a(this.f10963e);
                this.f10965g = (bcl) this.f10962d.mo8557a(new bcl());
            }
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        synchronized (this.f10960b) {
            bli.m888a(f10959a, "onStop()");
            this.f10963e.close();
        }
    }
}
