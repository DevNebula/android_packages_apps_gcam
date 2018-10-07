package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.utils.MathUtils;

/* compiled from: PG */
/* renamed from: jsz */
final class jsz implements izi {
    /* renamed from: a */
    private final jqo f21715a;
    /* renamed from: b */
    private final long f21716b;
    /* renamed from: c */
    private final /* synthetic */ jsw f21717c;

    public jsz(jsw jsw, long j, jqo jqo) {
        this.f21717c = jsw;
        this.f21715a = jqo;
        this.f21716b = j;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        jqs jqs = (jqs) obj;
        jzp a = jzp.m4773a(jqs);
        int i = this.f21717c.f8322f;
        a = MathUtils.fitSizeInside(a, new jzp(i, i));
        jqr a2 = jqs.mo13822a(a.f8515a, a.f8516b, this.f21715a);
        this.f21717c.f8321e.mo9600a(this.f21717c.f8317a.mo9540a(this.f21716b, (Bitmap) a2.mo9674e()));
        return new jsx(this.f21716b, a2, this.f21717c.f8319c.mo9546a((Bitmap) a2.mo9674e()));
    }
}
