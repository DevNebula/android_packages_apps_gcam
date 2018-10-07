package p000;

/* compiled from: PG */
/* renamed from: cga */
final class cga implements kov {
    /* renamed from: a */
    public final /* synthetic */ cfk f12338a;

    cga(cfk cfk) {
        this.f12338a = cfk;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m897d(cfk.f23052a, "exception retrieving cached indicator Bitmap", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        gss gss = (gss) obj;
        String str = cfk.f23052a;
        String valueOf = String.valueOf(gss);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("retrieved indicator Bitmap: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        if (gss != null) {
            bli.m896d(cfk.f23052a, "updating indicator Bitmap from cache");
            this.f12338a.f23190y.mo7471a(gss.f6036a, gss.f6037b.f7692e);
            this.f12338a.f23065M.mo5738a(gss.f6036a);
            cfk cfk = this.f12338a;
            if (cfk.f23078Z) {
                this.f12338a.f23173h.post(new cgb(this, cfk.f23188w.getIntExtra("filmstrip_index", 0)));
                this.f12338a.f23078Z = false;
            }
        }
    }
}
