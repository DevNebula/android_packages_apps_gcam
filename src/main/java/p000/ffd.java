package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ffd */
public final class ffd extends iuu implements ffc {
    public ffd(iun iun) {
        super(iun);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kbf.m16778b(mo9065d(), ((ffd) obj).mo9065d());
    }

    /* renamed from: a */
    public final List mo13235a(iqp iqp) {
        return mo9060a_(iqp);
    }

    /* renamed from: u_ */
    public final List mo13236u_() {
        List arrayList = new ArrayList();
        for (iqp iqp : mo9069h()) {
            ine ine = (ine) ine.f7525i.get(iqp);
            if (ine != null) {
                arrayList.add(ine);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo9065d()});
    }

    /* renamed from: v_ */
    public final boolean mo13237v_() {
        return khx.m5002a((int[]) mo9057a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, f7843a), 5);
    }

    /* renamed from: w_ */
    public final boolean mo13238w_() {
        return true;
    }
}
