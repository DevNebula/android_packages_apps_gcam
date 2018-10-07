package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: asj */
final class asj implements ffe {
    /* renamed from: a */
    private final /* synthetic */ ash f10688a;

    asj(ash ash) {
        this.f10688a = ash;
    }

    /* renamed from: a */
    public final void mo6771a() {
        fhh a = this.f10688a.f961a.mo6790a();
        fio fio = new fio((fim) ((ffw) isr.m4201a(this.f10688a.f962b)).mo13673b());
        try {
            Object fcb = new fcb();
            Object fbw = new fbw(fcg.f4696a);
            fio b = this.f10688a.f963c.mo1776b(fio);
            b.mo6813a(fds.m10428c(fcb));
            b.mo6813a(fds.m10428c(fbw));
            a.mo6816a(Arrays.asList(new fim[]{b.mo6807a()}), fiv.REPEATING);
            fbw.mo13229a().mo13731b();
            this.f10688a.f963c.mo1777c(fio).mo6813a(this.f10688a.f965e.f4718f);
            a.mo6816a(Arrays.asList(new fim[]{r3.mo6807a()}), fiv.NON_REPEATING);
            fcb.mo13229a().mo13731b();
            b.mo6809a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(true));
            a.mo6816a(Arrays.asList(new fim[]{b.mo6807a()}), fiv.REPEATING);
            this.f10688a.f964d.mo15641a(aua.m719a());
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    kqg.m5105a(r0, th2);
                }
            }
        }
    }
}
