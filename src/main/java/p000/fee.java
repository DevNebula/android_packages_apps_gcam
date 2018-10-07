package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: fee */
final class fee implements iqt {
    /* renamed from: a */
    private final kpw f18170a = kpw.m18486d();
    /* renamed from: b */
    private int f18171b;

    public fee(int i) {
        this.f18171b = i;
    }

    /* renamed from: a */
    public final void mo13232a() {
        if (!this.f18170a.isDone()) {
            this.f18170a.mo15642a(new InterruptedException("FlashStateResult cancelled"));
        }
    }

    /* renamed from: b */
    public final boolean mo13233b() {
        try {
            return ((Boolean) this.f18170a.get()).booleanValue();
        } catch (ExecutionException e) {
            throw new InterruptedException(e.getMessage());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        iwp iwp = (iwp) obj;
        if (iwp.mo13730a(CaptureResult.FLASH_STATE) != null && ((Integer) iwp.mo13730a(CaptureResult.FLASH_STATE)).intValue() == this.f18171b) {
            this.f18170a.mo15641a(Boolean.valueOf(true));
        }
    }
}
