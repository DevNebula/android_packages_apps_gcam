package p000;

import android.support.p002v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: tu */
public final class C0504tu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9801a;

    public C0504tu(RecyclerView recyclerView) {
        this.f9801a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f9801a;
        if (recyclerView.f717q && !recyclerView.isLayoutRequested()) {
            recyclerView = this.f9801a;
            if (recyclerView.f716p) {
                boolean z = recyclerView.f718r;
                recyclerView.mo1113a();
                return;
            }
            recyclerView.requestLayout();
        }
    }
}
