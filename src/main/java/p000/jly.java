package p000;

import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jly */
final class jly implements jnp {
    /* renamed from: a */
    private final /* synthetic */ MffContext f21631a;

    jly(MffContext mffContext) {
        this.f21631a = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        return new jsi(this.f21631a, (VideoFrameProvider) jms.mo9518a(VideoFrameProvider.class, "default"), new jkw((jwa) jms.mo9518a(jwa.class, "default"), (jqt) jms.mo9518a(jrb.class, "default"), 9), (jrj) jms.mo9518a(jrj.class, "default"), new jlp(), "screen-res-acquisition-pipeline");
    }
}
