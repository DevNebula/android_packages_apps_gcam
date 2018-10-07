package p000;

/* compiled from: PG */
/* renamed from: bjq */
final class bjq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bjp f1238a;

    bjq(bjp bjp) {
        this.f1238a = bjp;
    }

    public final void run() {
        try {
            this.f1238a.f1236b.f11474c.mo1977i();
            this.f1238a.f1235a.mo15641a(Boolean.TRUE);
        } catch (ipu e) {
            String str = bjo.f11472a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Failed when call MediaRecorder#stop: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            this.f1238a.f1235a.mo15641a(Boolean.FALSE);
        }
    }
}
