package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ibq */
public final class ibq {
    /* renamed from: a */
    public static final Object f7277a = new Object();

    static {
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
    }

    /* renamed from: a */
    public static int m3702a(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? 0 : Arrays.hashCode(fArr);
    }

    /* renamed from: a */
    public static int m3703a(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr);
    }

    /* renamed from: a */
    public static int m3704a(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? 0 : Arrays.hashCode(jArr);
    }

    /* renamed from: a */
    public static int m3705a(Object[] objArr) {
        int i = 0;
        int length = objArr != null ? objArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m3706a(byte[][] bArr) {
        int i = 0;
        int length = bArr != null ? bArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m3707a(ibm ibm, ibm ibm2) {
        ibo ibo = ibm.f20855o;
        if (ibo != null) {
            ibm2.f20855o = (ibo) ibo.clone();
        }
    }

    /* renamed from: a */
    public static boolean m3708a(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : Arrays.equals(fArr, fArr2);
    }

    /* renamed from: a */
    public static boolean m3709a(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    /* renamed from: a */
    public static boolean m3710a(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    /* renamed from: a */
    public static boolean m3711a(Object[] objArr, Object[] objArr2) {
        int length;
        if (objArr != null) {
            length = objArr.length;
        } else {
            boolean length2 = false;
        }
        int length3 = objArr2 != null ? objArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3;
            boolean z;
            boolean z2 = i2 >= length2;
            if (i2 >= length2) {
                i3 = i;
            } else if (objArr[i2] == null) {
                i2++;
            } else {
                i3 = i;
            }
            while (true) {
                z = i3 >= length3;
                if (i3 < length3 && objArr2[i3] == null) {
                    i3++;
                } else if (i2 >= length2 && i3 >= length3) {
                    return true;
                } else {
                    if (z2 != z && objArr[i2].equals(objArr2[i3])) {
                        i = i3 + 1;
                        i2++;
                    }
                }
            }
            if (i2 >= length2) {
                return true;
            }
            return z2 != z ? false : false;
        }
    }

    /* renamed from: a */
    public static boolean m3712a(byte[][] bArr, byte[][] bArr2) {
        int length;
        if (bArr != null) {
            length = bArr.length;
        } else {
            boolean length2 = false;
        }
        int length3 = bArr2 != null ? bArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3;
            boolean z;
            boolean z2 = i2 >= length2;
            if (i2 >= length2) {
                i3 = i;
            } else if (bArr[i2] == null) {
                i2++;
            } else {
                i3 = i;
            }
            while (true) {
                z = i3 >= length3;
                if (i3 < length3 && bArr2[i3] == null) {
                    i3++;
                } else if (i2 >= length2 && i3 >= length3) {
                    return true;
                } else {
                    if (z2 != z && Arrays.equals(bArr[i2], bArr2[i3])) {
                        i = i3 + 1;
                        i2++;
                    }
                }
            }
            if (i2 >= length2) {
                return true;
            }
            return z2 != z ? false : false;
        }
    }
}
