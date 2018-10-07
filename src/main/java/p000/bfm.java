package p000;

/* compiled from: PG */
/* renamed from: bfm */
final class bfm implements koj {
    /* renamed from: a */
    private final /* synthetic */ inc f11233a;
    /* renamed from: b */
    private final /* synthetic */ inp f11234b;
    /* renamed from: c */
    private final /* synthetic */ iur f11235c;
    /* renamed from: d */
    private final /* synthetic */ biq f11236d;
    /* renamed from: e */
    private final /* synthetic */ ilp f11237e;
    /* renamed from: f */
    private final /* synthetic */ ilp f11238f;
    /* renamed from: g */
    private final /* synthetic */ kbg f11239g;
    /* renamed from: h */
    private final /* synthetic */ bfl f11240h;

    bfm(bfl bfl, inc inc, inp inp, iur iur, biq biq, ilp ilp, ilp ilp2, kbg kbg) {
        this.f11240h = bfl;
        this.f11233a = inc;
        this.f11234b = inp;
        this.f11235c = iur;
        this.f11236d = biq;
        this.f11237e = ilp;
        this.f11238f = ilp2;
        this.f11239g = kbg;
    }

    /* renamed from: a */
    private final kpk m7395a(biw biw) {
        kpk a;
        bli.m896d(bfl.f22635a, "CameraDeviceProxy and PreparedMediaRecorder are ready.");
        synchronized (this.f11240h.f22641g) {
            if (this.f11240h.mo14560b()) {
                a = kow.m13874a(new IllegalStateException("CamcorderManager has been closed."));
            } else {
                jri.m13405b(this.f11240h.f22640f.isDone() ^ 1);
                this.f11240h.f22640f.mo15641a(Boolean.valueOf(true));
                bhw bhw = new bhw();
                inc inc = this.f11233a;
                inp inp = this.f11234b;
                iur iur = this.f11235c;
                bff bff = this.f11240h;
                Object bgp = new bgp(inc, inp, iur, bff.f22636b, bff.f22637c, bff.f22643i, bff.f22644j, this.f11236d, this.f11237e, this.f11238f, bff.f22645k, bff, biw, bff.f22638d, this.f11239g, bff.f22639e);
                jri.m13395a(this.f11240h.f22642h.containsKey(this.f11235c) ^ 1);
                this.f11240h.f22642h.put(this.f11235c, bgp);
                a = kow.m13873a(bgp);
            }
        }
        return a;
    }
}
