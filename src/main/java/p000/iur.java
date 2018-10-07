package p000;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: iur */
public final class iur {
    /* renamed from: a */
    public final Integer f7847a;
    /* renamed from: b */
    public final String f7848b;

    private iur(Integer num, String str) {
        this.f7848b = str;
        this.f7847a = num;
    }

    /* renamed from: a */
    public final int mo9096a() {
        Integer num = this.f7847a;
        if (num != null) {
            return num.intValue();
        }
        String valueOf = String.valueOf(this.f7848b);
        String str = "Attempted to access a camera id that is not supported on legacy camera API's: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        throw new UnsupportedOperationException(valueOf);
    }

    /* renamed from: a */
    public static iur m4312a(String str) {
        return new iur(iur.m4313b(str), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kbf.m16778b(this.f7848b, ((iur) obj).f7848b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7848b});
    }

    /* renamed from: b */
    private static Integer m4313b(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public final String toString() {
        String str = this.f7848b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 9);
        stringBuilder.append("CameraId-");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
