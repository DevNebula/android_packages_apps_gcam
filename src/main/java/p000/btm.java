package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: btm */
final class btm extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ btl f1575a;

    btm(btl btl) {
        this.f1575a = btl;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f1575a.f1573d.mo2109b(this.f1575a.f1570a.getDimension(R.dimen.focus_lock_hold_outer_ring_diameter));
        this.f1575a.f1573d.mo2111d(this.f1575a.f1570a.getDimension(R.dimen.focus_lock_hold_outer_ring_thickness));
        this.f1575a.f1573d.mo2108a(this.f1575a.f1570a.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f1575a.f1571b.invalidate();
    }
}
