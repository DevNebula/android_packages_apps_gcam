package p000;

import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jmn */
final class jmn implements jnp {
    /* renamed from: a */
    private final /* synthetic */ MffContext f21640a;

    jmn(MffContext mffContext) {
        this.f21640a = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        return new jsi(this.f21640a, (VideoFrameProvider) jms.mo9518a(VideoFrameProvider.class, "default"), (jla) jms.mo9518a(jla.class, "med-res-acquisition-pipeline"), (jrj) jms.mo9518a(jrj.class, "med-res-acquisition-pipeline"), new jlu(), "med-res-acquisition-pipeline");
    }
}
