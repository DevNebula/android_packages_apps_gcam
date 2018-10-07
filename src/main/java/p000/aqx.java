package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* renamed from: aqx */
public final class aqx implements ara {
    /* renamed from: a */
    private final int f10674a;
    /* renamed from: b */
    private final boolean f10675b;

    public aqx(int i, boolean z) {
        this.f10674a = i;
        this.f10675b = z;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo1719a(Object obj, arb arb) {
        Drawable drawable = (Drawable) obj;
        Drawable e = arb.mo1721e();
        if (e == null) {
            e = new ColorDrawable(0);
        }
        Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{e, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f10675b);
        transitionDrawable.startTransition(this.f10674a);
        arb.mo1720d(transitionDrawable);
        return true;
    }
}
