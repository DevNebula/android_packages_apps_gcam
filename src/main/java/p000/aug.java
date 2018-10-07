package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;

/* compiled from: PG */
/* renamed from: aug */
public final class aug extends fiw {
    /* renamed from: a */
    public static final String f10784a = bli.m887a("SceneChangeMonitor");
    /* renamed from: b */
    public Runnable f10785b;
    /* renamed from: c */
    public long f10786c = 0;
    /* renamed from: d */
    public boolean f10787d;
    /* renamed from: e */
    public final hke f10788e;
    /* renamed from: f */
    private boolean f10789f = false;
    /* renamed from: g */
    private final ilp f10790g;
    /* renamed from: h */
    private final ilp f10791h;
    /* renamed from: i */
    private final iqt f10792i = new auh(this);

    aug(bps bps, ilp ilp, ivw ivw, hke hke) {
        this.f10790g = bps.f1443a;
        this.f10791h = ilp;
        this.f10787d = ((Boolean) this.f10790g.mo13673b()).booleanValue();
        this.f10788e = hke;
        ivw.mo9110b().mo8557a(this.f10790g.mo13672a(this.f10792i, kpq.f8776a));
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        boolean z = true;
        if (hsy.f6967b == null) {
            z = false;
        } else if (((Integer) iwp.mo13730a(hsy.f6967b)).intValue() != 1) {
            z = false;
        }
        if (!this.f10789f && z) {
            if (((Boolean) this.f10790g.mo13673b()).booleanValue()) {
                bli.m888a(f10784a, "onSceneChanged while scrolling ev comp, ignoring");
            } else if (((Boolean) this.f10791h.mo13673b()).booleanValue()) {
                bli.m888a(f10784a, "onSceneChanged while counting down, ignoring");
            } else if (System.currentTimeMillis() - this.f10786c < ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS) {
                bli.m888a(f10784a, "onSceneChanged while waiting for expiration of last scrolling ev comp, ignoring");
            } else {
                bli.m888a(f10784a, "onSceneChanged");
                Runnable runnable = this.f10785b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        this.f10789f = z;
    }
}
