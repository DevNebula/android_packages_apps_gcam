package p000;

import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cus */
final class cus implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cur f2973a;

    cus(cur cur) {
        this.f2973a = cur;
    }

    public final void run() {
        if (this.f2973a.f2968c.computeScrollOffset()) {
            cur cur = this.f2973a;
            cuv cuv = cur.f2967b;
            int currX = cur.f2968c.getCurrX();
            this.f2973a.f2968c.getCurrY();
            cuv.mo5826a(currX);
            this.f2973a.f2966a.removeCallbacks(this);
            this.f2973a.f2966a.post(this);
            return;
        }
        bli.m896d(FilmstripView.f2524a, "[fling] onScrollEnd from computeScrollOffset");
        this.f2973a.f2967b.mo5825a();
    }
}
