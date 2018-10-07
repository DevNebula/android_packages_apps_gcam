package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jnj */
final class jnj implements jnp {
    jnj() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        jtv jtv = (jtv) jms.mo9518a(jtv.class, "combined_eyes");
        jtv jtv2 = (jtv) jms.mo9518a(jtv.class, "camera_motion_score");
        jtj a = jti.m13447a(new jtm((FeatureTable) jms.mo9518a(FeatureTable.class, "default")));
        a.f8331e = 0.009615f;
        a.f8329c = new float[]{0.183983f, 0.092317f, 0.037357f, 0.171591f, 0.217251f, 0.041185f, 0.663748f, 0.764957f};
        a.f8330d = new float[]{0.445112f, 0.212411f, 0.146466f, 0.441349f, 0.204785f, 0.164381f, 0.164444f, 0.11652f};
        a.f8328b = new float[]{0.042788f, -0.19514f, 0.014271f, 0.06167f, 0.07682f, -0.498248f, 0.459787f, 0.054438f, 0.530616f, 0.029619f, -0.063138f, -0.031777f, -0.035284f, -0.171816f, -0.034343f, 0.410111f};
        return a.mo9551a(jza.FACE_COUNT).mo9551a(jza.FACE_SHARPNESS_AGGREGATE_SCORE).mo9551a(jza.FACE_IS_SMILING_AGGREGATE_SCORE).mo9549a(jtv).mo9551a(jza.MOTION_SALIENCY).mo9549a(jtv2).mo9551a(jza.PERCEPTUAL_SHARPNESS).mo9551a(jza.MAX_GRID_SHARPNESS).mo9548a(jto.m4693a(5)).mo9548a(jto.m4695a(4, 6, false)).mo9548a(jto.m4693a(4)).mo9548a(jto.m4695a(3, 1, true)).mo9548a(jto.m4695a(3, 4, true)).mo9548a(jto.m4694a(6, 0.965829f, 4.771227f)).mo9548a(jto.m4693a(7)).mo9548a(jto.m4694a(1, 0.577393f, 1.231493f)).mo9547a();
    }
}
