package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jnq */
public final class jnq implements jnp {
    jnq() {
    }

    /* renamed from: a */
    public static void m13252a(jms jms, jqo jqo, Executor executor) {
        jms.f8294c = false;
        jms.mo9522b(jxm.class, "default").mo9524a(new jqb());
        jms.mo9522b(jll.class, "post_processing_executor").mo9524a(new jqc(executor));
        jms.mo9522b(jqo.class, "post_processing_bitmapallocator").mo9524a(new jqd(jqo));
        jms.mo9522b(jsb.class, "default").mo9524a(new jqf());
        jms.mo9522b(jsw.class, "default").mo9524a(new jqg(DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX));
        jms.mo9522b(jjd.class, "default").mo9524a(new jqh());
        jms.f8294c = true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        return new jqu((jqo) jms.mo9518a(jqo.class, "default"), (jrj) jms.mo9518a(jrj.class, "med-res-acquisition-pipeline"));
    }
}
