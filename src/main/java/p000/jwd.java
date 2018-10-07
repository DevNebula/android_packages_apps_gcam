package p000;

import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.vision.face.Face;
import java.util.List;

/* compiled from: PG */
/* renamed from: jwd */
public final class jwd implements jwb {
    /* renamed from: a */
    private final jxm f21774a;

    public jwd(jxm jxm) {
        aqe.m610a((Object) jxm, "Argument must not be null");
        this.f21774a = jxm;
    }

    /* renamed from: a */
    public final boolean mo9574a(long j) {
        for (Face face : (List) this.f21774a.mo9599a(j).mo9589a(jxa.f8412c)) {
            if (FaceUtils.hasAllLandmarks(face) && FaceUtils.hasAllProbabilities(face)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "HasValidFaceFrameFilter";
    }
}
