package p000;

/* compiled from: PG */
/* renamed from: gvy */
final class gvy implements kov {
    /* renamed from: a */
    private final /* synthetic */ gvv f19707a;

    gvy(gvv gvv) {
        this.f19707a = gvv;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m897d(gvv.f19695a, "exception retrieving cached indicator Bitmap", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        gss gss = (gss) obj;
        String str = gvv.f19695a;
        String valueOf = String.valueOf(gss);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("retrieved indicator Bitmap: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        if (gss != null) {
            bli.m896d(gvv.f19695a, "updating indicator Bitmap from cache");
            this.f19707a.mo7471a(gss.f6036a, gss.f6037b.f7692e);
        }
    }
}
