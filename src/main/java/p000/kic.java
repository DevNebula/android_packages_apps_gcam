package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: kic */
abstract class kic extends kig {
    /* renamed from: a */
    private final ByteBuffer f21911a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    kic() {
    }

    /* renamed from: b */
    protected abstract void mo14110b(byte b);

    /* renamed from: a */
    public final kig mo10019a(byte b) {
        mo14110b(b);
        return this;
    }

    /* renamed from: a */
    public final kig mo10020a(char c) {
        this.f21911a.putChar(c);
        return m13804b();
    }

    /* renamed from: b */
    private final kig m13804b() {
        try {
            mo14109a(this.f21911a.array());
            return this;
        } finally {
            this.f21911a.clear();
        }
    }

    /* renamed from: a */
    protected void mo14109a(byte[] bArr) {
        for (int i = 0; i < 2; i++) {
            mo14110b(bArr[i]);
        }
    }
}
