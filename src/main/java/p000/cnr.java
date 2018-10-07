package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cnr */
final class cnr extends izx {
    /* renamed from: a */
    private final /* synthetic */ cnq f25795a;

    cnr(cnq cnq) {
        this.f25795a = cnq;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo15029b(Object obj, Object obj2) {
        FeatureTable featureTable = (FeatureTable) obj;
        grw grw = this.f25795a.f13057n;
        jig jig = new jig(featureTable);
        jzr a = jig.mo9457a(jza.FACE_COUNT);
        jzr a2 = jig.mo9457a(jza.EXPOSURE);
        jzr a3 = jig.mo9457a(jza.MOTION_SALIENCY);
        jzr a4 = jig.mo9457a(jza.PERCEPTUAL_SHARPNESS);
        jzr a5 = jig.mo9457a(jza.CAMERA_MOTION);
        grw.mo7382a().f25305a = grw.m2816a(a);
        grw.mo7382a().f25309e = grw.m2816a(a2);
        grw.mo7382a().f25306b = grw.m2816a(a3);
        grw.mo7382a().f25308d = grw.m2816a(a4);
        grw.mo7382a().f25307c = grw.m2816a(a5);
        int assignmentCount = featureTable.getAssignmentCount(jza.FACE_COUNT);
        int assignmentCount2 = featureTable.getAssignmentCount(jza.EXPOSURE);
        int assignmentCount3 = featureTable.getAssignmentCount(jza.MOTION_SALIENCY);
        int assignmentCount4 = featureTable.getAssignmentCount(jza.PERCEPTUAL_SHARPNESS);
        ArrayList arrayList = new ArrayList();
        arrayList.add(grw.m2815a("FACE", assignmentCount));
        arrayList.add(grw.m2815a("CAMF", assignmentCount2));
        arrayList.add(grw.m2815a("MOTN", assignmentCount3));
        arrayList.add(grw.m2815a("FAST", assignmentCount4));
        grw.mo7385b().f25320b = (kma[]) arrayList.toArray(new kma[0]);
    }
}
