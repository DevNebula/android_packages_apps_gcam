package p000;

import java.util.Collections;

/* renamed from: ipd */
public final /* synthetic */ class ipd implements Runnable {
    /* renamed from: a */
    private final ioo f7641a;

    public ipd(ioo ioo) {
        this.f7641a = ioo;
    }

    public final void run() {
        ioo ioo = this.f7641a;
        if (!ioo.f21114j) {
            for (iop e : Collections.unmodifiableCollection(ioo.f21108d)) {
                e.mo8686e();
            }
            ioo.f21114j = true;
        }
    }
}
