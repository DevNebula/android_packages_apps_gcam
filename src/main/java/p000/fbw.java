package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fbw */
public final class fbw implements fdx {
    /* renamed from: a */
    private final fen f24232a;
    /* renamed from: b */
    private final kpw f24233b = kpw.m18486d();

    public fbw(gie gie) {
        this.f24232a = new fen(keu.m13727a(Integer.valueOf(gie.f5453d)), fep.AE_MODE_PASSIVE);
    }

    /* renamed from: a */
    public final iwp mo13229a() {
        try {
            return (iwp) this.f24233b.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        obj = (iwp) obj;
        if (this.f24232a.mo6767a(obj.mo13731b(), null, (Integer) obj.mo13730a(CaptureResult.CONTROL_AE_MODE), (Long) obj.mo13730a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f24233b.mo15641a(obj);
        }
    }
}
