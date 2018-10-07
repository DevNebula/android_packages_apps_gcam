package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dsx */
final class dsx implements ilp, iqt {
    /* renamed from: a */
    private final iqz f24069a;
    /* renamed from: b */
    private final long f24070b;
    /* renamed from: c */
    private final ilb f24071c;
    /* renamed from: d */
    private final ffc f24072d;
    /* renamed from: e */
    private long f24073e;

    static {
        bli.m887a("AutoFlashIndicator");
    }

    private dsx(ira ira, ffc ffc) {
        this.f24069a = ira.mo8854a("AutoFlashIndicator");
        this.f24070b = 30;
        this.f24072d = ffc;
        this.f24071c = new ilb(Boolean.valueOf(ffc.mo9082u()));
    }

    dsx(ira ira, ffc ffc, byte b) {
        this(ira, ffc);
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f24071c.mo13672a(iqt, executor);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo13673b() {
        return (Boolean) this.f24071c.mo13673b();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        iwp iwp = (iwp) obj;
        if (this.f24072d.mo9082u()) {
            Integer num = (Integer) iwp.mo13730a(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                return;
            }
            if (kbf.m16778b(num, Integer.valueOf(4))) {
                if (!((Boolean) this.f24071c.mo13673b()).booleanValue()) {
                    this.f24069a.mo8832b("Flash required");
                }
                this.f24073e = iwp.mo13731b();
                this.f24071c.mo8826a(Boolean.valueOf(true));
            } else if (kbf.m16778b(num, Integer.valueOf(2))) {
                if (((Boolean) this.f24071c.mo13673b()).booleanValue()) {
                    this.f24069a.mo8832b("Flash not required");
                }
                this.f24073e = iwp.mo13731b();
                this.f24071c.mo8826a(Boolean.valueOf(false));
            } else if (this.f24073e + this.f24070b < iwp.mo13731b()) {
                if (!((Boolean) this.f24071c.mo13673b()).booleanValue()) {
                    this.f24069a.mo8838f(String.format(null, "No converged AE result for %d frames, falling back to single-image auto-flash photo", new Object[]{Long.valueOf(this.f24070b)}));
                }
                this.f24071c.mo8826a(Boolean.valueOf(true));
            }
        }
    }
}
