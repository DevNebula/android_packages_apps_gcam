package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: ho */
final class C0271ho implements Comparator {
    C0271ho() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length != length2) {
            return length - length2;
        }
        for (length = 0; length < bArr.length; length++) {
            byte b = bArr[length];
            byte b2 = bArr2[length];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}
