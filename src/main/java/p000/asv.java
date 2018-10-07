package p000;

/* compiled from: PG */
/* renamed from: asv */
public final class asv implements iqt {
    /* renamed from: a */
    private final kpw f10701a = kpw.m18486d();
    /* renamed from: b */
    private boolean f10702b;

    asv() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        boolean z;
        boolean z2 = true;
        fco fco = (fco) obj;
        if (fco.f4704a.f4700b == gih.ACTIVE_SCAN) {
            z = false;
        } else if (fco.f4705b.f4700b == gih.ACTIVE_SCAN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f10702b = true;
        } else if (this.f10702b) {
            if (fco.f4704a.f4700b == gih.ACTIVE_SCAN) {
                gih gih = fco.f4705b.f4700b;
                if (gih == gih.FOCUSED_LOCKED) {
                    z = true;
                } else if (gih != gih.NOT_FOCUSED_LOCKED) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                if (fco.f4705b.f4700b != gih.FOCUSED_LOCKED) {
                    z2 = false;
                }
                this.f10701a.mo15641a(Boolean.valueOf(z2));
            }
        }
    }
}
