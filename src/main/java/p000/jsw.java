package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jsw */
public class jsw {
    /* renamed from: a */
    public final jry f8317a;
    /* renamed from: b */
    public final jry f8318b;
    /* renamed from: c */
    public final jtf f8319c;
    /* renamed from: d */
    public final jrg f8320d;
    /* renamed from: e */
    public final jxm f8321e;
    /* renamed from: f */
    public final int f8322f;
    /* renamed from: g */
    public final FeatureTable f8323g;

    public jsw(jrg jrg, jxm jxm, FeatureTable featureTable, jry jry, jry jry2, jtf jtf, int i) {
        boolean z;
        jri.m13404b((Object) jxm);
        jri.m13404b((Object) featureTable);
        jri.m13404b((Object) jry);
        jri.m13404b((Object) jry2);
        jri.m13404b((Object) jtf);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f8320d = jrg;
        this.f8321e = jxm;
        this.f8323g = featureTable;
        this.f8317a = jry;
        this.f8318b = jry2;
        this.f8319c = jtf;
        this.f8322f = i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f8317a);
        String valueOf2 = String.valueOf(this.f8318b);
        String valueOf3 = String.valueOf(this.f8319c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 104) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("SummaryFeatureExtractor[parallelMetadataExtractor=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", serialMetadataExtractor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", parallelFeatureExtractor=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
