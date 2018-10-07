package p000;

/* compiled from: PG */
/* renamed from: bfn */
final class bfn implements koj {
    /* renamed from: a */
    private final /* synthetic */ inc f11241a;
    /* renamed from: b */
    private final /* synthetic */ inp f11242b;
    /* renamed from: c */
    private final /* synthetic */ iur f11243c;
    /* renamed from: d */
    private final /* synthetic */ iou f11244d;
    /* renamed from: e */
    private final /* synthetic */ ilp f11245e;
    /* renamed from: f */
    private final /* synthetic */ ilp f11246f;
    /* renamed from: g */
    private final /* synthetic */ kbg f11247g;
    /* renamed from: h */
    private final /* synthetic */ bfl f11248h;

    bfn(bfl bfl, inc inc, inp inp, iur iur, iou iou, ilp ilp, ilp ilp2, kbg kbg) {
        this.f11248h = bfl;
        this.f11241a = inc;
        this.f11242b = inp;
        this.f11243c = iur;
        this.f11244d = iou;
        this.f11245e = ilp;
        this.f11246f = ilp2;
        this.f11247g = kbg;
    }

    /* renamed from: a */
    private final kpk m7397a(ios ios) {
        kpk a;
        bli.m896d(bfl.f22635a, "CameraDeviceProxy and PreparedMediaRecorder are ready.");
        synchronized (this.f11248h.f22641g) {
            if (this.f11248h.mo14560b()) {
                a = kow.m13874a(new IllegalStateException("CamcorderManager has been closed."));
            } else {
                jri.m13405b(this.f11248h.f22640f.isDone() ^ 1);
                this.f11248h.f22640f.mo15641a(Boolean.valueOf(true));
                bhw bhw = new bhw();
                inc inc = this.f11241a;
                inp inp = this.f11242b;
                iur iur = this.f11243c;
                bff bff = this.f11248h;
                Object bgm = new bgm(inc, inp, iur, bff.f22636b, bff.f22637c, bff.f22643i, bff.f22644j, this.f11244d, this.f11245e, this.f11246f, bff.f22645k, bff, ios, bff.f22638d, this.f11247g, bff.f22639e);
                jri.m13395a(this.f11248h.f22642h.containsKey(this.f11243c) ^ 1);
                this.f11248h.f22642h.put(this.f11243c, bgm);
                a = kow.m13873a(bgm);
            }
        }
        return a;
    }
}
