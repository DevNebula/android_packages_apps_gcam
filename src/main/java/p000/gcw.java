package p000;

import com.google.googlex.gcam.GoudaSwigWrapper;

/* renamed from: gcw */
final /* synthetic */ class gcw implements Runnable {
    /* renamed from: a */
    private final gcv f5312a;

    gcw(gcv gcv) {
        this.f5312a = gcv;
    }

    public final void run() {
        gcv gcv = this.f5312a;
        synchronized (gcv.f19027d) {
            GoudaSwigWrapper goudaSwigWrapper = gcv.f19030g;
            if (goudaSwigWrapper != null) {
                goudaSwigWrapper.Init();
                gcv.f19029f = true;
            }
        }
    }
}
