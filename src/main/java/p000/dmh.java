package p000;

/* compiled from: PG */
/* renamed from: dmh */
final class dmh implements dob {
    /* renamed from: a */
    private final /* synthetic */ dmf f24003a;

    dmh(dmf dmf) {
        this.f24003a = dmf;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        kpk kpk = this.f24003a.f23998i;
        if (kpk != null) {
            kpk.cancel(true);
            this.f24003a.f23998i = null;
        }
        bfe bfe = this.f24003a.f23999j;
        if (bfe != null) {
            bfe.close();
            this.f24003a.f23999j = null;
        }
        this.f24003a.f23996g = true;
        return null;
    }
}
