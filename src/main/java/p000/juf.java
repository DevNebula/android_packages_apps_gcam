package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: juf */
public final class juf implements juk {
    /* renamed from: a */
    public final juk[] f21762a;

    private juf(juk[] jukArr) {
        jri.m13404b((Object) jukArr);
        this.f21762a = jukArr;
    }

    /* renamed from: a */
    public static juf m13487a(juk... jukArr) {
        return new juf(jukArr);
    }

    /* renamed from: a */
    public final List mo9570a(List list) {
        for (juk a : this.f21762a) {
            list = a.mo9570a(list);
        }
        return list;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f21762a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 29);
        stringBuilder.append("ChainedSegmenter[segmenters=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
