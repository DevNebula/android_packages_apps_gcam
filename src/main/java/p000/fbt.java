package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fbt */
public final class fbt implements fdx {
    /* renamed from: a */
    private final kpw f24231a = kpw.m18486d();

    /* renamed from: a */
    public final iwp mo13229a() {
        try {
            return (iwp) this.f24231a.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        obj = (iwp) obj;
        Boolean bool = (Boolean) obj.mo13730a(CaptureResult.CONTROL_AE_LOCK);
        if (!this.f24231a.isDone() && bool != null && !bool.booleanValue()) {
            this.f24231a.mo15641a(obj);
        }
    }
}
