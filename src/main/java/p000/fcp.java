package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcp */
public final class fcp implements fdx {
    /* renamed from: a */
    public static final keu f24240a = keu.m13729a(Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(5));
    /* renamed from: b */
    public final kpw f24241b = kpw.m18486d();
    /* renamed from: c */
    private final fen f24242c = new fen(Integer.valueOf(1), f24240a, 120, fep.AF);

    /* renamed from: a */
    public final iwp mo13229a() {
        try {
            return (iwp) this.f24241b.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo8826a(iwp iwp) {
        if (this.f24242c.mo6767a(iwp.mo13731b(), (Integer) iwp.mo13733d().mo13726a(CaptureRequest.CONTROL_AF_TRIGGER), (Integer) iwp.mo13730a(CaptureResult.CONTROL_AF_STATE), (Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f24241b.mo15641a((Object) iwp);
        }
    }
}
