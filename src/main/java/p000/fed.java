package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fed */
public final class fed implements fel {
    /* renamed from: a */
    public final iqz f18168a;
    /* renamed from: b */
    public final ikb f18169b;

    public fed(ira ira, ikb ikb) {
        this.f18168a = ira.mo8854a("SimpleTorchSwitch");
        this.f18169b = ikb;
    }

    /* renamed from: a */
    public final fem mo6765a(fip fip, fim fim) {
        Object fef = new fef(this, fip, new fio(fim));
        try {
            fee fee = new fee(3);
            fio fio = new fio(fef.f24247b);
            fio.mo6809a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
            fio.mo6809a(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
            fio.mo6813a(fds.m10428c(fee));
            fim a = fio.mo6807a();
            fef.f24246a.mo6816a(Arrays.asList(new fim[]{a}), fiv.REPEATING);
            fef.f24248c.f18169b.mo8557a(new feg(fee));
            fee.mo13233b();
            return fef;
        } catch (Throwable th) {
            fef.close();
        }
    }

    /* renamed from: c */
    public final void mo6766c() {
    }
}
