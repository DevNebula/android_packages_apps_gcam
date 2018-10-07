package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fef */
final class fef implements fem {
    /* renamed from: a */
    public final fip f24246a;
    /* renamed from: b */
    public final fio f24247b;
    /* renamed from: c */
    public final /* synthetic */ fed f24248c;
    /* renamed from: d */
    private final AtomicBoolean f24249d = new AtomicBoolean(false);

    fef(fed fed, fip fip, fio fio) {
        this.f24248c = fed;
        this.f24246a = fip;
        this.f24247b = fio;
    }

    public final void close() {
        Throwable e;
        if (!this.f24249d.getAndSet(true)) {
            try {
                fee fee = new fee(2);
                fio fio = new fio(this.f24247b);
                fim a = fio.mo6807a();
                fio.mo6809a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                fio.mo6809a(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                fio.mo6813a(fds.m10428c(fee));
                this.f24246a.mo6816a(Arrays.asList(new fim[]{fio.mo6807a()}), fiv.NON_REPEATING);
                this.f24246a.mo6816a(Arrays.asList(new fim[]{a}), fiv.REPEATING);
                this.f24248c.f18169b.mo8557a(new feh(fee));
                fee.mo13233b();
                return;
            } catch (isr e2) {
                e = e2;
            } catch (InterruptedException e3) {
                e = e3;
            }
        } else {
            return;
        }
        this.f24248c.f18168a.mo8831a("Unable to reset after torch on.", e);
    }

    /* renamed from: a */
    public final fim mo13234a(fim fim) {
        fio fio = new fio(fim);
        fio.mo6809a(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
        fio.mo6809a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        return fio.mo6807a();
    }
}
