package p000;

/* renamed from: esh */
final /* synthetic */ class esh implements Runnable {
    /* renamed from: a */
    private final esd f4424a;
    /* renamed from: b */
    private final eso f4425b;

    esh(esd esd, eso eso) {
        this.f4424a = esd;
        this.f4425b = eso;
    }

    public final void run() {
        esd esd = this.f4424a;
        eso eso = this.f4425b;
        if (eso != null) {
            try {
                esd.f17707d.mo7397b(eso.f4435b);
            } catch (Throwable e) {
                String str = esd.f17704a;
                String valueOf = String.valueOf(eso.f4435b);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("Couldn't delete temp microvideo file after cancellation: ");
                stringBuilder.append(valueOf);
                bli.m892b(str, stringBuilder.toString(), e);
            }
        }
    }
}
