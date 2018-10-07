package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqf */
class bqf extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bqb f22855a;

    bqf(bqb bqb) {
        this.f22855a = bqb;
        super(0);
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f22855a.f22842a.mo2588b(true);
        this.f22855a.f22842a.mo2587a(false);
        this.f22855a.f22842a.mo2586a();
        this.f22855a.f22844c.start();
        this.f22855a.f22845d.mo8826a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f22855a.f22845d.mo8826a(Boolean.valueOf(false));
    }

    /* renamed from: g */
    public void mo13440g() {
        EvCompView evCompView = this.f22855a.f22842a;
        String a = EvCompView.m1254a(evCompView.f2469e);
        evCompView.announceForAccessibility(evCompView.getContext().getResources().getString(R.string.ev_announcement, new Object[]{a}));
    }

    /* renamed from: a */
    public final void mo13421a(float f) {
        bqb bqb = this.f22855a;
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
