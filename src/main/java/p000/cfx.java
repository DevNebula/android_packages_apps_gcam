package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: cfx */
final class cfx extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ cfk f23192a;

    cfx(cfk cfk) {
        this.f23192a = cfk;
    }

    public final void onCameraSwitch(int i) {
        this.f23192a.f23067O.mo13446o();
        cfk cfk = this.f23192a;
        cfk.f23178m.mo7297b(cfk.mo12492w(), "pref_camera_id_key", i);
    }
}
