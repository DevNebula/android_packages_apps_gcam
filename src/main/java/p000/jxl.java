package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxl */
final class jxl extends jxi {
    public jxl(String str) {
        super(str, (byte) 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9593a(DataInputStream dataInputStream) {
        return jzp.m4772a(dataInputStream.readInt(), dataInputStream.readInt());
    }

    /* renamed from: a */
    public final void mo9594a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof jzp) {
            jzp jzp = (jzp) obj;
            dataOutputStream.writeInt(jzp.f8515a);
            dataOutputStream.writeInt(jzp.f8516b);
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
