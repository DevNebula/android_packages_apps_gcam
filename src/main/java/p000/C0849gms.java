package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gms */
public final class C0849gms extends gkk {
    /* renamed from: F */
    private static final String f26657F = bli.m887a("PortraitCaptureSess");
    /* renamed from: G */
    private final bvm f26658G;

    public C0849gms(ContentResolver contentResolver, glt glt, gmp gmp, eqa eqa, gsp gsp, gtg gtg, gsx gsx, gsl gsl, grg grg, bcv bcv, ixv ixv, ird ird, bvm bvm, gnh gnh, irs irs, String str, kbg kbg, iut iut, long j, Executor executor, gev gev) {
        super(contentResolver, glt, gmp, eqa, null, null, gsp, gtg, gsx, gsl, grg, bcv, ixv, ird, null, null, gnh, irs, str, kbg, iut, j, executor, gev);
        this.f26658G = bvm;
    }

    /* renamed from: q */
    protected final void mo15539q() {
        this.f24384E.mo13344a();
    }

    /* renamed from: r */
    protected final void mo15540r() {
        mo14909A().mo7085a(this.f24384E);
    }

    /* renamed from: s */
    final String mo14924s() {
        return f26657F;
    }

    /* renamed from: t */
    protected final void mo15541t() {
        if (this.f26423a.size() == 1) {
            this.f26658G.mo2175a(((eql) kow.m13881c((Future) jri.m13404b(this.f24409z))).mo6497b(), bve.NONE);
        }
    }

    /* renamed from: v */
    protected final void mo15543v() {
        boolean z;
        if (this.f24394k == glw.PORTRAIT) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
    }
}
