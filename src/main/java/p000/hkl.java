package p000;

/* renamed from: hkl */
final /* synthetic */ class hkl implements gua {
    /* renamed from: a */
    private final hkk f20182a;

    hkl(hkk hkk) {
        this.f20182a = hkk;
    }

    /* renamed from: a */
    public final void mo7454a(long j) {
        hkk hkk = this.f20182a;
        if (j <= 209715200) {
            String str = hkk.f6656a;
            StringBuilder stringBuilder = new StringBuilder(75);
            stringBuilder.append("Stopping recording due to low storage. Remaining bytes=");
            stringBuilder.append(j);
            bli.m894c(str, stringBuilder.toString());
            dix dix = hkk.f6664i.f6693a;
            dix.f14089d.execute(new djb(dix));
        }
    }
}
