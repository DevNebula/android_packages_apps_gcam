package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jtn */
public abstract class jtn implements jtv {
    /* renamed from: a */
    public final FeatureTable f21737a;

    public jtn(FeatureTable featureTable) {
        this.f21737a = featureTable;
    }

    /* renamed from: a */
    public abstract jzf mo13856a(long j, jky jky);

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        return mo13856a(j, this.f21737a.getRowForTimestamp(j));
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
    }

    /* renamed from: a */
    public final void mo9555a() {
    }

    public String toString() {
        return "FeatureTableFrameScorer";
    }
}
