package p000;

/* compiled from: PG */
/* renamed from: bjj */
public final class bjj implements bji {
    /* renamed from: a */
    private static final String f11467a = bli.m887a("CdrMediaRecPauseRsm");
    /* renamed from: b */
    private final biw f11468b;

    public bjj(biw biw) {
        this.f11468b = biw;
    }

    /* renamed from: a */
    public final void mo1983a() {
        try {
            this.f11468b.mo1975g();
        } catch (ipu e) {
            String str = f11467a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
            stringBuilder.append("Failed when calling MediaRecorder#pause: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public final void mo1984b() {
        try {
            this.f11468b.mo1976h();
        } catch (ipu e) {
            String str = f11467a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
            stringBuilder.append("Failed when calling MediaRecorder#resume: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
        }
    }
}
