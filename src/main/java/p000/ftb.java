package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ftb */
public final class ftb {
    /* renamed from: a */
    public final List f4937a;

    ftb(List list) {
        this.f4937a = list;
    }

    /* renamed from: a */
    public final boolean mo6900a(Key key, Object obj) {
        return mo6901a(key, obj);
    }

    @SafeVarargs
    /* renamed from: a */
    public final boolean mo6901a(Key key, Object... objArr) {
        boolean z;
        if (objArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        Set hashSet = new HashSet(Arrays.asList(objArr));
        for (iwp a : this.f4937a) {
            if (!hashSet.contains(a.mo13730a(key))) {
                return false;
            }
        }
        return true;
    }
}
