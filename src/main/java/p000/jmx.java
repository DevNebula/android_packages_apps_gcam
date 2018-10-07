package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import java.io.File;
import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: jmx */
public final class jmx implements jnp {
    /* renamed from: a */
    private final /* synthetic */ VideoFrameProvider f21642a;

    private jmx(VideoFrameProvider videoFrameProvider) {
        this.f21642a = videoFrameProvider;
    }

    /* renamed from: a */
    public static void m13232a(jms jms, MffContext mffContext, jmr jmr, GraphFactory[] graphFactoryArr, VideoFrameProvider videoFrameProvider, kpk kpk, jqo jqo, EnumSet enumSet) {
        jms.f8294c = false;
        jms.mo9522b(VideoFrameProvider.class, "default").mo9524a(new jmx(videoFrameProvider));
        jms.mo9522b(jsh.class, "low-res-acquisition-pipeline").mo9524a(new jmg());
        jms.mo9522b(jsh.class, "med-res-acquisition-pipeline").mo9524a(new jmj(jmr));
        jms.mo9522b(jsh.class, "empty-acquisition-pipeline").mo9524a(new jmk());
        jms.mo9522b(jsi.class, "low-res-acquisition-pipeline").mo9524a(new jmm(mffContext));
        jms.mo9522b(jsi.class, "med-res-acquisition-pipeline").mo9524a(new jmn(mffContext));
        jms.mo9522b(jlb.class, "low-res-acquisition-pipeline").mo9524a(new jmo());
        jms.mo9522b(jla.class, "med-res-acquisition-pipeline").mo9524a(new jmp());
        jms.mo9522b(jqu.class, "low-res-acquisition-pipeline").mo9524a(new jmq());
        jms.mo9522b(jqu.class, "med-res-acquisition-pipeline").mo9524a(new jnq());
        jms.mo9522b(jqo.class, "default").mo9524a(new jlx(jqo));
        jms.mo9522b(jsh.class, "default").mo9524a(new jly(mffContext));
        jms.mo9522b(jrb.class, "default").mo9524a(new jlz(kpk));
        jms.mo9522b(jie.class, "default").mo9524a(new jma());
        jms.mo9522b(jif.class, "default").mo9524a(new jmb(graphFactoryArr, mffContext));
        jms.mo9522b(jsl.class, "default").mo9524a(new jmc());
        jms.mo9522b(jrj.class, "default").mo9524a(new jmd());
        jms.mo9522b(jrj.class, "low-res-acquisition-pipeline").mo9524a(new jme());
        jms.mo9522b(jrj.class, "med-res-acquisition-pipeline").mo9524a(new jmf());
        jms.mo9522b(FeatureTable.class, "default").mo9524a(new jmh(enumSet));
        jms.mo9522b(File.class, "session-directory").mo9524a(new jmi(kpk));
        jms.f8294c = true;
    }

    /* renamed from: b */
    public static void m13233b(jms jms) {
        jms.f8294c = false;
        jms.mo9522b(jvt.class, "default").mo9524a(new jmy());
        jms.mo9522b(jtv.class, "auc_sharpness").mo9524a(new jnh());
        jms.mo9522b(jtv.class, "auc_motion_saliency").mo9524a(new C0695jni());
        jms.mo9522b(jtv.class, "auc_quality").mo9524a(new jnj());
        jms.mo9522b(jtv.class, "camera_motion_score").mo9524a(new jnk());
        jms.mo9522b(jtv.class, "combined_eyes").mo9524a(new jnl());
        jms.mo9522b(jwa.class, "FeatureWaitingFrameDropper").mo9524a(new jnm());
        jms.mo9522b(jwa.class, "FixedFrameRateSavingFrameDropper").mo9524a(new jnn());
        jms.mo9522b(jwa.class, "InOrderTimestampFrameDropper").mo9524a(new jno());
        jms.mo9522b(jvx.class, "default").mo9524a(new jmz());
        jms.mo9522b(jwa.class, "default").mo9524a(new jna());
        jms.mo9522b(jwa.class, "med-res-acquisition-pipeline").mo9524a(new jnb());
        jms.mo9522b(jtv.class, "med-res-acquisition-pipeline").mo9524a(new jnc());
        jms.f8294c = true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        return this.f21642a;
    }
}
