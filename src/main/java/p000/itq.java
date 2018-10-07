package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: itq */
public final class itq implements iwo {
    /* renamed from: a */
    private final CaptureRequest f24667a;

    public itq(CaptureRequest captureRequest) {
        this.f24667a = captureRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kbf.m16778b(this.f24667a, ((itq) obj).f24667a);
    }

    /* renamed from: a */
    public final Object mo13726a(Key key) {
        return this.f24667a.get(key);
    }

    /* renamed from: a */
    public final iud mo9118a() {
        return new iud(this.f24667a);
    }

    /* renamed from: b */
    public final Object mo13727b() {
        return this.f24667a.getTag();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24667a});
    }
}
