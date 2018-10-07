package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcf */
final class fcf implements fdx {
    /* renamed from: a */
    private static final keu f24237a = keu.m13730a(Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(3));
    /* renamed from: b */
    private final fen f24238b = new fen(Integer.valueOf(1), f24237a, 60, fep.AE);
    /* renamed from: c */
    private final kpw f24239c = kpw.m18486d();

    /* renamed from: a */
    public final iwp mo13229a() {
        try {
            return (iwp) this.f24239c.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        obj = (iwp) obj;
        if (this.f24238b.mo6767a(obj.mo13731b(), (Integer) obj.mo13733d().mo13726a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), (Integer) obj.mo13730a(CaptureResult.CONTROL_AE_STATE), (Long) obj.mo13730a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f24239c.mo15641a(obj);
        }
    }
}
