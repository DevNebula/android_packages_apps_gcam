package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dhp */
final class dhp extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ BottomBarController f23923a;
    /* renamed from: b */
    private final /* synthetic */ dho f23924b;

    dhp(dho dho, BottomBarController bottomBarController) {
        this.f23924b = dho;
        this.f23923a = bottomBarController;
    }

    public final void onFpsSwitch(int i) {
        synchronized (this.f23924b.f26052j) {
            if (this.f23924b.f26055m == dii.CAMCORDER_OPENED) {
                this.f23923a.setClickable(false);
                inc inc = inc.FPS_120;
                if (i == 0) {
                    inc = inc.FPS_120;
                } else if (i == 1) {
                    inc = inc.FPS_240;
                }
                this.f23924b.mo15507a(inc);
                return;
            }
            String str = dho.f26623c;
            String valueOf = String.valueOf(this.f23924b.f26055m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Do nothing onFpsSwitch. mState=");
            stringBuilder.append(valueOf);
            bli.m898e(str, stringBuilder.toString());
        }
    }

    public final void onThumbnailButtonClicked() {
        synchronized (this.f23924b.f26052j) {
            dho dho = this.f23924b;
            if (dho.f26056n != null) {
                dho.f26056n.mo13032e();
            }
        }
    }
}
