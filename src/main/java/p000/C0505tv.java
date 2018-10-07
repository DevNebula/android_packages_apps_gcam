package p000;

import android.support.p002v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: tv */
public final class C0505tv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9802a;

    public C0505tv(RecyclerView recyclerView) {
        this.f9802a = recyclerView;
    }

    public final void run() {
        C0512ub c0512ub = this.f9802a.f724x;
        if (c0512ub != null) {
            c0512ub.mo11208d();
        }
        this.f9802a.f666E = false;
    }
}
