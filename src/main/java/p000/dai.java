package p000;

/* compiled from: PG */
/* renamed from: dai */
final class dai extends hci {
    /* renamed from: a */
    private final /* synthetic */ daf f23725a;

    dai(daf daf) {
        this.f23725a = daf;
    }

    public final void onShutterButtonClick() {
        daf daf = this.f23725a;
        daf.f25901d.mo2154a(new dbi(daf.f25903f, daf.f25900c));
        this.f23725a.f25900c = false;
    }

    public final void onShutterTouch(hin hin) {
        this.f23725a.f25903f = hin;
    }
}
