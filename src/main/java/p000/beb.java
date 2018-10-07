package p000;

/* renamed from: beb */
final /* synthetic */ class beb implements Runnable {
    /* renamed from: a */
    private final bea f1128a;

    beb(bea bea) {
        this.f1128a = bea;
    }

    public final void run() {
        bea bea = this.f1128a;
        synchronized (bea.f22604w) {
            if (bea.f22603v != bel.READY) {
                String str = bea.f22577a;
                String valueOf = String.valueOf(bea.f22603v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
                stringBuilder.append("Ignore restartPreview: state=");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                return;
            }
            bea.f22596o.mo12381a(bea.f22600s, bea.f22598q, bea.f22601t);
        }
    }
}
