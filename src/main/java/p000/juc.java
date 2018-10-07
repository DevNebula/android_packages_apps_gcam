package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: juc */
public final class juc extends jtn {
    /* renamed from: b */
    private final jza f24806b;
    /* renamed from: c */
    private final int f24807c;

    public juc(FeatureTable featureTable, jza jza) {
        boolean z = true;
        super(featureTable);
        jri.m13404b((Object) jza);
        if (jza.f8493A != 1) {
            z = false;
        }
        jri.m13395a(z);
        this.f24806b = jza;
        this.f24807c = 0;
    }

    public juc(FeatureTable featureTable, jza jza, int i) {
        boolean z;
        boolean z2 = true;
        super(featureTable);
        jri.m13404b((Object) jza);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (i >= jza.f8493A) {
            z2 = false;
        }
        jri.m13395a(z2);
        this.f24806b = jza;
        this.f24807c = i;
    }

    /* renamed from: a */
    public final jzf mo13856a(long j, jky jky) {
        return new jzc(jky.mo9479a(this.f24806b).getValueAt(this.f24807c, new int[0]));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24806b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("SingleFeatureScorer[type=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
