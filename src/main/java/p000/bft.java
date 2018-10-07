package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bft */
final class bft implements bfr, iop {
    /* renamed from: a */
    public static final String f22658a = bli.m887a("CdrRecSesImpl");
    /* renamed from: A */
    private long f22659A = 0;
    /* renamed from: B */
    private long f22660B = 0;
    /* renamed from: C */
    private long f22661C;
    /* renamed from: D */
    private final iqh f22662D;
    /* renamed from: b */
    public final bgk f22663b;
    /* renamed from: c */
    public final bhj f22664c;
    /* renamed from: d */
    public File f22665d;
    /* renamed from: e */
    public final bjn f22666e;
    /* renamed from: f */
    public final hke f22667f;
    /* renamed from: g */
    public final Object f22668g = new Object();
    /* renamed from: h */
    public final ikb f22669h = new ikb();
    /* renamed from: i */
    public final ArrayList f22670i = new ArrayList();
    /* renamed from: j */
    public bga f22671j = bga.RECORDING;
    /* renamed from: k */
    private final bfs f22672k;
    /* renamed from: l */
    private final inp f22673l;
    /* renamed from: m */
    private final ilp f22674m;
    /* renamed from: n */
    private final kbg f22675n;
    /* renamed from: o */
    private File f22676o = null;
    /* renamed from: p */
    private int f22677p = 1;
    /* renamed from: q */
    private final gtf f22678q;
    /* renamed from: r */
    private final Executor f22679r;
    /* renamed from: s */
    private final bji f22680s;
    /* renamed from: t */
    private final bjg f22681t;
    /* renamed from: u */
    private final kbg f22682u;
    /* renamed from: v */
    private final kbg f22683v;
    /* renamed from: w */
    private final bhs f22684w;
    /* renamed from: x */
    private final bhc f22685x;
    /* renamed from: y */
    private final long f22686y;
    /* renamed from: z */
    private long f22687z;

    public bft(bfs bfs, bgk bgk, inp inp, bhj bhj, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg, File file, Executor executor, gtf gtf, bjn bjn, bji bji, bjg bjg, hke hke, kbg kbg2, long j, bhc bhc, bib bib, kbg kbg3, bhs bhs) {
        this.f22672k = bfs;
        this.f22663b = bgk;
        this.f22673l = inp;
        this.f22664c = bhj;
        this.f22674m = ilp2;
        this.f22675n = kbg;
        this.f22665d = file;
        this.f22679r = executor;
        this.f22678q = gtf;
        this.f22666e = bjn;
        this.f22680s = bji;
        this.f22681t = bjg;
        this.f22667f = hke;
        this.f22682u = kbg2;
        this.f22686y = j;
        this.f22687z = j;
        this.f22659A = 0;
        this.f22683v = kbg3;
        this.f22684w = bhs;
        this.f22685x = bhc;
        this.f22662D = new iqh();
        this.f22669h.mo8557a(ilp.mo13672a(new bfv(this, bib), this.f22679r));
        this.f22669h.mo8557a(ilp3.mo13672a(new bfw(this, bib), this.f22679r));
        this.f22669h.mo8557a(bhc);
        this.f22669h.mo8557a(bib);
    }

    /* renamed from: a */
    final void mo14562a(File file, long j) {
        String str;
        String valueOf;
        boolean renameTo;
        File a = m15052a(System.currentTimeMillis());
        long b = m15053b(j);
        if (this.f22665d != null) {
            str = f22658a;
            valueOf = String.valueOf(this.f22665d);
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
        if (renameTo || this.f22683v.mo9709b()) {
            this.f22670i.add(0, new bgl(a, this.f22673l, this.f22682u, ((Boolean) this.f22674m.mo13673b()).booleanValue(), j, b, this.f22684w.f11401b));
            return;
        }
        str = f22658a;
        valueOf = String.valueOf(this.f22665d);
        String valueOf3 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf3).length());
        stringBuilder2.append("Failed to rename recording file to output file: ");
        stringBuilder2.append(valueOf);
        stringBuilder2.append(" => ");
        stringBuilder2.append(valueOf3);
        bli.m891b(str, stringBuilder2.toString());
    }

    /* renamed from: a */
    private final File m15052a(long j) {
        ixx ixx = this.f22673l.mo8648f().f7516c;
        return this.f22678q.mo7436a(this.f22678q.mo7439b(j), ixx);
    }

    /* renamed from: b */
    private final long m15053b(long j) {
        return (j - this.f22687z) - this.f22660B;
    }

    /* renamed from: a */
    public final long mo12368a() {
        return this.f22659A;
    }

    /* renamed from: b */
    public final long mo12369b() {
        return this.f22686y;
    }

    /* renamed from: g */
    public final int mo12370g() {
        return this.f22677p;
    }

    /* renamed from: c */
    public final void mo8684c() {
        this.f22672k.mo1938a();
    }

    /* renamed from: d */
    public final void mo8685d() {
        synchronized (this.f22668g) {
            bli.m888a(f22658a, "Max file size approaching.");
            if (this.f22671j == bga.STOPPING_RECORD) {
                bli.m888a(f22658a, "Ignoring max file size approaching signal because recording is stopping");
            } else if (this.f22683v.mo9709b()) {
            } else {
                this.f22676o = m15052a(System.currentTimeMillis());
                this.f22681t.mo1982a(this.f22676o);
            }
        }
    }

    /* renamed from: e */
    public final void mo8686e() {
        this.f22672k.mo1939b();
    }

    /* renamed from: f */
    public final void mo8687f() {
        synchronized (this.f22668g) {
            bli.m888a(f22658a, "Next output file started");
            this.f22677p++;
            long currentTimeMillis = System.currentTimeMillis();
            mo14562a(this.f22665d, currentTimeMillis);
            this.f22665d = this.f22676o;
            this.f22676o = null;
            this.f22687z = currentTimeMillis;
            this.f22660B = 0;
        }
    }

    /* renamed from: a */
    public final void mo8683a(long j, long j2) {
        float a = this.f22662D.mo8769a(new iqi(j, (float) j2));
        String str = f22658a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Bitrate at ");
        stringBuilder.append(j);
        stringBuilder.append(" = ");
        stringBuilder.append(a);
        bli.m888a(str, stringBuilder.toString());
    }

    /* renamed from: h */
    public final void mo12371h() {
        synchronized (this.f22668g) {
            this.f22671j = bga.PAUSED;
            this.f22680s.mo1983a();
            this.f22661C = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public final void mo12372i() {
        synchronized (this.f22668g) {
            this.f22671j = bga.RECORDING;
            this.f22680s.mo1984b();
            m15054m();
        }
    }

    /* renamed from: j */
    public final kpk mo12373j() {
        return mo14561a(true);
    }

    /* renamed from: a */
    final kpk mo14561a(boolean z) {
        kpk d;
        boolean z2 = true;
        synchronized (this.f22668g) {
            if (this.f22671j.equals(bga.RECORDING) || this.f22671j.equals(bga.PAUSED)) {
                if (!(this.f22671j.equals(bga.RECORDING) || this.f22671j.equals(bga.PAUSED))) {
                    z2 = false;
                }
                jri.m13395a(z2);
                if (this.f22671j.equals(bga.PAUSED)) {
                    m15054m();
                }
                this.f22671j = bga.STOPPING_RECORD;
                d = kpw.m18486d();
                long b = m15053b(System.currentTimeMillis());
                if (z || b > 1000) {
                    d.mo15644b(this.f22666e.mo1985a(this.f22664c, z ^ 1));
                } else {
                    Object bbv = new bbv("CdrRecSession", 1000 - ((int) b));
                    this.f22669h.mo8557a(bbv);
                    bbv.execute(new bfu(this, d, z));
                }
                d = kny.m18476a(d, new bfz(this), this.f22679r);
            } else {
                String valueOf = String.valueOf(this.f22671j);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                d = kow.m13874a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return d;
    }

    /* renamed from: k */
    public final kpk mo12374k() {
        kpk a = mo14561a(false);
        kpk d = kpw.m18486d();
        kow.m13878a(a, new bfx(this, d), kpq.f8776a);
        return iel.m3775a(d, a, new bfy());
    }

    /* renamed from: l */
    public final bjv mo12375l() {
        if (this.f22675n.mo9709b()) {
            return ((bjw) this.f22675n.mo9706a()).mo12388a(this.f22664c);
        }
        return new bjv(new bdx("snapshot taker doesn't exist."));
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        aub a;
        synchronized (this.f22668g) {
            if (this.f22671j == bga.RECORDING || this.f22671j == bga.PAUSED) {
                a = this.f22685x.mo12376a(asw);
            } else {
                String str = f22658a;
                String valueOf = String.valueOf(this.f22671j);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("Ignore triggerFocusAndMeterAtPoint: state=");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                a = new atl();
            }
        }
        return a;
    }

    /* renamed from: m */
    private final void m15054m() {
        long currentTimeMillis = System.currentTimeMillis() - this.f22661C;
        this.f22659A += currentTimeMillis;
        this.f22660B = currentTimeMillis + this.f22660B;
    }
}
