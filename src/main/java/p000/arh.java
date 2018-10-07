package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: arh */
final class arh extends InputStream {
    /* renamed from: a */
    private final ByteBuffer f933a;
    /* renamed from: b */
    private int f934b = -1;

    arh(ByteBuffer byteBuffer) {
        this.f933a = byteBuffer;
    }

    public final int available() {
        return this.f933a.remaining();
    }

    public final synchronized void mark(int i) {
        this.f934b = this.f933a.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (this.f933a.hasRemaining()) {
            return this.f933a.get();
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f933a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.f933a.get(bArr, i, min);
        return min;
    }

    public final synchronized void reset() {
        int i = this.f934b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f933a.position(i);
    }

    public final long skip(long j) {
        if (!this.f933a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) available());
        ByteBuffer byteBuffer = this.f933a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }
}
