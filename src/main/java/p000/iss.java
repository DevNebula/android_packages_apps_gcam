package p000;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: iss */
public final class iss extends FilterInputStream {
    /* renamed from: a */
    public int f7757a = 0;
    /* renamed from: b */
    public final ByteBuffer f7758b = ByteBuffer.wrap(this.f7759c);
    /* renamed from: c */
    private final byte[] f7759c = new byte[8];

    protected iss(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() {
        int i;
        int read = this.in.read();
        int i2 = this.f7757a;
        if (read >= 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.f7757a = i + i2;
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        this.f7757a += Math.max(read, 0);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        this.f7757a += Math.max(read, 0);
        return read;
    }

    /* renamed from: a */
    public final int mo8947a() {
        mo8949a(this.f7759c, 4);
        this.f7758b.rewind();
        return this.f7758b.getInt();
    }

    /* renamed from: a */
    public final void mo8949a(byte[] bArr, int i) {
        if (read(bArr, 0, i) != i) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final short mo8950b() {
        mo8949a(this.f7759c, 2);
        this.f7758b.rewind();
        return this.f7758b.getShort();
    }

    /* renamed from: c */
    public final long mo8951c() {
        return ((long) mo8947a()) & 4294967295L;
    }

    /* renamed from: a */
    public final void mo8948a(ByteOrder byteOrder) {
        this.f7758b.order(byteOrder);
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f7757a = (int) (((long) this.f7757a) + skip);
        return skip;
    }
}
