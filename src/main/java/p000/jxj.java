package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxj */
final class jxj extends jxi {
    public jxj(String str) {
        super(str, (byte) 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9593a(DataInputStream dataInputStream) {
        return Long.valueOf(dataInputStream.readLong());
    }

    /* renamed from: a */
    public final void mo9594a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof Long) {
            dataOutputStream.writeLong(((Long) obj).longValue());
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
