package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gmk */
final class gmk implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f19320a;
    /* renamed from: b */
    private final /* synthetic */ gmi f19321b;

    gmk(gmi gmi, kpw kpw) {
        this.f19321b = gmi;
        this.f19320a = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f19321b.mo15544q();
        this.f19321b.mo14919a("captureFailed");
        this.f19321b.mo7076a(hci.m11977a(), true, th.getMessage());
        m11406a();
        this.f19320a.mo15642a(th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Uri uri = (Uri) obj;
        Uri uri2 = this.f19321b.f24402s;
        jri.m13404b((Object) uri2);
        this.f19321b.f24400q.mo7405a(uri, uri2);
        gkt gkt = this.f19321b;
        gkt.f24403t.onCapturePersisted(gkt.f24382C, gkt.f24383D);
        this.f19321b.f24407x.mo7378c();
        this.f19321b.mo14918a(uri2, new ArrayList());
        this.f19321b.mo14919a("capturePersisted");
        this.f19321b.f24393j.mo1902a(uri);
        m11406a();
        this.f19320a.mo15641a(kbg.m4803b(uri2));
    }

    /* renamed from: a */
    private final void m11406a() {
        gmi gmi = this.f19321b;
        if (gmi.f24384E != null) {
            gmi.f24384E.mo13344a();
            String str = gmi.f26434a;
            String valueOf = String.valueOf(this.f19321b.f24384E);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Unblocked file saving task ");
            stringBuilder.append(valueOf);
            bli.m894c(str, stringBuilder.toString());
        }
    }
}
