package p000;

import android.hardware.Camera.ShutterCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zm */
final class C0615zm implements ShutterCallback {
    /* renamed from: a */
    public final aas f10096a;
    /* renamed from: b */
    private final Handler f10097b;

    C0615zm(Handler handler, aas aas) {
        this.f10097b = handler;
        this.f10096a = aas;
    }

    public final void onShutter() {
        this.f10097b.post(new C0616zn(this));
    }
}
