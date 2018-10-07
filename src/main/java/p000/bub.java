package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bub */
public final class bub implements kwk {
    /* renamed from: a */
    private final kwk f11788a;
    /* renamed from: b */
    private final kwk f11789b;
    /* renamed from: c */
    private final kwk f11790c;

    public bub(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11788a = kwk;
        this.f11789b = kwk2;
        this.f11790c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11788a;
        kwk kwk2 = this.f11789b;
        Context context = (Context) kwk.mo10566a();
        btl btl = (btl) kwk2.mo10566a();
        this.f11790c.mo10566a();
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.passive_focus_converge_outer_ring_opacity_fade_out);
        valueAnimator.addUpdateListener(btl.mo2119e());
        valueAnimator.addListener(new hiu("PassiveFocusConvergeAnimation"));
        return (hix) ktm.m14219a(hiy.m3247a(valueAnimator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
