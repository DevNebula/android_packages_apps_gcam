package p000;

import android.util.Log;
import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: hjj */
final class hjj extends TimerTask {
    /* renamed from: a */
    private final /* synthetic */ hji f6636a;

    hjj(hji hji) {
        this.f6636a = hji;
    }

    public final void run() {
        Log.e("CAM_GApiClientPxy", "Timeout connecting to GoogleApiClient");
        ((kpw) jri.m13404b(this.f6636a.f20168b)).mo15642a(new IllegalStateException("Fail to connect, timeout"));
    }
}
