package p000;

import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import java.util.List;

/* compiled from: PG */
/* renamed from: jid */
public final class jid {
    /* renamed from: a */
    public final FilterGraph f8213a;
    /* renamed from: b */
    public final List f8214b;

    public jid(FilterGraph filterGraph, List list) {
        jri.m13404b((Object) filterGraph);
        jri.m13404b((Object) list);
        this.f8213a = filterGraph;
        this.f8214b = list;
    }

    public final String toString() {
        int size = this.f8214b.size();
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("FeatureExtractionGraph[target-count=");
        stringBuilder.append(size);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
