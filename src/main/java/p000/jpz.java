package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jpz */
final class jpz implements jnp {
    jpz() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.mo9518a(FeatureTable.class, "default");
        jwo jwn = new jwn(jza.HUE_SAT_HISTOGRAM);
        jwo jwn2 = new jwn(jza.VALUE_HISTOGRAM);
        jws jws = new jws();
        jws.mo9584a(jza.HUE_SAT_HISTOGRAM, jwn, 0.4f);
        jws.mo9584a(jza.VALUE_HISTOGRAM, jwn2, 0.6f);
        return new jua(new jwq(new jwl(jws.mo9583a(), 2500), featureTable));
    }
}
