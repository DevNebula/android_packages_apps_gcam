package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gmf */
final class gmf implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f19304a;
    /* renamed from: b */
    private final /* synthetic */ gmb f19305b;

    gmf(gmb gmb, kpw kpw) {
        this.f19305b = gmb;
        this.f19304a = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f19304a.mo15642a(th);
        this.f19305b.mo7076a(hci.m11977a(), true, th.getMessage());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        obj = (Uri) obj;
        Uri uri = this.f19305b.f24402s;
        jri.m13404b((Object) uri);
        this.f19305b.f24400q.mo7405a((Uri) jri.m13404b(obj), uri);
        gkt gkt = this.f19305b;
        gkt.f24403t.onCapturePersisted(gkt.f24382C, gkt.f24383D);
        this.f19305b.f24407x.mo7378c();
        this.f19305b.mo14918a(uri, new ArrayList());
        this.f19305b.mo14919a("capturePersisted");
        this.f19304a.mo15641a(kbg.m4804c(uri));
        this.f19305b.f24393j.mo1902a(obj);
        this.f19305b.mo14910B().mo2016c(this.f19305b.f24392i);
    }
}
