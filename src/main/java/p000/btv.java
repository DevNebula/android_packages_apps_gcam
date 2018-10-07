package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btv */
public final class btv extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ Resources f1585a;
    /* renamed from: b */
    private final /* synthetic */ bsz f1586b;
    /* renamed from: c */
    private final /* synthetic */ FocusIndicatorView f1587c;

    public btv(Resources resources, bsz bsz, FocusIndicatorView focusIndicatorView) {
        this.f1585a = resources;
        this.f1586b = bsz;
        this.f1587c = focusIndicatorView;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1586b.mo2111d(this.f1585a.getDimension(R.dimen.active_focus_outer_ring_thickness));
        this.f1586b.mo2108a(this.f1585a.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f1587c.invalidate();
    }
}
