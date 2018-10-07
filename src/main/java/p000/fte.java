package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;

/* compiled from: PG */
/* renamed from: fte */
public final class fte implements fsl {
    /* renamed from: a */
    private final /* synthetic */ fsw f18770a;

    public fte(fsw fsw) {
        this.f18770a = fsw;
    }

    /* renamed from: a */
    public final ftn mo6883a(fsm fsm) {
        fsx a = this.f18770a.mo6889a(fsm);
        fto a2 = new fto("flash").mo6904a("single image", a.mo6896d());
        r2 = new Integer[2];
        Integer valueOf = Integer.valueOf(0);
        r2[0] = valueOf;
        Object valueOf2 = Integer.valueOf(1);
        r2[1] = valueOf2;
        String str = "hw jpeg, sw jpeg, reprocessing";
        str = "edge";
        str = "noise reduction";
        a2 = a2.mo6904a("limited or full", a.mo6893a(r2)).mo6904a(str, a.mo6892a(fss.HW_JPEG, fss.SW_JPEG, fss.REPROCESSING)).mo6904a("flash fired", a.f4933a.mo6898a().mo6900a(CaptureResult.FLASH_STATE, Integer.valueOf(3))).mo6904a(str, a.mo6890a()).mo6904a(str, a.mo6897e());
        Key key = CaptureResult.COLOR_CORRECTION_ABERRATION_MODE;
        Object valueOf3 = Integer.valueOf(2);
        return a2.mo6904a("aberration", a.mo6891a(key, valueOf, keu.m13728a(valueOf2, valueOf3), keu.m13728a(valueOf2, valueOf3))).mo6904a("af converged", a.mo6895c()).mo6903a();
    }
}
