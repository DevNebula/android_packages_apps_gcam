package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: deu */
final class deu extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ des f23864a;

    deu(des des) {
        this.f23864a = des;
    }

    public final void onCancelButtonPressed() {
        this.f23864a.mo15500q();
    }

    public final void onRetakeButtonPressed() {
        des des = this.f23864a;
        des.f25930N++;
        if (des.f25984s == 0) {
            bli.m891b(des.f25916c, "Can't undo capture, no images captured.");
        } else if (!LightCycle.m1327b() || this.f23864a.f25975j.f3862b.mo23d().mo77a() == 8) {
            bli.m891b(des.f25916c, "Can't undo capture, LightCycle not ready to undo.");
        } else {
            des = this.f23864a;
            int i = des.f25984s;
            if (i > 0) {
                des.f25984s = i - 1;
                des.f25985t.mo6281b();
                this.f23864a.f25920D.sendEmptyMessage(101);
            }
            des = this.f23864a;
            if (des.f25984s == 0) {
                des.mo15497n();
            }
        }
    }
}
