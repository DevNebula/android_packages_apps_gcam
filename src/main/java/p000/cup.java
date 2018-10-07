package p000;

import android.graphics.Bitmap;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cup */
final class cup implements csj {
    /* renamed from: a */
    private final /* synthetic */ FilmstripView f13280a;

    cup(FilmstripView filmstripView) {
        this.f13280a = filmstripView;
    }

    /* renamed from: a */
    public final void mo5731a(int i, cre cre) {
        bli.m888a(FilmstripView.f2524a, "onFilmstripItemInserted()");
        FilmstripView filmstripView = this.f13280a;
        if (filmstripView.f2538m[2] == null) {
            filmstripView.mo2645i();
        } else {
            filmstripView.mo2632a(cre);
        }
        if (this.f13280a.f2539n != null) {
            this.f13280a.f2539n.mo12902a(this.f13280a.mo2640d());
        }
        this.f13280a.mo2646j();
        filmstripView = this.f13280a;
        if (filmstripView.f2549x != null) {
            hfz hfz = filmstripView.f2532g;
            if (hfz != null) {
                if (hfz.mo7835d() == 0) {
                    filmstripView.f2549x.setAlpha(0.7f);
                } else {
                    filmstripView.f2549x.setAlpha(0.0f);
                }
                filmstripView.invalidate();
            }
        }
    }

    /* renamed from: b */
    public final void mo5733b(int i, cre cre) {
        bli.m888a(FilmstripView.f2524a, "onFilmstripItemRemoved()");
        this.f13280a.mo2635b(cre);
        if (this.f13280a.f2539n != null) {
            this.f13280a.f2539n.mo12902a(this.f13280a.mo2640d());
        }
        FilmstripView filmstripView = this.f13280a;
        filmstripView.announceForAccessibility(filmstripView.getResources().getString(R.string.filmstrip_item_deleted));
        this.f13280a.mo2646j();
        filmstripView = this.f13280a;
        if (filmstripView.f2549x != null) {
            hfz hfz = filmstripView.f2532g;
            if (hfz != null) {
                if (hfz.mo7835d() == 0) {
                    filmstripView.f2549x.setAlpha(0.7f);
                } else {
                    filmstripView.f2549x.setAlpha(0.0f);
                }
                filmstripView.invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo5732a(csk csk) {
        int i = 1;
        bli.m888a(FilmstripView.f2524a, "onFilmstripItemUpdated()");
        FilmstripView filmstripView = this.f13280a;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf == null) {
            filmstripView.mo2645i();
            return;
        }
        cvf[] cvfArr;
        cvf cvf2;
        cre cre = cvf.f3002g;
        if (csk.mo5734a(cre)) {
            filmstripView.mo2634b(2);
            err e = cre.mo5692e();
            if (!(e == null || filmstripView.f2543r || filmstripView.f2536k.mo12917h())) {
                filmstripView.f2537l = cvf.f3001f + (hjg.m3257a(e.mo6542h().f7695a, e.mo6542h().f7696b, e.mo6546l(), filmstripView.getMeasuredWidth(), filmstripView.getMeasuredHeight()).x / 2);
            }
        }
        while (i >= 0) {
            cvfArr = filmstripView.f2538m;
            cvf2 = cvfArr[i];
            if (cvf2 == null) {
                cvf2 = cvfArr[i + 1];
                if (cvf2 != null) {
                    cvfArr[i] = filmstripView.mo2637c(cvf2.f3002g.mo5690c());
                }
            } else if (csk.mo5734a(cvf2.f3002g)) {
                filmstripView.mo2634b(i);
            }
            i--;
        }
        for (i = 3; i < 5; i++) {
            cvfArr = filmstripView.f2538m;
            cvf2 = cvfArr[i];
            if (cvf2 == null) {
                cvf2 = cvfArr[i - 1];
                if (cvf2 != null) {
                    cvfArr[i] = filmstripView.mo2637c(cvf2.f3002g.mo5689b());
                }
            } else if (csk.mo5734a(cvf2.f3002g)) {
                filmstripView.mo2634b(i);
            }
        }
        filmstripView.mo2629a();
        filmstripView.requestLayout();
    }

    /* renamed from: a */
    public final void mo5730a() {
        bli.m888a(FilmstripView.f2524a, "onFilmstripItemsLoaded()");
        this.f13280a.mo2645i();
        Bitmap a = this.f13280a.f2528c.mo5743d().mo5728a();
        if (a != null) {
            this.f13280a.mo2631a(a);
        }
        this.f13280a.f2548w.mo15641a(Boolean.valueOf(true));
    }
}
