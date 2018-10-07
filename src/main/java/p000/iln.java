package p000;

/* compiled from: PG */
/* renamed from: iln */
final class iln implements iqt {
    /* renamed from: a */
    public final /* synthetic */ ilm f21047a;
    /* renamed from: b */
    private final int f21048b;

    iln(ilm ilm, int i) {
        this.f21047a = ilm;
        this.f21048b = i;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        this.f21047a.f7447a.set(this.f21048b, obj);
        ilm ilm = this.f21047a;
        if (!ilm.f7448b) {
            boolean z;
            for (Object obj2 : ilm.f7447a) {
                if (obj2 == null) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                this.f21047a.f7448b = true;
            }
        }
        ilm = this.f21047a;
        if (ilm.f7448b) {
            this.f21047a.f7450d.execute(new ilo(this, ken.m13713a(ilm.f7447a)));
        }
    }
}
