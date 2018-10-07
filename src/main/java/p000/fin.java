package p000;

import android.hardware.camera2.CaptureRequest.Key;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fin */
public final class fin {
    /* renamed from: a */
    public final Key f4800a;
    /* renamed from: b */
    public final Object f4801b;

    public fin(Key key, Object obj) {
        this.f4800a = (Key) jri.m13391a((Object) key, (Object) "Parameter keys cannot be null.");
        this.f4801b = jri.m13391a(obj, (Object) "Parameter values cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof fin)) {
            return false;
        }
        fin fin = (fin) obj;
        if (kbf.m16778b(this.f4800a, fin.f4800a) && kbf.m16778b(this.f4801b, fin.f4801b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4800a, this.f4801b});
    }
}
