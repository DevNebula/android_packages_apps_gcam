package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ry */
final class C0465ry implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ArrayList f9674a;
    /* renamed from: b */
    private final /* synthetic */ C0839rv f9675b;

    C0465ry(C0839rv c0839rv, ArrayList arrayList) {
        this.f9675b = c0839rv;
        this.f9674a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9674a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0530ux c0530ux = (C0530ux) arrayList.get(i);
            C0512ub c0512ub = this.f9675b;
            View view = c0530ux.f9877a;
            ViewPropertyAnimator animate = view.animate();
            c0512ub.f25458d.add(c0530ux);
            animate.alpha(1.0f).setDuration(c0512ub.f9807i).setListener(new C0468sa(c0512ub, c0530ux, view, animate)).start();
            i = i2;
        }
        this.f9674a.clear();
        this.f9675b.f25455a.remove(this.f9674a);
    }
}
