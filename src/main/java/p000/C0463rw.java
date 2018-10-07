package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rw */
final class C0463rw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ArrayList f9670a;
    /* renamed from: b */
    private final /* synthetic */ C0839rv f9671b;

    C0463rw(C0839rv c0839rv, ArrayList arrayList) {
        this.f9671b = c0839rv;
        this.f9670a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9670a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0473sf c0473sf = (C0473sf) arrayList.get(i);
            C0512ub c0512ub = this.f9671b;
            C0530ux c0530ux = c0473sf.f9704a;
            int i3 = c0473sf.f9705b;
            int i4 = c0473sf.f9706c;
            int i5 = c0473sf.f9707d;
            i = c0473sf.f9708e;
            View view = c0530ux.f9877a;
            i3 = i5 - i3;
            i4 = i - i4;
            if (i3 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i4 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            c0512ub.f25459e.add(c0530ux);
            animate.setDuration(c0512ub.f9809k).setListener(new C0469sb(c0512ub, c0530ux, i3, view, i4, animate)).start();
            i = i2;
        }
        this.f9670a.clear();
        this.f9671b.f25456b.remove(this.f9670a);
    }
}
