package p000;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: td */
final class C0490td {
    /* renamed from: a */
    public boolean f9771a = true;
    /* renamed from: b */
    public int f9772b;
    /* renamed from: c */
    public int f9773c;
    /* renamed from: d */
    public int f9774d;
    /* renamed from: e */
    public int f9775e;
    /* renamed from: f */
    public int f9776f;
    /* renamed from: g */
    public int f9777g;
    /* renamed from: h */
    public int f9778h = 0;
    /* renamed from: i */
    public int f9779i;
    /* renamed from: j */
    public List f9780j = null;
    /* renamed from: k */
    public boolean f9781k;

    C0490td() {
    }

    /* renamed from: a */
    public final void mo11140a(View view) {
        View view2;
        int size = this.f9780j.size();
        View view3 = null;
        int i = LfuScheduler.MAX_PRIORITY;
        int i2 = 0;
        while (i2 < size) {
            int i3;
            View view4;
            view2 = ((C0530ux) this.f9780j.get(i2)).f9877a;
            C0519uk c0519uk = (C0519uk) view2.getLayoutParams();
            if (view2 == view) {
                i3 = i;
                view4 = view3;
            } else if (c0519uk.f9832c.mo11326j()) {
                i3 = i;
                view4 = view3;
            } else {
                i3 = (c0519uk.f9832c.mo11322f() - this.f9774d) * this.f9775e;
                if (i3 < 0) {
                    i3 = i;
                    view4 = view3;
                } else if (i3 < i) {
                    if (i3 == 0) {
                        break;
                    }
                    view4 = view2;
                } else {
                    i3 = i;
                    view4 = view3;
                }
            }
            i2++;
            view3 = view4;
            i = i3;
        }
        view2 = view3;
        if (view2 == null) {
            this.f9774d = -1;
        } else {
            this.f9774d = ((C0519uk) view2.getLayoutParams()).f9832c.mo11322f();
        }
    }

    /* renamed from: a */
    final boolean mo11141a(C0528uv c0528uv) {
        int i = this.f9774d;
        return i >= 0 && i < c0528uv.mo11304a();
    }

    /* renamed from: a */
    final View mo11139a(C0524up c0524up) {
        List list = this.f9780j;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                View view = ((C0530ux) this.f9780j.get(i)).f9877a;
                C0519uk c0519uk = (C0519uk) view.getLayoutParams();
                if (c0519uk.f9832c.mo11326j() || this.f9774d != c0519uk.f9832c.mo11322f()) {
                    i++;
                } else {
                    mo11140a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = c0524up.mo11289a(this.f9774d, Long.MAX_VALUE).f9877a;
        this.f9774d += this.f9775e;
        return view2;
    }
}
