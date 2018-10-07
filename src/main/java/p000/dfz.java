package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: dfz */
final class dfz extends Handler {
    /* renamed from: a */
    private final WeakReference f3246a;

    public dfz(des des) {
        this.f3246a = new WeakReference(des);
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        des des = (des) this.f3246a.get();
        if (des != null) {
            switch (message.what) {
                case 101:
                    des.mo15496m();
                    return;
                case 102:
                case 103:
                    return;
                case 104:
                    eln eln = des.f25980o;
                    goe m = eln.f4165b.mo13384m();
                    if (m.mo7274b()) {
                        String path = m.mo7273a().getPath();
                        long a = des.f25971f.mo7091a() / 1000000;
                        if (!des.f25924H && LightCycle.m1335f() > 0) {
                            z = false;
                        }
                        int i = (int) a;
                        synchronized (LightCycle.f2562a) {
                            LightCycleNative.FinishCapture(z, path, path, i);
                            LightCycle.f2563b = Boolean.valueOf(false);
                        }
                        des.f25979n.mo6311a(eln, new elp(des, eln));
                    } else {
                        bli.m891b(des.f25916c, "Could not create temporary mosaic file. Not able to stitch.");
                    }
                    des.mo15502s();
                    return;
                case 105:
                    des.mo15502s();
                    return;
                default:
                    throw new AssertionError(message.what);
            }
        }
    }
}
