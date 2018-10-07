package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: qi */
public final class C0428qi {
    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9550a;

    public C0428qi(RecyclerView recyclerView) {
        this.f9550a = recyclerView;
    }

    /* renamed from: a */
    final void mo10895a(C0429qj c0429qj) {
        switch (c0429qj.f9551a) {
            case 1:
                this.f9550a.f711k.mo11242b();
                return;
            case 2:
                this.f9550a.f711k.mo11257e();
                return;
            case 4:
                this.f9550a.f711k.mo11259f();
                return;
            case 8:
                this.f9550a.f711k.mo11252d();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final C0530ux mo10892a(int i) {
        C0530ux c;
        RecyclerView recyclerView = this.f9550a;
        int childCount = recyclerView.f706f.f9647a.f9652a.getChildCount();
        int i2 = 0;
        C0530ux c0530ux = null;
        while (i2 < childCount) {
            c = RecyclerView.m453c(recyclerView.f706f.mo11037d(i2));
            if (c == null) {
                c = c0530ux;
            } else if (c.mo11326j()) {
                c = c0530ux;
            } else if (c.f9879c != i) {
                c = c0530ux;
            } else if (!recyclerView.f706f.mo11036c(c.f9877a)) {
                break;
            }
            i2++;
            c0530ux = c;
        }
        c = c0530ux;
        if (c == null) {
            return null;
        }
        if (this.f9550a.f706f.mo11036c(c.f9877a)) {
            return null;
        }
        return c;
    }

    /* renamed from: a */
    public final void mo10894a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.f9550a;
        int childCount = recyclerView.f706f.f9647a.f9652a.getChildCount();
        int i4 = i + i2;
        for (i3 = 0; i3 < childCount; i3++) {
            View d = recyclerView.f706f.mo11037d(i3);
            C0530ux c = RecyclerView.m453c(d);
            if (!(c == null || c.mo11332p())) {
                int i5 = c.f9879c;
                if (i5 >= i && i5 < i4) {
                    c.mo11311a(2);
                    c.mo11314a(obj);
                    ((C0519uk) d.getLayoutParams()).f9834e = true;
                }
            }
        }
        C0524up c0524up = recyclerView.f704d;
        for (i3 = c0524up.f9844c.size() - 1; i3 >= 0; i3--) {
            C0530ux c0530ux = (C0530ux) c0524up.f9844c.get(i3);
            if (c0530ux != null) {
                childCount = c0530ux.f9879c;
                if (childCount >= i && childCount < i4) {
                    c0530ux.mo11311a(2);
                    c0524up.mo11295b(i3);
                }
            }
        }
        this.f9550a.f665D = true;
    }

    /* renamed from: a */
    public final void mo10893a(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.f9550a;
        int childCount = recyclerView.f706f.f9647a.f9652a.getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            C0530ux c = RecyclerView.m453c(recyclerView.f706f.mo11037d(i3));
            if (!(c == null || c.mo11332p() || c.f9879c < i)) {
                c.mo11313a(i2, false);
                recyclerView.f662A.f9860f = true;
            }
        }
        C0524up c0524up = recyclerView.f704d;
        int size = c0524up.f9844c.size();
        for (i3 = 0; i3 < size; i3++) {
            C0530ux c0530ux = (C0530ux) c0524up.f9844c.get(i3);
            if (c0530ux != null && c0530ux.f9879c >= i) {
                c0530ux.mo11313a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f9550a.f664C = true;
    }

    /* renamed from: b */
    public final void mo10896b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f9550a;
        int childCount = recyclerView.f706f.f9647a.f9652a.getChildCount();
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i6;
        if (i < i2) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (i < i2) {
            i4 = i;
        } else {
            i4 = i2;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            C0530ux c = RecyclerView.m453c(recyclerView.f706f.mo11037d(i7));
            if (c != null) {
                i5 = c.f9879c;
                if (i5 >= i4 && i5 <= i6) {
                    if (i5 == i) {
                        c.mo11313a(i2 - i, false);
                    } else {
                        c.mo11313a(i3, false);
                    }
                    recyclerView.f662A.f9860f = true;
                }
            }
        }
        C0524up c0524up = recyclerView.f704d;
        i5 = c0524up.f9844c.size();
        for (childCount = 0; childCount < i5; childCount++) {
            C0530ux c0530ux = (C0530ux) c0524up.f9844c.get(childCount);
            if (c0530ux != null) {
                int i8 = c0530ux.f9879c;
                if (i8 >= i4 && i8 <= i6) {
                    if (i8 == i) {
                        c0530ux.mo11313a(i2 - i, false);
                    } else {
                        c0530ux.mo11313a(i3, false);
                    }
                }
            }
        }
        recyclerView.requestLayout();
        this.f9550a.f664C = true;
    }

    /* renamed from: c */
    public final void mo10897c(int i, int i2) {
        this.f9550a.mo1115a(i, i2, true);
        RecyclerView recyclerView = this.f9550a;
        recyclerView.f664C = true;
        C0528uv c0528uv = recyclerView.f662A;
        c0528uv.f9857c += i2;
    }
}
