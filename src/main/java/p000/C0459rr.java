package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: rr */
public final class C0459rr {
    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9652a;

    public C0459rr(RecyclerView recyclerView) {
        this.f9652a = recyclerView;
    }

    /* renamed from: a */
    public final View mo11048a(int i) {
        return this.f9652a.getChildAt(i);
    }

    /* renamed from: a */
    public final int mo11047a(View view) {
        return this.f9652a.indexOfChild(view);
    }

    /* renamed from: b */
    public final void mo11050b(View view) {
        C0530ux c = RecyclerView.m453c(view);
        if (c != null) {
            this.f9652a.mo1125a(c, c.f9889m);
            c.f9889m = 0;
        }
    }

    /* renamed from: b */
    public final void mo11049b(int i) {
        View childAt = this.f9652a.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m453c(childAt);
            childAt.clearAnimation();
        }
        this.f9652a.removeViewAt(i);
    }
}
