package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cyt */
final class cyt extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ cyd f23721a;

    cyt(cyd cyd) {
        this.f23721a = cyd;
    }

    public final void onCameraSwitch(int i) {
        cyd cyd = this.f23721a;
        if (!cyd.f25820F) {
            boolean c = cyd.f25888o.mo6126c();
            cyd.f25880g.mo7289a(cyd.f25882i.f3018b, "pref_camera_id_key", i);
            grd grd = (grd) cyd.f25830P.cameraChange().create();
            iqo iqo = cyd.f25831Q;
            if (iqo != null) {
                iqo.close();
                cyd.f25831Q = null;
            }
            boolean c2 = cyd.f25888o.mo6126c();
            AtomicReference atomicReference = new AtomicReference();
            Long valueOf = Long.valueOf(System.nanoTime());
            cyd.f25836V.mo8826a(Boolean.valueOf(false));
            atomicReference.set(ilq.m3881a(cyd.f25836V, new cyg(cyd, grd, c, c2, valueOf, atomicReference)));
            cyd.f25831Q = (iqo) atomicReference.get();
            cyd.f25891r.mo8940a(cyd.f25831Q);
            czp czp = cyd.f25816B;
            if (czp != null) {
                czp.mo12949a(c2 ^ 1);
            }
            String str = cyd.f25814c;
            StringBuilder stringBuilder = new StringBuilder(44);
            stringBuilder.append("Start to switch camera. cameraId=");
            stringBuilder.append(i);
            bli.m888a(str, stringBuilder.toString());
            cyd.mo15485a(true, true);
        }
    }

    public final void onThumbnailButtonClicked() {
        this.f23721a.f25825K = true;
    }
}
