package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* compiled from: PG */
/* renamed from: fgp */
public final class fgp extends imq {
    /* renamed from: b */
    private final ffc f26351b;

    fgp(ffc ffc, ilp ilp, ilp ilp2) {
        super(ilq.m3880a(ilp, ilp2));
        this.f26351b = ffc;
        jri.m13404b((int[]) ffc.mo9056a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES));
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        List list = (List) obj;
        if (!this.f26351b.mo9083v()) {
            return Integer.valueOf(1);
        }
        switch (((fxi) list.get(0)).ordinal()) {
            case 0:
                return Integer.valueOf(2);
            case 1:
                return Integer.valueOf(1);
            case 2:
                return Integer.valueOf(3);
            default:
                return Integer.valueOf(1);
        }
    }
}
