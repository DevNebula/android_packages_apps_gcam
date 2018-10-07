package p000;

/* compiled from: PG */
/* renamed from: cfp */
final class cfp implements iqt {
    /* renamed from: a */
    private final /* synthetic */ cfk f12331a;

    cfp(cfk cfk) {
        this.f12331a = cfk;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        obj = (Boolean) obj;
        jri.m13404b(obj);
        if (obj.booleanValue()) {
            cfk cfk = this.f12331a;
            if (cfk.f23073U && cfk.f23074V) {
                ikd.m12501a();
                if (cfk.f23073U && !cfk.f23075W) {
                    bli.m888a(cfk.f23052a, "stopPreviewForOverlay");
                    cfk.f23075W = true;
                    cfk.mo14579G();
                    cfk.mo14585a(cfk.f23060H);
                    cfk.f23055C.mo13121c(cfk.f23070R);
                    cfk.f23177l.mo8869a(false);
                }
            }
        }
    }
}
