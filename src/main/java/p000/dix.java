package p000;

import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dix */
public final class dix implements bfs, iqo {
    /* renamed from: a */
    public static final String f14082a = bli.m887a("CdrActiveCapSsn");
    /* renamed from: A */
    private final dju f14083A;
    /* renamed from: B */
    private final gxz f14084B;
    /* renamed from: C */
    private final eqa f14085C;
    /* renamed from: D */
    private final ikb f14086D = new ikb();
    /* renamed from: b */
    public final bdy f14087b;
    /* renamed from: c */
    public final Executor f14088c;
    /* renamed from: d */
    public final ikd f14089d;
    /* renamed from: e */
    public final gci f14090e;
    /* renamed from: f */
    public final hat f14091f;
    /* renamed from: g */
    public final cqx f14092g;
    /* renamed from: h */
    public final hkv f14093h;
    /* renamed from: i */
    public final djz f14094i;
    /* renamed from: j */
    public final dkd f14095j;
    /* renamed from: k */
    public final erk f14096k;
    /* renamed from: l */
    public final Object f14097l = new Object();
    /* renamed from: m */
    public final bcv f14098m;
    /* renamed from: n */
    public final hkw f14099n;
    /* renamed from: o */
    public boolean f14100o = false;
    /* renamed from: p */
    public final List f14101p = new ArrayList();
    /* renamed from: q */
    public hkk f14102q;
    /* renamed from: r */
    public hks f14103r;
    /* renamed from: s */
    public final gsp f14104s;
    /* renamed from: t */
    public djn f14105t = djn.NO_RECORDING;
    /* renamed from: u */
    public final gnh f14106u;
    /* renamed from: v */
    private final iut f14107v;
    /* renamed from: w */
    private final hfz f14108w;
    /* renamed from: x */
    private final Executor f14109x;
    /* renamed from: y */
    private final cqm f14110y;
    /* renamed from: z */
    private final djo f14111z;

    public dix(bdy bdy, Executor executor, iut iut, Executor executor2, hfz hfz, ikd ikd, gci gci, cqm cqm, hat hat, cqx cqx, djo djo, dju dju, hkv hkv, djz djz, dkd dkd, erk erk, gxz gxz, eqa eqa, gsp gsp, bcv bcv, ast ast, hks hks, gnh gnh) {
        this.f14087b = (bdy) this.f14086D.mo8557a(bdy);
        this.f14088c = executor;
        this.f14107v = iut;
        this.f14109x = executor2;
        this.f14108w = hfz;
        this.f14089d = ikd;
        this.f14090e = gci;
        this.f14110y = cqm;
        this.f14091f = hat;
        this.f14092g = cqx;
        this.f14111z = djo;
        this.f14083A = dju;
        this.f14093h = hkv;
        this.f14094i = djz;
        this.f14095j = dkd;
        this.f14096k = erk;
        this.f14084B = gxz;
        this.f14085C = eqa;
        this.f14104s = gsp;
        this.f14098m = bcv;
        this.f14103r = hks;
        this.f14106u = gnh;
        this.f14099n = new hkw(this);
        this.f14086D.mo8557a(ast);
    }

    public final void close() {
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        bli.m896d(f14082a, "close");
        synchronized (this.f14097l) {
            if (this.f14105t == djn.CLOSED) {
                bli.m891b(f14082a, "ActiveCamcorderCaptureSession has been closed.");
                return;
            }
            bli.m888a(f14082a, "close");
            if (this.f14105t == djn.RECORDING || this.f14105t == djn.STARTING_RECORDING) {
                this.f14089d.execute(new diy(this));
            }
            if (this.f14105t == djn.RECORDING) {
                jri.m13404b(this.f14102q);
                kpk a = this.f14102q.mo7921a(true);
                this.f14102q = null;
                try {
                    hku hku = (hku) a.get();
                    mo13034b(hku);
                    this.f14109x.execute(new djc(this, hku));
                } catch (InterruptedException e2) {
                    e = e2;
                    str = f14082a;
                    valueOf = String.valueOf(e);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("failed to close current recording: ");
                    stringBuilder.append(valueOf);
                    bli.m891b(str, stringBuilder.toString());
                    mo13039g();
                    this.f14089d.execute(new diz(this));
                    this.f14105t = djn.CLOSED;
                    this.f14086D.close();
                } catch (ExecutionException e3) {
                    e = e3;
                    str = f14082a;
                    valueOf = String.valueOf(e);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("failed to close current recording: ");
                    stringBuilder.append(valueOf);
                    bli.m891b(str, stringBuilder.toString());
                    mo13039g();
                    this.f14089d.execute(new diz(this));
                    this.f14105t = djn.CLOSED;
                    this.f14086D.close();
                }
            }
            if (this.f14105t == djn.RECORDING || this.f14105t == djn.STARTING_RECORDING || this.f14105t == djn.STOPPING_RECORDING) {
                mo13039g();
                this.f14089d.execute(new diz(this));
            }
            this.f14105t = djn.CLOSED;
            this.f14086D.close();
        }
    }

    /* renamed from: a */
    final synchronized void mo13033a(hku hku) {
        synchronized (hku.f6680b) {
            List list = hku.f6680b;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                bju bju = (bju) listIterator.previous();
                dju dju = this.f14083A;
                dju.f3313a.mo8898a(bju.f1242b.getName(), this.f14107v, bju.f1241a, bju.f1247g, bju.f1246f, (float) (bju.f1250j / 1000));
                djo djo = this.f14111z;
                epy epy = new epy(djo.f3310b);
                epy.f4296a = bju.f1242b;
                epy.f4297b = bju.f1243c;
                epy = epy.mo6488a(bju.f1244d);
                epy.f4298c = iqm.m4095a(bju.f1248h);
                kbg b = kbg.m4803b(djo.f3309a.insert(Media.EXTERNAL_CONTENT_URI, epy.mo6487a(bju.f1245e).mo6486a(bju.f1249i).mo6489a(bju.f1242b.getName()).mo6485a().f4295a));
                if (b.mo9709b()) {
                    this.f14108w.mo7825a(this.f14110y.mo12891a((Uri) b.mo9706a()), true);
                } else {
                    String str = f14082a;
                    String valueOf = String.valueOf(bju);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    stringBuilder.append("Could not insert video snapshot ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" into MediaStore");
                    bli.m891b(str, stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: c */
    final djm mo13035c() {
        Object d = kpw.m18486d();
        Uri a = this.f14104s.mo7401a();
        eqi b = this.f14085C.mo6494b(System.currentTimeMillis(), a.getLastPathSegment(), glw.VIDEO, d, this.f14087b.mo12358a().mo8648f().f7516c);
        this.f14106u.mo7246a(a, glw.VIDEO, b);
        return new dhr(a, b, d);
    }

    /* renamed from: b */
    final void mo13034b(hku hku) {
        if (!hku.f6679a.isEmpty()) {
            int i;
            int size = hku.f6679a.size() - this.f14101p.size();
            if (size > 0) {
                for (i = 0; i < size; i++) {
                    this.f14101p.add(mo13035c());
                }
            }
            Iterator it = hku.f6679a.iterator();
            i = 0;
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    break;
                }
                bgl bgl = (bgl) it.next();
                djm djm = (djm) this.f14101p.get(i2);
                String str = f14082a;
                String valueOf = String.valueOf(bgl);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                stringBuilder.append("recordingDidSucceed: videoFile=");
                stringBuilder.append(valueOf);
                bli.m894c(str, stringBuilder.toString());
                dju dju = this.f14083A;
                dju.f3313a.mo8904a(false, bgl.f1161a.getName(), this.f14107v, bgl.f1162b.mo8649g().mo8639c(), bgl.f1165e, bgl.f1161a.length(), (float) bgl.mo1942a(), bgl.f1164d, dju.f3314b.mo5998a(), dju.f3314b.mo6001b(), bgl.f1167g);
                djm.mo5988b().mo15641a(new eqr(bgl));
                jri.m13404b(djm.mo5987a());
                kow.m13878a(djm.mo5987a().mo6496a(), new djl(this, djm), kpq.f8776a);
                i = i2 + 1;
            }
        }
        this.f14101p.clear();
    }

    /* renamed from: a */
    public final void mo1938a() {
        kow.m13878a(mo13040h(), new dje(this), this.f14089d);
    }

    /* renamed from: b */
    public final void mo1939b() {
        kow.m13878a(mo13040h(), new djf(this), this.f14089d);
    }

    /* renamed from: d */
    public final boolean mo13036d() {
        ikd.m12501a();
        synchronized (this.f14097l) {
            hkk hkk = this.f14102q;
            if (hkk != null) {
                boolean a = hkk.mo7922a();
                return a;
            }
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo13037e() {
        ikd.m12501a();
        synchronized (this.f14097l) {
            hkk hkk = this.f14102q;
            if (hkk != null) {
                boolean b = hkk.mo7923b();
                return b;
            }
            return false;
        }
    }

    /* renamed from: f */
    final void mo13038f() {
        this.f14090e.mo7042g();
        this.f14094i.mo13043b();
        this.f14091f.mo7618c();
        this.f14093h.f6687g.mo13122c(true);
    }

    /* renamed from: g */
    final void mo13039g() {
        this.f14095j.mo6008d();
        this.f14095j.mo6007c();
    }

    /* renamed from: h */
    final kpk mo13040h() {
        kpk d;
        boolean z = true;
        synchronized (this.f14097l) {
            if (this.f14105t != djn.RECORDING) {
                z = false;
            }
            jri.m13405b(z);
            this.f14105t = djn.STOPPING_RECORDING;
            this.f14093h.mo7933c(true);
            jri.m13404b(this.f14102q);
            d = kpw.m18486d();
            this.f14109x.execute(new dja(this, this.f14102q.f6657b.mo12370g(), d));
            kpk a = this.f14102q.mo7921a(false);
            this.f14102q = null;
            d = kny.m18475a(iel.m3774a(d, a, new dji(this), this.f14089d), new djj(this), this.f14109x);
            kow.m13878a(d, new djk(this), this.f14089d);
        }
        return d;
    }
}
