package p000;

import android.view.Surface;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bea */
final class bea implements bdy, bgk, iop {
    /* renamed from: a */
    public static final String f22577a = bli.m887a("CdrCptrSesMediaR");
    /* renamed from: A */
    private final ilp f22578A;
    /* renamed from: B */
    private final fiw f22579B;
    /* renamed from: C */
    private kpk f22580C = kow.m13873a(null);
    /* renamed from: D */
    private kpk f22581D;
    /* renamed from: E */
    private final ikb f22582E = new ikb();
    /* renamed from: b */
    public final bhe f22583b;
    /* renamed from: c */
    public final inp f22584c;
    /* renamed from: d */
    public final bhl f22585d;
    /* renamed from: e */
    public final Executor f22586e;
    /* renamed from: f */
    public final gtf f22587f;
    /* renamed from: g */
    public final bjk f22588g;
    /* renamed from: h */
    public final bjn f22589h;
    /* renamed from: i */
    public final bjg f22590i;
    /* renamed from: j */
    public final bji f22591j;
    /* renamed from: k */
    public final ilp f22592k;
    /* renamed from: l */
    public final ilp f22593l;
    /* renamed from: m */
    public final ilp f22594m;
    /* renamed from: n */
    public final kbg f22595n;
    /* renamed from: o */
    public final bhy f22596o;
    /* renamed from: p */
    public final bic f22597p;
    /* renamed from: q */
    public final Surface f22598q;
    /* renamed from: r */
    public final iqt f22599r;
    /* renamed from: s */
    public bhj f22600s;
    /* renamed from: t */
    public bhs f22601t;
    /* renamed from: u */
    public bft f22602u;
    /* renamed from: v */
    public bel f22603v = bel.READY;
    /* renamed from: w */
    public final Object f22604w = new Object();
    /* renamed from: x */
    public final Runnable f22605x = new beb(this);
    /* renamed from: y */
    private final bdz f22606y;
    /* renamed from: z */
    private final biq f22607z;

    public bea(bdz bdz, bhe bhe, inp inp, bhl bhl, Executor executor, gtf gtf, biq biq, bjk bjk, bjn bjn, bji bji, bjg bjg, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, kbg kbg, bhy bhy, bic bic, Surface surface, iqt iqt, bhj bhj, bhs bhs, biw biw, fiw fiw) {
        this.f22606y = bdz;
        this.f22583b = bhe;
        this.f22584c = inp;
        this.f22585d = bhl;
        this.f22586e = executor;
        this.f22587f = gtf;
        this.f22607z = biq;
        this.f22588g = bjk;
        this.f22589h = bjn;
        this.f22591j = bji;
        this.f22590i = bjg;
        this.f22592k = ilp;
        this.f22593l = ilp3;
        this.f22578A = ilp4;
        this.f22594m = ilp5;
        this.f22595n = kbg;
        this.f22596o = bhy;
        this.f22597p = bic;
        this.f22598q = surface;
        this.f22599r = iqt;
        this.f22600s = bhj;
        this.f22601t = bhs;
        this.f22579B = fiw;
        this.f22581D = kow.m13873a((Object) biw);
        this.f22582E.mo8557a(bhy);
        this.f22582E.mo8557a(ilp.mo13672a(new bec(this), executor));
        this.f22582E.mo8557a(ilp2.mo13672a(new bed(this), executor));
        this.f22582E.mo8557a(this.f22593l.mo13672a(new bee(this), this.f22586e));
        this.f22582E.mo8557a(ilp5.mo13672a(new bef(this), this.f22586e));
    }

    /* renamed from: a */
    public final iqo mo8557a(iqo iqo) {
        return this.f22582E.mo8557a(iqo);
    }

    public final void close() {
        synchronized (this.f22604w) {
            if (this.f22603v.equals(bel.CLOSED)) {
                bli.m891b(f22577a, "Session has been closed");
                return;
            }
            this.f22603v = bel.CLOSED;
            bli.m888a(f22577a, "close");
            if (this.f22602u != null) {
                bli.m891b(f22577a, "CamcorderRecordingSession was not shutdowned properly.");
                this.f22602u.mo14561a(true);
            }
            this.f22581D.cancel(true);
            this.f22580C.cancel(true);
            if (this.f22600s != null) {
                bli.m888a(f22577a, "cameraCaptureSessionProxy is empty this happens when we try to create a session after the cameraDeviceProxy is closed.");
                this.f22600s.close();
            }
            this.f22606y.mo1928a();
            this.f22588g.close();
            this.f22582E.close();
        }
    }

    /* renamed from: b */
    public final ikb mo8558b() {
        return this.f22582E.mo8558b();
    }

    /* renamed from: h */
    private final biw m15014h() {
        biw biw;
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        synchronized (this.f22604w) {
            try {
                biw = (biw) this.f22581D.get();
            } catch (InterruptedException e2) {
                e = e2;
                str = f22577a;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                stringBuilder.append("fail to get futurePreparedMediaRecorder: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                biw = null;
                return biw;
            } catch (ExecutionException e3) {
                e = e3;
                str = f22577a;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                stringBuilder.append("fail to get futurePreparedMediaRecorder: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                biw = null;
                return biw;
            }
        }
        return biw;
    }

    /* renamed from: a */
    public final inp mo12358a() {
        return this.f22584c;
    }

    /* renamed from: c */
    public final void mo8684c() {
        synchronized (this.f22604w) {
            bft bft = this.f22602u;
            if (bft != null) {
                bft.mo8684c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8685d() {
        synchronized (this.f22604w) {
            bft bft = this.f22602u;
            if (bft != null) {
                bft.mo8685d();
            }
        }
    }

    /* renamed from: e */
    public final void mo8686e() {
        synchronized (this.f22604w) {
            bft bft = this.f22602u;
            if (bft != null) {
                bft.mo8686e();
            }
        }
    }

    /* renamed from: f */
    public final void mo8687f() {
        synchronized (this.f22604w) {
            bft bft = this.f22602u;
            if (bft != null) {
                bft.mo8687f();
            }
        }
    }

    /* renamed from: g */
    public final kpk mo1941g() {
        kpk a;
        synchronized (this.f22604w) {
            String str = f22577a;
            String valueOf = String.valueOf(this.f22603v);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
            stringBuilder.append("onRecordingSessionClosed with state ");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            if (this.f22603v.equals(bel.CLOSED)) {
                a = kow.m13873a(null);
            } else if (this.f22603v == bel.READY) {
                a = this.f22580C;
            } else {
                boolean z;
                jri.m13395a(this.f22603v.equals(bel.RECORDING));
                this.f22603v = bel.READY;
                if (this.f22602u != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13395a(z);
                this.f22602u = null;
                this.f22580C = m15015i();
                a = this.f22580C;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo8683a(long j, long j2) {
        synchronized (this.f22604w) {
            bft bft = this.f22602u;
            if (bft != null) {
                bft.mo8683a(j, j2);
            }
        }
    }

    /* renamed from: i */
    private final kpk m15015i() {
        kpk a;
        kpk d = kpw.m18486d();
        synchronized (this.f22604w) {
            this.f22581D = this.f22607z.mo12384a();
        }
        if (this.f22607z.mo12385b()) {
            a = kow.m13873a(this.f22600s);
        } else {
            synchronized (this.f22604w) {
                a = kny.m18476a(this.f22581D, new bei(this), kpq.f8776a);
            }
        }
        kow.m13878a(kny.m18476a(a, new bej(this), kpq.f8776a), new bek(this, d), kpq.f8776a);
        return d;
    }

    /* renamed from: a */
    public final kpk mo12359a(bfs bfs) {
        kpk a;
        synchronized (this.f22604w) {
            String str;
            StringBuilder stringBuilder;
            if (this.f22603v.equals(bel.READY)) {
                jri.m13395a(this.f22603v.equals(bel.READY));
                this.f22603v = bel.STARTING_RECORD;
                Object h = m15014h();
                jri.m13404b(h);
                if (h.mo1973e() != ((Integer) this.f22578A.mo13673b()).intValue()) {
                    File c = h.mo1971c();
                    if (!(c == null || c.delete())) {
                        str = f22577a;
                        String valueOf = String.valueOf(c);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        stringBuilder.append("Failed to delete recording file: ");
                        stringBuilder.append(valueOf);
                        bli.m891b(str, stringBuilder.toString());
                    }
                    this.f22580C = m15015i();
                }
                a = iel.m3773a(iel.m3773a(this.f22580C, this.f22581D, new beg(this)), this.f22581D, new beh(this, bfs));
            } else {
                str = String.valueOf(this.f22603v);
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(str);
                a = kow.m13874a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        aub a;
        synchronized (this.f22604w) {
            if (this.f22603v == bel.RECORDING) {
                jri.m13404b(this.f22602u);
                a = this.f22602u.mo1782a(asw);
            } else if (this.f22603v != bel.READY || this.f22600s == null) {
                String str = f22577a;
                String valueOf = String.valueOf(this.f22603v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("Ignore triggerFocusAndMeterAtPoint: state=");
                stringBuilder.append(valueOf);
                bli.m888a(str, stringBuilder.toString());
                a = new atl();
            } else {
                bli.m888a(f22577a, "triggerAfScan");
                asw asw2 = asw;
                a = this.f22583b.mo1949a(this.f22600s, this.f22601t, false, asw2, Arrays.asList(new Surface[]{this.f22598q}), this.f22605x);
            }
        }
        return a;
    }
}
