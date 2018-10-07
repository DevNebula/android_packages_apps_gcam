package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bzd */
public final class bzd implements iqt {
    /* renamed from: b */
    private static final String f12032b = bli.m887a("HdrPVFMetaDataSaver");
    /* renamed from: a */
    public volatile iwp f12033a;
    /* renamed from: c */
    private ilb f12034c = new ilb(Boolean.valueOf(false));

    public bzd(fxq fxq) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        iwp iwp = (iwp) obj;
        if (iwp.mo13730a(CaptureResult.COLOR_CORRECTION_GAINS) == null) {
            bli.m896d(f12032b, "skipping frame since cc gains were missing");
        } else if (iwp.mo13730a(CaptureResult.COLOR_CORRECTION_TRANSFORM) == null) {
            bli.m896d(f12032b, "skipping frame since cc transforms were missing");
        } else if (iwp.mo13730a(CaptureResult.CONTROL_AE_REGIONS) == null) {
            bli.m896d(f12032b, "skipping frame since aeRegions were missing");
        } else if (fxq.m2465a(iwp)) {
            this.f12033a = iwp;
            this.f12034c.mo8826a(Boolean.valueOf(true));
        } else {
            bli.m896d(f12032b, "skipping frame due to touch to expose / focus");
        }
    }
}
