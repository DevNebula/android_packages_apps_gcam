package p000;

import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jyc */
public final class jyc implements jmu {
    /* renamed from: a */
    private final /* synthetic */ jyt f21805a;

    public jyc(jyt jyt) {
        this.f21805a = jyt;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9523a(Object obj, String str) {
        jia jia = new jia((VideoFrameProvider) obj);
        this.f21805a.mo9618a("frame_grabs.csv", new jic(jia));
        this.f21805a.mo9618a("decoder_stats.txt", new jib(jia));
        return jia;
    }
}
