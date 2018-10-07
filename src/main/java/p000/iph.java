package p000;

import java.util.Collections;

/* renamed from: iph */
public final /* synthetic */ class iph implements Runnable {
    /* renamed from: a */
    private final ioo f7645a;

    public iph(ioo ioo) {
        this.f7645a = ioo;
    }

    public final void run() {
        for (iop f : Collections.unmodifiableCollection(this.f7645a.f21108d)) {
            f.mo8687f();
        }
    }
}
