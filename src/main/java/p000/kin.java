package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: kin */
public final class kin implements DataOutput {
    /* renamed from: a */
    private final DataOutput f8682a;

    public kin(ByteArrayOutputStream byteArrayOutputStream) {
        this.f8682a = new DataOutputStream(byteArrayOutputStream);
    }

    public final void write(int i) {
        try {
            this.f8682a.write(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.f8682a.write(bArr);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f8682a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBoolean(boolean z) {
        try {
            this.f8682a.writeBoolean(z);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeByte(int i) {
        try {
            this.f8682a.writeByte(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBytes(String str) {
        try {
            this.f8682a.writeBytes(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChar(int i) {
        try {
            this.f8682a.writeChar(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChars(String str) {
        try {
            this.f8682a.writeChars(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeDouble(double d) {
        try {
            this.f8682a.writeDouble(d);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeFloat(float f) {
        try {
            this.f8682a.writeFloat(f);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeInt(int i) {
        try {
            this.f8682a.writeInt(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeLong(long j) {
        try {
            this.f8682a.writeLong(j);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeShort(int i) {
        try {
            this.f8682a.writeShort(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeUTF(String str) {
        try {
            this.f8682a.writeUTF(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
