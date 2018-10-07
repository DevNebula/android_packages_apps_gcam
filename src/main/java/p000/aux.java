package p000;

/* compiled from: PG */
/* renamed from: aux */
public final class aux implements iqo, iqt {
    /* renamed from: a */
    public static final String f10833a = bli.m887a("StdPassiveFocus");
    /* renamed from: b */
    public final atb f10834b;
    /* renamed from: c */
    public hiv f10835c = null;
    /* renamed from: d */
    public hiv f10836d = null;
    /* renamed from: e */
    public kpw f10837e;
    /* renamed from: f */
    private final ikd f10838f;
    /* renamed from: g */
    private final ikb f10839g = new ikb();
    /* renamed from: h */
    private final iju f10840h = new auz(this);

    public aux(ikd ikd, atb atb, ilp ilp) {
        this.f10838f = ikd;
        this.f10834b = atb;
        this.f10839g.mo8557a(ilp.mo13672a(this, ikd));
    }

    public final void close() {
        this.f10839g.close();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        boolean z;
        boolean z2 = false;
        fco fco = (fco) obj;
        if (this.f10835c == null && this.f10836d == null) {
            if (fco.f4704a.f4700b == gih.PASSIVE_SCAN) {
                z = false;
            } else if (fco.f4705b.f4700b == gih.PASSIVE_SCAN) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bli.m896d(f10833a, "PassiveFocusScanAnimation: start");
                this.f10835c = this.f10834b.mo12314a(kau.f21835a);
                this.f10835c.mo7896a(new auy(this));
                if (this.f10835c != null) {
                    this.f10837e = kpw.m18486d();
                    iel.m3774a(this.f10835c.mo7897b(), this.f10837e, this.f10840h, this.f10838f);
                }
            }
        }
        if (this.f10837e != null) {
            gih gih;
            if (fco.f4704a.f4700b == gih.PASSIVE_SCAN) {
                gih = fco.f4705b.f4700b;
                if (gih == gih.PASSIVE_FOCUSED) {
                    z = true;
                } else if (gih == gih.PASSIVE_UNFOCUSED) {
                    z = true;
                } else if (gih == gih.FOCUSED_LOCKED) {
                    z = true;
                } else if (gih == gih.NOT_FOCUSED_LOCKED) {
                    z = true;
                } else if (gih != gih.INACTIVE) {
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
                gih = fco.f4705b.f4700b;
                if (gih == gih.PASSIVE_FOCUSED) {
                    z2 = true;
                } else if (gih == gih.FOCUSED_LOCKED) {
                    z2 = true;
                }
                this.f10837e.mo15641a(Boolean.valueOf(z2));
            }
        }
    }
}
