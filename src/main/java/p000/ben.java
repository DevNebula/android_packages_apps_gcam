package p000;

/* renamed from: ben */
final /* synthetic */ class ben implements Runnable {
    /* renamed from: a */
    private final bem f1134a;

    ben(bem bem) {
        this.f1134a = bem;
    }

    public final void run() {
        bem bem = this.f1134a;
        synchronized (bem.f22627s) {
            if (bem.f22626r != bey.READY) {
                String str = bem.f22608a;
                String valueOf = String.valueOf(bem.f22626r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
                stringBuilder.append("Ignore restartPreview: state=");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                return;
            }
            bem.f22619k.mo12381a(bem.f22623o, bem.f22621m, bem.f22624p);
        }
    }
}
