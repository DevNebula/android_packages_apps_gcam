package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: iqa */
public final class iqa {
    /* renamed from: a */
    public byte[] f7678a = new byte[1];
    /* renamed from: b */
    public int f7679b = 0;
    /* renamed from: c */
    public int f7680c = 0;

    /* renamed from: a */
    public final void mo8761a(int i) {
        Object obj = this.f7678a;
        int length = obj.length;
        int i2 = this.f7680c;
        if (length - i2 < i) {
            int i3 = this.f7679b;
            i2 -= i3;
            int i4 = i2 + i;
            if (i4 > length || i4 <= (length >> 1)) {
                Object obj2 = new byte[i4];
                if (i2 > 0) {
                    System.arraycopy(obj, i3, obj2, 0, i2);
                }
                this.f7678a = obj2;
            } else if (i2 > 0) {
                System.arraycopy(obj, i3, obj, 0, i2);
            }
            this.f7679b = 0;
            this.f7680c = i2;
        }
    }

    /* renamed from: a */
    public final void mo8762a(OutputStream outputStream, int i) {
        int i2 = this.f7679b;
        if (i2 + i <= this.f7680c) {
            outputStream.write(this.f7678a, i2, i);
            this.f7679b += i;
            return;
        }
        throw new IllegalStateException("Byte queue is too short");
    }

    /* renamed from: a */
    public final int mo8760a() {
        return this.f7680c - this.f7679b;
    }

    /* renamed from: b */
    public final void mo8763b(int i) {
        int i2 = this.f7679b + i;
        if (i2 <= this.f7680c) {
            this.f7679b = i2;
            return;
        }
        throw new IllegalStateException("Byte queue is too short");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ByteDeque [ ");
        for (int i = 0; i <= this.f7678a.length; i++) {
            if (i == this.f7679b) {
                stringBuilder.append("{ ");
            }
            if (i == this.f7680c) {
                stringBuilder.append("} ");
            }
            if (i < this.f7678a.length) {
                stringBuilder.append(String.format("%02X ", new Object[]{Byte.valueOf(this.f7678a[i])}));
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
