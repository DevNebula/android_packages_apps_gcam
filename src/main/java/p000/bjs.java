package p000;

/* compiled from: PG */
/* renamed from: bjs */
final class bjs implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kpw f1239a;
    /* renamed from: b */
    private final /* synthetic */ bjr f1240b;

    bjs(bjr bjr, kpw kpw) {
        this.f1240b = bjr;
        this.f1239a = kpw;
    }

    public final void run() {
        try {
            this.f1240b.f11477b.mo1977i();
            this.f1239a.mo15641a(Boolean.TRUE);
        } catch (ipu e) {
            String str = bjr.f11476a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Failed when call MediaRecorder#stop: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            this.f1239a.mo15641a(Boolean.FALSE);
        }
    }
}
