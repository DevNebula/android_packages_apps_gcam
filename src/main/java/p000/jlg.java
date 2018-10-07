package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jlg */
final class jlg {
    /* renamed from: a */
    public final DataInputStream f8277a;

    jlg(ByteArrayInputStream byteArrayInputStream) {
        this.f8277a = new DataInputStream(byteArrayInputStream);
    }

    /* renamed from: a */
    public final int mo9511a(int i, int i2) {
        int readInt = this.f8277a.readInt();
        if (readInt >= i && readInt <= i2) {
            return readInt;
        }
        StringBuilder stringBuilder = new StringBuilder(92);
        stringBuilder.append("Unexpected value read from stream: ");
        stringBuilder.append(readInt);
        stringBuilder.append(" (must be between ");
        stringBuilder.append(i);
        stringBuilder.append(" and ");
        stringBuilder.append(i2);
        stringBuilder.append("!");
        throw new IOException(stringBuilder.toString());
    }
}
