package p000;

/* compiled from: PG */
/* renamed from: bmb */
public final class bmb {
    /* renamed from: A */
    public static final bsb f1300A = new bsb("camera.enable_lkcnry");
    /* renamed from: B */
    public static final bsb f1301B = new bsb("camera.artemis");
    /* renamed from: C */
    public static final bsb f1302C = new bsb("camera.use_photos");
    /* renamed from: D */
    public static final bsb f1303D = new bsb("camera.diet_burst");
    /* renamed from: E */
    public static final bsa f1304E = new bsa("camera.auto_fps");
    /* renamed from: F */
    public static final bsb f1305F = new bsb("camerairis.enable_iris");
    /* renamed from: G */
    public static final bsb f1306G = new bsb("camera.use_smarts_api");
    /* renamed from: H */
    public static final bsb f1307H = new bsb("camera.iris_use_pb");
    /* renamed from: c */
    public static final bsa f1308c = new bsa("camera.onscreen_log");
    /* renamed from: d */
    public static final bsa f1309d = new bsa("camera.onscreen_logcat");
    /* renamed from: e */
    public static final bsa f1310e = new bsa("camera.syshealth_info");
    /* renamed from: f */
    public static final bsa f1311f = new bsa("camera.faceboxes");
    /* renamed from: g */
    public static final bsq f1312g = new bsq("camera.use_perf_logger", false);
    /* renamed from: h */
    public static final bsa f1313h = new bsa("camera.af.debug.show");
    /* renamed from: i */
    public static final bsa f1314i = new bsa("camera.op.nes");
    /* renamed from: j */
    public static final bsa f1315j = new bsa("camera.hwhdr_inapp");
    /* renamed from: k */
    public static final bsk f1316k = new bsk("camera.hwhdr_intent");
    /* renamed from: l */
    public static final bsb f1317l = new bsb("camera.enable_pd");
    /* renamed from: m */
    public static final bsb f1318m = new bsb("camera.enable_pd_blur");
    /* renamed from: n */
    public static final bsb f1319n = new bsb("cameraprogress_overlay");
    /* renamed from: o */
    public static final bsa f1320o = new bsa("camera.enable_micro_he");
    /* renamed from: p */
    public static final bsa f1321p = new bsa("camera.mv_verbose");
    /* renamed from: q */
    public static final bsa f1322q = new bsa("camera.micro_no_trim");
    /* renamed from: r */
    public static final bsa f1323r = new bsa("camera.micro_audio");
    /* renamed from: s */
    public static final bsa f1324s = new bsa("camera.micro_trimtoast");
    /* renamed from: t */
    public static final bsb f1325t = new bsb("camera.micro_motion");
    /* renamed from: u */
    public static final bsb f1326u = new bsb("camera.micro_tooltip");
    /* renamed from: v */
    public static final bsk f1327v = new bsk("camera.micro_tone_map");
    /* renamed from: w */
    public static final bsa f1328w = new bsa("camera.mts_4k");
    /* renamed from: x */
    public static final bsb f1329x = new bsb("camera.mts_1fr");
    /* renamed from: y */
    public static final bsa f1330y = new bsa("camera.micro_longpress");
    /* renamed from: z */
    public static final bsa f1331z = new bsa("camera.mts_simple");
    /* renamed from: I */
    public final bsq f1332I = new bsq("camera.enable_micro", this.f1333J.mo2004g());
    /* renamed from: J */
    public final bkw f1333J;
    /* renamed from: K */
    private final bul f1334K;
    /* renamed from: a */
    public final bsn f1335a;
    /* renamed from: b */
    public hjf f1336b;

    static {
        bsa bsa = new bsa("camera.use_local_logger");
        bsa = new bsa("camera.af.ring.hide");
        bsb bsb = new bsb("camera.flash.ind");
        bsa = new bsa("camera.elmyra_assist");
        bsa = new bsa("camera.elmyra_lens");
        bsa = new bsa("camera.optbar.hdr");
        bsa = new bsa("camera.finish_use_cpu");
    }

    public bmb(bsn bsn, hjf hjf, bul bul, bkw bkw) {
        this.f1335a = bsn;
        this.f1336b = hjf;
        this.f1334K = bul;
        this.f1333J = bkw;
        bsk bsk = new bsk("camera.raw_mode");
        bsc bsc = new bsc("camera.chk_anim_trnstns");
    }

    /* renamed from: a */
    public final boolean mo2019a() {
        return this.f1333J.mo2004g();
    }

    /* renamed from: b */
    public final boolean mo2020b() {
        if (this.f1333J.mo2004g() && this.f1334K.mo2156a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo2021c() {
        hjf hjf = this.f1336b;
        boolean z = !hjf.mo7905c() ? hjf.mo7906d() : true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo2022d() {
        return this.f1333J.mo2004g() && this.f1335a.mo2107a(this.f1332I);
    }
}
