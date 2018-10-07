package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: flu */
final class flu implements fjm {
    /* renamed from: a */
    public final fjv f18428a;
    /* renamed from: b */
    public final fyk f18429b;
    /* renamed from: c */
    public final int f18430c;
    /* renamed from: d */
    public final Surface f18431d;
    /* renamed from: e */
    public final ikb f18432e;
    /* renamed from: f */
    private final fxr f18433f;
    /* renamed from: g */
    private final ikv f18434g;

    flu(ikb ikb, ikv ikv, ixb ixb, fjv fjv) {
        boolean z;
        if (ixb.mo13752f() > 2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f18432e = ikb;
        this.f18434g = ikv;
        iqp iqp = new iqp(ixb.mo13754h(), ixb.mo13750d());
        ixb.mo13751e();
        this.f18428a = fjv;
        this.f18430c = ixb.mo13752f() - 2;
        this.f18433f = new fxr(this.f18430c);
        this.f18429b = new fyk(this.f18433f);
        this.f18432e.mo8557a(this.f18433f);
        this.f18431d = ixb.mo13753g();
    }

    /* renamed from: a */
    public final fjk mo6835a(fjm... fjmArr) {
        Collection hashSet = new HashSet();
        hashSet.add(this);
        for (fjm fjm : fjmArr) {
            jri.m13396a(fjm instanceof flu, (Object) "ImageReader ImageSources can only be combined with other ImageReaderImageSources of the same type");
            hashSet.add((flu) fjm);
        }
        return new flv(new ArrayList(hashSet), this.f18434g);
    }

    /* renamed from: a */
    public final int mo6834a() {
        return this.f18430c;
    }
}
