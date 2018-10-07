package p000;

import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuv */
public final class cuv {
    /* renamed from: a */
    public int f2976a = -1;
    /* renamed from: b */
    private final /* synthetic */ cuw f2977b;

    cuv(cuw cuw) {
        this.f2977b = cuw;
    }

    /* renamed from: a */
    public final void mo5825a() {
        this.f2977b.f13291e = true;
        bli.m888a(FilmstripView.f2524a, "[fling] onScrollEnd() - onScrollEnd");
        FilmstripView filmstripView = this.f2977b.f13292f;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf != null) {
            if (cvf != null) {
                if (filmstripView.mo2644h() || !filmstripView.mo2636b()) {
                    cve cve = filmstripView.f2550y;
                    if (cve != null) {
                        cve.mo5845a(cvf.f3003h);
                    }
                } else if (filmstripView.f2536k.mo12917h() || filmstripView.f2543r) {
                    String str = FilmstripView.f2524a;
                    boolean h = filmstripView.f2536k.mo12917h();
                    StringBuilder stringBuilder = new StringBuilder(41);
                    stringBuilder.append("[fling] mController.isScrolling() - ");
                    stringBuilder.append(h);
                    bli.m896d(str, stringBuilder.toString());
                } else {
                    int a = cvf.mo5846a();
                    int abs = (int) ((((float) Math.abs(filmstripView.f2537l - a)) * 600.0f) / ((float) filmstripView.f2534i.width()));
                    if (abs < 0) {
                        abs = 400;
                    }
                    bli.m896d(FilmstripView.f2524a, "[fling] Scroll to center.");
                    filmstripView.f2536k.mo12912a(a, abs, false);
                }
            }
            if (this.f2977b.f13292f.mo2644h()) {
                bli.m896d(FilmstripView.f2524a, "[fling] onScrollEnd() - Ensuring that items are at full resolution.");
                this.f2977b.f13292f.mo2630a(2);
                this.f2977b.f13292f.mo2630a(3);
                this.f2977b.f13292f.mo2630a(1);
                this.f2977b.f13292f.mo2630a(4);
            }
        }
    }

    /* renamed from: a */
    public final void mo5826a(int i) {
        FilmstripView filmstripView = this.f2977b.f13292f;
        filmstripView.f2537l = (i - this.f2976a) + filmstripView.f2537l;
        this.f2976a = i;
        if (filmstripView.mo2638c()) {
            bli.m888a(FilmstripView.f2524a, "[fling] onScrollUpdate() - stopScrolling!");
            this.f2977b.f13292f.f2536k.mo12913b(true);
        }
        this.f2977b.f13292f.invalidate();
    }
}
