package p000;

import android.util.Log;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ikm */
public final class ikm extends OutputStream {
    /* renamed from: a */
    private final ikn f7425a;

    public ikm(ikn ikn) {
        this.f7425a = ikn;
    }

    public final void close() {
        StringBuilder stringBuilder;
        ikn ikn = this.f7425a;
        if (ikn.f7426a.mo8760a() > 0) {
            String valueOf = String.valueOf(ikn.f7426a);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder2.append("Warning: unwritten bytes in the buffer: ");
            stringBuilder2.append(valueOf);
            Log.w("CAM_ProcFSM", stringBuilder2.toString());
        }
        int i = ikn.f7429d;
        if (i > 0) {
            stringBuilder = new StringBuilder(48);
            stringBuilder.append("Warning: still need to forward ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes");
            Log.w("CAM_ProcFSM", stringBuilder.toString());
        }
        if (ikn.f7428c > 0) {
            i = ikn.f7429d;
            stringBuilder = new StringBuilder(45);
            stringBuilder.append("Warning: still need to skip ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes");
            Log.w("CAM_ProcFSM", stringBuilder.toString());
        }
        ikn.f7427b.close();
    }

    public final void flush() {
        this.f7425a.f7427b.flush();
    }

    public final void write(int i) {
        ikn ikn = this.f7425a;
        int i2 = ikn.f7428c;
        if (i2 != 0) {
            if (i2 > 0) {
                ikn.f7428c = i2 - 1;
            }
        } else if (ikn.f7429d != 0) {
            ikn.f7427b.write(i);
            i2 = ikn.f7429d;
            if (i2 > 0) {
                ikn.f7429d = i2 - 1;
            }
        } else {
            iqa iqa = ikn.f7426a;
            iqa.mo8761a(1);
            byte[] bArr = iqa.f7678a;
            int i3 = iqa.f7680c;
            bArr[i3] = (byte) i;
            iqa.f7680c = i3 + 1;
            ikn.mo8588b();
        }
    }

    public final void write(byte[] bArr) {
        this.f7425a.mo8586a(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f7425a.mo8586a(bArr, i, i2);
    }
}
