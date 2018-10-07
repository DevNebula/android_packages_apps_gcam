package p000;

/* compiled from: PG */
/* renamed from: dgw */
final class dgw extends hci {
    /* renamed from: a */
    private final /* synthetic */ dgl f23922a;

    dgw(dgl dgl) {
        this.f23922a = dgl;
    }

    public final void onShutterButtonClick() {
        dgl dgl = this.f23922a;
        if (dgl.f23920z != null) {
            dgl.f23897c.mo12481l().f17187s.mo13525a();
            if (!this.f23922a.f23901g.mo7055a(true)) {
                hfk hfk = this.f23922a;
                if (hfk.f23876H.f3057c.mo13532b()) {
                    hfk.mo14848a();
                    return;
                }
                int intValue = ((Integer) hfk.f23877I.mo13673b()).intValue();
                if (intValue <= 0) {
                    hfk.mo14851h();
                    return;
                }
                hfk.f23876H.mo5898a(hfk);
                hfk.f23876H.mo5897a(intValue);
            }
        }
    }
}
