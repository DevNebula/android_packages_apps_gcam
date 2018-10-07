package p000;

import java.util.Collections;

/* renamed from: ipc */
public final /* synthetic */ class ipc implements Runnable {
    /* renamed from: a */
    private final ioo f7640a;

    public ipc(ioo ioo) {
        this.f7640a = ioo;
    }

    public final void run() {
        for (iop d : Collections.unmodifiableCollection(this.f7640a.f21108d)) {
            d.mo8685d();
        }
    }
}
