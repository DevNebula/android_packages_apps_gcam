package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcc */
public final class fcc extends fiw {
    /* renamed from: a */
    private final fbz f18119a;

    fcc(fbz fbz) {
        this.f18119a = fbz;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        int intValue = ((Integer) jri.m13404b((Integer) iwp.mo13730a(CaptureResult.CONTROL_AE_MODE))).intValue();
        Object obj = (gie) gie.f5447c.get(Integer.valueOf(intValue));
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("unknown metadata value: ");
            stringBuilder.append(intValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        gie gie = (gie) jri.m13404b(obj);
        int intValue2 = ((Integer) jri.m13404b((Integer) iwp.mo13730a(CaptureResult.CONTROL_AE_STATE))).intValue();
        Object obj2 = (gif) gif.f5455b.get(Integer.valueOf(intValue2));
        if (obj2 == null) {
            StringBuilder stringBuilder2 = new StringBuilder(35);
            stringBuilder2.append("unknown metadata value: ");
            stringBuilder2.append(intValue2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        this.f18119a.mo8826a(fbx.m2282c().mo6735a(gie).mo6736a((gif) jri.m13404b(obj2)).mo6734a());
    }
}
