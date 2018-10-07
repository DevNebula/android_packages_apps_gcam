package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: pu */
public final class C0421pu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9546a;

    public C0421pu(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9546a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f9546a.mo12109c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9546a;
        actionBarOverlayLayout.f10561h = actionBarOverlayLayout.f10555b.animate().translationY(0.0f).setListener(this.f9546a.f10562i);
    }
}
