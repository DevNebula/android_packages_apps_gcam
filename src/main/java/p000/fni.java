package p000;

import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: fni */
public final class fni implements kaw {
    /* renamed from: a */
    private final /* synthetic */ int f18485a;
    /* renamed from: b */
    private final /* synthetic */ fnh f18486b;

    public fni(fnh fnh, ixf ixf, int i) {
        this.f18486b = fnh;
        this.f18485a = i;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        obj = (Surface) obj;
        jri.m13404b(obj);
        Object ivj = new ivj(new fnc(new iub(ImageWriter.newInstance(obj, this.f18485a)), this.f18486b.f4863b));
        this.f18486b.f4862a.mo8557a(ivj);
        fnh fnh = this.f18486b;
        return new fmw(ivj, fnh.f4862a, fnh.f4864c);
    }
}
