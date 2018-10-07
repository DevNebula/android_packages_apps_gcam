package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btw */
public final class btw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ Resources f1588a;
    /* renamed from: b */
    private final /* synthetic */ bsz f1589b;
    /* renamed from: c */
    private final /* synthetic */ FocusIndicatorView f1590c;

    public btw(Resources resources, bsz bsz, FocusIndicatorView focusIndicatorView) {
        this.f1588a = resources;
        this.f1589b = bsz;
        this.f1590c = focusIndicatorView;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f1589b.mo2109b(this.f1588a.getDimension(R.dimen.focus_lock_hold_outer_ring_diameter));
        this.f1589b.mo2111d(this.f1588a.getDimension(R.dimen.focus_lock_hold_outer_ring_thickness));
        this.f1589b.mo2108a(this.f1588a.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f1590c.invalidate();
    }
}
