package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ame */
final class ame implements amd {
    /* renamed from: a */
    private final InputStream f10400a;

    ame(InputStream inputStream) {
        this.f10400a = inputStream;
    }

    /* renamed from: a */
    public final int mo363a() {
        return this.f10400a.read();
    }

    /* renamed from: b */
    public final int mo366b() {
        return ((this.f10400a.read() << 8) & 65280) | (this.f10400a.read() & Illuminant.kOther);
    }

    /* renamed from: c */
    public final short mo367c() {
        return this.f10400a.read() & Illuminant.kOther;
    }

    /* renamed from: a */
    public final int mo364a(byte[] bArr, int i) {
        int i2 = i;
        while (i2 > 0) {
            int read = this.f10400a.read(bArr, i - i2, i2);
            if (read == -1) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    /* renamed from: a */
    public final long mo365a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.f10400a.skip(j2);
            if (skip <= 0) {
                if (this.f10400a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }
}
