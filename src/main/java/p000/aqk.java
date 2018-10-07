package p000;

/* compiled from: PG */
/* renamed from: aqk */
public final class aqk implements aqb, aqc {
    /* renamed from: a */
    public aqb f10667a;
    /* renamed from: b */
    public aqb f10668b;
    /* renamed from: c */
    private final aqc f10669c;
    /* renamed from: d */
    private boolean f10670d;

    aqk() {
        this(null);
    }

    public aqk(aqc aqc) {
        this.f10669c = aqc;
    }

    /* renamed from: b */
    public final void mo1677b() {
        this.f10670d = true;
        if (!(this.f10667a.mo1680e() || this.f10668b.mo1682g())) {
            this.f10668b.mo1677b();
        }
        if (this.f10670d && !this.f10667a.mo1682g()) {
            this.f10667a.mo1677b();
        }
    }

    /* renamed from: b */
    public final boolean mo1686b(aqb aqb) {
        aqc aqc = this.f10669c;
        boolean z = aqc != null ? aqc.mo1686b(this) : true;
        if (z && aqb.equals(this.f10667a)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo1687c(aqb aqb) {
        aqc aqc = this.f10669c;
        boolean z = aqc != null ? aqc.mo1687c(this) : true;
        if (z && aqb.equals(this.f10667a) && !mo1685a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo1688d(aqb aqb) {
        boolean z = false;
        aqc aqc = this.f10669c;
        boolean z2 = aqc != null ? aqc.mo1688d(this) : true;
        if (z2) {
            if (aqb.equals(this.f10667a)) {
                z = true;
            } else if (!this.f10667a.mo1681f()) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo1678c() {
        this.f10670d = false;
        this.f10668b.mo1678c();
        this.f10667a.mo1678c();
    }

    /* renamed from: a */
    public final boolean mo1685a() {
        boolean z;
        aqc aqc = this.f10669c;
        if (aqc == null) {
            z = false;
        } else if (aqc.mo1685a()) {
            z = true;
        } else {
            z = false;
        }
        if (z || mo1681f()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo1679d() {
        return this.f10667a.mo1679d();
    }

    /* renamed from: e */
    public final boolean mo1680e() {
        return this.f10667a.mo1680e() || this.f10668b.mo1680e();
    }

    /* renamed from: a */
    public final boolean mo1676a(aqb aqb) {
        if (!(aqb instanceof aqk)) {
            return false;
        }
        aqk aqk = (aqk) aqb;
        aqb aqb2 = this.f10667a;
        if (aqb2 != null) {
            if (!aqb2.mo1676a(aqk.f10667a)) {
                return false;
            }
        } else if (aqk.f10667a != null) {
            return false;
        }
        aqb2 = this.f10668b;
        if (aqb2 != null) {
            if (!aqb2.mo1676a(aqk.f10668b)) {
                return false;
            }
        } else if (aqk.f10668b != null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo1681f() {
        return this.f10667a.mo1681f() || this.f10668b.mo1681f();
    }

    /* renamed from: g */
    public final boolean mo1682g() {
        return this.f10667a.mo1682g();
    }

    /* renamed from: e */
    public final void mo1689e(aqb aqb) {
        if (aqb.equals(this.f10667a)) {
            aqc aqc = this.f10669c;
            if (aqc != null) {
                aqc.mo1689e(this);
            }
        }
    }

    /* renamed from: f */
    public final void mo1690f(aqb aqb) {
        if (!aqb.equals(this.f10668b)) {
            aqc aqc = this.f10669c;
            if (aqc != null) {
                aqc.mo1690f(this);
            }
            if (!this.f10668b.mo1680e()) {
                this.f10668b.mo1678c();
            }
        }
    }

    /* renamed from: h */
    public final void mo1683h() {
        this.f10670d = false;
        this.f10667a.mo1683h();
        this.f10668b.mo1683h();
    }

    /* renamed from: i */
    public final void mo1684i() {
        this.f10667a.mo1684i();
        this.f10668b.mo1684i();
    }
}
