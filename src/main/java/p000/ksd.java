package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: ksd */
public final class ksd {
    /* renamed from: a */
    public static final Charset f8883a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final byte[] f8884b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8884b = bArr;
        ByteBuffer.wrap(bArr);
        bArr = f8884b;
        kre.m5133a(bArr, bArr.length);
    }

    /* renamed from: a */
    static Object m5192a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m5194a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m5190a(boolean z) {
        return !z ? 1237 : 1231;
    }

    /* renamed from: a */
    public static int m5191a(byte[] bArr) {
        int length = bArr.length;
        length = ksd.m5188a(length, bArr, 0, length);
        if (length == 0) {
            return 1;
        }
        return length;
    }

    /* renamed from: a */
    public static int m5189a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    /* renamed from: a */
    static boolean m5195a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m5196b(byte[] bArr) {
        return kur.f8962a.mo10443a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    static Object m5193a(Object obj, Object obj2) {
        return ((kte) obj).mo14189h().mo14190a((kte) obj2).mo14192g();
    }

    /* renamed from: a */
    static int m5188a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static String m5197c(byte[] bArr) {
        return new String(bArr, f8883a);
    }
}
