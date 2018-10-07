package p000;

import android.net.Uri;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gkn */
final class gkn implements kov {
    /* renamed from: a */
    private final /* synthetic */ List f19249a;
    /* renamed from: b */
    private final /* synthetic */ gkk f19250b;

    gkn(gkk gkk, List list) {
        this.f19250b = gkk;
        this.f19249a = list;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f19250b.mo7076a(hci.m11977a(), true, th.getMessage());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Uri uri = (Uri) obj;
        List arrayList = new ArrayList(this.f19249a);
        arrayList.add(uri);
        gkt gkt = this.f19250b;
        Uri uri2 = gkt.f24402s;
        gkt.f24400q.mo7405a(uri, uri2);
        gkt = this.f19250b;
        gkt.f24403t.onCapturePersisted(gkt.f24382C, gkt.f24383D);
        this.f19250b.f24407x.mo7378c();
        this.f19250b.mo13370a(hci.m11979a((int) R.string.burst_process_done, new Object[0]));
        this.f19250b.mo14918a(uri2, arrayList);
        this.f19250b.f24391h.mo7215a(C0252go.f5881ba, C0252go.f5882bb, this.f19250b.mo14924s());
        this.f19250b.f24393j.mo1902a(uri);
        this.f19250b.f26427e.mo12587b();
    }
}
