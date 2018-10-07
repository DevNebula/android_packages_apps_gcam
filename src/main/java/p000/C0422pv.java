package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: pv */
public final class C0422pv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9547a;

    public C0422pv(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9547a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f9547a.mo12109c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9547a;
        actionBarOverlayLayout.f10561h = actionBarOverlayLayout.f10555b.animate().translationY((float) (-this.f9547a.f10555b.getHeight())).setListener(this.f9547a.f10562i);
    }
}
