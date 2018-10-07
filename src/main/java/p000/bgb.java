package p000;

import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bgb */
final class bgb implements bfr, iop {
    /* renamed from: a */
    public static final String f22688a = bli.m887a("CdrRecSesImpl2");
    /* renamed from: b */
    public final bgk f22689b;
    /* renamed from: c */
    public File f22690c;
    /* renamed from: d */
    public final Object f22691d = new Object();
    /* renamed from: e */
    public final ikb f22692e = new ikb();
    /* renamed from: f */
    public final ArrayList f22693f = new ArrayList();
    /* renamed from: g */
    public bgj f22694g = bgj.RECORDING;
    /* renamed from: h */
    private final bfs f22695h;
    /* renamed from: i */
    private final inp f22696i;
    /* renamed from: j */
    private final bhj f22697j;
    /* renamed from: k */
    private final ilp f22698k;
    /* renamed from: l */
    private final kbg f22699l;
    /* renamed from: m */
    private File f22700m = null;
    /* renamed from: n */
    private int f22701n = 1;
    /* renamed from: o */
    private final gtf f22702o;
    /* renamed from: p */
    private final Executor f22703p;
    /* renamed from: q */
    private final kbg f22704q;
    /* renamed from: r */
    private final kbg f22705r;
    /* renamed from: s */
    private final bhs f22706s;
    /* renamed from: t */
    private final bhc f22707t;
    /* renamed from: u */
    private final ios f22708u;
    /* renamed from: v */
    private final long f22709v;
    /* renamed from: w */
    private long f22710w;
    /* renamed from: x */
    private long f22711x = 0;
    /* renamed from: y */
    private long f22712y = 0;
    /* renamed from: z */
    private long f22713z;

    public bgb(bfs bfs, bgk bgk, inp inp, bhj bhj, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg, File file, Executor executor, gtf gtf, ios ios, hke hke, kbg kbg2, long j, bhc bhc, bib bib, kbg kbg3, bhs bhs) {
        this.f22695h = bfs;
        this.f22689b = bgk;
        this.f22696i = inp;
        this.f22697j = bhj;
        this.f22698k = ilp2;
        this.f22699l = kbg;
        this.f22690c = file;
        this.f22703p = executor;
        this.f22702o = gtf;
        this.f22704q = kbg2;
        this.f22709v = j;
        this.f22710w = j;
        this.f22711x = 0;
        this.f22705r = kbg3;
        this.f22706s = bhs;
        this.f22708u = ios;
        this.f22707t = bhc;
        this.f22692e.mo8557a(ilp.mo13672a(new bgd(this, bib), this.f22703p));
        this.f22692e.mo8557a(ilp3.mo13672a(new bge(this, bib), this.f22703p));
        this.f22692e.mo8557a(bhc);
        this.f22692e.mo8557a(bib);
        if (inp.mo8643a() == inc.FPS_AUTO) {
            bje bje = new bje();
            iqo bjd = new bjd(ios);
            iqo a = this.f22706s.mo12380a(new bgf(bjd));
            this.f22692e.mo8557a(bjd);
            this.f22692e.mo8557a(a);
        }
    }

    /* renamed from: a */
    final void mo14563a(File file, long j) {
        String str;
        String valueOf;
        boolean renameTo;
        File a = m15071a(System.currentTimeMillis());
        long j2 = (j - this.f22710w) - this.f22712y;
        if (this.f22690c != null) {
            str = f22688a;
            valueOf = String.valueOf(this.f22690c);
            String valueOf2 = String.valueOf(a);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 42) + String.valueOf(valueOf2).length());
            stringBuilder.append("Rename recording file to output file: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" => ");
            stringBuilder.append(valueOf2);
            bli.m894c(str, stringBuilder.toString());
            renameTo = file.renameTo(a);
        } else {
            renameTo = false;
        }
        if (renameTo || this.f22705r.mo9709b()) {
            this.f22693f.add(0, new bgl(a, this.f22696i, this.f22704q, ((Boolean) this.f22698k.mo13673b()).booleanValue(), j, j2, this.f22706s.f11401b));
            return;
        }
        str = f22688a;
        valueOf = String.valueOf(this.f22690c);
        String valueOf3 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf3).length());
        stringBuilder2.append("Failed to rename recording file to output file: ");
        stringBuilder2.append(valueOf);
        stringBuilder2.append(" => ");
        stringBuilder2.append(valueOf3);
        bli.m891b(str, stringBuilder2.toString());
    }

    /* renamed from: a */
    private final File m15071a(long j) {
        ixx ixx = this.f22696i.mo8648f().f7516c;
        return this.f22702o.mo7436a(this.f22702o.mo7439b(j), ixx);
    }

    /* renamed from: a */
    public final long mo12368a() {
        return this.f22711x;
    }

    /* renamed from: b */
    public final long mo12369b() {
        return this.f22709v;
    }

    /* renamed from: m */
    final /* synthetic */ Boolean mo14564m() {
        Throwable e;
        try {
            this.f22697j.mo12378a();
            return Boolean.valueOf(true);
        } catch (iwf e2) {
            e = e2;
        } catch (CameraAccessException e3) {
            e = e3;
        }
        bli.m892b(f22688a, "fail to close capture session.", e);
        return Boolean.valueOf(false);
    }

    /* renamed from: g */
    public final int mo12370g() {
        return this.f22701n;
    }

    /* renamed from: c */
    public final void mo8684c() {
        this.f22695h.mo1938a();
    }

    /* renamed from: d */
    public final void mo8685d() {
        synchronized (this.f22691d) {
            if (this.f22705r.mo9709b()) {
                return;
            }
            this.f22700m = m15071a(System.currentTimeMillis());
            ios ios = this.f22708u;
            File file = this.f22700m;
            synchronized (ios.f21139a) {
                if (ios.f21140b != ipr.STARTED) {
                    String valueOf = String.valueOf(ipr.STARTED);
                    String valueOf2 = String.valueOf(ios.f21140b);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" is expected but we get ");
                    stringBuilder.append(valueOf2);
                    Log.w("VideoRecorderImpl", stringBuilder.toString());
                } else {
                    ios.f21143e.mo13681a(file);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo8686e() {
        this.f22695h.mo1939b();
    }

    /* renamed from: f */
    public final void mo8687f() {
        synchronized (this.f22691d) {
            this.f22701n++;
            long currentTimeMillis = System.currentTimeMillis();
            mo14563a(this.f22690c, currentTimeMillis);
            this.f22690c = this.f22700m;
            this.f22700m = null;
            this.f22710w = currentTimeMillis;
            this.f22712y = 0;
        }
    }

    /* renamed from: a */
    public final void mo8683a(long j, long j2) {
    }

    /* renamed from: h */
    public final void mo12371h() {
        synchronized (this.f22691d) {
            this.f22694g = bgj.PAUSED;
            this.f22708u.mo13693c();
            this.f22713z = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public final void mo12372i() {
        synchronized (this.f22691d) {
            this.f22694g = bgj.RECORDING;
            this.f22708u.mo13694d();
            m15072o();
        }
    }

    /* renamed from: j */
    public final kpk mo12373j() {
        return mo14565n();
    }

    /* renamed from: n */
    final kpk mo14565n() {
        kpk a;
        boolean z = true;
        synchronized (this.f22691d) {
            if (this.f22694g.equals(bgj.RECORDING) || this.f22694g.equals(bgj.PAUSED)) {
                if (!(this.f22694g.equals(bgj.RECORDING) || this.f22694g.equals(bgj.PAUSED))) {
                    z = false;
                }
                jri.m13395a(z);
                if (this.f22694g.equals(bgj.PAUSED)) {
                    m15072o();
                }
                this.f22694g = bgj.STOPPING_RECORD;
                a = kny.m18476a(kny.m18475a(this.f22708u.mo13695e(), new bgc(this), kpq.f8776a), new bgi(this), this.f22703p);
            } else {
                String valueOf = String.valueOf(this.f22694g);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13874a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }

    /* renamed from: k */
    public final kpk mo12374k() {
        kpk n = mo14565n();
        return iel.m3775a(kny.m18476a(n, new bgg(this), kpq.f8776a), n, new bgh());
    }

    /* renamed from: l */
    public final bjv mo12375l() {
        if (this.f22699l.mo9709b()) {
            return ((bjw) this.f22699l.mo9706a()).mo12388a(this.f22697j);
        }
        return new bjv(new bdx("snapshot taker doesn't exist."));
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        aub a;
        synchronized (this.f22691d) {
            if (this.f22694g == bgj.RECORDING || this.f22694g == bgj.PAUSED) {
                a = this.f22707t.mo12376a(asw);
            } else {
                String str = f22688a;
                String valueOf = String.valueOf(this.f22694g);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("Ignore triggerFocusAndMeterAtPoint: state=");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                a = new atl();
            }
        }
        return a;
    }

    /* renamed from: o */
    private final void m15072o() {
        long currentTimeMillis = System.currentTimeMillis() - this.f22713z;
        this.f22711x += currentTimeMillis;
        this.f22712y = currentTimeMillis + this.f22712y;
    }
}
