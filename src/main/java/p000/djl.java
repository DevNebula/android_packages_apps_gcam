package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: djl */
final class djl implements kov {
    /* renamed from: a */
    private final /* synthetic */ djm f14119a;
    /* renamed from: b */
    private final /* synthetic */ dix f14120b;

    djl(dix dix, djm djm) {
        this.f14120b = dix;
        this.f14119a = djm;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f14120b.f14106u.mo7248a(null, hci.m11977a(), false);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Uri uri = (Uri) obj;
        this.f14120b.f14104s.mo7405a(uri, this.f14119a.mo5989c());
        err a = this.f14120b.f14092g.mo12895a(uri);
        erk erk = this.f14120b.f14096k;
        String str = a.f13139e.f4383g;
        erj erj = new erj();
        erk.m2079a(erj, str);
        a.f13140f = erj.mo6522a();
        this.f14120b.f14108w.mo7825a(a, true);
        this.f14120b.f14106u.mo7249a(this.f14119a.mo5989c(), new ArrayList());
        this.f14120b.f14098m.f1104a.mo7085a(new bcx(uri));
    }
}
