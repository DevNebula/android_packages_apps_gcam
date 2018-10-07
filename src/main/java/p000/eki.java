package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.p004ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: eki */
public class eki implements Renderer {
    /* renamed from: A */
    public int f3959A = PhotoSphereMessageOverlay.f2566a;
    /* renamed from: B */
    public ekv f3960B = null;
    /* renamed from: C */
    public boolean f3961C = false;
    /* renamed from: D */
    public int f3962D = 0;
    /* renamed from: E */
    public int f3963E = 0;
    /* renamed from: F */
    public byte[] f3964F = null;
    /* renamed from: G */
    public boolean f3965G = false;
    /* renamed from: H */
    public eld f3966H;
    /* renamed from: I */
    public ejy f3967I;
    /* renamed from: J */
    private final ekr f3968J;
    /* renamed from: K */
    private final float[] f3969K = new float[16];
    /* renamed from: L */
    private final float[] f3970L = new float[16];
    /* renamed from: M */
    private final float[] f3971M = new float[16];
    /* renamed from: N */
    private final float[] f3972N = new float[16];
    /* renamed from: O */
    private final float[] f3973O = new float[16];
    /* renamed from: P */
    private final float[] f3974P = new float[16];
    /* renamed from: Q */
    private final float[] f3975Q = new float[16];
    /* renamed from: R */
    private final float[] f3976R = new float[16];
    /* renamed from: S */
    private float[] f3977S = new float[16];
    /* renamed from: T */
    private float f3978T = 60.0f;
    /* renamed from: U */
    private float f3979U = 100.0f;
    /* renamed from: V */
    private float f3980V = 100.0f;
    /* renamed from: W */
    private int f3981W = 120;
    /* renamed from: X */
    private int f3982X = 80;
    /* renamed from: Y */
    private boolean f3983Y = false;
    /* renamed from: Z */
    private int f3984Z;
    /* renamed from: a */
    public ejn f3985a;
    /* renamed from: aa */
    private int f3986aa;
    /* renamed from: ab */
    private int f3987ab;
    /* renamed from: ac */
    private int f3988ac;
    /* renamed from: ad */
    private boolean f3989ad;
    /* renamed from: ae */
    private boolean f3990ae = false;
    /* renamed from: af */
    private boolean f3991af = false;
    /* renamed from: ag */
    private int f3992ag = 0;
    /* renamed from: ah */
    private boolean f3993ah = false;
    /* renamed from: ai */
    private final ArrayList f3994ai = new ArrayList();
    /* renamed from: aj */
    private gci f3995aj;
    /* renamed from: ak */
    private boolean f3996ak = false;
    /* renamed from: al */
    private eky f3997al;
    /* renamed from: am */
    private eky f3998am;
    /* renamed from: an */
    private final eju f3999an = new eju();
    /* renamed from: ao */
    private boolean f4000ao = false;
    /* renamed from: ap */
    private long f4001ap = 0;
    /* renamed from: aq */
    private boolean f4002aq = false;
    /* renamed from: ar */
    private double f4003ar = 0.0d;
    /* renamed from: as */
    private double f4004as = 0.0d;
    /* renamed from: at */
    private final Vector f4005at = new Vector();
    /* renamed from: au */
    private final Context f4006au;
    /* renamed from: av */
    private int f4007av = 0;
    /* renamed from: aw */
    private float f4008aw = -1.0f;
    /* renamed from: ax */
    private HashMap f4009ax = new HashMap();
    /* renamed from: b */
    public final ekn f4010b = new ekn();
    /* renamed from: c */
    public eko f4011c;
    /* renamed from: d */
    public final ekt f4012d;
    /* renamed from: e */
    public final PhotoSphereMessageOverlay f4013e;
    /* renamed from: f */
    public ejm f4014f;
    /* renamed from: g */
    public ejm f4015g;
    /* renamed from: h */
    public eks f4016h;
    /* renamed from: i */
    public ejr f4017i;
    /* renamed from: j */
    public elh f4018j;
    /* renamed from: k */
    public elk f4019k;
    /* renamed from: l */
    public ejs f4020l;
    /* renamed from: m */
    public eli f4021m;
    /* renamed from: n */
    public boolean f4022n = false;
    /* renamed from: o */
    public boolean f4023o = false;
    /* renamed from: p */
    public boolean f4024p = true;
    /* renamed from: q */
    public int f4025q;
    /* renamed from: r */
    public int f4026r;
    /* renamed from: s */
    public boolean f4027s = false;
    /* renamed from: t */
    public boolean f4028t = false;
    /* renamed from: u */
    public boolean f4029u = false;
    /* renamed from: v */
    public boolean f4030v = false;
    /* renamed from: w */
    public int f4031w = C0252go.f5834ag;
    /* renamed from: x */
    public boolean f4032x = false;
    /* renamed from: y */
    public boolean f4033y = false;
    /* renamed from: z */
    public boolean f4034z = false;

    static {
        eki.class.getSimpleName();
    }

    public eki(Context context, ekr ekr, PhotoSphereMessageOverlay photoSphereMessageOverlay, gci gci) {
        this.f4006au = context;
        this.f3968J = ekr;
        this.f4013e = photoSphereMessageOverlay;
        this.f3995aj = gci;
        this.f4012d = new ekt(this.f4006au);
    }

    /* renamed from: a */
    public final void mo6279a(float f) {
        mo6282b(f);
        this.f3978T = this.f3979U;
        this.f4022n = false;
    }

    /* renamed from: b */
    private static eky m1879b(int i) {
        if (i == C0252go.f5835ah) {
            return new ela(true);
        }
        if (i == C0252go.f5836ai) {
            return new ela(false);
        }
        if (i == C0252go.f5834ag) {
            return new ekz();
        }
        if (i == C0252go.f5838ak) {
            return new ekx();
        }
        return i == C0252go.f5837aj ? new elb() : null;
    }

    public void onDrawFrame(GL10 gl10) {
        if (this.f4023o && !this.f4029u && this.f3987ab != 0) {
            GLES20.glClear(16384);
            if (this.f4023o && !this.f4029u && LightCycle.m1339j()) {
                int c;
                ekn ekn;
                double abs;
                int i;
                if (!this.f3990ae) {
                    ejo.m1846c();
                    c = ejo.m1846c();
                    LightCycle.m1321a(c, this.f3962D, this.f3963E);
                    ekn = this.f4010b;
                    ekn.f3889d.clear();
                    ejo ejo = new ejo();
                    ekn.f17497k.add(ejo);
                    ekn.f3889d.add(0, ejo);
                    ((ejo) ekn.f3889d.get(0)).f3893a = c;
                    this.f3990ae = true;
                    this.f4026r = ejo.m1845b();
                    LightCycle.m1321a(this.f4026r, this.f3962D, this.f3963E);
                    this.f4025q = ejo.m1845b();
                    LightCycle.m1321a(this.f4025q, this.f3962D, this.f3963E);
                }
                if (!this.f4027s && this.f3961C) {
                    if (this.f4031w != C0252go.f5834ag || this.f4032x) {
                        m1878a(false);
                    } else {
                        m1878a(true);
                    }
                }
                eld eld = this.f3966H;
                if (eld.f4130b) {
                    if (this.f4024p) {
                        eld.mo6299a(0.0d);
                    } else {
                        double d = this.f4003ar;
                        if (d != 0.0d) {
                            d = Math.abs(d);
                            abs = Math.abs(this.f4004as);
                            if (d < abs + abs) {
                                eld = this.f3966H;
                                eld.mo6299a(eld.f4142n.mo6294a() + this.f4003ar);
                                this.f4003ar = 0.0d;
                            } else {
                                eld = this.f3966H;
                                eld.mo6299a(eld.f4142n.mo6294a() + this.f4004as);
                                this.f4003ar -= this.f4004as;
                            }
                        }
                    }
                    this.f3977S = this.f3966H.mo6301b();
                    LightCycle.m1332c(this.f3977S);
                }
                if (this.f3965G) {
                    LightCycle.m1331c(this.f4026r);
                }
                if (this.f3992ag > 0) {
                    float f;
                    boolean z;
                    boolean z2;
                    int i2 = this.f4026r;
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                    float f2 = ((float) this.f3987ab) / ((float) this.f3988ac);
                    float f3 = this.f3980V;
                    abs = this.f3999an.mo6261a();
                    if (this.f4031w != C0252go.f5834ag) {
                        if (this.f3996ak) {
                            f3 = (float) ((abs * 18.0d) + ((double) this.f3980V));
                        } else {
                            f3 = (float) (((1.0d - abs) * 18.0d) + ((double) this.f3980V));
                        }
                    }
                    float tan = ((float) Math.tan((((double) f3) / 360.0d) * 3.141592653589793d)) * 0.1f;
                    float f4 = tan * f2;
                    Matrix.frustumM(this.f3971M, 0, -f4, f4, -tan, tan, 0.1f, 200.0f);
                    Matrix.setIdentityM(this.f3972N, 0);
                    int a = this.f3995aj.mo7041f().mo8806a();
                    Matrix.rotateM(this.f3972N, 0, ((float) a) - this.f3966H.f4143o, 0.0f, 0.0f, 1.0f);
                    Matrix.multiplyMM(this.f3969K, 0, this.f3971M, 0, this.f3972N, 0);
                    if (!this.f3983Y) {
                        Matrix.orthoM(this.f3974P, 0, 0.0f, (float) this.f3987ab, 0.0f, (float) this.f3988ac, -50.0f, 50.0f);
                        Integer valueOf = Integer.valueOf((this.f3987ab * 31) + this.f3988ac);
                        eks eks = (eks) this.f4009ax.get(valueOf);
                        if (eks != null) {
                            this.f4016h = eks;
                        } else {
                            this.f4016h = new eks(this.f4006au, this.f3966H, this.f3987ab, this.f3988ac);
                            this.f4009ax.put(valueOf, this.f4016h);
                            this.f4009ax.put(Integer.valueOf((this.f3988ac * 31) + this.f3987ab), new eks(this.f4006au, this.f3966H, this.f3988ac, this.f3987ab));
                        }
                        ekt ekt = this.f4012d;
                        a = this.f3987ab;
                        int i3 = this.f3988ac;
                        eks eks2 = this.f4016h;
                        Options options = new Options();
                        options.inScaled = false;
                        Bitmap decodeResource = BitmapFactory.decodeResource(ekt.f4064c.getResources(), R.drawable.pano_target_default, options);
                        if (decodeResource != null) {
                            decodeResource.recycle();
                        }
                        ekt.f4066e = new ejt();
                        ekt.f4066e.mo13154a(ekt.f4064c, R.drawable.pano_target_default, -1.0f);
                        ekt.f4067f = new ejt();
                        ekt.f4067f.mo13154a(ekt.f4064c, R.drawable.pano_target_activated, -1.0f);
                        try {
                            ekt.f4068g = new elj();
                            ekt.f4069h = new eli();
                        } catch (Throwable e) {
                            kqg.f8786a.mo10213b(e);
                        }
                        ejn ejn = ekt.f4066e;
                        ejq ejq = ekt.f4068g;
                        ejn.f3890e = ejq;
                        ekt.f4067f.f3890e = ejq;
                        ekt.f4074m = ((float) a) / 2.0f;
                        ekt.f4075n = ((float) i3) / 2.0f;
                        Matrix.setIdentityM(ekt.f4084w, 0);
                        ekt.f4085x = eks2;
                        this.f4012d.f4078q = this.f3966H;
                        Context context = this.f4006au;
                        Options options2 = new Options();
                        options2.inScaled = false;
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.focus_quadrant_1, options2);
                        i = (int) (((float) new abw(options2.outWidth, options2.outHeight).f178a.y) * 0.85f);
                        c = this.f3988ac / 2;
                        f = (float) (this.f3987ab / 2);
                        PointF pointF = new PointF(f, (float) (c + i));
                        PointF pointF2 = new PointF(f, (float) (c - i));
                        this.f4014f = new ejm();
                        this.f4015g = new ejm();
                        this.f4014f.mo13154a(this.f4006au, R.drawable.pano_alignhint_up, -1.0f);
                        this.f4015g.mo13154a(this.f4006au, R.drawable.pano_alignhint_down, -1.0f);
                        this.f4014f.mo14887a(pointF);
                        this.f4015g.mo14887a(pointF2);
                        try {
                            this.f4021m = new eli();
                        } catch (Throwable e2) {
                            kqg.f8786a.mo10213b(e2);
                        }
                        ejn = this.f4014f;
                        ejq ejq2 = this.f4021m;
                        ejn.f3890e = ejq2;
                        this.f4015g.f3890e = ejq2;
                        this.f3983Y = true;
                    }
                    ekn = this.f4010b;
                    ekn.f17498l = true;
                    if (this.f3965G) {
                        ekn.f17499m = true;
                    } else {
                        ekn.f17499m = false;
                    }
                    if (this.f4007av > 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f4011c.f17500f.size() != 0) {
                        z2 = false;
                    } else if (z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f3965G = z2;
                    if (!this.f3965G) {
                        this.f4010b.f17499m = false;
                    }
                    ekn ekn2 = this.f4010b;
                    ekn2.f17498l = z;
                    ekn2.mo13155a(i2);
                    ekr ekr = this.f3968J;
                    if (this.f4011c.f17500f.size() <= 0) {
                        z = false;
                    } else if (this.f3967I.f3917D.f3910b) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z != ekr.f4052a) {
                        ekr.f4052a = z;
                    }
                    GLES20.glViewport(0, 0, this.f3984Z, this.f3986aa);
                    GLES20.glClear(256);
                    GLES20.glEnable(2929);
                    try {
                        Matrix.multiplyMM(this.f3973O, 0, this.f3972N, 0, this.f3977S, 0);
                        Matrix.multiplyMM(this.f3969K, 0, this.f3971M, 0, this.f3973O, 0);
                        GLES20.glLineWidth(2.0f);
                        this.f3985a.mo6255b(this.f3969K);
                        GLES20.glDisable(2929);
                        GLES20.glEnable(3042);
                        this.f4011c.mo6254a(this.f3969K);
                        Matrix.setIdentityM(this.f3972N, 0);
                        Matrix.rotateM(this.f3972N, 0, ((float) this.f3995aj.mo7041f().mo8806a()) - this.f3966H.f4143o, 0.0f, 0.0f, 1.0f);
                        Matrix.rotateM(this.f3972N, 0, 180.0f, 1.0f, 0.0f, 0.0f);
                        Matrix.multiplyMM(this.f3970L, 0, this.f3971M, 0, this.f3972N, 0);
                        this.f4020l.mo13152b(ejd.f3858d);
                        if ((!this.f4022n && this.f3989ad) || this.f4024p) {
                            GLES20.glUseProgram(this.f4019k.f3898d);
                            this.f4019k.mo13161a(1.0f);
                            this.f4010b.mo6254a(this.f3970L);
                        }
                        ekt ekt2 = this.f4012d;
                        ekt2.f4073l = this.f3977S;
                        float[] fArr = this.f3969K;
                        float[] fArr2 = this.f3974P;
                        int h = LightCycle.m1337h();
                        if (h >= 0) {
                            f3 = ekt2.f4076o;
                            ekt2.f4076o = f3 + ((1.0f - f3) * 0.1f);
                        } else {
                            ekt2.f4076o = 0.0f;
                        }
                        f3 = ((((Math.max(Math.min((float) Math.sqrt((double) ekt2.f4078q.f4145q), 0.6981317f), 0.17453292f) - 25.659786f) / 0.5235988f) * 0.75f) + 2.75f) * 0.017453292f;
                        synchronized (LightCycle.f2562a) {
                            if (LightCycle.f2563b.booleanValue()) {
                                LightCycleNative.SetTargetHitAngleRadians(f3);
                            } else {
                                throw new IllegalStateException("State is not ready.");
                            }
                        }
                        float[] fArr3 = ekt2.f4073l;
                        ejk ejk = new ejk(-fArr3[2], -fArr3[6], -fArr3[10]);
                        GLES20.glBlendFunc(1, 771);
                        GLES20.glUseProgram(ekt2.f4068g.f3898d);
                        GLES20.glUniform1f(ekt2.f4068g.f17535e, 1.0f);
                        ekt2.f4068g.mo13160a(1.0f);
                        try {
                            float f5;
                            synchronized (ekt2.f4065d) {
                                for (Entry entry : ekt2.f4065d.entrySet()) {
                                    float[] fArr4 = (float[]) entry.getValue();
                                    Matrix.multiplyMM(ekt2.f4072k, 0, fArr, 0, fArr4, 0);
                                    Matrix.multiplyMV(ekt2.f4071j, 0, ekt2.f4072k, 0, ekt2.f4070i, 0);
                                    eku eku = ekt2.f4079r;
                                    ejk ejk2 = new ejk(-fArr4[8], -fArr4[9], -fArr4[10]);
                                    f2 = (float) Math.acos((double) ((ejk2.f3882c * ejk.f3882c) + ((ejk2.f3880a * ejk.f3880a) + (ejk2.f3881b * ejk.f3881b))));
                                    if (f2 < ekt.f4063b) {
                                        eku.f4086a = 1.0f;
                                        eku.f4087b = 1.0f;
                                    } else if (f2 < ekt.f4062a) {
                                        f2 = 1.0f - ((f2 - ekt.f4063b) / (ekt.f4062a - ekt.f4063b));
                                        eku.f4086a = 0.0f + f2;
                                        eku.f4087b = (f2 * 0.6f) + 0.4f;
                                    } else {
                                        eku.f4086a = 0.0f;
                                        eku.f4087b = 0.4f;
                                    }
                                    if (ekt2.f4077p) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = ekt2.f4079r.f4086a;
                                    }
                                    f3 = ekt2.f4079r.f4087b;
                                    if (ekt2.f4065d.size() == 1) {
                                        f4 = Math.max(0.75f, f2);
                                        f2 = 1.0f;
                                    } else if (!ekt2.f4080s) {
                                        f4 = f2;
                                        f2 = f3;
                                    } else if (ekt2.f4077p) {
                                        f4 = f2;
                                        f2 = f3;
                                    } else {
                                        f2 = Math.max(ekt2.f4082u, f2);
                                        if (ekt2.f4081t) {
                                            f4 = ekt2.f4082u;
                                            ekt2.f4082u = f4 + ((1.0f - f4) * 0.01f);
                                            if (ekt2.f4082u > 0.9f) {
                                                if (ekt2.f4083v == 0) {
                                                    ekt2.f4083v = SystemClock.elapsedRealtimeNanos();
                                                } else {
                                                    if (((double) (SystemClock.elapsedRealtimeNanos() - ekt2.f4083v)) / 1.0E9d > 0.5d) {
                                                        ekt2.f4081t = false;
                                                    }
                                                    ekt2.f4082u = 0.9f;
                                                }
                                            }
                                        } else {
                                            ekt2.f4082u *= 0.985f;
                                        }
                                        if (ekt2.f4082u < 0.01f) {
                                            ekt2.f4082u = 0.0f;
                                            ekt2.f4080s = false;
                                            f4 = f2;
                                            f2 = f3;
                                        } else {
                                            f4 = f2;
                                            f2 = f3;
                                        }
                                    }
                                    fArr3 = ekt2.f4071j;
                                    if (fArr3[3] >= 0.0f) {
                                        ekt.m1890b(fArr3);
                                        fArr3 = ekt2.f4071j;
                                        f5 = fArr3[0];
                                        tan = ekt2.f4074m;
                                        f5 = (f5 * tan) + tan;
                                        f3 = fArr3[1];
                                        tan = ekt2.f4075n;
                                        tan += f3 * tan;
                                        if (((Integer) entry.getKey()).intValue() == h) {
                                            f3 = 1.0f - f4;
                                            ekt2.f4068g.mo13160a(f4);
                                            ekt2.f4067f.mo13153a(fArr2, f5, tan, f2);
                                            ekt2.f4068g.mo13160a(f3);
                                            ekt2.f4066e.mo13153a(fArr2, f5, tan, f2);
                                            ekt2.f4068g.mo13160a(1.0f);
                                        } else {
                                            ekt2.f4068g.mo13160a(f4);
                                            ekt2.f4066e.mo13153a(fArr2, f5, tan, f2);
                                        }
                                    }
                                }
                            }
                            eks eks3 = ekt2.f4085x;
                            if (eks3 != null && eks3.f4061i) {
                                if (eks3.f4059g) {
                                    eks3.f4058f = ((int) (((long) ((int) (((double) (SystemClock.elapsedRealtimeNanos() - eks3.f4055c)) / 1000000.0d))) / 400)) + 1;
                                    if (eks3.f4058f >= eks3.f4053a.size() - 1) {
                                        eks3.f4059g = false;
                                        eks3.f4060h = true;
                                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                        long j = eks3.f4055c;
                                        eld = eks3.f4054b;
                                        fArr3 = LightCycle.m1325a(eld.mo6300a(), eld.f4141m, (int) (((double) (elapsedRealtimeNanos - j)) / 1000000.0d));
                                        f = fArr3[0];
                                        f4 = fArr3[1];
                                        f5 = fArr3[2];
                                        StringBuilder stringBuilder = new StringBuilder(56);
                                        stringBuilder.append("Bias : ");
                                        stringBuilder.append(f);
                                        stringBuilder.append(", ");
                                        stringBuilder.append(f4);
                                        stringBuilder.append(", ");
                                        stringBuilder.append(f5);
                                        fArr = eks3.f4054b.f4140l;
                                        fArr[0] = fArr3[0];
                                        fArr[1] = fArr3[1];
                                        fArr[2] = fArr3[2];
                                        eks3.f4058f = eks3.f4053a.size() - 1;
                                    }
                                }
                                GLES20.glEnable(3042);
                                GLES20.glUseProgram(eks3.f4056d.f3898d);
                                if (eks3.f4059g) {
                                    GLES20.glBlendFunc(1, 771);
                                    eks3.f4056d.mo13159a(1.2f);
                                } else {
                                    GLES20.glBlendFunc(770, 771);
                                    eks3.f4056d.mo13159a(0.5f);
                                }
                                ejt ejt = (ejt) eks3.f4053a.get(eks3.f4058f);
                                Point point = eks3.f4057e;
                                f2 = (float) point.x;
                                f = (float) point.y;
                                if (!ejt.f17477l) {
                                    bli.m891b(ejt.f17471f, "Sprite not initialized.");
                                } else if (ejt.f3890e != null) {
                                    GLES20.glUseProgram(ejt.f3890e.f3898d);
                                    ejt.f3886a.position(0);
                                    ejt.f3887b.position(0);
                                    ejt.f3890e.mo6260b(ejt.f3886a);
                                    ejt.f3890e.mo6258a(ejt.f3887b);
                                    Matrix.translateM(ejt.f17475j, 0, fArr2, 0, f2 + ejt.f17473h, ejt.f17474i + f, 0.0f);
                                    Matrix.rotateM(ejt.f17475j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                                    ejt.f3890e.mo6259a(ejt.f17475j);
                                    if (ejt.f3889d.size() != 0) {
                                        ((ejo) ejt.f3889d.get(0)).mo6256a();
                                        ejt.f3888c.position(0);
                                        GLES20.glDrawElements(4, ejt.f17476k, 5123, ejt.f3888c);
                                    }
                                }
                            }
                        } catch (Throwable e22) {
                            kqg.f8786a.mo10213b(e22);
                        }
                        GLES20.glBlendFunc(770, 771);
                        if (!(this.f4031w == C0252go.f5834ag || this.f4032x)) {
                            double a2 = this.f3999an.mo6261a();
                            Matrix.multiplyMM(this.f3970L, 0, this.f3971M, 0, this.f3972N, 0);
                            if (this.f3996ak) {
                                this.f3997al.mo6293a(1.0f - ((float) a2), this.f4012d, this.f3974P, this.f3987ab, this.f3988ac);
                                eju eju = this.f3999an;
                                if (eju.f3899a) {
                                    eju.mo6262b();
                                    this.f3996ak = false;
                                }
                            } else {
                                this.f3998am.mo6293a((float) a2, this.f4012d, this.f3974P, this.f3987ab, this.f3988ac);
                            }
                        }
                        GLES20.glDisable(3042);
                        GLES20.glDisable(2929);
                        GLES20.glBlendFunc(770, 771);
                        GLES20.glDisable(2929);
                        GLES20.glEnable(3042);
                        c = LightCycle.m1333d();
                        if (c == 0) {
                            if (!this.f4002aq && LightCycle.m1341l()) {
                                this.f4002aq = true;
                                this.f4000ao = false;
                            }
                            if (this.f4002aq && !LightCycle.m1341l()) {
                                this.f4002aq = false;
                                this.f4000ao = true;
                                this.f4001ap = SystemClock.elapsedRealtimeNanos();
                            }
                            if (this.f4000ao && ((double) (SystemClock.elapsedRealtimeNanos() - this.f4001ap)) / 1.0E9d > 0.25d) {
                                this.f4000ao = false;
                                PhotoSphereMessageOverlay photoSphereMessageOverlay = this.f4013e;
                                TextView textView = (TextView) photoSphereMessageOverlay.findViewById(R.id.short_info_message);
                                photoSphereMessageOverlay.f2569d.post(new elx(textView, PhotoSphereMessageOverlay.f2568c));
                                photoSphereMessageOverlay.f2569d.postDelayed(new ely(textView), 750);
                            }
                        }
                        Object obj;
                        if (this.f4031w == C0252go.f5835ah) {
                            obj = 1;
                        } else if (this.f4031w == C0252go.f5836ai) {
                            obj = 1;
                        } else if (this.f4031w != C0252go.f5837aj) {
                            obj = null;
                        } else {
                            obj = 1;
                        }
                        if (this.f4024p && obj == null) {
                            fArr3 = this.f3974P;
                            f = -this.f3966H.mo6301b()[6];
                            GLES20.glEnable(3042);
                            if (f > 0.34906584f) {
                                GLES20.glUseProgram(this.f4021m.f3898d);
                                this.f4021m.mo13159a(0.5f);
                                this.f4015g.mo6254a(fArr3);
                            }
                            if (f < -0.34906584f) {
                                try {
                                    GLES20.glUseProgram(this.f4021m.f3898d);
                                    this.f4021m.mo13159a(0.5f);
                                    this.f4014f.mo6254a(fArr3);
                                } catch (Throwable e222) {
                                    kqg.f8786a.mo10213b(e222);
                                }
                            }
                        }
                        if (c != 0) {
                            if (c == -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            PhotoSphereMessageOverlay photoSphereMessageOverlay2 = this.f4013e;
                            photoSphereMessageOverlay2.f2569d.post(new elz(photoSphereMessageOverlay2, z));
                        } else {
                            PhotoSphereMessageOverlay photoSphereMessageOverlay3 = this.f4013e;
                            photoSphereMessageOverlay3.f2569d.post(new ema(photoSphereMessageOverlay3));
                        }
                    } catch (Throwable e2222) {
                        kqg.f8786a.mo10213b(e2222);
                    }
                }
                i = this.f4026r;
                this.f4026r = this.f4025q;
                this.f4025q = i;
                this.f3992ag++;
                if (this.f3992ag == 0) {
                    Calendar.getInstance().getTimeInMillis();
                }
                i = this.f3992ag;
                if (i % 30 == 0 && i != 0) {
                    Calendar.getInstance().getTimeInMillis();
                }
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i != this.f3987ab || i2 != this.f3988ac) {
            this.f3987ab = i;
            this.f3988ac = i2;
            this.f3984Z = this.f3987ab;
            this.f3986aa = this.f3988ac;
            this.f3983Y = false;
            this.f3961C = false;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            if (this.f4008aw < 0.0f) {
                this.f4008aw = this.f3967I.mo6266a();
            }
            this.f3979U = eki.m1876a(this.f4008aw, 1.7f);
            this.f3981W = (int) eki.m1876a(this.f4008aw, 2.5f);
            this.f3982X = (int) eki.m1876a(this.f4008aw, 1.1f);
            float f = this.f3979U;
            this.f3978T = f;
            this.f3980V = m1880c(f);
            this.f4017i = new ejr();
            this.f4020l = new ejs();
            this.f4018j = new elh();
            this.f4019k = new elk();
            this.f4020l.mo13152b(ejd.f3856b);
            this.f4011c = new eko(this.f4010b);
            new Options().inScaled = false;
            this.f3985a = new ekl();
            ejn ejn = this.f4010b;
            ejn.f3890e = this.f4019k;
            ejn.f17496j = this.f4020l;
            if (this.f3965G) {
                ejn.f17499m = true;
                ejn.f17498l = true;
            }
            Matrix.setIdentityM(this.f3975Q, 0);
            float[] fArr = this.f3975Q;
            fArr[0] = 0.0f;
            fArr[1] = -1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            Matrix.setIdentityM(this.f3977S, 0);
            GLES20.glClearColor(ejd.f3857c[0], ejd.f3857c[1], ejd.f3857c[2], ejd.f3857c[3]);
            this.f4023o = true;
            boolean z = this.f4034z;
            if (z) {
                this.f4013e.mo2668a(z, 0);
            }
            Matrix.setIdentityM(this.f3976R, 0);
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        this.f3961C = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dd  */
    /* renamed from: a */
    private final synchronized void m1878a(boolean r8) {
        /*
        r7 = this;
        r0 = 1;
        r1 = 0;
        monitor-enter(r7);
        r2 = r7.f4016h;	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x000b;
    L_0x0007:
        r3 = r7.f4023o;	 Catch:{ all -> 0x00e7 }
        if (r3 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r7);
        return;
    L_0x000d:
        r3 = r7.f3960B;	 Catch:{ all -> 0x00e7 }
        r4 = r7.f3964F;	 Catch:{ all -> 0x00e7 }
        r5 = r7.f3962D;	 Catch:{ all -> 0x00e7 }
        r6 = r7.f3963E;	 Catch:{ all -> 0x00e7 }
        r2 = r2.f4060h;	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x017f;
    L_0x0019:
        r2 = r7.f3967I;	 Catch:{ all -> 0x00e7 }
        r2 = r2.f3951v;	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x017c;
    L_0x001f:
        r2 = r0;
    L_0x0020:
        if (r4 == 0) goto L_0x003b;
    L_0x0022:
        r2 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1324a(r4, r5, r6, r2);	 Catch:{ all -> 0x00e7 }
        r3.f4090c = r2;	 Catch:{ all -> 0x00e7 }
        r2 = r3.f4090c;	 Catch:{ all -> 0x00e7 }
        r4 = 0;
        r2 = r2[r4];	 Catch:{ all -> 0x00e7 }
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0179;
    L_0x0033:
        r3.f4088a = r0;	 Catch:{ all -> 0x00e7 }
        r0 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1346q();	 Catch:{ all -> 0x00e7 }
        r3.f4089b = r0;	 Catch:{ all -> 0x00e7 }
    L_0x003b:
        r0 = r7.f4007av;	 Catch:{ all -> 0x00e7 }
        r0 = r0 + 1;
        r7.f4007av = r0;	 Catch:{ all -> 0x00e7 }
        if (r8 != 0) goto L_0x000b;
    L_0x0043:
        r0 = r7.f3960B;	 Catch:{ all -> 0x00e7 }
        r0 = r0.f4088a;	 Catch:{ all -> 0x00e7 }
        r7.f3989ad = r0;	 Catch:{ all -> 0x00e7 }
        r1 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1340k();	 Catch:{ all -> 0x00e7 }
        r7.f3993ah = r1;	 Catch:{ all -> 0x00e7 }
        r1 = r7.f3960B;	 Catch:{ all -> 0x00e7 }
        r2 = r1.f4089b;	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x005b;
    L_0x0055:
        if (r0 == 0) goto L_0x005b;
    L_0x0057:
        r0 = r7.f4030v;	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x0104;
    L_0x005b:
        r0 = r7.f4028t;	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x0093;
    L_0x005f:
        r0 = r7.f3994ai;	 Catch:{ all -> 0x00e7 }
        r0 = r0.size();	 Catch:{ all -> 0x00e7 }
        if (r0 <= 0) goto L_0x0080;
    L_0x0067:
        r0 = r7.f3994ai;	 Catch:{ all -> 0x00e7 }
        r1 = 0;
        r0 = r0.get(r1);	 Catch:{ all -> 0x00e7 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x00e7 }
        r0 = r0.intValue();	 Catch:{ all -> 0x00e7 }
        r1 = r7.f3994ai;	 Catch:{ all -> 0x00e7 }
        r2 = 0;
        r1.remove(r2);	 Catch:{ all -> 0x00e7 }
        r1 = r7.f4011c;	 Catch:{ all -> 0x00e7 }
        r2 = 1;
        r1.mo13156a(r0, r2);	 Catch:{ all -> 0x00e7 }
    L_0x0080:
        r0 = r7.f4012d;	 Catch:{ all -> 0x00e7 }
        r0.mo6289a();	 Catch:{ all -> 0x00e7 }
        r0 = r7.f4013e;	 Catch:{ all -> 0x00e7 }
        r1 = r7.f4034z;	 Catch:{ all -> 0x00e7 }
        r2 = r7.f3967I;	 Catch:{ all -> 0x00e7 }
        r2 = r2.f3944o;	 Catch:{ all -> 0x00e7 }
        r0.mo2668a(r1, r2);	 Catch:{ all -> 0x00e7 }
        r0 = 0;
        r7.f4028t = r0;	 Catch:{ all -> 0x00e7 }
    L_0x0093:
        r0 = r7.f4016h;	 Catch:{ all -> 0x00e7 }
        r0 = r0.f4060h;	 Catch:{ all -> 0x00e7 }
        if (r0 != 0) goto L_0x00e2;
    L_0x0099:
        r0 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1347r();	 Catch:{ all -> 0x00e7 }
        r1 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1333d();	 Catch:{ all -> 0x00e7 }
        r2 = r7.f4033y;	 Catch:{ all -> 0x00e7 }
        if (r2 != 0) goto L_0x00f0;
    L_0x00a5:
        r2 = r7.f4016h;	 Catch:{ all -> 0x00e7 }
        r2 = r2.f4059g;	 Catch:{ all -> 0x00e7 }
        if (r2 != 0) goto L_0x00f0;
    L_0x00ab:
        if (r0 == 0) goto L_0x00f0;
    L_0x00ad:
        if (r1 != 0) goto L_0x00f0;
    L_0x00af:
        r2 = r7.f3967I;	 Catch:{ all -> 0x00e7 }
        r3 = r2.f3951v;	 Catch:{ all -> 0x00e7 }
        if (r3 == 0) goto L_0x00f0;
    L_0x00b5:
        r0 = 1;
        r7.f4033y = r0;	 Catch:{ all -> 0x00e7 }
        r0 = r2.f3932c;	 Catch:{ all -> 0x00e7 }
        r1 = new ekj;	 Catch:{ all -> 0x00e7 }
        r1.<init>(r7);	 Catch:{ all -> 0x00e7 }
        r2 = r0.f3865e;	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x00ea;
    L_0x00c3:
        r2 = r0.f3862b;	 Catch:{ all -> 0x00e7 }
        r2 = r2.mo28i();	 Catch:{ all -> 0x00e7 }
        r3 = p000.abc.AUTO;	 Catch:{ all -> 0x00e7 }
        r2.f151q = r3;	 Catch:{ all -> 0x00e7 }
        r3 = r0.f3862b;	 Catch:{ all -> 0x00e7 }
        r3.mo18a(r2);	 Catch:{ all -> 0x00e7 }
        r2 = r0.f3862b;	 Catch:{ all -> 0x00e7 }
        r0 = r0.f3861a;	 Catch:{ all -> 0x00e7 }
        r2.mo14a(r0, r1);	 Catch:{ all -> 0x00e7 }
    L_0x00d9:
        r0 = r7.f4030v;	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x00e2;
    L_0x00dd:
        r0 = r7.f4016h;	 Catch:{ all -> 0x00e7 }
        r0.mo6288a();	 Catch:{ all -> 0x00e7 }
    L_0x00e2:
        r0 = 0;
        r7.f3961C = r0;	 Catch:{ all -> 0x00e7 }
        goto L_0x000b;
    L_0x00e7:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x00ea:
        r0 = 1;
        r2 = 0;
        r1.mo11600a(r0, r2);	 Catch:{ all -> 0x00e7 }
        goto L_0x00d9;
    L_0x00f0:
        r2 = r7.f4016h;	 Catch:{ all -> 0x00e7 }
        r3 = r2.f4059g;	 Catch:{ all -> 0x00e7 }
        if (r3 == 0) goto L_0x00d9;
    L_0x00f6:
        if (r0 == 0) goto L_0x0100;
    L_0x00f8:
        if (r0 == 0) goto L_0x00fe;
    L_0x00fa:
        r0 = r7.f3993ah;	 Catch:{ all -> 0x00e7 }
        if (r0 != 0) goto L_0x0100;
    L_0x00fe:
        if (r1 == 0) goto L_0x00d9;
    L_0x0100:
        r2.mo6288a();	 Catch:{ all -> 0x00e7 }
        goto L_0x00d9;
    L_0x0104:
        r0 = r1.f4090c;	 Catch:{ all -> 0x00e7 }
        r1 = r7.f4011c;	 Catch:{ all -> 0x00e7 }
        r1 = r1.mo13157c(r0);	 Catch:{ all -> 0x00e7 }
        r2 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1317a(r0);	 Catch:{ all -> 0x00e7 }
        r3 = r7.f4011c;	 Catch:{ all -> 0x00e7 }
        r3 = r3.f17500f;	 Catch:{ all -> 0x00e7 }
        r3 = r3.size();	 Catch:{ all -> 0x00e7 }
        r3 = r3 + -1;
        r4 = r7.f3967I;	 Catch:{ all -> 0x00e7 }
        r5 = r4.f3949t;	 Catch:{ all -> 0x00e7 }
        if (r5 != 0) goto L_0x0154;
    L_0x0120:
        r5 = r4.f3951v;	 Catch:{ all -> 0x00e7 }
        if (r5 == 0) goto L_0x0154;
    L_0x0124:
        r5 = r4.f3921H;	 Catch:{ all -> 0x00e7 }
        r5.add(r2);	 Catch:{ all -> 0x00e7 }
        r2 = 1;
        r4.f3949t = r2;	 Catch:{ all -> 0x00e7 }
        r2 = new eka;	 Catch:{ all -> 0x00e7 }
        r2.<init>(r4);	 Catch:{ all -> 0x00e7 }
        r5 = 0;
        r5 = new java.lang.Void[r5];	 Catch:{ all -> 0x00e7 }
        r2.execute(r5);	 Catch:{ all -> 0x00e7 }
        r2 = r4.f3920G;	 Catch:{ all -> 0x00e7 }
        r2.add(r0);	 Catch:{ all -> 0x00e7 }
        r0 = r4.f3943n;	 Catch:{ all -> 0x00e7 }
        r2 = r3 + 1;
        r5 = r0.size();	 Catch:{ all -> 0x00e7 }
        r2 = java.lang.Math.max(r2, r5);	 Catch:{ all -> 0x00e7 }
        r0.setSize(r2);	 Catch:{ all -> 0x00e7 }
        r0 = r4.f3943n;	 Catch:{ all -> 0x00e7 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x00e7 }
        r0.set(r3, r1);	 Catch:{ all -> 0x00e7 }
    L_0x0154:
        r0 = r7.f4011c;	 Catch:{ all -> 0x00e7 }
        r1 = 0;
        r0.mo13156a(r3, r1);	 Catch:{ all -> 0x00e7 }
        r0 = r7.f3994ai;	 Catch:{ all -> 0x00e7 }
        r1 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00e7 }
        r0.add(r1);	 Catch:{ all -> 0x00e7 }
        r0 = 1;
        r7.f4027s = r0;	 Catch:{ all -> 0x00e7 }
        r7.m1881c();	 Catch:{ all -> 0x00e7 }
        r0 = 0;
        r7.f4024p = r0;	 Catch:{ all -> 0x00e7 }
        r0 = r7.f4013e;	 Catch:{ all -> 0x00e7 }
        r0.mo2666a();	 Catch:{ all -> 0x00e7 }
        r0 = 0;
        r7.f4002aq = r0;	 Catch:{ all -> 0x00e7 }
        r0 = 0;
        r7.f4000ao = r0;	 Catch:{ all -> 0x00e7 }
        goto L_0x005b;
    L_0x0179:
        r0 = r1;
        goto L_0x0033;
    L_0x017c:
        r2 = r1;
        goto L_0x0020;
    L_0x017f:
        r2 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: eki.a(boolean):void");
    }

    /* renamed from: a */
    public final void mo6278a() {
        mo6279a(this.f3979U / this.f3978T);
    }

    /* renamed from: c */
    private final float m1880c(float f) {
        int i = this.f3987ab;
        if (i >= this.f3988ac) {
            return f;
        }
        double tan = Math.tan(Math.toRadians((double) f) / 2.0d);
        double d = ((double) i) / (tan + tan);
        d = Math.atan(((double) this.f3988ac) / (d + d));
        return (float) Math.toDegrees(d + d);
    }

    /* renamed from: a */
    private static float m1876a(float f, float f2) {
        return (float) (Math.atan(((double) f2) * Math.tan(((((double) f) * 0.5d) / 180.0d) * 3.141592653589793d)) * 114.59155902616465d);
    }

    /* renamed from: a */
    public final void mo6280a(int i) {
        int i2 = this.f4031w;
        this.f4031w = i;
        this.f4034z = false;
        this.f3959A = PhotoSphereMessageOverlay.f2566a;
        switch (i - 1) {
            case 0:
                this.f3959A = PhotoSphereMessageOverlay.f2566a;
                this.f4012d.mo6290a(0);
                break;
            case 1:
                this.f3959A = PhotoSphereMessageOverlay.f2567b;
                this.f4013e.mo2666a();
                this.f4012d.mo6290a(1);
                this.f3996ak = true;
                this.f3999an.mo6262b();
                break;
            case 2:
                this.f3959A = PhotoSphereMessageOverlay.f2567b;
                this.f4013e.mo2666a();
                this.f4012d.mo6290a(2);
                this.f3996ak = true;
                this.f3999an.mo6262b();
                break;
            case 3:
                this.f3959A = PhotoSphereMessageOverlay.f2567b;
                this.f4013e.mo2666a();
                this.f4012d.mo6290a(3);
                this.f3996ak = true;
                this.f3999an.mo6262b();
                break;
            case 4:
                this.f3959A = PhotoSphereMessageOverlay.f2566a;
                this.f4013e.mo2666a();
                this.f4012d.mo6290a(4);
                this.f3996ak = true;
                this.f3999an.mo6262b();
                break;
            case 5:
                this.f4013e.mo2668a(this.f4034z, this.f3967I.f3944o);
                this.f4034z = true;
                break;
        }
        this.f3997al = eki.m1879b(i2);
        this.f3998am = eki.m1879b(i);
    }

    /* renamed from: b */
    public final synchronized void mo6281b() {
        Vector vector;
        int size = this.f4011c.f17500f.size();
        eko eko = this.f4011c;
        synchronized (eko.f17500f) {
            if (eko.f17500f.size() > 0) {
                vector = eko.f17500f;
                vector.removeElementAt(vector.size() - 1);
            }
        }
        while (this.f4005at.size() > size) {
            vector = this.f4005at;
            vector.removeElementAt(vector.size() - 1);
        }
        if (this.f4005at.size() == size) {
            this.f4003ar -= ((Double) this.f4005at.lastElement()).doubleValue();
            this.f4004as = this.f4003ar / 45.0d;
            Vector vector2 = this.f4005at;
            vector2.removeElementAt(vector2.size() - 1);
        }
        m1881c();
        Thread ekk = new ekk(this);
        ekk.start();
        try {
            ekk.join();
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }

    /* renamed from: c */
    private final void m1881c() {
        this.f4011c.f17500f.size();
        this.f4011c.f17500f.size();
    }

    /* renamed from: b */
    public final void mo6282b(float f) {
        this.f3979U = this.f3978T / f;
        this.f3979U = Math.min(this.f3979U, (float) this.f3981W);
        this.f3979U = Math.max(this.f3979U, (float) this.f3982X);
        this.f3980V = m1880c(this.f3979U);
    }
}
