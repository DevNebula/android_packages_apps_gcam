package p000;

import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: ze */
final class C0608ze implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f10075a;
    /* renamed from: b */
    private final /* synthetic */ aas f10076b;
    /* renamed from: c */
    private final /* synthetic */ aaf f10077c;
    /* renamed from: d */
    private final /* synthetic */ aaf f10078d = null;
    /* renamed from: e */
    private final /* synthetic */ PictureCallback f10079e;
    /* renamed from: f */
    private final /* synthetic */ C0800yu f10080f;

    C0608ze(C0800yu c0800yu, Handler handler, aas aas, aaf aaf, PictureCallback pictureCallback) {
        this.f10080f = c0800yu;
        this.f10075a = handler;
        this.f10076b = aas;
        this.f10077c = aaf;
        this.f10079e = pictureCallback;
    }

    public final void run() {
        if (!this.f10080f.f22452a.f22445e.mo81c()) {
            this.f10080f.f22452a.f22445e.mo80b(6);
            C0800yu c0800yu = this.f10080f;
            C0802zf c0802zf = c0800yu.f22452a.f22444d;
            Handler handler = this.f10075a;
            aas aas = this.f10076b;
            ShutterCallback c0615zm = handler != null ? c0800yu != null ? aas != null ? new C0615zm(handler, aas) : null : null : null;
            c0802zf.obtainMessage(601, new C0609zg(c0615zm, C0611zi.m6316a(this.f10075a, this.f10080f, this.f10077c), C0611zi.m6316a(this.f10075a, this.f10080f, null), this.f10079e)).sendToTarget();
        }
    }
}
