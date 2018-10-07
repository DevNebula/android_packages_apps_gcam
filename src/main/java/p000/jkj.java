package p000;

import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkj */
public final class jkj extends jjq {
    /* renamed from: c */
    private final jxm f24771c;
    /* renamed from: d */
    private final jjf f24772d;
    /* renamed from: e */
    private final MotionStabilizer f24773e;

    public jkj(jxm jxm, jjf jjf, MotionStabilizer motionStabilizer) {
        this("GIF_Action", 6, jxm, jjf, motionStabilizer);
    }

    public jkj(String str, int i, jxm jxm, jjf jjf, MotionStabilizer motionStabilizer) {
        super(str, i);
        jri.m13404b((Object) jxm);
        jri.m13404b((Object) jjf);
        jri.m13404b((Object) motionStabilizer);
        this.f24771c = jxm;
        this.f24772d = jjf;
        this.f24773e = motionStabilizer;
    }

    /* renamed from: a */
    public final jaq mo9461a(juh juh, Executor executor) {
        boolean z;
        boolean booleanValue;
        jri.m13404b((Object) juh);
        jri.m13404b((Object) executor);
        if (juh.mo9565d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Cannot create GIF from an empty stack.");
        ken a = ken.m13713a(juh.f8350a);
        int size = a.size();
        int i = 0;
        while (i < size) {
            Object obj = a.get(i);
            i++;
            jxa a2 = this.f24771c.mo9599a(((Long) obj).longValue());
            if (a2.mo9592b(jxa.f8428s)) {
                booleanValue = ((Boolean) a2.mo9589a(jxa.f8428s)).booleanValue() ^ 1;
                break;
            }
        }
        booleanValue = false;
        return jli.m13199b(new jjy(this.f21555a, this.f21556b, juh.mo9564c(), this.f24772d, this.f24773e, booleanValue, ken.m13713a(juh.f8350a)));
    }
}
