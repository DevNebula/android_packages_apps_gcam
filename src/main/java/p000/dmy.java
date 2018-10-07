package p000;

import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dmy */
public final class dmy extends doc {
    /* renamed from: c */
    public bfr f24016c;
    /* renamed from: d */
    public ixz f24017d;
    /* renamed from: e */
    public bfe f24018e;
    /* renamed from: f */
    public final Runnable f24019f = new dna(this);
    /* renamed from: g */
    private final dkd f24020g;
    /* renamed from: h */
    private ScheduledExecutorService f24021h;
    /* renamed from: i */
    private djz f24022i;

    static {
        bli.m887a("VidIntStRecVideo");
    }

    public dmy(doc doc, bfr bfr, dkd dkd, bfe bfe, djz djz) {
        super((bug) doc);
        this.f24016c = bfr;
        this.f24020g = dkd;
        this.f24017d = new hke();
        this.f24021h = iel.m3780e("VideoIntEx", 1);
        this.f24018e = bfe;
        this.f24022i = djz;
        mo2149a(daz.class, new dnb(this));
        mo2149a(dlu.class, new dnc(this));
        mo2149a(dlt.class, new dne(this));
        mo2149a(dbi.class, new dng(this));
        mo2149a(dlm.class, new dnh(this));
    }

    /* renamed from: f */
    final doc mo14864f() {
        Handler handler = new Handler(((doa) mo2152d()).f14237d.getMainLooper());
        handler.post(new dmz(this));
        kow.m13878a(this.f24016c.mo12373j(), new dni(this, handler), kpq.f8776a);
        this.f24022i.mo13043b();
        this.f24020g.mo6007c();
        this.f24020g.mo6008d();
        return null;
    }

    /* renamed from: e */
    public final doc mo2150b() {
        this.f24021h.scheduleAtFixedRate(new dnk(this), 0, 1, TimeUnit.SECONDS);
        return null;
    }

    /* renamed from: c */
    public final void mo2151c() {
        this.f24016c = null;
        ScheduledExecutorService scheduledExecutorService = this.f24021h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.f24021h = null;
    }
}
