package p000;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btl */
public final class btl {
    /* renamed from: a */
    public final Resources f1570a;
    /* renamed from: b */
    public final FocusIndicatorView f1571b;
    /* renamed from: c */
    public final FocusIndicatorRingView f1572c;
    /* renamed from: d */
    public final bsz f1573d;
    /* renamed from: e */
    public final bta f1574e;

    public btl(Resources resources, FocusIndicatorView focusIndicatorView, FocusIndicatorRingView focusIndicatorRingView, bsz bsz, bta bta) {
        this.f1570a = resources;
        this.f1571b = focusIndicatorView;
        this.f1572c = focusIndicatorRingView;
        this.f1573d = bsz;
        this.f1574e = bta;
    }

    /* renamed from: a */
    public final AnimatorUpdateListener mo2115a() {
        return new btn(this);
    }

    /* renamed from: b */
    public final AnimatorUpdateListener mo2116b() {
        return new bto(this);
    }

    /* renamed from: c */
    public final AnimatorUpdateListener mo2117c() {
        return new bts(this);
    }

    /* renamed from: d */
    public final AnimatorUpdateListener mo2118d() {
        return new btp(this);
    }

    /* renamed from: e */
    public final AnimatorUpdateListener mo2119e() {
        return new btq(this);
    }
}
