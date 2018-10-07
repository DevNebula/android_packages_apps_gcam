package p000;

import android.hardware.Camera.Parameters;

/* compiled from: PG */
/* renamed from: yw */
final class C0600yw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Parameters[] f10054a;
    /* renamed from: b */
    private final /* synthetic */ aaw f10055b;
    /* renamed from: c */
    private final /* synthetic */ C0800yu f10056c;

    C0600yw(C0800yu c0800yu, Parameters[] parametersArr, aaw aaw) {
        this.f10056c = c0800yu;
        this.f10054a = parametersArr;
        this.f10055b = aaw;
    }

    public final void run() {
        this.f10056c.f22452a.f22444d.obtainMessage(202, this.f10054a).sendToTarget();
        this.f10056c.f22452a.f22444d.post(this.f10055b.f38a);
    }
}
