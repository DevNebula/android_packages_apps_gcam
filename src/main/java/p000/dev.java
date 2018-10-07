package p000;

/* compiled from: PG */
/* renamed from: dev */
final class dev extends hci {
    /* renamed from: a */
    private final /* synthetic */ ehp f23865a;
    /* renamed from: b */
    private final /* synthetic */ des f23866b;

    dev(des des, ehp ehp) {
        this.f23866b = des;
        this.f23865a = ehp;
    }

    public final void onShutterButtonClick() {
        des des = this.f23866b;
        if (!des.f25977l || !des.f25976k) {
            return;
        }
        if (des.f25978m) {
            des.mo15501r();
            return;
        }
        this.f23865a.mo13406I();
        ejy ejy = this.f23866b.f25987v;
        eki eki = ejy.f3931b;
        if (!(eki == null || ejy.f3934e || ejy.f3944o != 0 || ejy.f3953x)) {
            eki.f3966H.mo6299a(0.0d);
            ekt ekt = eki.f4012d;
            if (ekt != null) {
                ekt.mo6291a(eki.f3966H.mo6301b());
            }
            if (eki.f4024p && eki.f4031w == C0252go.f5834ag) {
                eki.f4013e.mo2669b(eki.f3959A);
            }
            eki.f4032x = true;
            ejy.f3953x = true;
        }
        boolean z = ejy.f3953x;
        this.f23866b.f25978m = true;
    }
}
