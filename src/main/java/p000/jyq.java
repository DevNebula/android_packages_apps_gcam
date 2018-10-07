package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: jyq */
public final class jyq implements jnp {
    /* renamed from: a */
    private final /* synthetic */ jyt f21816a;

    public jyq(jyt jyt) {
        this.f21816a = jyt;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.mo9518a(FeatureTable.class, "default");
        jyv jlj = new jlj(featureTable);
        jyv jih = new jih(new jig(featureTable), EnumSet.complementOf(EnumSet.of(jza.TEST_FEATURE_1, jza.TEST_FEATURE_2, jza.TEST_MULTIDIMENSIONAL_FEATURE)));
        this.f21816a.mo9618a("features.csv", jlj);
        this.f21816a.mo9618a("feature_stats.txt", jih);
        return featureTable;
    }
}
