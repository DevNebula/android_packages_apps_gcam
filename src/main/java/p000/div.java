package p000;

/* compiled from: PG */
/* renamed from: div */
public final class div extends imt implements ilp {
    /* renamed from: a */
    private final bsn f26110a;

    public div(bsn bsn, gor gor) {
        super(gor.mo7284b("pref_video_fps_key", gom.FPS_30.name()));
        this.f26110a = bsn;
    }

    /* renamed from: a */
    public final inc mo13673b() {
        kbg a = this.f26110a.mo2105a(bin.f1219c);
        if (!a.mo9709b()) {
            return (inc) super.mo13673b();
        }
        if (((Integer) a.mo9706a()).intValue() == 30) {
            return inc.FPS_30;
        }
        if (((Integer) a.mo9706a()).intValue() == 60) {
            return inc.FPS_60;
        }
        if (((Integer) a.mo9706a()).intValue() == 0) {
            return inc.FPS_AUTO;
        }
        return (inc) super.mo13673b();
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo15012c(Object obj) {
        return ((inc) obj).name();
    }
}
