package p000;

/* compiled from: PG */
/* renamed from: did */
final class did extends hci {
    /* renamed from: a */
    private final /* synthetic */ dhz f23926a;

    did(dhz dhz) {
        this.f23926a = dhz;
    }

    public final void onShutterButtonClick() {
        synchronized (this.f23926a.f26052j) {
            dil dil = this.f23926a.f26056n;
            if (dil != null) {
                dil.mo13030c();
            }
        }
    }
}
