package p000;

import android.util.Log;
import java.io.Writer;

/* compiled from: PG */
/* renamed from: im */
public final class C0290im extends Writer {
    /* renamed from: a */
    private final String f7454a;
    /* renamed from: b */
    private StringBuilder f7455b = new StringBuilder(128);

    public C0290im(String str) {
        this.f7454a = str;
    }

    public final void close() {
        m3902a();
    }

    public final void flush() {
        m3902a();
    }

    /* renamed from: a */
    private final void m3902a() {
        if (this.f7455b.length() > 0) {
            Log.d(this.f7454a, this.f7455b.toString());
            StringBuilder stringBuilder = this.f7455b;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m3902a();
            } else {
                this.f7455b.append(c);
            }
        }
    }
}
