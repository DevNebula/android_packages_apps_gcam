package p000;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: eem */
public final class eem extends edf implements gqm {
    /* renamed from: n */
    public gql f26276n;
    /* renamed from: o */
    public gqn f26277o;
    /* renamed from: p */
    public gqn f26278p = new gqn(new eeo(this), new gqi[0]);
    /* renamed from: q */
    public gqn f26279q;
    /* renamed from: r */
    public gqn f26280r;

    public eem(eih eih, ilp ilp, boolean z, edo edo, ecd ecd, ehp ehp, ehg ehg) {
        super(eih, ilp, z);
        this.f26277o = new gqn(new een(this), edo, ecd);
        this.f26279q = new gqn(new eep(this), ehp);
        this.f26280r = new gqn(new eeq(this), ehg);
        this.f26276n = new gql(this.f26277o, true);
    }

    /* renamed from: h */
    public final void mo7345h() {
        mo13459i();
    }

    /* renamed from: i */
    public final void mo13459i() {
        this.f26276n.mo7346a();
        this.f26277o.mo13459i();
        this.f26278p.mo13459i();
        this.f26279q.mo13459i();
        this.f26280r.mo13459i();
    }

    /* renamed from: a */
    public final void mo7343a() {
        super.mo7343a();
        this.f26276n.mo7348b();
    }

    /* renamed from: b */
    public final void mo7344b() {
        super.mo7344b();
        this.f26276n.mo7349c();
    }

    /* renamed from: s */
    public final void mo13450s() {
        if (this.f26276n.mo7351e() != null) {
            ((gqj) this.f26276n.mo7351e().f24440a).mo13450s();
        }
    }

    /* renamed from: a */
    public final void mo14872a(kwk kwk, Window window, BottomBarController bottomBarController, hcd hcd, how how, gwp gwp, fbr fbr, bxj bxj) {
        if (!this.f26276n.mo7352f()) {
            super.mo14872a(kwk, window, bottomBarController, hcd, how, gwp, fbr, bxj);
            this.f26276n.f5995a = C0252go.f5887bg;
        }
    }

    /* renamed from: a */
    public final void mo13427a(boolean z) {
        if (this.f26276n.mo7351e() != null) {
            ((gqj) this.f26276n.mo7351e().f24440a).mo13427a(z);
        }
    }

    /* renamed from: q */
    public final void mo13448q() {
        if (this.f26276n.mo7351e() != null) {
            ((gqj) this.f26276n.mo7351e().f24440a).mo13448q();
        }
    }

    /* renamed from: r */
    public final void mo13449r() {
        if (this.f26276n.mo7351e() != null) {
            ((gqj) this.f26276n.mo7351e().f24440a).mo13449r();
        }
    }
}
