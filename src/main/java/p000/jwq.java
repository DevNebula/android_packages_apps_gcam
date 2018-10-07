package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jwq */
public class jwq {
    /* renamed from: a */
    private final jwp f8406a;
    /* renamed from: b */
    private final FeatureTable f8407b;

    public jwq(jwp jwp, FeatureTable featureTable) {
        this.f8406a = jwp;
        this.f8407b = featureTable;
    }

    /* renamed from: a */
    public final float mo9582a(long j, long j2) {
        return this.f8406a.mo9581a(this.f8407b.getRowForTimestamp(j), this.f8407b.getRowForTimestamp(j2));
    }
}
