package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gkt */
public abstract class gkt implements gkr {
    /* renamed from: A */
    public kpw f24380A = kpw.m18486d();
    /* renamed from: B */
    public boolean f24381B = false;
    /* renamed from: C */
    public int f24382C = 0;
    /* renamed from: D */
    public int f24383D = 0;
    /* renamed from: E */
    public gft f24384E;
    /* renamed from: a */
    private bls f24385a;
    /* renamed from: b */
    private final gsi f24386b;
    /* renamed from: c */
    private final gtf f24387c;
    /* renamed from: d */
    private final hju f24388d;
    /* renamed from: e */
    private final gev f24389e;
    /* renamed from: f */
    private final ird f24390f;
    /* renamed from: h */
    public final glv f24391h;
    /* renamed from: i */
    public String f24392i;
    /* renamed from: j */
    public final bcv f24393j;
    /* renamed from: k */
    public glw f24394k;
    /* renamed from: l */
    public hec f24395l = hci.m11977a();
    /* renamed from: m */
    public int f24396m = -1;
    /* renamed from: n */
    public gmq f24397n;
    /* renamed from: o */
    public final eqa f24398o;
    /* renamed from: p */
    public final Executor f24399p;
    /* renamed from: q */
    public final gsp f24400q;
    /* renamed from: r */
    public final gnh f24401r;
    /* renamed from: s */
    public final Uri f24402s;
    /* renamed from: t */
    public final glt f24403t;
    /* renamed from: u */
    public final gmp f24404u;
    /* renamed from: v */
    public kbg f24405v;
    /* renamed from: w */
    public long f24406w;
    /* renamed from: x */
    public final grg f24407x;
    /* renamed from: y */
    public gew f24408y;
    /* renamed from: z */
    public volatile kpk f24409z;

    gkt(Executor executor, gmp gmp, glt glt, eqa eqa, gsi gsi, gtf gtf, gsp gsp, grg grg, bcv bcv, ird ird, bls bls, gnh gnh, String str, kbg kbg, long j, hju hju, gev gev, glv glv) {
        this.f24399p = executor;
        this.f24401r = gnh;
        this.f24398o = eqa;
        this.f24386b = gsi;
        this.f24387c = gtf;
        this.f24400q = gsp;
        this.f24403t = glt;
        this.f24404u = gmp;
        this.f24392i = str;
        this.f24405v = kbg;
        this.f24406w = j;
        this.f24388d = hju;
        this.f24407x = grg;
        this.f24393j = bcv;
        this.f24390f = ird;
        this.f24385a = bls;
        this.f24389e = gev;
        this.f24391h = glv;
        this.f24402s = gsp.mo7401a();
    }

    /* renamed from: s */
    abstract String mo14924s();

    /* renamed from: a */
    public final void mo13369a(glm glm) {
        this.f24403t.mo13388a(glm);
    }

    /* renamed from: a */
    public void mo13367a(bnl bnl) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo13373b() {
        this.f24403t.onCaptureStartCommitted(this.f24382C, this.f24383D);
    }

    /* renamed from: w */
    final synchronized void mo14925w() {
        if (this.f24409z != null) {
            iel.m3776a(this.f24409z, new gle(this), this.f24399p);
        } else {
            mo14922b("Tried to delete but the future is null");
        }
    }

    /* renamed from: a */
    public void mo13368a(gft gft) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo13379g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: x */
    final gsi mo14926x() {
        return (gsi) jri.m13404b(this.f24386b);
    }

    /* renamed from: h */
    public final grg mo7077h() {
        return this.f24407x;
    }

    /* renamed from: y */
    final gtf mo14927y() {
        return (gtf) jri.m13404b(this.f24387c);
    }

    /* renamed from: z */
    final hju mo14928z() {
        return (hju) jri.m13404b(this.f24388d);
    }

    /* renamed from: A */
    final gev mo14909A() {
        return (gev) jri.m13404b(this.f24389e);
    }

    /* renamed from: i */
    public final int mo13380i() {
        return this.f24396m;
    }

    /* renamed from: j */
    public final hec mo13381j() {
        return this.f24395l;
    }

    /* renamed from: k */
    public glw mo13382k() {
        return this.f24394k;
    }

    /* renamed from: B */
    final bls mo14910B() {
        return (bls) jri.m13404b(this.f24385a);
    }

    /* renamed from: l */
    public final long mo13383l() {
        return this.f24406w;
    }

    /* renamed from: m */
    public goe mo13384m() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public final String mo13385n() {
        return this.f24392i;
    }

    /* renamed from: C */
    final ird mo14911C() {
        return (ird) jri.m13404b(this.f24390f);
    }

    /* renamed from: o */
    public final Uri mo13386o() {
        return this.f24402s;
    }

    /* renamed from: D */
    final kpk mo14912D() {
        jri.m13404b(this.f24409z);
        return kny.m18476a(this.f24409z, gkw.f19274a, this.f24399p);
    }

    /* renamed from: E */
    final synchronized void mo14913E() {
        if (this.f24409z == null) {
            this.f24409z = this.f24398o.mo6493a(this.f24406w, this.f24392i, this.f24394k, this.f24380A, ixx.JPEG);
        }
    }

    /* renamed from: a */
    final void mo14919a(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String s = mo14924s();
        String str2 = this.f24392i;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str2).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str2);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m894c(s, stringBuilder.toString());
        bls bls = this.f24385a;
        if (bls != null) {
            bls.mo2013a(this.f24392i, str);
        }
    }

    /* renamed from: b */
    final void mo14922b(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String s = mo14924s();
        String str2 = this.f24392i;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str2).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str2);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m898e(s, stringBuilder.toString());
    }

    /* renamed from: b */
    final synchronized void mo14920b(Bitmap bitmap, int i) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new gla(this, bitmap, i), this.f24399p);
        }
    }

    /* renamed from: a */
    final synchronized void mo14914a(Uri uri) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new gkx(this, uri), this.f24399p);
        }
    }

    /* renamed from: b */
    final synchronized void mo14921b(Uri uri) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new glb(this, uri), this.f24399p);
        }
    }

    /* renamed from: a */
    public final synchronized void mo14918a(Uri uri, List list) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new gld(this, uri, list), this.f24399p);
        }
    }

    /* renamed from: a */
    final synchronized void mo14917a(Uri uri, hec hec, boolean z) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new glc(this, uri, hec, z), this.f24399p);
        }
    }

    /* renamed from: c */
    final synchronized void mo14923c(Uri uri) {
        this.f24401r.mo7253c(uri);
    }

    /* renamed from: a */
    private final synchronized void m16062a(Uri uri, int i) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new gky(this, uri, i), this.f24399p);
        }
    }

    /* renamed from: a */
    private final synchronized void m16063a(Uri uri, hec hec) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new gkz(this, uri, hec), this.f24399p);
        }
    }

    /* renamed from: a */
    final synchronized void mo14915a(Uri uri, glw glw) {
        if (this.f24409z != null) {
            kny.m18476a(this.f24409z, new gkv(this, uri, glw), this.f24399p);
        }
    }

    /* renamed from: a */
    final synchronized void mo14916a(Uri uri, glw glw, eqi eqi) {
        if (this.f24409z != null) {
            this.f24409z.mo10200a(new gku(this, uri, glw, eqi), this.f24399p);
        }
    }

    /* renamed from: a */
    public final void mo13361a(int i) {
        if (this.f24382C == 0) {
            this.f24382C = i;
        }
        this.f24383D = i;
    }

    /* renamed from: a */
    public void mo13364a(Location location) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final synchronized void mo13374b(int i) {
        if (!this.f24391h.mo7218b()) {
            String toHexString = Integer.toHexString(hashCode());
            String s = mo14924s();
            String str = this.f24392i;
            int length = String.valueOf(toHexString).length();
            String str2 = "Ignoring setProgress. CaptureSession is not started.";
            StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str).length()) + String.valueOf(str2).length());
            stringBuilder.append("[");
            stringBuilder.append(toHexString);
            stringBuilder.append("|");
            stringBuilder.append(str);
            stringBuilder.append("] ");
            stringBuilder.append(str2);
            bli.m891b(s, stringBuilder.toString());
        } else if (i != 0) {
            int i2;
            boolean z = this.f24381B;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f24381B = i2 | z;
            this.f24396m = i;
            m16062a(this.f24402s, this.f24396m);
            gew gew = this.f24408y;
            if (gew != null) {
                gew.mo7089a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo7075a(gew gew) {
        if (!hci.m11982a(this.f24395l)) {
            gew.mo7090a(this.f24395l);
        }
        gew.mo7089a(this.f24396m);
        this.f24408y = gew;
    }

    /* renamed from: a */
    public final synchronized void mo13370a(hec hec) {
        mo14919a("setProgressMessage");
        if (this.f24391h.mo7218b()) {
            this.f24395l = hec;
            if (!hci.m11982a(hec) && this.f24396m < 0) {
                this.f24396m = 0;
            }
            m16063a(this.f24402s, hec);
            gew gew = this.f24408y;
            if (gew != null) {
                gew.mo7090a(hec);
            }
        } else {
            mo14922b("Ignoring setProgressMessage. CaptureSession is not started.");
        }
    }

    /* renamed from: a */
    public final void mo13366a(anq anq, hec hec, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo13372a(byte[] bArr, hec hec, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public void mo13387p() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo13365a(anq anq) {
        throw new UnsupportedOperationException();
    }
}
