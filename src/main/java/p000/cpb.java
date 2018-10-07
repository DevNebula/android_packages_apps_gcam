package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cpb */
final class cpb extends izy {
    /* renamed from: a */
    private final /* synthetic */ Uri f23667a;
    /* renamed from: b */
    private final /* synthetic */ coy f23668b;

    cpb(coy coy, Uri uri) {
        this.f23668b = coy;
        this.f23667a = uri;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        err err = (err) obj;
        ikd.m12501a();
        int a = this.f23668b.mo7813a(this.f23667a);
        if (a != crb.f2784a) {
            cre a2 = this.f23668b.f13078i.mo5681a(a);
            if (err == null) {
                a2.mo5691d();
                this.f23668b.f13071b.mo5733b(a, a2);
                return;
            }
            this.f23668b.mo12889a(a, err);
        }
    }
}
