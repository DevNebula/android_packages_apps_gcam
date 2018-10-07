package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: aqt */
public abstract class aqt extends aql {
    /* renamed from: a */
    public final View f25495a;
    /* renamed from: b */
    private final aza f25496b;

    public aqt(View view) {
        this.f25495a = (View) aqe.m610a((Object) view, "Argument must not be null");
        this.f25496b = new aza(view);
    }

    /* renamed from: a */
    public final aqb mo12303a() {
        Object tag = this.f25495a.getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof aqb) {
            return (aqb) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: a */
    public final void mo12306a(aqr aqr) {
        aza aza = this.f25496b;
        int c = aza.mo12342c();
        int b = aza.mo12341b();
        if (aza.m7262a(c, b)) {
            aqr.mo1717a(c, b);
            return;
        }
        if (!aza.f11067b.contains(aqr)) {
            aza.f11067b.add(aqr);
        }
        if (aza.f11068c == null) {
            ViewTreeObserver viewTreeObserver = aza.f11066a.getViewTreeObserver();
            aza.f11068c = new aqu(aza);
            viewTreeObserver.addOnPreDrawListener(aza.f11068c);
        }
    }

    /* renamed from: a */
    public void mo12304a(Drawable drawable) {
        super.mo12304a(drawable);
        this.f25496b.mo12340a();
    }

    /* renamed from: b */
    public final void mo12309b(aqr aqr) {
        this.f25496b.f11067b.remove(aqr);
    }

    /* renamed from: a */
    public final void mo12305a(aqb aqb) {
        this.f25495a.setTag(aqb);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f25495a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("Target for: ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
