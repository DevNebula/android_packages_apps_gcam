package p000;

import java.util.Collections;

/* renamed from: ipf */
public final /* synthetic */ class ipf implements Runnable {
    /* renamed from: a */
    private final ioo f7643a;

    public ipf(ioo ioo) {
        this.f7643a = ioo;
    }

    public final void run() {
        ioo ioo = this.f7643a;
        if (!ioo.f21115k) {
            for (iop c : Collections.unmodifiableCollection(ioo.f21108d)) {
                c.mo8684c();
            }
            ioo.f21115k = true;
        }
    }
}
