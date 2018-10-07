package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gbd */
public final class gbd implements eoj, eok {
    /* renamed from: a */
    public final View f18981a;
    /* renamed from: b */
    public volatile Runnable f18982b;
    /* renamed from: c */
    private volatile gxn f18983c;
    /* renamed from: d */
    private final hny f18984d;
    /* renamed from: e */
    private final hnz f18985e = new gbh(this);

    public gbd(View view, hny hny) {
        this.f18981a = view;
        this.f18984d = hny;
    }

    /* renamed from: a */
    static Rect m11135a(View view, View view2, View view3) {
        if (view2.getTop() != 0) {
            return new Rect(view.getLeft(), view.getBottom(), view.getRight(), view2.getTop());
        }
        if (view2.getLeft() == 0) {
            return new Rect(view2.getRight(), view3.getTop(), view.getLeft(), view3.getBottom());
        }
        return new Rect(view.getRight(), view3.getTop(), view2.getLeft(), view3.getBottom());
    }

    /* renamed from: a */
    public final boolean mo13319a(boolean z) {
        gxn gxn = this.f18983c;
        if (gxn == null) {
            return false;
        }
        this.f18983c = null;
        gxn.mo7505a();
        if (z && this.f18982b != null) {
            this.f18982b.run();
            this.f18982b = null;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo6372i() {
        this.f18984d.mo13554a(this.f18985e);
    }

    /* renamed from: j */
    public final void mo6373j() {
        this.f18984d.mo13555b(this.f18985e);
    }

    /* renamed from: a */
    public final void mo13318a(String str, String str2, Runnable runnable) {
        mo13319a(true);
        this.f18982b = runnable;
        gzb gzb = new gzb();
        gzb.f6215a = str;
        if (gzb.f6217c.length() > 0) {
            gzb.f6217c.append("\n");
        }
        gzb.f6217c.append(str2);
        gxn gxn = new gxn(gzb.f6215a, gzb.f6217c.toString(), gzb.f6216b);
        View findViewById = this.f18981a.getRootView().findViewById(R.id.capture_overlay_layout);
        View findViewById2 = this.f18981a.getRootView().findViewById(R.id.bottom_bar);
        OnLayoutChangeListener gbi = new gbi(this, gxn, findViewById, findViewById2);
        gxn.mo7510c(new gbe(findViewById2, gbi));
        gxn.mo7509b(new gbf(findViewById2, gbi));
        gxn.mo7504a(new gbg(this, findViewById2, gbi));
        this.f18983c = gxn;
        gxn.mo7507a(findViewById, gbd.m11135a(this.f18981a, findViewById2, findViewById));
    }
}
