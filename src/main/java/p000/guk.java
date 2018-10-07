package p000;

import android.view.Window;

/* compiled from: PG */
/* renamed from: guk */
final class guk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Window f6068a;
    /* renamed from: b */
    private final /* synthetic */ guj f6069b;

    guk(guj guj, Window window) {
        this.f6069b = guj;
        this.f6068a = window;
    }

    public final void run() {
        this.f6068a.getDecorView().setOnSystemUiVisibilityChangeListener(this.f6069b.f19626e);
    }
}
