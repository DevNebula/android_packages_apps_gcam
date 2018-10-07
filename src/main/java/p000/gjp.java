package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gjp */
final class gjp implements fem {
    /* renamed from: a */
    private final fip f24363a;
    /* renamed from: b */
    private final fio f24364b;
    /* renamed from: c */
    private final AtomicBoolean f24365c = new AtomicBoolean(false);
    /* renamed from: d */
    private final /* synthetic */ gjk f24366d;

    gjp(gjk gjk, fip fip, fio fio) {
        this.f24366d = gjk;
        this.f24363a = fip;
        this.f24364b = fio;
    }

    public final void close() {
        if (!this.f24365c.getAndSet(true) && this.f24366d.f19240d) {
            fim a = new fio(this.f24364b).mo6807a();
            try {
                this.f24363a.mo6816a(Arrays.asList(new fim[]{a}), fiv.REPEATING);
            } catch (Throwable e) {
                bli.m892b(gjk.f19237a, "Couldn't reset external flash AE mode", e);
            }
        }
    }

    /* renamed from: a */
    public final fim mo13234a(fim fim) {
        fio fio = new fio(fim);
        if (this.f24366d.f19240d) {
            fio.mo6809a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(5));
        }
        return fio.mo6807a();
    }
}
