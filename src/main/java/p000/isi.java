package p000;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: isi */
final /* synthetic */ class isi implements Runnable {
    /* renamed from: a */
    private final irh f7755a;

    isi(irh irh) {
        this.f7755a = irh;
    }

    public final void run() {
        irx irx;
        irh irh = this.f7755a;
        synchronized (irh.f7717d) {
            if (irh.f7716c.mo8942c()) {
                irx = irh.f7720g;
                if (irx != null) {
                    irh.f7720g = null;
                    irh.f7719f = null;
                } else {
                    irx = null;
                }
            } else {
                iur iur = irh.f7719f;
                if (iur == null) {
                    irx = null;
                } else if (irh.f7721h == null) {
                    irq irq = irh.f7715b;
                    irh.f7723j = new irl((Handler) irq.m4146a((Handler) irq.f7736a.mo10566a(), 1), (Executor) irq.m4146a((Executor) irq.f7737b.mo10566a(), 2), (CameraManager) irq.m4146a((CameraManager) irq.f7738c.mo10566a(), 3), (irs) irq.m4146a((irs) irq.f7739d.mo10566a(), 4), (ird) irq.m4146a((ird) irq.f7740e.mo10566a(), 5), (iya) irq.m4146a((iya) irq.f7741f.mo10566a(), 6), (String) irq.m4146a(iur.f7848b, 7));
                    irx b = irh.f7723j.mo13704b();
                    b.mo13706a(new ism(irh, iur));
                    b.mo13706a((iri) jri.m13404b(irh.f7720g));
                    irh.f7721h = iur;
                    irh.f7722i = b;
                    irh.f7716c.mo8940a(new isk(irh));
                    irh.f7714a.mo8861b(iur);
                    irx = null;
                } else {
                    irx = null;
                }
            }
            irh.f7724k = false;
        }
        if (irx != null) {
            irx.mo8874b();
        }
    }
}
