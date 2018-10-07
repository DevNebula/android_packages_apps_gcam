package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.RectF;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: chj */
final class chj implements chh {
    /* renamed from: a */
    public static final String f12507a = bli.m887a("BurstCntrImpl");
    /* renamed from: y */
    private static final RectF f12508y = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    /* renamed from: A */
    private final AtomicBoolean f12509A = new AtomicBoolean(false);
    /* renamed from: B */
    private final AtomicBoolean f12510B = new AtomicBoolean(false);
    /* renamed from: C */
    private final jsi f12511C;
    /* renamed from: D */
    private final jsi f12512D;
    /* renamed from: E */
    private final Pipeline f12513E;
    /* renamed from: F */
    private final jwa f12514F;
    /* renamed from: G */
    private final SurfaceTextureStreamer f12515G;
    /* renamed from: H */
    private final MffContext f12516H;
    /* renamed from: I */
    private volatile long f12517I;
    /* renamed from: J */
    private final agw f12518J = new ahe(52428800);
    /* renamed from: b */
    public final Context f12519b;
    /* renamed from: c */
    public final cjn f12520c;
    /* renamed from: d */
    public final gkr f12521d;
    /* renamed from: e */
    public final gln f12522e;
    /* renamed from: f */
    public final gev f12523f;
    /* renamed from: g */
    public final kpk f12524g;
    /* renamed from: h */
    public final grw f12525h;
    /* renamed from: i */
    public final ckw f12526i;
    /* renamed from: j */
    public final jmr f12527j;
    /* renamed from: k */
    public final boolean f12528k;
    /* renamed from: l */
    public final ird f12529l;
    /* renamed from: m */
    public volatile boolean f12530m = false;
    /* renamed from: n */
    public final int f12531n;
    /* renamed from: o */
    public final chi f12532o;
    /* renamed from: p */
    public final jyt f12533p;
    /* renamed from: q */
    public final jqo f12534q;
    /* renamed from: r */
    public final AtomicReference f12535r = new AtomicReference();
    /* renamed from: s */
    public final UUID f12536s;
    /* renamed from: t */
    public volatile boolean f12537t = true;
    /* renamed from: u */
    public final AtomicReference f12538u = new AtomicReference();
    /* renamed from: v */
    public final gsp f12539v;
    /* renamed from: w */
    public final irs f12540w;
    /* renamed from: x */
    public final glj f12541x;
    /* renamed from: z */
    private final AtomicBoolean f12542z = new AtomicBoolean(false);

    public chj(Context context, jmr jmr, kpk kpk, bcy bcy, chi chi, cjn cjn, gkr gkr, gln gln, gev gev, grw grw, SurfaceTextureStreamer surfaceTextureStreamer, boolean z, gsp gsp, UUID uuid, ird ird, irs irs, glj glj) {
        jqo jrk;
        ird.mo8856a("BurstControllerImpl#constructor");
        this.f12529l = ird;
        this.f12519b = context;
        this.f12527j = jmr;
        this.f12524g = kpk;
        this.f12520c = cjn;
        this.f12521d = gkr;
        this.f12522e = gln;
        this.f12523f = gev;
        this.f12525h = grw;
        this.f12528k = z;
        this.f12532o = chi;
        this.f12539v = gsp;
        this.f12536s = uuid;
        this.f12540w = irs;
        this.f12541x = glj;
        kow.m13878a(this.f12524g, new chk(this), kpq.f8776a);
        this.f12515G = surfaceTextureStreamer;
        this.f12533p = new jyt(jlo.m4598a(), "camera_sb_");
        jqo jrd = new jrd(this.f12518J);
        if (jlo.m4600c()) {
            jrk = new jrk(jrd);
            this.f12533p.mo9618a("bitmap_allocs.csv", jrk);
        } else {
            jrk = jrd;
        }
        this.f12534q = jrk;
        this.f12516H = new MffContext(this.f12519b);
        Object jms = new jms();
        MffContext mffContext = this.f12516H;
        jmr jmr2 = this.f12527j;
        kpk kpk2 = this.f12524g;
        jqo jqo = this.f12534q;
        if (jmr2.mo9517a()) {
            mffContext.getApplicationContext();
            jmx.m13233b(jms);
            List arrayList = new ArrayList();
            arrayList.add(new jlv());
            arrayList.add(new jlq());
            arrayList.add(new jls());
            GraphFactory[] graphFactoryArr = (GraphFactory[]) arrayList.toArray(new GraphFactory[arrayList.size()]);
            EnumSet copyOf = EnumSet.copyOf(EnumSet.of(jza.TIMESTAMP, jza.EXPOSURE));
            copyOf.addAll(EnumSet.of(jza.PERCEPTUAL_SHARPNESS, new jza[]{jza.MAX_GRID_SHARPNESS, jza.BRIGHTNESS_MEAN, jza.BRIGHTNESS_VARIANCE, jza.MAX_BLOCK_BRIGHTNESS_MEAN, jza.MIN_BLOCK_BRIGHTNESS_MEAN, jza.MAX_BLOCK_BRIGHTNESS_VARIANCE, jza.MIN_BLOCK_BRIGHTNESS_VARIANCE}));
            copyOf.addAll(EnumSet.of(jza.MOTION_SALIENCY, jza.MOTION_ESTIMATION_SALIENCY, jza.INTERFRAME_HOMOGRAPHY, jza.CAMERA_MOTION));
            copyOf.addAll(EnumSet.of(jza.FACE_COUNT, jza.FACE_IS_SMILING_AGGREGATE_SCORE, jza.FACE_IS_LEFT_EYE_OPEN_AGGREGATE_SCORE, jza.FACE_IS_RIGHT_EYE_OPEN_AGGREGATE_SCORE, jza.FACE_SHARPNESS_AGGREGATE_SCORE));
            copyOf.addAll(EnumSet.of(jza.HUE_SAT_HISTOGRAM, jza.VALUE_HISTOGRAM, jza.VIDEO_PRESENTATION_TIME));
            jmx.m13232a(jms, mffContext, jmr2, graphFactoryArr, surfaceTextureStreamer, kpk2, jqo, copyOf);
        } else {
            boolean z2;
            jri.m13404b(jms);
            if (jmr2 == jmr.FIXED_FPS) {
                z2 = true;
            } else {
                z2 = false;
            }
            jri.m13395a(z2);
            jms.f8294c = false;
            jms.mo9522b(jwa.class, "FixedFPSModeFrameDropper").mo9524a(new jnd());
            jms.mo9522b(jvx.class, "default").mo9524a(new jne());
            jms.mo9522b(jwa.class, "default").mo9524a(new jnf());
            jms.mo9522b(jwa.class, "med-res-acquisition-pipeline").mo9524a(new jng());
            jms.f8294c = true;
            jmx.m13232a(jms, mffContext, jmr2, new GraphFactory[0], surfaceTextureStreamer, kpk2, jqo, EnumSet.of(jza.TIMESTAMP));
        }
        if (jlo.m4600c()) {
            jyt jyt = this.f12533p;
            jms.mo9520a(VideoFrameProvider.class, new jyc(jyt));
            jms.mo9520a(jtv.class, new jyj(jyt.mo9619b("live_framescores.csv")));
            jms.mo9520a(jwa.class, new jyk(jyt.mo9616a("frame_dropper_events.csv")));
            jms.mo9520a(jtn.class, new jyl(jyt.mo9619b("live_features.csv")));
            jms.mo9522b(jrj.class, "default").mo9524a(new jym(jyt));
            jms.mo9522b(jsi.class, "low-res-acquisition-pipeline").mo9524a(new jyn());
            jms.mo9522b(jsi.class, "med-res-acquisition-pipeline").mo9524a(new jyo());
            jms.mo9522b(jsh.class, "default").mo9524a(new jyp());
            jms.mo9522b(FeatureTable.class, "default").mo9524a(new jyq(jyt));
            jms.mo9520a(FeatureTable.class, new jyd(jyt.mo9616a("feature_additions.csv")));
            jyt.mo9618a("capture_config.txt", jms.mo9519a());
        }
        this.f12511C = (jsi) jms.mo9518a(jsi.class, "low-res-acquisition-pipeline");
        RectF rectF = f12508y;
        this.f12511C.mo15053a(rectF);
        this.f12512D = (jsi) jms.mo9518a(jsi.class, "med-res-acquisition-pipeline");
        this.f12512D.mo15053a(rectF);
        this.f12513E = (Pipeline) jms.mo9518a(jsl.class, "default");
        this.f12531n = chi.f2174c;
        this.f12514F = (jwa) jms.mo9518a(jwa.class, "default");
        this.f12526i = new ckw(bcy);
        ird.mo8857b();
    }

    public final synchronized void close() {
        if (this.f12509A.get()) {
            bli.m888a(f12507a, "close");
            this.f12529l.mo8856a("BurstControllerImpl#close");
            m8302c();
            this.f12516H.release();
            this.f12529l.mo8857b();
        } else {
            throw new RuntimeException("Burst was never stopped before closing.");
        }
    }

    /* renamed from: c */
    private final void m8302c() {
        if (!this.f12510B.getAndSet(true)) {
            jrg jrg = (jrg) this.f12538u.getAndSet(null);
            if (jrg != null) {
                jrg.close();
            }
            try {
                this.f12518J.mo281a();
                this.f12533p.mo9617a();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: d */
    private final void m8303d() {
        if (!this.f12542z.get()) {
            throw new RuntimeException("Stopping burst that was not started yet.");
        } else if (this.f12509A.getAndSet(true)) {
            throw new RuntimeException("Stopping burst twice.");
        }
    }

    /* renamed from: a */
    public final void mo2296a(kpk kpk, dpu dpu) {
        this.f12529l.mo8856a("BurstControllerImpl#processBurstResults");
        Executor a = khx.m5000a();
        jli.m13191a(kpk).mo9275a(a, new chm(this, dpu)).mo9283b(a, new chl(this)).mo9282a(izw.f21401a);
        this.f12529l.mo8857b();
    }

    /* renamed from: a */
    public final synchronized jwa mo2295a() {
        if (this.f12542z.getAndSet(true)) {
            throw new RuntimeException("Burst was already started");
        }
        this.f12529l.mo8856a("BurstControllerImpl#startAnalysis");
        this.f12515G.start();
        this.f12526i.mo12516a();
        this.f12517I = System.nanoTime();
        Executor d = cht.m1158d();
        jli.m13187a(jli.m13187a(this.f12511C.process(), this.f12512D.process()).mo9275a(d, new chn()), this.f12513E.process()).mo9275a(d, new chp(this, d)).mo9283b(d, new cho(this)).mo9282a(izw.f21401a);
        bli.m896d(cig.f2211a, "onBurstStarted");
        this.f12529l.mo8857b();
        return this.f12514F;
    }

    /* renamed from: e */
    private final void m8304e() {
        bli.m888a(f12507a, "Stopping analysis.");
        this.f12529l.mo8856a("BurstControllerImpl#stop");
        this.f12513E.stop();
        this.f12515G.stop();
        this.f12511C.stop();
        this.f12512D.stop();
        this.f12529l.mo8857b();
    }

    /* renamed from: b */
    public final synchronized void mo12503b() {
        bli.m888a(f12507a, "stopAndCancel");
        this.f12529l.mo8856a("BurstControllerImpl#stopAndCancel");
        m8303d();
        this.f12537t = false;
        m8304e();
        this.f12529l.mo8857b();
    }

    /* renamed from: a */
    public final synchronized void mo12502a(jrg jrg, dpu dpu) {
        try {
            this.f12529l.mo8856a("BurstControllerImpl#stopAndPopulateResults");
            m8303d();
            try {
                kae jzy = new jzy(jqk.m13349b((AutoCloseable) jrg));
                try {
                    jrg jrg2 = (jrg) this.f12538u.getAndSet(jrg);
                    if (jrg2 != null) {
                        jrg2.close();
                        m8302c();
                        throw new IllegalStateException("Trying to capture images when existing burst session is running.");
                    }
                    this.f12535r.set(dpu);
                    int f = jrg.mo13836f();
                    float convert = (float) TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f12517I, TimeUnit.NANOSECONDS);
                    klx klx = this.f12525h.f6021a;
                    klx.f25313a = convert;
                    klx.f25314b = f;
                    m8304e();
                    jzy.mo9673d();
                    chj.m8300a(null, jzy);
                    this.f12529l.mo8857b();
                } catch (Throwable th) {
                    chj.m8300a(th, jzy);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f12529l.mo8857b();
                throw th2;
            }
        } catch (Throwable th22) {
            throw th22;
        }
    }
}
