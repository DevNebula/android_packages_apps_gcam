package p000;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.google.android.apps.camera.zoomui.ZoomMarkerView;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* compiled from: PG */
/* renamed from: hpf */
public class hpf extends hpe {
    /* renamed from: a */
    private irs f26468a;
    /* renamed from: b */
    private final AnimatorListenerAdapter f26469b = new hph(this);
    /* renamed from: c */
    private final AnimatorListenerAdapter f26470c = new hpi(this);
    /* renamed from: d */
    private final AnimatorListenerAdapter f26471d = new hpj(this);
    /* renamed from: e */
    private final AnimatorUpdateListener f26472e = new hpk(this);
    /* renamed from: h */
    public ZoomUi f26473h;
    /* renamed from: i */
    public ZoomMarkerView f26474i;
    /* renamed from: j */
    public LinearLayout f26475j;
    /* renamed from: k */
    public ilp f26476k;
    /* renamed from: l */
    public SeekBar f26477l;
    /* renamed from: m */
    public ValueAnimator f26478m;
    /* renamed from: n */
    public ObjectAnimator f26479n;
    /* renamed from: o */
    public boolean f26480o;
    /* renamed from: p */
    public ValueAnimator f26481p;
    /* renamed from: q */
    public ValueAnimator f26482q;
    /* renamed from: r */
    public boolean f26483r;
    /* renamed from: s */
    public ValueAnimator f26484s;
    /* renamed from: t */
    public float f26485t;
    /* renamed from: u */
    public float f26486u = 1.0f;
    /* renamed from: v */
    public final Runnable f26487v = new hpg(this);

    static {
        bli.m887a("ZoomEnabledSC");
    }

    /* renamed from: a */
    public void mo15547a(hpt hpt, ZoomUi zoomUi, ZoomMarkerView zoomMarkerView, ilp ilp, boolean z, ValueAnimator valueAnimator, irs irs) {
        this.f26473h = zoomUi;
        this.f26474i = zoomMarkerView;
        this.f26476k = ilp;
        this.f26475j = zoomUi.mo2761c();
        this.f26477l = zoomUi.mo2760b();
        this.f26478m = new ValueAnimator();
        this.f26478m.addUpdateListener(this.f26472e);
        this.f26478m.addListener(this.f26469b);
        this.f26478m.setDuration(250);
        this.f26478m.setInterpolator(new C0704ks());
        this.f26481p = new ValueAnimator();
        this.f26481p.addUpdateListener(this.f26472e);
        this.f26482q = new ValueAnimator();
        this.f26482q.addUpdateListener(this.f26472e);
        this.f26482q.setDuration(500);
        this.f26482q.setInterpolator(new C0704ks());
        this.f26482q.addListener(this.f26471d);
        this.f26484s = valueAnimator;
        this.f26479n = ObjectAnimator.ofFloat(this.f26475j, View.ALPHA, new float[]{0.0f, 1.0f});
        this.f26479n.setDuration(300);
        this.f26479n.setInterpolator(new C0704ks());
        this.f26479n.addListener(this.f26470c);
        this.f26480o = z;
        this.f26468a = irs;
    }
}
