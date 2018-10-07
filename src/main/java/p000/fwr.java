package p000;

/* renamed from: fwr */
public final /* synthetic */ class fwr implements iqt {
    /* renamed from: a */
    private final iqz f18843a;

    public fwr(iqz iqz) {
        this.f18843a = iqz;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        iqz iqz = this.f18843a;
        String valueOf = String.valueOf((Boolean) obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
        stringBuilder.append("ImageCaptureCommand Availability = ");
        stringBuilder.append(valueOf);
        iqz.mo8832b(stringBuilder.toString());
    }
}
