package p000;

import android.content.Context;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: vn */
public final class C0770vn implements C0410pe {
    /* renamed from: a */
    public C0736ot f22347a;
    /* renamed from: b */
    private C0734op f22348b;
    /* renamed from: c */
    private final /* synthetic */ Toolbar f22349c;

    public C0770vn(Toolbar toolbar) {
        this.f22349c = toolbar;
    }

    /* renamed from: a */
    public final boolean mo10851a(C0736ot c0736ot) {
        View view = this.f22349c.f745h;
        if (view instanceof C0389np) {
            ((C0389np) view).mo10755a();
        }
        Toolbar toolbar = this.f22349c;
        toolbar.removeView(toolbar.f745h);
        toolbar = this.f22349c;
        toolbar.removeView(toolbar.f744g);
        Toolbar toolbar2 = this.f22349c;
        toolbar2.f745h = null;
        for (int size = toolbar2.f754q.size() - 1; size >= 0; size--) {
            toolbar2.addView((View) toolbar2.f754q.get(size));
        }
        toolbar2.f754q.clear();
        this.f22347a = null;
        this.f22349c.requestLayout();
        c0736ot.mo14348a(false);
        return true;
    }

    /* renamed from: b */
    public final boolean mo10853b(C0736ot c0736ot) {
        Toolbar toolbar = this.f22349c;
        if (toolbar.f744g == null) {
            toolbar.f744g = new C0440qv(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.f744g.setImageDrawable(toolbar.f742e);
            toolbar.f744g.setContentDescription(toolbar.f743f);
            LayoutParams d = Toolbar.m516d();
            d.f9176a = (toolbar.f750m & 112) | 8388611;
            d.f22350b = 2;
            toolbar.f744g.setLayoutParams(d);
            toolbar.f744g.setOnClickListener(new C0542vm(toolbar));
        }
        ViewParent parent = this.f22349c.f744g.getParent();
        ViewParent viewParent = this.f22349c;
        if (parent != viewParent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewParent.f744g);
            }
            toolbar = this.f22349c;
            toolbar.addView(toolbar.f744g);
        }
        this.f22349c.f745h = c0736ot.getActionView();
        this.f22347a = c0736ot;
        parent = this.f22349c.f745h.getParent();
        viewParent = this.f22349c;
        if (parent != viewParent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewParent.f745h);
            }
            LayoutParams d2 = Toolbar.m516d();
            Toolbar toolbar2 = this.f22349c;
            d2.f9176a = (toolbar2.f750m & 112) | 8388611;
            d2.f22350b = 2;
            toolbar2.f745h.setLayoutParams(d2);
            toolbar = this.f22349c;
            toolbar.addView(toolbar.f745h);
        }
        Toolbar toolbar3 = this.f22349c;
        for (int childCount = toolbar3.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar3.getChildAt(childCount);
            if (!(((C0771vo) childAt.getLayoutParams()).f22350b == 2 || childAt == toolbar3.f738a)) {
                toolbar3.removeViewAt(childCount);
                toolbar3.f754q.add(childAt);
            }
        }
        this.f22349c.requestLayout();
        c0736ot.mo14348a(true);
        View view = this.f22349c.f745h;
        if (view instanceof C0389np) {
            ((C0389np) view).mo10756b();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo10850a() {
        return false;
    }

    /* renamed from: a */
    public final void mo10846a(Context context, C0734op c0734op) {
        C0734op c0734op2 = this.f22348b;
        if (c0734op2 != null) {
            C0736ot c0736ot = this.f22347a;
            if (c0736ot != null) {
                c0734op2.mo14301a(c0736ot);
            }
        }
        this.f22348b = c0734op;
    }

    /* renamed from: a */
    public final void mo10847a(C0734op c0734op, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo10852a(C0835pn c0835pn) {
        return false;
    }

    /* renamed from: a */
    public final void mo10848a(C0411pf c0411pf) {
    }

    /* renamed from: a */
    public final void mo10849a(boolean z) {
        Object obj = null;
        if (this.f22347a != null) {
            C0734op c0734op = this.f22348b;
            if (c0734op != null) {
                int size = c0734op.size();
                for (int i = 0; i < size; i++) {
                    if (this.f22348b.getItem(i) == this.f22347a) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                mo10851a(this.f22347a);
            }
        }
    }
}
