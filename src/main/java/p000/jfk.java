package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jfk */
public final class jfk implements ize {
    /* renamed from: a */
    public final jdi f24735a;
    /* renamed from: b */
    public final jcg[] f24736b;
    /* renamed from: c */
    public final int[] f24737c;
    /* renamed from: d */
    public final int f24738d;

    public jfk(jdi jdi, jcg[] jcgArr, int[] iArr, int i) {
        boolean z;
        if (jcgArr.length == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f24735a = jdi;
        this.f24736b = jcgArr;
        this.f24737c = iArr;
        this.f24738d = i;
    }

    /* renamed from: a */
    public final int mo15039a(int i) {
        return (this.f24736b[i].mo9320a() * this.f24737c[i]) / 8;
    }

    public final void close() {
        this.f24735a.close();
    }

    /* renamed from: a */
    public final jas mo13767a() {
        return this.f24735a.mo13767a();
    }

    /* renamed from: a */
    public static jfk m16588a(jdo jdo, jfl jfl) {
        int i = 0;
        int i2 = jfl.f8128a;
        jcg[] jcgArr = new jcg[]{jfl.f8129b};
        int[] iArr = new int[]{jfl.f8130c};
        ByteBuffer order = ByteBuffer.allocateDirect(((jfl.f8129b.mo9320a() * jfl.f8130c) * i2) / 8).order(ByteOrder.nativeOrder());
        while (i < i2) {
            jfl.mo9381a(i, order);
            i++;
        }
        order.rewind();
        return new jfk(jdi.m18375a(jdo, order), jcgArr, iArr, i2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24735a);
        String arrays = Arrays.toString(this.f24736b);
        String arrays2 = Arrays.toString(this.f24737c);
        int i = this.f24738d;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 83) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append("GLVertexArray{buffer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", types=");
        stringBuilder.append(arrays);
        stringBuilder.append(", dimensions=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", count=");
        stringBuilder.append(i);
        stringBuilder.append(", isInterleaved=");
        stringBuilder.append(false);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
