package p000;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jro */
public final class jro implements jry {
    /* renamed from: a */
    private final jry[] f21677a;

    public jro(jry[] jryArr) {
        this.f21677a = jryArr;
    }

    /* renamed from: a */
    public final jxa mo9540a(long j, Bitmap bitmap) {
        jri.m13404b((Object) bitmap);
        jxa jxa = new jxa();
        for (jry a : this.f21677a) {
            jxa.mo9591a(a.mo9540a(j, bitmap));
        }
        return jxa;
    }

    /* renamed from: a */
    public static jro m13414a(jry... jryArr) {
        jri.m13404b((Object) jryArr);
        return new jro(jryArr);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f21677a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 35);
        stringBuilder.append("ComboMetadataExtractor[extractors=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
