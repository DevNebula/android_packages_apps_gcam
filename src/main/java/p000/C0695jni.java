package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jni */
final class C0695jni implements jnp {
    C0695jni() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.mo9518a(FeatureTable.class, "default");
        return jtw.m13464b().mo9559a(featureTable, jza.MOTION_SALIENCY, 0.75f).mo9559a(featureTable, jza.FACE_COUNT, 0.05f).mo9559a(featureTable, jza.FACE_IS_LEFT_EYE_OPEN_AGGREGATE_SCORE, 0.05f).mo9559a(featureTable, jza.FACE_IS_RIGHT_EYE_OPEN_AGGREGATE_SCORE, 0.05f).mo9559a(featureTable, jza.FACE_IS_SMILING_AGGREGATE_SCORE, 0.1f).mo9560a((jtv) jms.mo9518a(jtv.class, "camera_motion_score"), 0.0f).mo9558a();
    }
}
