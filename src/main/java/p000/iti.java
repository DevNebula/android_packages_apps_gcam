package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: iti */
public final class iti extends FilterOutputStream {
    /* renamed from: a */
    public final ByteBuffer f7826a = ByteBuffer.allocate(4);

    public iti(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    /* renamed from: a */
    public final iti mo9007a(int i) {
        this.f7826a.rewind();
        this.f7826a.putInt(i);
        this.out.write(this.f7826a.array());
        return this;
    }

    /* renamed from: a */
    public final iti mo9008a(short s) {
        this.f7826a.rewind();
        this.f7826a.putShort(s);
        this.out.write(this.f7826a.array(), 0, 2);
        return this;
    }
}
