package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: frv */
final class frv implements kaw {
    /* renamed from: a */
    private final hju f18742a;

    public frv(hju hju) {
        this.f18742a = hju;
    }

    /* renamed from: a */
    private final foz m10912a(fkp fkp) {
        jri.m13404b((Object) fkp);
        try {
            iqm b;
            iwp iwp = (iwp) koz.m5089a((Future) jri.m13404b(fkp.mo15529h()), TimeoutException.class, TimeUnit.MILLISECONDS);
            hju hju = this.f18742a;
            ixa ixa = (ixa) fkp.mo13743e().get(0);
            byte[] bArr = new byte[ixa.mo9144a().capacity()];
            ixa.mo9144a().get(bArr);
            itg itg = new itg(itg.m4252a(bArr));
            iqm a = isx.m4216a(isx.m4217a(itg.f7821a));
            Integer num = (Integer) iwp.mo13730a(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                b = iqm.m4097b(num.intValue() - a.f7692e);
            } else {
                b = iqm.CLOCKWISE_0;
            }
            iqp a2 = new iqp(fkp.mo13745g(), fkp.mo13742d()).mo8813a(b);
            itg.mo8998a(a2.f7695a, a2.f7696b, a, kbg.m4804c(iwp));
            Object a3 = foz.m2410a(fkp.mo13744f(), bArr, a2, a.f7692e, itg.f7821a, hju, true);
            fkp.close();
            return (foz) jri.m13404b(a3);
        } catch (TimeoutException e) {
            throw new kqf("Timeout reterieving image metadata.");
        } catch (Throwable th) {
            fkp.close();
        }
    }
}
