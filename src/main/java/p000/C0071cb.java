package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: cb */
public class C0071cb {
    /* renamed from: a */
    public final View f1856a;
    /* renamed from: b */
    public int f1857b;
    /* renamed from: c */
    public int f1858c;
    /* renamed from: d */
    public int f1859d;

    C0071cb() {
    }

    public C0071cb(View view) {
        this.f1856a = view;
    }

    /* renamed from: a */
    public boolean mo2248a(int i) {
        if (this.f1859d == i) {
            return false;
        }
        this.f1859d = i;
        mo2247a();
        return true;
    }

    /* renamed from: a */
    public void mo2247a() {
        View view = this.f1856a;
        C0315jm.m4624b(view, this.f1859d - (view.getTop() - this.f1857b));
        view = this.f1856a;
        C0315jm.m4609a(view, -(view.getLeft() - this.f1858c));
    }
}
