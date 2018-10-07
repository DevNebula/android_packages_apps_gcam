package p000;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: hwg */
public final class hwg {
    /* renamed from: a */
    public final String f7140a;
    /* renamed from: b */
    private final String f7141b;

    public hwg(String str, String str2) {
        this.f7141b = htl.m3460a(str);
        this.f7140a = htl.m3460a(str2);
    }

    /* renamed from: a */
    public final Intent mo8225a() {
        String str = this.f7141b;
        return str != null ? new Intent(str).setPackage(this.f7140a) : new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwg)) {
            return false;
        }
        return htl.m3483a(this.f7141b, ((hwg) obj).f7141b) && htl.m3483a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7141b, null});
    }

    public final String toString() {
        String str = this.f7141b;
        if (str != null) {
            return str;
        }
        ComponentName componentName = null;
        return componentName.flattenToString();
    }
}
