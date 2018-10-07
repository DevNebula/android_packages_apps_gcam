package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: cdn */
public final class cdn {
    /* renamed from: a */
    public static ByteBuffer m1143a(int i, int i2, ixa ixa) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2);
        ByteBuffer a = ixa.mo9144a();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int c = i3 * ixa.mo9146c();
            int i5 = i4;
            i4 = 0;
            while (i4 < i) {
                int i6 = i5 + 1;
                allocateDirect.put(i5, a.get((ixa.mo9145b() * i4) + c));
                i4++;
                i5 = i6;
            }
            i3++;
            i4 = i5;
        }
        return allocateDirect;
    }
}
