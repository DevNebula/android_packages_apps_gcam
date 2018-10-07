package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: iro */
final class iro implements iri {
    /* renamed from: a */
    private final kpw f21232a = kpw.m18486d();
    /* renamed from: b */
    private final ird f21233b;

    iro(ird ird) {
        this.f21233b = ird;
    }

    /* renamed from: a */
    public final void mo8871a() {
        this.f21232a.mo15641a(irp.RETRY);
    }

    /* renamed from: b */
    public final void mo8874b() {
        this.f21232a.mo15641a(irp.RETRY);
    }

    /* renamed from: a */
    public final void mo8872a(int i) {
        if (i == 3) {
            this.f21232a.mo15641a(irp.ERROR);
        } else {
            this.f21232a.mo15641a(irp.RETRY);
        }
    }

    /* renamed from: a */
    public final void mo8873a(iwl iwl) {
        this.f21232a.mo15641a(irp.CONNECTED);
    }

    /* renamed from: a */
    public final irp mo13705a(long j) {
        irp irp;
        this.f21233b.mo8856a("awaitResult");
        try {
            irp = (irp) this.f21232a.get(j, TimeUnit.MILLISECONDS);
            this.f21233b.mo8857b();
        } catch (TimeoutException e) {
            try {
                irp = irp.ERROR_TIMEOUT;
                return irp;
            } finally {
                this.f21233b.mo8857b();
            }
        } catch (ExecutionException e2) {
            irp = irp.ERROR_TIMEOUT;
            return irp;
        }
        return irp;
    }
}
