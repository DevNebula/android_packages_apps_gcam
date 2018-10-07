package p000;

/* compiled from: PG */
/* renamed from: fpg */
final class fpg implements fux {
    /* renamed from: a */
    private final fux f24277a;
    /* renamed from: b */
    private final /* synthetic */ fpf f24278b;

    fpg(fpf fpf, fux fux) {
        this.f24278b = fpf;
        this.f24277a = fux;
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        if (this.f24278b.f18564a.contains(Integer.valueOf(iwz.mo13741c()))) {
            this.f24277a.mo13282a(iwz, kpk);
        } else {
            iwz.close();
        }
    }

    public final void close() {
        this.f24277a.close();
    }
}
