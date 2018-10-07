package p000;

import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jmm */
final class jmm implements jnp {
    /* renamed from: a */
    private final /* synthetic */ MffContext f21639a;

    jmm(MffContext mffContext) {
        this.f21639a = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        return new jsi(this.f21639a, (VideoFrameProvider) jms.mo9518a(VideoFrameProvider.class, "default"), (jla) jms.mo9518a(jlb.class, "low-res-acquisition-pipeline"), (jrj) jms.mo9518a(jrj.class, "low-res-acquisition-pipeline"), new jlt(), "low-res-acquisition-pipeline");
    }
}
