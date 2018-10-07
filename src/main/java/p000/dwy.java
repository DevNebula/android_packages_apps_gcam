package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dwy */
final class dwy extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ dwd f24087a;

    dwy(dwd dwd) {
        this.f24087a = dwd;
    }

    public final void onCameraSwitch(int i) {
        dwd dwd = this.f24087a;
        String str;
        StringBuilder stringBuilder;
        if (dwd.f26222k.mo12463E() || dwd.f26222k.mo12483n().mo1877b()) {
            str = dwd.f26171d;
            boolean E = dwd.f26222k.mo12463E();
            boolean b = dwd.f26222k.mo12483n().mo1877b();
            stringBuilder = new StringBuilder(82);
            stringBuilder.append("Not switching cameras, appController is stopped: ");
            stringBuilder.append(E);
            stringBuilder.append(" / waiting for camera: ");
            stringBuilder.append(b);
            bli.m888a(str, stringBuilder.toString());
        } else if (i == dwd.f26235x) {
            str = dwd.f26171d;
            int i2 = dwd.f26235x;
            stringBuilder = new StringBuilder(47);
            stringBuilder.append("Not switching cameras, same facing: ");
            stringBuilder.append(i2);
            bli.m898e(str, stringBuilder.toString());
            dwd.f26222k.mo12481l().mo13129h();
        } else {
            dwd.f26234w = C0252go.f5830ac;
            dxj dxj = dwd.f26224m;
            if (dxj != null) {
                dxj.mo13089c();
            }
            dwd.f26224m = null;
            dwd.f26221j.mo12483n().mo1879d(i);
            dwd.f26220i.mo6124a(i);
        }
    }
}
