package p000;

/* compiled from: PG */
/* renamed from: fqo */
final class fqo implements kov {
    /* renamed from: a */
    private final /* synthetic */ fqh f18654a;

    fqo(fqh fqh) {
        this.f18654a = fqh;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f18654a.f24294e.f18636b.mo8833b("Failed to save image!", th);
        this.f18654a.f24291b.close();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        fwc fwc = (fwc) obj;
        jri.m13404b((Object) fwc);
        this.f18654a.f24294e.f18636b.mo8837e("Setting final result");
        this.f18654a.f24290a.mo13291a(fwc);
        this.f18654a.f24294e.f18636b.mo8837e("Done saving image");
        this.f18654a.f24291b.close();
    }
}
