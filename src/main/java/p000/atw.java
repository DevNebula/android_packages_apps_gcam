package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;

/* compiled from: PG */
/* renamed from: atw */
public final class atw implements kwk {
    /* renamed from: a */
    private final kwk f10747a;
    /* renamed from: b */
    private final kwk f10748b;
    /* renamed from: c */
    private final kwk f10749c;

    private atw(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10747a = kwk;
        this.f10748b = kwk2;
        this.f10749c = kwk3;
    }

    /* renamed from: a */
    public static atw m7066a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new atw(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f10747a;
        kwk kwk2 = this.f10748b;
        kwk kwk3 = this.f10749c;
        ffc ffc = (ffc) kwk.mo10566a();
        kwk2.mo10566a();
        ilp ilp = (fch) kwk3.mo10566a();
        if (ffc.mo9080s()) {
            a = keu.m13727a(fds.m10423a(CaptureRequest.CONTROL_AF_REGIONS, ilp));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
