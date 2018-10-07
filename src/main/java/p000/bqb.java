package p000;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqb */
public class bqb extends gqj {
    /* renamed from: a */
    public EvCompView f22842a;
    /* renamed from: b */
    public bpx f22843b;
    /* renamed from: c */
    public ValueAnimator f22844c;
    /* renamed from: d */
    public ilp f22845d;
    /* renamed from: e */
    public float f22846e;
    /* renamed from: f */
    public int f22847f;
    /* renamed from: g */
    public int f22848g;
    /* renamed from: h */
    public float f22849h;
    /* renamed from: i */
    public int f22850i;
    /* renamed from: j */
    public final Runnable f22851j = new bqc(this);
    /* renamed from: k */
    private ilp f22852k;

    public bqb() {
        super(0);
    }

    /* renamed from: a */
    public void mo14574a(bpx bpx, EvCompView evCompView, ValueAnimator valueAnimator, int i, ilp ilp, bps bps) {
        this.f22843b = bpx;
        this.f22842a = evCompView;
        this.f22844c = valueAnimator;
        this.f22850i = i;
        this.f22852k = ilp;
        this.f22845d = bps.f1443a;
    }

    /* renamed from: a_ */
    final void mo14575a_() {
        boolean z;
        boolean z2 = true;
        EvCompView evCompView = this.f22842a;
        float f = this.f22846e;
        if (f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        Object valueOf = Float.valueOf(f);
        jri.m13400a(z, "marker position must be in range [0,1] was: %s", valueOf);
        if (f < 0.0f) {
            z2 = false;
        }
        jri.m13400a(z2, "marker position must be in range [0,1] was: %s", valueOf);
        evCompView.f2466b = f;
        evCompView.invalidate();
        int round = Math.round(((float) this.f22848g) * this.f22846e);
        int i = this.f22847f;
        int i2 = round + i;
        this.f22842a.f2469e = (((float) i) + (((float) this.f22848g) * this.f22846e)) * this.f22849h;
        if (i2 != ((Integer) this.f22852k.mo13673b()).intValue()) {
            this.f22852k.mo8826a(Integer.valueOf(i2));
        }
    }
}
