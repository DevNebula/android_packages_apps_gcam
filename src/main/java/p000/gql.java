package p000;

/* compiled from: PG */
/* renamed from: gql */
public final class gql {
    /* renamed from: a */
    public int f5995a = C0252go.f5885be;
    /* renamed from: b */
    private final gqn f5996b;
    /* renamed from: c */
    private gqn f5997c;
    /* renamed from: d */
    private boolean f5998d;

    public gql(gqn gqn, boolean z) {
        this.f5997c = gqn;
        this.f5996b = gqn;
        this.f5998d = z;
    }

    /* renamed from: a */
    public final void mo7346a() {
        boolean z;
        if (this.f5995a == C0252go.f5887bg) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        this.f5997c = this.f5996b;
    }

    /* renamed from: b */
    public final void mo7348b() {
        if (this.f5995a == C0252go.f5887bg) {
            if (!this.f5998d) {
                this.f5997c = this.f5996b;
            }
            ((gqn) jqk.m13354c(this.f5997c)).mo7343a();
            this.f5995a = C0252go.f5886bf;
        }
    }

    /* renamed from: c */
    public final void mo7349c() {
        if (this.f5995a == C0252go.f5886bf) {
            ((gqn) jqk.m13354c(this.f5997c)).mo7344b();
            this.f5995a = C0252go.f5887bg;
        }
    }

    /* renamed from: d */
    public final void mo7350d() {
        jri.m13391a(this.f5997c, (Object) "A state must be set before exiting it");
        this.f5997c.mo7344b();
        this.f5997c = null;
    }

    /* renamed from: e */
    public final gqn mo7351e() {
        if (this.f5995a != C0252go.f5886bf) {
            return null;
        }
        return this.f5997c;
    }

    /* renamed from: f */
    public final boolean mo7352f() {
        return this.f5995a != C0252go.f5885be;
    }

    /* renamed from: a */
    public final void mo7347a(gqn gqn) {
        boolean z;
        jri.m13404b((Object) gqn);
        if (this.f5997c == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Setting new state without first exiting current state");
        if (this.f5995a == C0252go.f5885be) {
            this.f5995a = C0252go.f5886bf;
        }
        this.f5997c = gqn;
        this.f5997c.mo7343a();
    }
}
