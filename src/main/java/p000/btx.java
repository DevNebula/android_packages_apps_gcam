package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: btx */
public final class btx implements kwk {
    /* renamed from: a */
    private final kwk f11770a;
    /* renamed from: b */
    private final kwk f11771b;
    /* renamed from: c */
    private final kwk f11772c;

    public btx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11770a = kwk;
        this.f11771b = kwk2;
        this.f11772c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11770a;
        kwk kwk2 = this.f11771b;
        Context context = (Context) kwk.mo10566a();
        btl btl = (btl) kwk2.mo10566a();
        this.f11772c.mo10566a();
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_converge_outer_ring_opacity_fade_out);
        valueAnimator.addUpdateListener(btl.mo2119e());
        valueAnimator.addListener(new hiu("ActiveFocusConvergeAnimation"));
        return (hix) ktm.m14219a(hiy.m3247a(valueAnimator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
