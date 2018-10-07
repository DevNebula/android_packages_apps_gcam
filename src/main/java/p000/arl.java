package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: arl */
public final class arl extends InputStream {
    /* renamed from: b */
    private static final Queue f940b = arq.m677a(0);
    /* renamed from: a */
    public IOException f941a;
    /* renamed from: c */
    private InputStream f942c;

    arl() {
    }

    public final int available() {
        return this.f942c.available();
    }

    public final void close() {
        this.f942c.close();
    }

    public final void mark(int i) {
        this.f942c.mark(i);
    }

    public final boolean markSupported() {
        return this.f942c.markSupported();
    }

    /* renamed from: a */
    public static arl m652a(InputStream inputStream) {
        arl arl;
        synchronized (f940b) {
            arl = (arl) f940b.poll();
        }
        if (arl == null) {
            arl = new arl();
        }
        arl.f942c = inputStream;
        return arl;
    }

    public final int read() {
        try {
            return this.f942c.read();
        } catch (IOException e) {
            this.f941a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f942c.read(bArr);
        } catch (IOException e) {
            this.f941a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f942c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f941a = e;
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo1734a() {
        this.f941a = null;
        this.f942c = null;
        synchronized (f940b) {
            f940b.offer(this);
        }
    }

    public final synchronized void reset() {
        this.f942c.reset();
    }

    public final long skip(long j) {
        try {
            return this.f942c.skip(j);
        } catch (IOException e) {
            this.f941a = e;
            return 0;
        }
    }
}
