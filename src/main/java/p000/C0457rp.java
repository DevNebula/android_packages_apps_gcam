package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: rp */
public final class C0457rp {
    /* renamed from: a */
    public final C0459rr f9647a;
    /* renamed from: b */
    public final C0458rq f9648b = new C0458rq();
    /* renamed from: c */
    public final List f9649c = new ArrayList();

    public C0457rp(C0459rr c0459rr) {
        this.f9647a = c0459rr;
    }

    /* renamed from: a */
    public final void mo11031a(View view, int i, boolean z) {
        int childCount;
        if (i < 0) {
            childCount = this.f9647a.f9652a.getChildCount();
        } else {
            childCount = mo11035c(i);
        }
        this.f9648b.mo11041a(childCount, z);
        if (z) {
            mo11029a(view);
        }
        C0459rr c0459rr = this.f9647a;
        c0459rr.f9652a.addView(view, childCount);
        RecyclerView recyclerView = c0459rr.f9652a;
        C0530ux c = RecyclerView.m453c(view);
        C0507tx c0507tx = recyclerView.f710j;
        if (c0507tx != null && c != null) {
            c0507tx.mo11190a(c);
        }
    }

    /* renamed from: a */
    public final void mo11030a(View view, int i, LayoutParams layoutParams, boolean z) {
        int childCount;
        if (i < 0) {
            childCount = this.f9647a.f9652a.getChildCount();
        } else {
            childCount = mo11035c(i);
        }
        this.f9648b.mo11041a(childCount, z);
        if (z) {
            mo11029a(view);
        }
        C0459rr c0459rr = this.f9647a;
        C0530ux c = RecyclerView.m453c(view);
        if (c != null) {
            if (c.mo11328l() || c.mo11332p()) {
                c.mo11320d();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called attach on a child which is not detached: ");
                stringBuilder.append(c);
                stringBuilder.append(c0459rr.f9652a.mo1154g());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        c0459rr.f9652a.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: a */
    final void mo11028a(int i) {
        int c = mo11035c(i);
        this.f9648b.mo11044d(c);
        C0459rr c0459rr = this.f9647a;
        View a = c0459rr.mo11048a(c);
        if (a != null) {
            C0530ux c2 = RecyclerView.m453c(a);
            if (c2 != null) {
                if (!c2.mo11328l() || c2.mo11332p()) {
                    c2.mo11311a(256);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("called detach on an already detached child ");
                    stringBuilder.append(c2);
                    stringBuilder.append(c0459rr.f9652a.mo1154g());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        c0459rr.f9652a.detachViewFromParent(c);
    }

    /* renamed from: b */
    public final View mo11034b(int i) {
        return this.f9647a.mo11048a(mo11035c(i));
    }

    /* renamed from: a */
    public final int mo11027a() {
        return this.f9647a.f9652a.getChildCount() - this.f9649c.size();
    }

    /* renamed from: c */
    final int mo11035c(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f9647a.f9652a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - this.f9648b.mo11042b(i2));
            if (b == 0) {
                while (this.f9648b.mo11043c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: d */
    public final View mo11037d(int i) {
        return this.f9647a.mo11048a(i);
    }

    /* renamed from: b */
    public final int mo11032b() {
        return this.f9647a.f9652a.getChildCount();
    }

    /* renamed from: a */
    public final void mo11029a(View view) {
        this.f9649c.add(view);
        C0459rr c0459rr = this.f9647a;
        C0530ux c = RecyclerView.m453c(view);
        if (c != null) {
            RecyclerView recyclerView = c0459rr.f9652a;
            int i = c.f9890n;
            if (i != -1) {
                c.f9889m = i;
            } else {
                c.f9889m = C0315jm.m4633h(c.f9877a);
            }
            recyclerView.mo1125a(c, 4);
        }
    }

    /* renamed from: b */
    final int mo11033b(View view) {
        int a = this.f9647a.mo11047a(view);
        if (a == -1 || this.f9648b.mo11043c(a)) {
            return -1;
        }
        return a - this.f9648b.mo11042b(a);
    }

    /* renamed from: c */
    public final boolean mo11036c(View view) {
        return this.f9649c.contains(view);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f9648b.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.f9649c.size());
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public final boolean mo11038d(View view) {
        if (!this.f9649c.remove(view)) {
            return false;
        }
        this.f9647a.mo11050b(view);
        return true;
    }
}
