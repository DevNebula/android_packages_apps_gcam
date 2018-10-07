package p000;

import android.content.Context;
import android.support.p002v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: nh */
public final class C0725nh extends C0387nn implements C0406oq {
    /* renamed from: a */
    public final C0734op f22123a;
    /* renamed from: d */
    private final Context f22124d;
    /* renamed from: e */
    private C0388no f22125e;
    /* renamed from: f */
    private WeakReference f22126f;
    /* renamed from: g */
    private final /* synthetic */ C0724ne f22127g;

    public C0725nh(C0724ne c0724ne, Context context, C0388no c0388no) {
        this.f22127g = c0724ne;
        this.f22124d = context;
        this.f22125e = c0388no;
        C0734op c0734op = new C0734op(context);
        this.f22123a = c0734op;
        this.f22123a.mo14295a((C0406oq) this);
    }

    /* renamed from: a */
    public final boolean mo14246a() {
        this.f22123a.mo14332l();
        try {
            boolean a = this.f22125e.mo10752a((C0387nn) this, this.f22123a);
            return a;
        } finally {
            this.f22123a.mo14331k();
        }
    }

    /* renamed from: b */
    public final void mo10741b() {
        C0724ne c0724ne = this.f22127g;
        if (c0724ne.f22105g == this) {
            if (C0724ne.m14400a(c0724ne.f22109k, c0724ne.f22110l, false)) {
                this.f22125e.mo10751a(this);
            } else {
                c0724ne = this.f22127g;
                c0724ne.f22106h = this;
                c0724ne.f22107i = this.f22125e;
            }
            this.f22125e = null;
            this.f22127g.mo14245e(false);
            ActionBarContextView actionBarContextView = this.f22127g.f22103e;
            if (actionBarContextView.f10543h == null) {
                actionBarContextView.mo12099b();
            }
            this.f22127g.f22102d.f9654a.sendAccessibilityEvent(32);
            c0724ne = this.f22127g;
            c0724ne.f22100b.mo12108a(c0724ne.f22112n);
            this.f22127g.f22105g = null;
        }
    }

    /* renamed from: c */
    public final View mo10744c() {
        WeakReference weakReference = this.f22126f;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    /* renamed from: d */
    public final Menu mo10745d() {
        return this.f22123a;
    }

    /* renamed from: e */
    public final MenuInflater mo10746e() {
        return new C0392nu(this.f22124d);
    }

    /* renamed from: f */
    public final CharSequence mo10747f() {
        return this.f22127g.f22103e.f10542g;
    }

    /* renamed from: g */
    public final CharSequence mo10748g() {
        return this.f22127g.f22103e.f10541f;
    }

    /* renamed from: h */
    public final void mo10749h() {
        if (this.f22127g.f22105g == this) {
            this.f22123a.mo14332l();
            try {
                this.f22125e.mo10754b(this, this.f22123a);
            } finally {
                this.f22123a.mo14331k();
            }
        }
    }

    /* renamed from: i */
    public final boolean mo10750i() {
        return this.f22127g.f22103e.f10544i;
    }

    /* renamed from: a */
    public final boolean mo10834a(C0734op c0734op, MenuItem menuItem) {
        C0388no c0388no = this.f22125e;
        return c0388no != null ? c0388no.mo10753a((C0387nn) this, menuItem) : false;
    }

    /* renamed from: m */
    public final void mo10835m() {
        if (this.f22125e != null) {
            mo10749h();
            this.f22127g.f22103e.mo10869a();
        }
    }

    /* renamed from: a */
    public final void mo10738a(View view) {
        this.f22127g.f22103e.mo12095a(view);
        this.f22126f = new WeakReference(view);
    }

    /* renamed from: a */
    public final void mo10737a(int i) {
        mo10739a(this.f22127g.f22099a.getResources().getString(i));
    }

    /* renamed from: a */
    public final void mo10739a(CharSequence charSequence) {
        this.f22127g.f22103e.mo12096a(charSequence);
    }

    /* renamed from: b */
    public final void mo10742b(int i) {
        mo10743b(this.f22127g.f22099a.getResources().getString(i));
    }

    /* renamed from: b */
    public final void mo10743b(CharSequence charSequence) {
        this.f22127g.f22103e.mo12100b(charSequence);
    }

    /* renamed from: a */
    public final void mo10740a(boolean z) {
        super.mo10740a(z);
        this.f22127g.f22103e.mo12098a(z);
    }
}
