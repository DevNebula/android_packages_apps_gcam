package p000;

/* renamed from: ims */
final /* synthetic */ class ims implements iqt {
    /* renamed from: a */
    private final imr f21067a;
    /* renamed from: b */
    private final iqt f21068b;

    ims(imr imr, iqt iqt) {
        this.f21067a = imr;
        this.f21068b = iqt;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        imr imr = this.f21067a;
        iqt iqt = this.f21068b;
        imq imq = imr.f24648a;
        String valueOf;
        if (obj == null) {
            valueOf = String.valueOf(imq.f24646a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
            stringBuilder.append("Input: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" returned a null value");
            throw new NullPointerException(stringBuilder.toString());
        }
        Object b = imq.mo15010b(obj);
        if (b == null) {
            String valueOf2 = String.valueOf(obj);
            valueOf = imq.getClass().getName();
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 58) + String.valueOf(valueOf).length());
            stringBuilder2.append("Transforming input value: ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(" resulted in a null output for: ");
            stringBuilder2.append(valueOf);
            throw new NullPointerException(stringBuilder2.toString());
        }
        iqt.mo8826a(b);
    }
}
