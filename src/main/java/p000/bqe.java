package p000;

import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqe */
class bqe extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bqb f22854a;

    bqe(bqb bqb) {
        this.f22854a = bqb;
        super(0);
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f22854a.f22842a.mo2588b(true);
        this.f22854a.f22842a.mo2587a(false);
        this.f22854a.f22842a.mo2586a();
        this.f22854a.f22844c.reverse();
    }

    /* renamed from: a */
    public void mo13421a(float f) {
        bqb bqb = this.f22854a;
        float f2 = bqb.f22846e;
        EvCompView evCompView = bqb.f22842a;
        bqb.f22846e = f2 + ((f / ((float) evCompView.f2465a.mo2078a(evCompView.getHeight()))) / 2.0f);
        if (bqb.f22846e > 1.0f) {
            bqb.f22846e = 1.0f;
        }
        if (bqb.f22846e <= 0.0f) {
            bqb.f22846e = 0.0f;
        }
        bqb.mo14575a_();
    }
}
