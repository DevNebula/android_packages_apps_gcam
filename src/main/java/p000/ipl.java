package p000;

import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: ipl */
public final /* synthetic */ class ipl implements Callable {
    /* renamed from: a */
    private final ios f7658a;

    public ipl(ios ios) {
        this.f7658a = ios;
    }

    public final Object call() {
        ior ior = this.f7658a.f21144f;
        if (ior != null) {
            synchronized (ior.f21125a) {
                if (ior.f21134j == ipk.READY || ior.f21134j == ipk.PAUSED) {
                    ior.f21129e = new ipj(ior, "VideoEncoder");
                    ior.f21126b.start();
                    ior.f21129e.start();
                    ior.f21134j = ipk.STARTED;
                } else {
                    String valueOf = String.valueOf(ior.f21134j);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    stringBuilder.append("illegal state as ");
                    stringBuilder.append(valueOf);
                    Log.e("VideoEncoder", stringBuilder.toString());
                }
            }
        }
        return null;
    }
}
