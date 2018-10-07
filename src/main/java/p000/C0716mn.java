package p000;

import android.view.Menu;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: mn */
final class C0716mn implements C0388no {
    /* renamed from: a */
    public final /* synthetic */ C0713mg f22085a;
    /* renamed from: b */
    private C0388no f22086b;

    public C0716mn(C0713mg c0713mg, C0388no c0388no) {
        this.f22085a = c0713mg;
        this.f22086b = c0388no;
    }

    /* renamed from: a */
    public final boolean mo10753a(C0387nn c0387nn, MenuItem menuItem) {
        return this.f22086b.mo10753a(c0387nn, menuItem);
    }

    /* renamed from: a */
    public final boolean mo10752a(C0387nn c0387nn, Menu menu) {
        return this.f22086b.mo10752a(c0387nn, menu);
    }

    /* renamed from: a */
    public final void mo10751a(C0387nn c0387nn) {
        this.f22086b.mo10751a(c0387nn);
        C0713mg c0713mg = this.f22085a;
        if (c0713mg.f22065h != null) {
            c0713mg.f22060c.getDecorView().removeCallbacks(this.f22085a.f22066i);
        }
        c0713mg = this.f22085a;
        if (c0713mg.f22064g != null) {
            c0713mg.mo14224l();
            c0713mg = this.f22085a;
            c0713mg.f22067j = C0315jm.m4606a(c0713mg.f22064g).mo9758a(0.0f);
            this.f22085a.f22067j.mo9760a(new C0825mo(this));
        }
        c0713mg = this.f22085a;
        C0369me c0369me = c0713mg.f22061d;
        if (c0369me != null) {
            C0387nn c0387nn2 = c0713mg.f22063f;
            c0369me.mo10667b();
        }
        this.f22085a.f22063f = null;
    }

    /* renamed from: b */
    public final boolean mo10754b(C0387nn c0387nn, Menu menu) {
        return this.f22086b.mo10754b(c0387nn, menu);
    }
}
