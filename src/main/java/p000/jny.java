package p000;

/* compiled from: PG */
/* renamed from: jny */
final class jny implements jnp {
    jny() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        jxm jxm = (jxm) jms.mo9518a(jxm.class, "default");
        jwq jwq = (jwq) jms.mo9518a(jwq.class, "chroma_histogram_frame_distance_metric");
        jtv jtv = (jtv) jms.mo9518a(jtv.class, "post_proc_quality_metric");
        return juf.m13487a((juk) jms.mo9518a(juk.class, "continuous_action"), new jue(jtv), (juk) jms.mo9518a(juk.class, "image_sharpness_filter"), (juk) jms.mo9518a(juk.class, "face_quality_filter"), new juu(jxm, jtv, jwq), new jvo(3));
    }
}
