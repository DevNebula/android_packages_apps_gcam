package p000;

/* compiled from: PG */
/* renamed from: cfv */
final class cfv implements abn {
    /* renamed from: a */
    private final /* synthetic */ cfk f12333a;

    cfv(cfk cfk) {
        this.f12333a = cfk;
    }

    /* renamed from: a */
    public final void mo64a(int i) {
        String str = cfk.f23052a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Camera error callback. error=");
        stringBuilder.append(i);
        bli.m891b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo66a(RuntimeException runtimeException, String str, int i, int i2) {
        bli.m892b(cfk.f23052a, "Camera Exception", runtimeException);
        this.f12333a.f23069Q.mo8885a(4, str, i, i2);
        m8252a();
    }

    /* renamed from: a */
    public final void mo65a(RuntimeException runtimeException) {
        bli.m892b(cfk.f23052a, "DispatchThread Exception", runtimeException);
        this.f12333a.f23069Q.mo8885a(5, null, -1, -1);
        m8252a();
    }

    /* renamed from: a */
    private final void m8252a() {
        cfk cfk = this.f12333a;
        if (!cfk.f23071S) {
            cfk.f23071S = true;
            if (cfk.f23077Y) {
                cfk.mo12474a("CameraActivityController: Fatal error during onPause!");
            } else {
                cfk.f23121aq.mo12418c();
            }
        }
    }
}
