package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* renamed from: kqy */
final class kqy extends krc {
    public static final long serialVersionUID = 1;
    /* renamed from: d */
    private final int f26603d;
    /* renamed from: e */
    private final int f26604e;

    kqy(byte[] bArr, int i, int i2) {
        super(bArr);
        kqx.m5114a(i, i + i2, bArr.length);
        this.f26603d = i;
        this.f26604e = i2;
    }

    /* renamed from: a */
    public final byte mo10221a(int i) {
        int i2 = this.f26604e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f25360c[this.f26603d + i];
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(i2);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* renamed from: a */
    protected final void mo10225a(byte[] bArr, int i) {
        System.arraycopy(this.f25360c, this.f26603d, bArr, 0, i);
    }

    /* renamed from: e */
    protected final int mo15164e() {
        return this.f26603d;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* renamed from: b */
    public final int mo10227b() {
        return this.f26604e;
    }

    final Object writeReplace() {
        return kqx.m5116a(mo10229c());
    }
}
