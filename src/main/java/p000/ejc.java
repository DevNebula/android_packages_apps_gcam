package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: ejc */
final class ejc implements kov {
    /* renamed from: a */
    private final /* synthetic */ Uri f17466a;
    /* renamed from: b */
    private final /* synthetic */ eja f17467b;

    ejc(eja eja, Uri uri) {
        this.f17467b = eja;
        this.f17466a = uri;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m898e(eja.f17458a, "Fail to connect to GoogleApiClient");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        this.f17467b.f17464g.mo8879a(14, 1);
        Uri uri = this.f17466a;
        huq huq = hjk.f6637a.f20167a;
        huq.mo8134a(new iao(huq, uri)).mo8151a(this.f17467b);
    }
}
