package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: are */
public final class are implements adl {
    /* renamed from: b */
    private final String f10679b;
    /* renamed from: c */
    private final long f10680c;
    /* renamed from: d */
    private final int f10681d;

    public are(String str, long j, int i) {
        if (str == null) {
            str = "";
        }
        this.f10679b = str;
        this.f10680c = j;
        this.f10681d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        are are = (are) obj;
        if (this.f10680c != are.f10680c) {
            return false;
        }
        if (this.f10681d != are.f10681d) {
            return false;
        }
        if (this.f10679b.equals(are.f10679b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10679b.hashCode();
        long j = this.f10680c;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f10681d;
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f10680c).putInt(this.f10681d).array());
        messageDigest.update(this.f10679b.getBytes(f334a));
    }
}
