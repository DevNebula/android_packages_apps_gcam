package p000;

import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqd */
class bqd extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bqb f22853a;

    bqd(bqb bqb) {
        this.f22853a = bqb;
        super(0);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bqb bqb = this.f22853a;
        bqb.f22842a.postDelayed(bqb.f22851j, (long) bqb.f22850i);
        this.f22853a.f22842a.mo2588b(false);
        this.f22853a.f22842a.mo2586a();
        this.f22853a.f22842a.mo2587a(true);
        bqb = this.f22853a;
        bqb.f22846e = 0.5f;
        bqb.mo14575a_();
    }

    /* renamed from: b */
    public final void mo7344b() {
        bqb bqb = this.f22853a;
        bqb.f22842a.removeCallbacks(bqb.f22851j);
    }

    /* renamed from: f */
    public void mo13439f() {
    }

    /* renamed from: a */
    public void mo13421a(float f) {
        bqb bqb = this.f22853a;
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
