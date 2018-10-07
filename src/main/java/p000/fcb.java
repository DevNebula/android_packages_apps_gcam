package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcb */
public final class fcb implements fdx {
    /* renamed from: b */
    private static final keu f24234b = keu.m13730a(Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(3));
    /* renamed from: a */
    public final kpw f24235a = kpw.m18486d();
    /* renamed from: c */
    private final fen f24236c = new fen(f24234b, fep.AE_STATE);

    /* renamed from: a */
    public final iwp mo13229a() {
        try {
            return (iwp) this.f24235a.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo8826a(iwp iwp) {
        if (this.f24236c.mo6767a(iwp.mo13731b(), null, (Integer) iwp.mo13730a(CaptureResult.CONTROL_AE_STATE), (Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f24235a.mo15641a((Object) iwp);
        }
    }
}
