package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: aro */
public final class aro extends FilterInputStream {
    /* renamed from: a */
    private int f948a = kvl.UNSET_ENUM_VALUE;

    public aro(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        int i = this.f948a;
        if (i == kvl.UNSET_ENUM_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: a */
    private final long m666a(long j) {
        int i = this.f948a;
        if (i == 0) {
            return -1;
        }
        if (i == kvl.UNSET_ENUM_VALUE) {
            return j;
        }
        long j2 = (long) i;
        if (j > j2) {
            return j2;
        }
        return j;
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f948a = i;
    }

    public final int read() {
        if (m666a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m667b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a = (int) m666a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m667b((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f948a = kvl.UNSET_ENUM_VALUE;
    }

    public final long skip(long j) {
        long a = m666a(j);
        if (a == -1) {
            return 0;
        }
        a = super.skip(a);
        m667b(a);
        return a;
    }

    /* renamed from: b */
    private final void m667b(long j) {
        int i = this.f948a;
        if (i != kvl.UNSET_ENUM_VALUE && j != -1) {
            this.f948a = (int) (((long) i) - j);
        }
    }
}
