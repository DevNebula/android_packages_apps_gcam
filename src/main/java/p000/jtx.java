package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: jtx */
public final class jtx {
    /* renamed from: a */
    private final HashMap f8344a = khb.m4959d();

    /* renamed from: a */
    public final jtx mo9560a(jtv jtv, float f) {
        this.f8344a.put((jtv) jri.m13404b((Object) jtv), Float.valueOf(f));
        return this;
    }

    /* renamed from: a */
    public final jtx mo9559a(FeatureTable featureTable, jza jza, float f) {
        this.f8344a.put(new juc(featureTable, jza), Float.valueOf(f));
        return this;
    }

    /* renamed from: a */
    public final jtw mo9558a() {
        return new jtw(this.f8344a);
    }
}
