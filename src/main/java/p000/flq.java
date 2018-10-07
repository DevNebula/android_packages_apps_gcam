package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: flq */
final class flq implements fjm {
    /* renamed from: a */
    public final fjv f18412a;
    /* renamed from: b */
    public final fyk f18413b;
    /* renamed from: c */
    public final int f18414c;
    /* renamed from: d */
    public final Surface f18415d;
    /* renamed from: e */
    public final ikb f18416e;
    /* renamed from: f */
    private final ikv f18417f;

    flq(ikb ikb, ikv ikv, ixb ixb, fjv fjv) {
        this.f18416e = ikb;
        this.f18417f = ikv;
        this.f18412a = fjv;
        iqp iqp = new iqp(ixb.mo13754h(), ixb.mo13750d());
        ixb.mo13751e();
        this.f18414c = ixb.mo13752f();
        this.f18415d = ixb.mo13753g();
        this.f18413b = new fyk((fyt) ikb.mo8557a(new fxr(this.f18414c)));
    }

    /* renamed from: a */
    public final fjk mo6835a(fjm... fjmArr) {
        Collection hashSet = new HashSet();
        hashSet.add(this);
        for (fjm fjm : fjmArr) {
            jri.m13396a(fjm instanceof flq, (Object) "ImageReader ImageSources can only be combined with other ImageReaderImageSources of the same type");
            hashSet.add((flq) fjm);
        }
        return new flr(new ArrayList(hashSet), this.f18417f);
    }

    /* renamed from: a */
    public final int mo6834a() {
        return this.f18414c;
    }
}
