package p000;

import android.content.Context;
import android.support.p002v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: nr */
public final class C0726nr extends C0387nn implements C0406oq {
    /* renamed from: a */
    private Context f22128a;
    /* renamed from: d */
    private ActionBarContextView f22129d;
    /* renamed from: e */
    private C0388no f22130e;
    /* renamed from: f */
    private WeakReference f22131f;
    /* renamed from: g */
    private boolean f22132g;
    /* renamed from: h */
    private C0734op f22133h;

    public C0726nr(Context context, ActionBarContextView actionBarContextView, C0388no c0388no) {
        this.f22128a = context;
        this.f22129d = actionBarContextView;
        this.f22130e = c0388no;
        C0734op c0734op = new C0734op(actionBarContextView.getContext());
        this.f22133h = c0734op;
        this.f22133h.mo14295a((C0406oq) this);
    }

    /* renamed from: b */
    public final void mo10741b() {
        if (!this.f22132g) {
            this.f22132g = true;
            this.f22129d.sendAccessibilityEvent(32);
            this.f22130e.mo10751a(this);
        }
    }

    /* renamed from: c */
    public final View mo10744c() {
        WeakReference weakReference = this.f22131f;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    /* renamed from: d */
    public final Menu mo10745d() {
        return this.f22133h;
    }

    /* renamed from: e */
    public final MenuInflater mo10746e() {
        return new C0392nu(this.f22129d.getContext());
    }

    /* renamed from: f */
    public final CharSequence mo10747f() {
        return this.f22129d.f10542g;
    }

    /* renamed from: g */
    public final CharSequence mo10748g() {
        return this.f22129d.f10541f;
    }

    /* renamed from: h */
    public final void mo10749h() {
        this.f22130e.mo10754b(this, this.f22133h);
    }

    /* renamed from: i */
    public final boolean mo10750i() {
        return this.f22129d.f10544i;
    }

    /* renamed from: a */
    public final boolean mo10834a(C0734op c0734op, MenuItem menuItem) {
        return this.f22130e.mo10753a((C0387nn) this, menuItem);
    }

    /* renamed from: m */
    public final void mo10835m() {
        mo10749h();
        this.f22129d.mo10869a();
    }

    /* renamed from: a */
    public final void mo10738a(View view) {
        WeakReference weakReference;
        this.f22129d.mo12095a(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f22131f = weakReference;
    }

    /* renamed from: a */
    public final void mo10737a(int i) {
        mo10739a(this.f22128a.getString(i));
    }

    /* renamed from: a */
    public final void mo10739a(CharSequence charSequence) {
        this.f22129d.mo12096a(charSequence);
    }

    /* renamed from: b */
    public final void mo10742b(int i) {
        mo10743b(this.f22128a.getString(i));
    }

    /* renamed from: b */
    public final void mo10743b(CharSequence charSequence) {
        this.f22129d.mo12100b(charSequence);
    }

    /* renamed from: a */
    public final void mo10740a(boolean z) {
        super.mo10740a(z);
        this.f22129d.mo12098a(z);
    }
}
