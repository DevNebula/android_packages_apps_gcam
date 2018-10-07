package p000;

import com.google.android.libraries.smartburst.filterpacks.motion.FrameWarper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkf */
final class jkf implements jau {
    /* renamed from: a */
    public final jzp f21572a;
    /* renamed from: b */
    public final jqo f21573b;
    /* renamed from: c */
    public final FrameWarper f21574c;
    /* renamed from: d */
    public final /* synthetic */ jjy f21575d;
    /* renamed from: e */
    private final jrg f21576e;

    public jkf(jjy jjy, jrg jrg, jzp jzp, jqo jqo, FrameWarper frameWarper) {
        this.f21575d = jjy;
        this.f21576e = jrg;
        this.f21572a = jzp;
        this.f21573b = jqo;
        this.f21574c = frameWarper;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        jke jke = (jke) obj;
        return this.f21576e.mo13829b(jke.f8257a).mo9275a(executor, new jkg(this, jke));
    }
}
