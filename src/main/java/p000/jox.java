package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import java.util.List;

/* compiled from: PG */
/* renamed from: jox */
final class jox implements jnp {
    jox() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.mo9518a(FeatureTable.class, "default");
        List d = ((jrg) jms.mo9518a(jrg.class, "default")).mo13834d();
        jri.m13395a(d.isEmpty() ^ 1);
        return MotionStabilizer.createFrom(featureTable, ((Long) d.get(0)).longValue(), ((Long) d.get(d.size() - 1)).longValue());
    }
}
