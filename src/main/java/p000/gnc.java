package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gnc */
final class gnc implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f19376a;
    /* renamed from: b */
    private final /* synthetic */ gmz f19377b;

    gnc(gmz gmz, kpw kpw) {
        this.f19377b = gmz;
        this.f19376a = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f19376a.mo15642a(th);
        this.f19377b.mo7076a(hci.m11977a(), true, th.getMessage());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Uri uri = (Uri) obj;
        Uri uri2 = this.f19377b.f24402s;
        jri.m13404b((Object) uri2);
        this.f19377b.f24400q.mo7405a(uri, uri2);
        gkt gkt = this.f19377b;
        gkt.f24403t.onCapturePersisted(gkt.f24382C, gkt.f24383D);
        this.f19377b.f24407x.mo7378c();
        this.f19377b.mo14918a(uri2, new ArrayList());
        this.f19377b.mo14919a("capturePersisted");
        this.f19376a.mo15641a(kbg.m4803b(uri2));
        this.f19377b.f24393j.mo1902a(uri);
    }
}
