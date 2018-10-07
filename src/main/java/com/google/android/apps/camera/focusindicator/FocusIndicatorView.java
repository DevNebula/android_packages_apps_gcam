package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.atb;
import p000.bsx;
import p000.bsz;
import p000.bta;
import p000.btb;
import p000.btc;
import p000.btd;
import p000.btg;
import p000.btj;
import p000.btk;
import p000.hiv;
import p000.hix;
import p000.kbg;
import p000.ktm;

/* compiled from: PG */
public class FocusIndicatorView extends RelativeLayout implements atb {
    /* renamed from: a */
    public FocusIndicatorRingView f23241a;
    /* renamed from: b */
    public bsz f23242b;
    /* renamed from: c */
    public bta f23243c;
    /* renamed from: d */
    public TextView f23244d;
    /* renamed from: e */
    public hix f23245e;
    /* renamed from: f */
    public hix f23246f;
    /* renamed from: g */
    public hix f23247g;
    /* renamed from: h */
    public hix f23248h;
    /* renamed from: i */
    public hix f23249i;
    /* renamed from: j */
    public hix f23250j;
    /* renamed from: k */
    public hix f23251k;
    /* renamed from: l */
    public hix f23252l;
    /* renamed from: m */
    public Animator f23253m;
    /* renamed from: n */
    private final btc f23254n;
    /* renamed from: o */
    private final PointF f23255o;
    /* renamed from: p */
    private final int[] f23256p;
    /* renamed from: q */
    private final AnimatorListener f23257q;

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23255o = new PointF(0.0f, 0.0f);
        this.f23256p = new int[2];
        this.f23257q = new btb(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.focus_indicator_view_contents, this);
        this.f23254n = m15319a(context);
        btc btc = this.f23254n;
        this.f23241a = btg.m7829a(btc.f1548a);
        this.f23242b = btj.m7833a(btc.f1548a);
        this.f23243c = btk.m7835a(btc.f1548a);
        this.f23244d = (TextView) ktm.m14219a(btc.f1548a.f1568d, "Cannot return null from a non-@Nullable @Provides method");
        this.f23245e = (hix) btc.f1549b.mo10566a();
        this.f23246f = (hix) btc.f1550c.mo10566a();
        this.f23247g = (hix) btc.f1551d.mo10566a();
        this.f23248h = (hix) btc.f1552e.mo10566a();
        this.f23249i = (hix) btc.f1553f.mo10566a();
        this.f23250j = (hix) btc.f1554g.mo10566a();
        this.f23251k = (hix) btc.f1555h.mo10566a();
        this.f23252l = (hix) btc.f1556i.mo10566a();
        m15320a(this.f23245e);
        m15320a(this.f23246f);
        m15320a(this.f23247g);
        m15320a(this.f23248h);
        m15320a(this.f23249i);
        m15320a(this.f23250j);
        m15320a(this.f23251k);
        m15320a(this.f23252l);
    }

    FocusIndicatorView(Context context, FocusIndicatorRingView focusIndicatorRingView, bsz bsz, bta bta, TextView textView, hix hix, hix hix2, hix hix3, hix hix4, hix hix5, hix hix6) {
        super(context);
        this.f23255o = new PointF(0.0f, 0.0f);
        this.f23256p = new int[2];
        this.f23257q = new btb(this);
        this.f23254n = m15319a(context);
        this.f23241a = focusIndicatorRingView;
        this.f23242b = bsz;
        this.f23243c = bta;
        this.f23244d = textView;
        this.f23245e = m15320a(hix);
        this.f23246f = m15320a(hix2);
        this.f23247g = m15320a(hix3);
        this.f23248h = m15320a(hix4);
        this.f23249i = m15320a(hix5);
        this.f23250j = m15320a(hix6);
    }

    /* renamed from: a */
    private final hix m15320a(hix hix) {
        if (hix != null) {
            hix.mo7900a(this.f23257q);
        }
        return hix;
    }

    /* renamed from: d */
    private final void m15322d() {
        Animator animator = this.f23253m;
        if (animator != null && animator.isRunning()) {
            this.f23253m.cancel();
            this.f23253m = null;
        }
    }

    /* renamed from: a */
    public final void mo12315a() {
        m15322d();
        m15323e();
    }

    /* renamed from: e */
    private final void m15323e() {
        this.f23243c.mo2112a(0.0f);
        this.f23242b.mo2110c(0.0f);
        this.f23241a.invalidate();
    }

    /* renamed from: a */
    private final btc m15319a(Context context) {
        Object btd = new btd(context, this);
        bsx bsx = new bsx();
        bsx.f1539a = (btd) ktm.m14218a(btd);
        if (bsx.f1539a != null) {
            return new btc(bsx);
        }
        throw new IllegalStateException(String.valueOf(btd.class.getCanonicalName()).concat(" must be set"));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f23256p);
        PointF pointF = this.f23255o;
        int[] iArr = this.f23256p;
        pointF.set((float) iArr[0], (float) iArr[1]);
    }

    /* renamed from: c */
    private final PointF m15321c(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        PointF pointF3 = this.f23255o;
        pointF2.offset(-pointF3.x, -pointF3.y);
        return pointF2;
    }

    /* renamed from: a */
    public final void mo12316a(boolean z) {
        this.f23244d.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo12319b(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    /* renamed from: b */
    public final hiv mo12317b() {
        Animator animator = this.f23253m;
        if (animator == null || !animator.isRunning()) {
            return this.f23246f.mo7899a();
        }
        return hix.f6623a;
    }

    /* renamed from: a */
    public final hiv mo12313a(PointF pointF) {
        m15322d();
        m15323e();
        this.f23241a.mo2597a(m15321c(pointF));
        return this.f23245e.mo7899a();
    }

    /* renamed from: c */
    public final hiv mo12320c() {
        Animator animator = this.f23253m;
        if (animator == null || !animator.isRunning()) {
            return this.f23248h.mo7899a();
        }
        return hix.f6623a;
    }

    /* renamed from: a */
    public final hiv mo12314a(kbg kbg) {
        Animator animator = this.f23253m;
        if (animator != null && animator.isRunning()) {
            return hix.f6623a;
        }
        m15323e();
        if (kbg.mo9709b()) {
            this.f23241a.mo2597a(m15321c((PointF) kbg.mo9706a()));
        } else {
            this.f23241a.mo2597a(new PointF((float) (getWidth() / 2), (float) (getHeight() / 2)));
        }
        return this.f23247g.mo7899a();
    }

    /* renamed from: b */
    public final void mo12318b(PointF pointF) {
        this.f23241a.mo2597a(pointF);
        invalidate();
    }
}
