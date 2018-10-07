package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jnh */
final class jnh implements jnp {
    jnh() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        jtv jtv = (jtv) jms.mo9518a(jtv.class, "camera_motion_score");
        jtj a = jti.m13447a(new jtm((FeatureTable) jms.mo9518a(FeatureTable.class, "default")));
        a.f8331e = 0.027535f;
        a.f8329c = new float[]{0.047074f, 0.586649f, 0.718397f};
        a.f8330d = new float[]{0.16063f, 0.185991f, 0.138192f};
        a.f8328b = new float[]{-0.006965f, 0.961603f, 0.274355f};
        return a.mo9549a(jtv).mo9551a(jza.PERCEPTUAL_SHARPNESS).mo9551a(jza.MAX_GRID_SHARPNESS).mo9547a();
    }
}
