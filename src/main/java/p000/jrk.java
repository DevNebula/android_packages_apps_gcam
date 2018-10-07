package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.LongSparseArray;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jrk */
public final class jrk implements jqo, jyv {
    /* renamed from: a */
    private final jqo f21675a;
    /* renamed from: b */
    private final Set f21676b = new HashSet();

    public jrk(jqo jqo) {
        jri.m13404b((Object) jqo);
        this.f21675a = jqo;
    }

    /* renamed from: a */
    public final jqr mo9529a(String str, int i, int i2, Config config) {
        return new jrm(str, "CREATE", this.f21675a.mo9529a(str, i, i2, config), this.f21676b);
    }

    public final String toString() {
        return this.f21675a.toString();
    }

    /* renamed from: a */
    public final jqr mo9530a(String str, Bitmap bitmap) {
        return new jrm(str, "WRAP", this.f21675a.mo9530a(str, bitmap), this.f21676b);
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        LongSparseArray longSparseArray = new LongSparseArray();
        synchronized (this.f21676b) {
            for (jrm jrm : this.f21676b) {
                String f = jrm.mo15584f();
                longSparseArray.put(jrm.f26573b, new jrl(jrm.f26575d, jrm.f26574c, jrm));
                if (f != null) {
                    longSparseArray.put(jrm.f26578g, new jrl(-jrm.f26575d, jrm.mo15584f(), jrm));
                }
            }
        }
        writer.write("TIME,ALLOC_SIZE,WIDTH,HEIGHT,LABEL,TYPE,LEAKED,TOTAL_USAGE,TOTAL_COUNT\n");
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 < longSparseArray.size()) {
                int i4;
                String str;
                jrl jrl = (jrl) longSparseArray.valueAt(i3);
                int i5 = jrl.f8309a;
                if (i5 >= 0) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                i2 += i4;
                j += (long) i5;
                long keyAt = longSparseArray.keyAt(i3);
                i4 = jrl.f8309a;
                jrm jrm2 = jrl.f8310b;
                int i6 = jrm2.f26576e;
                int i7 = jrm2.f26577f;
                String str2 = jrm2.f26572a;
                String str3 = jrl.f8311c;
                if (jrm2.mo15584f() != null) {
                    str = "";
                } else {
                    str = "Y";
                }
                i5 = String.valueOf(str2).length();
                StringBuilder stringBuilder = new StringBuilder(((i5 + 93) + String.valueOf(str3).length()) + String.valueOf(str).length());
                stringBuilder.append(keyAt);
                stringBuilder.append(",");
                stringBuilder.append(i4);
                stringBuilder.append(",");
                stringBuilder.append(i6);
                stringBuilder.append(",");
                stringBuilder.append(i7);
                stringBuilder.append(",");
                stringBuilder.append(str2);
                stringBuilder.append(",");
                stringBuilder.append(str3);
                stringBuilder.append(",");
                stringBuilder.append(str);
                stringBuilder.append(",");
                stringBuilder.append(j);
                stringBuilder.append(",");
                stringBuilder.append(i2);
                stringBuilder.append("\n");
                writer.write(stringBuilder.toString());
                i = i3 + 1;
            } else {
                return;
            }
        }
    }
}
