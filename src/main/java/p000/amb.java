package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: amb */
final class amb implements amd {
    /* renamed from: a */
    private final ByteBuffer f10399a;

    amb(ByteBuffer byteBuffer) {
        this.f10399a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public final int mo363a() {
        if (this.f10399a.remaining() <= 0) {
            return -1;
        }
        return this.f10399a.get();
    }

    /* renamed from: b */
    public final int mo366b() {
        return ((mo363a() << 8) & 65280) | (mo363a() & Illuminant.kOther);
    }

    /* renamed from: c */
    public final short mo367c() {
        return mo363a() & Illuminant.kOther;
    }

    /* renamed from: a */
    public final int mo364a(byte[] bArr, int i) {
        int min = Math.min(i, this.f10399a.remaining());
        if (min == 0) {
            return -1;
        }
        this.f10399a.get(bArr, 0, min);
        return min;
    }

    /* renamed from: a */
    public final long mo365a(long j) {
        int min = (int) Math.min((long) this.f10399a.remaining(), j);
        ByteBuffer byteBuffer = this.f10399a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }
}
