package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dpi */
public final class dpi extends fiw {
    /* renamed from: a */
    private final /* synthetic */ Set f14898a;
    /* renamed from: b */
    private final /* synthetic */ Set f14899b;
    /* renamed from: c */
    private final /* synthetic */ iqz f14900c;

    public dpi(Set set, Set set2, iqz iqz) {
        this.f14898a = set;
        this.f14899b = set2;
        this.f14900c = iqz;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        iqz iqz;
        String valueOf;
        StringBuilder stringBuilder;
        jri.m13395a(this.f14898a.contains(iwp.mo13733d().mo13726a(CaptureRequest.NOISE_REDUCTION_MODE)));
        jri.m13395a(this.f14899b.contains(iwp.mo13733d().mo13726a(CaptureRequest.EDGE_MODE)));
        Integer num = (Integer) iwp.mo13730a(CaptureResult.NOISE_REDUCTION_MODE);
        if (!this.f14898a.contains(num)) {
            iqz = this.f14900c;
            valueOf = String.valueOf(num);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
            stringBuilder.append("Capture result did not contain an acceptable NR mode: ");
            stringBuilder.append(valueOf);
            iqz.mo8833b(stringBuilder.toString(), new IllegalArgumentException());
        }
        num = (Integer) iwp.mo13730a(CaptureResult.EDGE_MODE);
        if (!this.f14899b.contains(num)) {
            iqz = this.f14900c;
            valueOf = String.valueOf(num);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
            stringBuilder.append("Capture result did not contain an acceptable Edge mode: ");
            stringBuilder.append(valueOf);
            iqz.mo8833b(stringBuilder.toString(), new IllegalArgumentException());
        }
    }
}
