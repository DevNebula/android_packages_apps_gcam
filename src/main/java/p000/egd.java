package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: egd */
public final class egd extends ehu implements gqm {
    /* renamed from: a */
    public gql f26314a = new gql(this.f26315b, true);
    /* renamed from: b */
    public gqn f26315b;
    /* renamed from: c */
    public gqn f26316c;

    public egd(eih eih, ilp ilp, ilp ilp2, bxj bxj, edk edk, eil eil) {
        super(eih, ilp, ilp2, bxj);
        this.f26315b = new gqn(new ege(this), edk);
        this.f26316c = new gqn(new egf(this), eil);
    }

    /* renamed from: h */
    public final void mo7345h() {
        mo13459i();
    }

    /* renamed from: i */
    public final void mo13459i() {
        this.f26314a.mo7346a();
        this.f26315b.mo13459i();
        this.f26316c.mo13459i();
    }

    /* renamed from: a */
    public final void mo7343a() {
        super.mo7343a();
        this.f26314a.mo7348b();
    }

    /* renamed from: b */
    public final void mo7344b() {
        super.mo7344b();
        this.f26314a.mo7349c();
    }

    /* renamed from: a */
    public final void mo14880a(BottomBarController bottomBarController, hcd hcd, how how, gyz gyz) {
        if (!this.f26314a.mo7352f()) {
            super.mo14880a(bottomBarController, hcd, how, gyz);
            this.f26314a.f5995a = C0252go.f5887bg;
        }
    }

    /* renamed from: K */
    public final void mo13408K() {
        if (this.f26314a.mo7351e() != null) {
            ((gqj) this.f26314a.mo7351e().f24440a).mo13408K();
        }
    }

    /* renamed from: L */
    public final void mo13409L() {
        if (this.f26314a.mo7351e() != null) {
            ((gqj) this.f26314a.mo7351e().f24440a).mo13409L();
        }
    }
}
