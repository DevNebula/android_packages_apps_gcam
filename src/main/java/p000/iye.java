package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.Size;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: iye */
public final class iye implements iyc {
    /* renamed from: a */
    public static final float[] f21361a = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    /* renamed from: s */
    private static final float[] f21362s = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    /* renamed from: t */
    private static final float[] f21363t = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -0.9f, -1.0f, -0.9f, 1.0f, -0.9f, 1.0f, -1.0f};
    /* renamed from: u */
    private static final float[] f21364u = new float[]{-1.0f, 0.9f, 1.0f, 0.9f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.9f};
    /* renamed from: v */
    private static final float[] f21365v = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    /* renamed from: A */
    private final jfk f21366A;
    /* renamed from: B */
    private final kpk f21367B;
    /* renamed from: C */
    private final izs f21368C;
    /* renamed from: b */
    public final jdo f21369b;
    /* renamed from: c */
    public final jfk f21370c;
    /* renamed from: d */
    public final jeq f21371d;
    /* renamed from: e */
    public final jek f21372e;
    /* renamed from: f */
    public SurfaceTexture f21373f;
    /* renamed from: g */
    public final iyd f21374g;
    /* renamed from: h */
    public final ird f21375h;
    /* renamed from: i */
    public final jfh f21376i;
    /* renamed from: j */
    public final jdk f21377j;
    /* renamed from: k */
    public final jfh f21378k;
    /* renamed from: l */
    public final jdk f21379l;
    /* renamed from: m */
    public final Object f21380m = new Object();
    /* renamed from: n */
    public volatile kbg f21381n = kau.f21835a;
    /* renamed from: o */
    public volatile jfo f21382o;
    /* renamed from: p */
    public volatile iqm f21383p = iqm.CLOCKWISE_0;
    /* renamed from: q */
    public volatile ken f21384q = ken.m13719e();
    /* renamed from: r */
    public boolean f21385r = false;
    /* renamed from: w */
    private final Executor f21386w;
    /* renamed from: x */
    private final jeq f21387x;
    /* renamed from: y */
    private final jeq f21388y;
    /* renamed from: z */
    private final jfk f21389z;

    private iye(jdo jdo, ExecutorService executorService, jfk jfk, jeq jeq, jeq jeq2, jek jek, izv izv, jfh jfh, jdk jdk, jfh jfh2, jdk jdk2, iyd iyd, ird ird, boolean z) {
        this.f21369b = jdo;
        this.f21386w = executorService;
        this.f21372e = jek;
        this.f21376i = jfh;
        this.f21377j = jdk;
        this.f21378k = jfh2;
        this.f21379l = jdk2;
        this.f21387x = jeq;
        this.f21371d = jeq2;
        this.f21370c = jfk;
        this.f21374g = iyd;
        this.f21375h = ird;
        Object[] objArr = new izr[4];
        objArr[0] = jdk;
        objArr[1] = jdk2;
        objArr[2] = jdo;
        executorService.getClass();
        objArr[3] = new iyf(executorService);
        this.f21368C = ion.m4023c(khb.m4924a(objArr));
        OnFrameAvailableListener iyg = new iyg(this);
        kpk d = kpw.m18486d();
        jek.f26560a.execute(new iyi(this, jek, izv, iyg, d));
        this.f21367B = d;
        if (z) {
            boolean z2;
            this.f21388y = jeq.m18388a(jdo).mo9363a(jcc.m4458a(jff.m18396a(jdo, 35633, "attribute vec2 aPosition;\nvoid main() {\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"))).mo9363a(jcc.m4458a(jff.m18396a(jdo, 35632, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n    gl_FragColor = uColor;\n}"))).mo9362a();
            float[] fArr = f21363t;
            int length = fArr.length;
            if (((length & 1) ^ 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            jri.m13395a(z2);
            this.f21389z = jfk.m16588a(jdo, new jfm(length >> 1, jci.f8075i, fArr));
            fArr = f21364u;
            length = fArr.length;
            if (((length & 1) ^ 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            jri.m13395a(z2);
            this.f21366A = jfk.m16588a(jdo, new jfm(length >> 1, jci.f8075i, fArr));
            return;
        }
        this.f21388y = null;
        this.f21366A = null;
        this.f21389z = null;
    }

    public final void close() {
        synchronized (this.f21380m) {
            if (this.f21385r) {
                return;
            }
            this.f21385r = true;
            if (this.f21381n.mo9709b()) {
                ((jdk) this.f21381n.mo9706a()).close();
                this.f21381n = kau.f21835a;
            }
            kpk kpk = this.f21367B;
            if (kpk == null || kpk.isDone()) {
                ((Surface) this.f21367B.get()).release();
            } else {
                this.f21367B.cancel(true);
            }
            this.f21368C.close();
        }
    }

    /* renamed from: a */
    public static iye m12920a(Size size, iyd iyd, ird ird, boolean z) {
        boolean z2;
        int i;
        ird.mo8856a("VFEP.create");
        izv a = izu.m4426a(size.getWidth(), size.getHeight());
        Object newSingleThreadExecutor = Executors.newSingleThreadExecutor(iyj.f7921a);
        jdo a2 = jdx.m4480a(jdx.m4479a(newSingleThreadExecutor, new jdg(new jdd(izu.m4426a(1, 1))), jfj.f8124b));
        jek jek = new jek(a2, jdv.m18019a(a2, new jel(a2, new jdd(a))));
        jdc jdd = new jdd(a);
        ize a3 = jfh.m18397a(a2, jdd);
        jdk a4 = jdk.m18376a(jcc.m4458a(a3));
        ize a5 = jfh.m18397a(a2, jdd);
        jdk a6 = jdk.m18376a(jcc.m4458a(a5));
        jeq a7 = jeq.m18388a(a2).mo9363a(jcc.m4458a(jff.m18396a(a2, 35633, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"))).mo9363a(jcc.m4458a(jff.m18396a(a2, 35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(uImgTex, texCoord);\n}"))).mo9362a();
        jeq a8 = jeq.m18388a(a2).mo9363a(jcc.m4458a(jff.m18396a(a2, 35633, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"))).mo9363a(jcc.m4458a(jff.m18396a(a2, 35632, "precision mediump float;\nuniform sampler2D uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n    gl_FragColor = texture2D(uImgTex, texCoord);\n}"))).mo9362a();
        jfl[] jflArr = new jfl[2];
        float[] fArr = f21362s;
        int length = fArr.length;
        if (((length & 1) ^ 1) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        jri.m13395a(z2);
        jflArr[0] = new jfm(length >> 1, jci.f8075i, fArr);
        fArr = f21365v;
        length = fArr.length;
        if (((length & 1) ^ 1) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        jri.m13395a(z2);
        jflArr[1] = new jfm(length >> 1, jci.f8075i, fArr);
        length = jflArr[0].f8128a;
        jcg[] jcgArr = new jcg[2];
        int[] iArr = new int[2];
        int i2 = 0;
        for (i = 0; i < 2; i++) {
            jfl jfl = jflArr[i];
            int a9 = jfl.f8129b.mo9320a();
            int i3 = jfl.f8130c;
            i2 += (a9 * i3) * length;
            jcgArr[i] = jfl.f8129b;
            iArr[i] = i3;
        }
        ByteBuffer order = ByteBuffer.allocateDirect(i2 / 8).order(ByteOrder.nativeOrder());
        i = 0;
        while (true) {
            i2 = i;
            if (i2 < 2) {
                jfl jfl2 = jflArr[i2];
                for (i = 0; i < length; i++) {
                    jfl2.mo9381a(i, order);
                }
                i = i2 + 1;
            } else {
                order.rewind();
                iye iye = new iye(a2, newSingleThreadExecutor, new jfk(jdi.m18375a(a2, order), jcgArr, iArr, length), a7, a8, jek, a, a3, a4, a5, a6, iyd, ird, false);
                ird.mo8857b();
                return iye;
            }
        }
    }

    /* renamed from: a */
    final void mo13761a(jdk jdk) {
        jeq jeq = this.f21388y;
        if (jeq != null) {
            jdz a = jdz.m4482a((jfk) jqk.m13354c(this.f21366A)).mo9353a(jeq).mo9340a("uColor", 0.0f, 1.0f).mo9341a("aPosition", 0);
            a.f8102h = false;
            a.mo9343a(jdk);
            a = jdz.m4482a((jfk) jqk.m13354c(this.f21389z)).mo9353a(jeq).mo9340a("uColor", 1.0f, 0.0f).mo9341a("aPosition", 0);
            a.f8102h = false;
            a.mo9343a(jdk);
        }
    }

    /* renamed from: a */
    final void mo13762a(jek jek, float[] fArr, jdk jdk) {
        boolean z;
        jdz a = jdz.m4482a(this.f21370c).mo9353a(this.f21387x);
        if (jek.f26560a == a.f8098d.f26560a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        a.f8101g.put("uImgTex", jek);
        jdz a2 = a.mo9342a("uTransform", fArr).mo9341a("aPosition", 0).mo9341a("aTexCoord", 1);
        a2.f8102h = false;
        a2.mo9343a(jdk);
    }

    /* renamed from: a */
    public final kpk mo9171a() {
        kpk kpk;
        synchronized (this.f21380m) {
            jri.m13406b(this.f21385r ^ 1, (Object) "Tried to get input surface after ViewfinderEffectsPipeline is closed");
            kpk = this.f21367B;
        }
        return kpk;
    }

    /* renamed from: b */
    final int mo13763b() {
        int ordinal;
        synchronized (this.f21380m) {
            ordinal = this.f21383p.ordinal();
        }
        return ordinal;
    }

    /* renamed from: a */
    public final void mo9173a(iqm iqm) {
        synchronized (this.f21380m) {
            this.f21383p = iqm;
        }
    }

    /* renamed from: a */
    public final void mo9172a(Surface surface, Size size) {
        jri.m13391a((Object) surface, (Object) "Output surface cannot be null");
        jri.m13391a((Object) size, (Object) "Output size cannot be null");
        this.f21386w.execute(new iyk(this, surface, size));
    }

    /* renamed from: a */
    public final void mo9174a(List list) {
        this.f21384q = ken.m13713a((Collection) list);
    }
}
