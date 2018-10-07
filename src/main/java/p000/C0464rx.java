package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rx */
final class C0464rx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ArrayList f9672a;
    /* renamed from: b */
    private final /* synthetic */ C0839rv f9673b;

    C0464rx(C0839rv c0839rv, ArrayList arrayList) {
        this.f9673b = c0839rv;
        this.f9672a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9672a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            View view;
            View view2;
            int i2 = i + 1;
            C0472se c0472se = (C0472se) arrayList.get(i);
            C0512ub c0512ub = this.f9673b;
            C0530ux c0530ux = c0472se.f9698a;
            if (c0530ux != null) {
                view = c0530ux.f9877a;
            } else {
                view = null;
            }
            C0530ux c0530ux2 = c0472se.f9699b;
            if (c0530ux2 != null) {
                view2 = c0530ux2.f9877a;
            } else {
                view2 = null;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c0512ub.f9810l);
                c0512ub.f25461g.add(c0472se.f9698a);
                duration.translationX((float) (c0472se.f9702e - c0472se.f9700c));
                duration.translationY((float) (c0472se.f9703f - c0472se.f9701d));
                duration.alpha(0.0f).setListener(new C0470sc(c0512ub, c0472se, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c0512ub.f25461g.add(c0472se.f9699b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c0512ub.f9810l).alpha(1.0f).setListener(new C0471sd(c0512ub, c0472se, animate, view2)).start();
                i = i2;
            } else {
                i = i2;
            }
        }
        this.f9672a.clear();
        this.f9673b.f25457c.remove(this.f9672a);
    }
}
