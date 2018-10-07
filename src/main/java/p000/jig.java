package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jig */
public final class jig {
    /* renamed from: a */
    public final FeatureTable f8215a;

    public jig(FeatureTable featureTable) {
        jri.m13404b((Object) featureTable);
        this.f8215a = featureTable;
    }

    /* renamed from: a */
    public final jzr mo9457a(jza jza) {
        jzs jzs = new jzs();
        if (this.f8215a.getFeatureTypes().contains(jza)) {
            for (Feature values : this.f8215a.getColumnValues(jza)) {
                for (float f : values.getValues()) {
                    jzs.mo9666a((double) f);
                }
            }
        }
        return jzs.mo9665a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8215a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("FeatureTableStats[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
