package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fdd */
final class fdd implements fdx {
    /* renamed from: a */
    private static final keu f24243a = keu.m13729a(Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(2));
    /* renamed from: b */
    private final fen f24244b = new fen(f24243a, fep.AWB);
    /* renamed from: c */
    private final kpw f24245c = kpw.m18486d();

    /* renamed from: a */
    public final iwp mo13229a() {
        try {
            return (iwp) this.f24245c.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        obj = (iwp) obj;
        if (this.f24244b.mo6767a(obj.mo13731b(), null, (Integer) obj.mo13730a(CaptureResult.CONTROL_AWB_STATE), (Long) obj.mo13730a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f24245c.mo15641a(obj);
        }
    }
}
