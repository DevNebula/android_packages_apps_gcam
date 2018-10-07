package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import java.util.List;

/* compiled from: PG */
/* renamed from: jmb */
final class jmb implements jnp {
    /* renamed from: a */
    private final /* synthetic */ GraphFactory[] f21633a;
    /* renamed from: b */
    private final /* synthetic */ MffContext f21634b;

    jmb(GraphFactory[] graphFactoryArr, MffContext mffContext) {
        this.f21633a = graphFactoryArr;
        this.f21634b = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        jie jie = (jie) jms.mo9518a(jie.class, "default");
        FeatureTable featureTable = (FeatureTable) jms.mo9518a(FeatureTable.class, "default");
        List b = khb.m4945b();
        for (GraphFactory graphFactory : this.f21633a) {
            VideoFrameProvider videoFrameProvider = (VideoFrameProvider) jms.mo9518a(VideoFrameProvider.class, "default");
            FilterGraph create = graphFactory.create(this.f21634b);
            create.getVariable("videoProvider").setValue(videoFrameProvider);
            create.getRunner().getFrameManager().setCacheSize(25165824);
            create.getRunner().setThreadName(graphFactory.getClass().getName().replace("GraphFactory", ""));
            List b2 = khb.m4945b();
            for (Filter filter : create.getAllFilters()) {
                if (filter instanceof jii) {
                    b2.add((jii) filter);
                }
            }
            b.add(new jij(jie.mo9452a(new jid(create, b2)), featureTable));
        }
        b.add(new jin((VideoFrameProvider) jms.mo9518a(VideoFrameProvider.class, "default"), featureTable));
        return new jim(b);
    }
}
