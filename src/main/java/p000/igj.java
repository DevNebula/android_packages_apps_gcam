package p000;

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: igj */
public final class igj {
    /* renamed from: a */
    public final HashMap f7365a = new HashMap();

    /* renamed from: a */
    public final Object mo8437a(String str) {
        return this.f7365a.get(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof igj)) {
            return false;
        }
        igj igj = (igj) obj;
        if (this.f7365a.size() == igj.f7365a.size()) {
            for (String str : this.f7365a.keySet()) {
                Object a = mo8437a(str);
                Object a2 = igj.mo8437a(str);
                if (a instanceof Asset) {
                    if (!(a2 instanceof Asset)) {
                        return false;
                    }
                    Asset asset = (Asset) a;
                    Asset asset2 = (Asset) a2;
                    boolean equals = (asset == null || asset2 == null) ? asset == asset2 : TextUtils.isEmpty(asset.f23545b) ? Arrays.equals(asset.f23544a, asset2.f23544a) : asset.f23545b.equals(asset2.f23545b);
                    if (equals) {
                    }
                } else if (a instanceof String[]) {
                    if (!(a2 instanceof String[])) {
                        return false;
                    }
                    if (Arrays.equals((String[]) a, (String[]) a2)) {
                    }
                } else if (a instanceof long[]) {
                    if (!(a2 instanceof long[])) {
                        return false;
                    }
                    if (Arrays.equals((long[]) a, (long[]) a2)) {
                    }
                } else if (a instanceof float[]) {
                    if (!(a2 instanceof float[])) {
                        return false;
                    }
                    if (Arrays.equals((float[]) a, (float[]) a2)) {
                    }
                } else if (a instanceof byte[]) {
                    if (!(a2 instanceof byte[])) {
                        return false;
                    }
                    if (Arrays.equals((byte[]) a, (byte[]) a2)) {
                    }
                } else if (a == null || a2 == null) {
                    return a == a2;
                } else {
                    if (a.equals(a2)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7365a.hashCode() * 29;
    }

    public final String toString() {
        return this.f7365a.toString();
    }
}
