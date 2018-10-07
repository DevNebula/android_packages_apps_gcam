package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fsx */
public final class fsx {
    /* renamed from: a */
    public final fta f4933a;
    /* renamed from: b */
    private final ffc f4934b;
    /* renamed from: c */
    private final fsm f4935c;

    public fsx(ffc ffc, fta fta, fsm fsm) {
        this.f4934b = ffc;
        this.f4933a = fta;
        this.f4935c = fsm;
    }

    /* renamed from: a */
    public final boolean mo6890a() {
        Key key = CaptureResult.EDGE_MODE;
        Integer valueOf = Integer.valueOf(0);
        Object valueOf2 = Integer.valueOf(1);
        Object valueOf3 = Integer.valueOf(2);
        return mo6891a(key, valueOf, keu.m13728a(valueOf2, valueOf3), keu.m13727a(valueOf3));
    }

    /* renamed from: b */
    public final boolean mo6894b() {
        return this.f4933a.mo6898a().mo6901a(CaptureResult.FLASH_STATE, Integer.valueOf(3), Integer.valueOf(4)) ^ 1;
    }

    /* renamed from: c */
    public final boolean mo6895c() {
        return this.f4933a.mo6898a().mo6901a(CaptureResult.CONTROL_AF_STATE, Integer.valueOf(2), Integer.valueOf(6), Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(5));
    }

    /* renamed from: d */
    public final boolean mo6896d() {
        if (this.f4935c.f4915b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo6897e() {
        Key key = CaptureResult.NOISE_REDUCTION_MODE;
        Integer valueOf = Integer.valueOf(0);
        Object valueOf2 = Integer.valueOf(2);
        return mo6891a(key, valueOf, keu.m13728a(valueOf2, Integer.valueOf(1)), keu.m13727a(valueOf2));
    }

    /* renamed from: a */
    final boolean mo6891a(Key key, Object obj, Set set, Set set2) {
        int i;
        boolean z;
        fta fta = this.f4933a;
        if (fta.mo6899b().f4937a.size() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        i ^= 1;
        if (i != 0) {
            z = false;
        } else if (fta.mo6898a().mo6901a(key, set.toArray())) {
            z = true;
        } else {
            z = false;
        }
        boolean z2;
        if (i == 0) {
            z2 = false;
        } else if (!fta.mo6898a().mo6900a(key, obj)) {
            z2 = false;
        } else if (fta.mo6899b().mo6901a(key, set2.toArray())) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3;
        if (i == 0) {
            z3 = false;
        } else if (!fta.mo6898a().mo6901a(key, set.toArray())) {
            z3 = false;
        } else if (fta.mo6899b().mo6900a(key, obj)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo6892a(fss... fssArr) {
        return Arrays.asList(fssArr).contains(this.f4935c.f4914a);
    }

    /* renamed from: a */
    public final boolean mo6893a(Integer... numArr) {
        return Arrays.asList(numArr).contains(this.f4934b.mo9056a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
    }
}
