package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: ve */
public abstract class C0768ve extends C0512ub {
    /* renamed from: a */
    private boolean f22346a = true;

    /* renamed from: a */
    public abstract boolean mo14438a(C0530ux c0530ux);

    /* renamed from: a */
    public abstract boolean mo14439a(C0530ux c0530ux, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo14440a(C0530ux c0530ux, C0530ux c0530ux2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo14441b(C0530ux c0530ux);

    /* renamed from: a */
    public final boolean mo11201a(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2) {
        if (c0515ue != null) {
            int i = c0515ue.f9812a;
            int i2 = c0515ue2.f9812a;
            if (!(i == i2 && c0515ue.f9813b == c0515ue2.f9813b)) {
                return mo14439a(c0530ux, i, c0515ue.f9813b, i2, c0515ue2.f9813b);
            }
        }
        return mo14438a(c0530ux);
    }

    /* renamed from: a */
    public final boolean mo11202a(C0530ux c0530ux, C0530ux c0530ux2, C0515ue c0515ue, C0515ue c0515ue2) {
        int i;
        int i2;
        int i3 = c0515ue.f9812a;
        int i4 = c0515ue.f9813b;
        if (c0530ux2.mo11332p()) {
            i = c0515ue.f9812a;
            i2 = c0515ue.f9813b;
        } else {
            i = c0515ue2.f9812a;
            i2 = c0515ue2.f9813b;
        }
        return mo14440a(c0530ux, c0530ux2, i3, i4, i, i2);
    }

    /* renamed from: b */
    public final boolean mo11204b(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2) {
        int i;
        int i2;
        int i3 = c0515ue.f9812a;
        int i4 = c0515ue.f9813b;
        View view = c0530ux.f9877a;
        if (c0515ue2 != null) {
            i = c0515ue2.f9812a;
        } else {
            i = view.getLeft();
        }
        if (c0515ue2 != null) {
            i2 = c0515ue2.f9813b;
        } else {
            i2 = view.getTop();
        }
        if (c0530ux.mo11326j() || (i3 == i && i4 == i2)) {
            return mo14441b(c0530ux);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return mo14439a(c0530ux, i3, i4, i, i2);
    }

    /* renamed from: c */
    public final boolean mo11207c(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2) {
        int i = c0515ue.f9812a;
        int i2 = c0515ue2.f9812a;
        if (i == i2 && c0515ue.f9813b == c0515ue2.f9813b) {
            mo11211f(c0530ux);
            return false;
        }
        return mo14439a(c0530ux, i, c0515ue.f9813b, i2, c0515ue2.f9813b);
    }

    /* renamed from: e */
    public final boolean mo11210e(C0530ux c0530ux) {
        return !this.f22346a || c0530ux.mo11324h();
    }
}
