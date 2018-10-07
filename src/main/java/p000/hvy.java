package p000;

import java.io.FileOutputStream;

/* renamed from: hvy */
public final class hvy {
    /* renamed from: a */
    public int f7119a;

    /* renamed from: a */
    public static boolean m3593a(byte[] bArr, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
