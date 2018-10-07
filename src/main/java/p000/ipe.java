package p000;

import java.util.Collections;

/* renamed from: ipe */
public final /* synthetic */ class ipe implements Runnable {
    /* renamed from: a */
    private final ioo f7642a;

    public ipe(ioo ioo) {
        this.f7642a = ioo;
    }

    public final void run() {
        ioo ioo = this.f7642a;
        if (!ioo.f21114j) {
            for (iop e : Collections.unmodifiableCollection(ioo.f21108d)) {
                e.mo8686e();
            }
            ioo.f21114j = true;
        }
    }
}
