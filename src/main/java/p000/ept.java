package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ept */
public final class ept {
    /* renamed from: a */
    private static final Charset f4290a = Charset.forName("UTF-8");
    /* renamed from: b */
    private static ept f4291b;
    /* renamed from: c */
    private final MessageDigest f4292c;
    /* renamed from: d */
    private final Object f4293d = new Object();

    static {
        bli.m887a("FilenameHasher");
    }

    private ept(MessageDigest messageDigest) {
        this.f4292c = messageDigest;
    }

    /* renamed from: a */
    public static ept m2032a() {
        if (f4291b == null) {
            try {
                f4291b = new ept(MessageDigest.getInstance("SHA-1"));
            } catch (Throwable e) {
                throw new RuntimeException("Cannot initialize file name hasher", e);
            }
        }
        return f4291b;
    }

    /* renamed from: a */
    public final String mo6480a(String str) {
        return m2033b(str).substring(0, 10);
    }

    /* renamed from: b */
    private final String m2033b(String str) {
        StringBuilder stringBuilder;
        synchronized (this.f4293d) {
            byte[] digest = this.f4292c.digest(str.getBytes(f4290a));
            stringBuilder = new StringBuilder();
            for (byte b : digest) {
                stringBuilder.append(Integer.toString((b & Illuminant.kOther) + 256, 16).substring(1));
            }
        }
        return stringBuilder.toString();
    }
}
