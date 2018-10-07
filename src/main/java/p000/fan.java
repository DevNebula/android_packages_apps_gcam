package p000;

/* renamed from: fan */
public final /* synthetic */ class fan implements iqt {
    /* renamed from: a */
    private final fbd f18091a;

    public fan(fbd fbd) {
        this.f18091a = fbd;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        fbd fbd = this.f18091a;
        if (((Boolean) obj).booleanValue()) {
            fbd.f4653c.postDelayed(fbd.f4655e, 200);
            return;
        }
        fbd.f4653c.removeCallbacks(fbd.f4655e);
        fbd.f4651a.mo6719a(fbd.f4652b);
    }
}
