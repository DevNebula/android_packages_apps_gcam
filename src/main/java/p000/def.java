package p000;

/* compiled from: PG */
/* renamed from: def */
final class def implements dbw {
    /* renamed from: a */
    private final /* synthetic */ ddu f23856a;

    def(ddu ddu) {
        this.f23856a = ddu;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dau dau = (dau) obj;
        switch (dau.f3120a) {
            case 23:
                if (dau.f3121b.getRepeatCount() == 0) {
                    dbx dbx = this.f23856a;
                    if (!dbx.f23847f.mo9709b()) {
                        dbx.f23848g = true;
                        break;
                    }
                    return new deh(dbx, (byte[]) dbx.f23847f.mo9706a());
                }
                break;
        }
        return null;
    }
}
