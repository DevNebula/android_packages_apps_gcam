package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.utils.Feature;
import java.util.List;

/* compiled from: PG */
/* renamed from: jta */
public final class jta extends izy {
    /* renamed from: a */
    private final /* synthetic */ jsw f24802a;

    public jta(jsw jsw) {
        this.f24802a = jsw;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        for (jsx jsx : (List) obj) {
            long j = jsx.f8324a;
            for (Feature featureValue : jsx.f8326c) {
                this.f24802a.f8323g.setFeatureValue(j, featureValue);
            }
            this.f24802a.f8321e.mo9599a(j).mo9591a(this.f24802a.f8318b.mo9540a(j, (Bitmap) jsx.f8325b.mo9674e()));
            jsx.f8325b.mo15063a();
        }
    }
}
