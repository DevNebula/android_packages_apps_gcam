package p000;

import android.view.Surface;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bem */
final class bem implements bdy, bgk, iop {
    /* renamed from: a */
    public static final String f22608a = bli.m887a("CdrCptrSesCodec");
    /* renamed from: A */
    private final ikb f22609A = new ikb();
    /* renamed from: b */
    public final bhe f22610b;
    /* renamed from: c */
    public final inp f22611c;
    /* renamed from: d */
    public final bhl f22612d;
    /* renamed from: e */
    public final Executor f22613e;
    /* renamed from: f */
    public final gtf f22614f;
    /* renamed from: g */
    public final ilp f22615g;
    /* renamed from: h */
    public final ilp f22616h;
    /* renamed from: i */
    public final ilp f22617i;
    /* renamed from: j */
    public final kbg f22618j;
    /* renamed from: k */
    public final bhy f22619k;
    /* renamed from: l */
    public final bic f22620l;
    /* renamed from: m */
    public final Surface f22621m;
    /* renamed from: n */
    public final iqt f22622n;
    /* renamed from: o */
    public bhj f22623o;
    /* renamed from: p */
    public bhs f22624p;
    /* renamed from: q */
    public bgb f22625q;
    /* renamed from: r */
    public bey f22626r = bey.READY;
    /* renamed from: s */
    public final Object f22627s = new Object();
    /* renamed from: t */
    public final Runnable f22628t = new ben(this);
    /* renamed from: u */
    private final bdz f22629u;
    /* renamed from: v */
    private final iou f22630v;
    /* renamed from: w */
    private final ilp f22631w;
    /* renamed from: x */
    private final fiw f22632x;
    /* renamed from: y */
    private kpk f22633y = kow.m13873a(null);
    /* renamed from: z */
    private kpk f22634z;

    public bem(bdz bdz, bhe bhe, inp inp, bhl bhl, Executor executor, gtf gtf, iou iou, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, kbg kbg, bhy bhy, bic bic, Surface surface, iqt iqt, bhj bhj, bhs bhs, ios ios, fiw fiw) {
        this.f22629u = bdz;
        this.f22610b = bhe;
        this.f22611c = inp;
        this.f22612d = bhl;
        this.f22613e = executor;
        this.f22614f = gtf;
        this.f22630v = iou;
        this.f22615g = ilp;
        this.f22616h = ilp3;
        this.f22631w = ilp4;
        this.f22617i = ilp5;
        this.f22618j = kbg;
        this.f22619k = bhy;
        this.f22620l = bic;
        this.f22621m = surface;
        this.f22622n = iqt;
        this.f22623o = bhj;
        this.f22624p = bhs;
        this.f22632x = fiw;
        this.f22634z = kow.m13873a((Object) ios);
        this.f22609A.mo8557a(bhy);
        this.f22609A.mo8557a(ilp.mo13672a(new beo(this), executor));
        this.f22609A.mo8557a(ilp2.mo13672a(new beq(this), executor));
        this.f22609A.mo8557a(this.f22616h.mo13672a(new ber(this), this.f22613e));
        this.f22609A.mo8557a(ilp5.mo13672a(new bes(this), this.f22613e));
    }

    /* renamed from: a */
    public final iqo mo8557a(iqo iqo) {
        return this.f22609A.mo8557a(iqo);
    }

    public final void close() {
        synchronized (this.f22627s) {
            if (this.f22626r.equals(bey.CLOSED)) {
                bli.m891b(f22608a, "Session has been closed");
                return;
            }
            this.f22626r = bey.CLOSED;
            bli.m896d(f22608a, "close");
            bgb bgb = this.f22625q;
            if (bgb != null) {
                bgb.mo14565n();
            }
            this.f22634z.cancel(true);
            this.f22633y.cancel(true);
            if (this.f22623o != null) {
                bli.m888a(f22608a, "requestProcessor is empty this happens when we try to create a session after the cameraDeviceProxy is closed.");
                this.f22623o.close();
            }
            ios h = m15028h();
            if (h != null) {
                h.close();
            }
            this.f22629u.mo1928a();
            this.f22620l.close();
            this.f22609A.close();
        }
    }

    /* renamed from: b */
    public final ikb mo8558b() {
        return this.f22609A.mo8558b();
    }

    /* renamed from: a */
    public final inp mo12358a() {
        return this.f22611c;
    }

    /* renamed from: h */
    private final ios m15028h() {
        ios ios;
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        synchronized (this.f22627s) {
            try {
                ios = (ios) this.f22634z.get();
            } catch (InterruptedException e2) {
                e = e2;
                str = f22608a;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                stringBuilder.append("fail to get futureVideoRecorder: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                ios = null;
            } catch (ExecutionException e3) {
                e = e3;
                str = f22608a;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                stringBuilder.append("fail to get futureVideoRecorder: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                ios = null;
            } catch (Throwable e4) {
                bli.m892b(f22608a, "get VideoRecorder canceled because session is closed", e4);
                ios = null;
            }
        }
        return ios;
    }

    /* renamed from: c */
    public final void mo8684c() {
        synchronized (this.f22627s) {
            bgb bgb = this.f22625q;
            if (bgb != null) {
                bgb.mo8684c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8685d() {
        synchronized (this.f22627s) {
            bgb bgb = this.f22625q;
            if (bgb != null) {
                bgb.mo8685d();
            }
        }
    }

    /* renamed from: e */
    public final void mo8686e() {
        synchronized (this.f22627s) {
            bgb bgb = this.f22625q;
            if (bgb != null) {
                bgb.mo8686e();
            }
        }
    }

    /* renamed from: f */
    public final void mo8687f() {
        synchronized (this.f22627s) {
            bgb bgb = this.f22625q;
            if (bgb != null) {
                bgb.mo8687f();
            }
        }
    }

    /* renamed from: g */
    public final kpk mo1941g() {
        kpk a;
        synchronized (this.f22627s) {
            if (this.f22626r.equals(bey.CLOSED)) {
                a = kow.m13873a(null);
            } else {
                boolean z;
                jri.m13395a(this.f22626r.equals(bey.RECORDING));
                this.f22626r = bey.READY;
                if (this.f22625q != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13395a(z);
                this.f22625q = null;
                a = m15029i();
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo8683a(long j, long j2) {
        synchronized (this.f22627s) {
        }
    }

    /* renamed from: i */
    private final kpk m15029i() {
        kpk a;
        kpk d = kpw.m18486d();
        synchronized (this.f22627s) {
            this.f22633y = d;
            this.f22634z = this.f22630v.mo13696a();
        }
        if (this.f22630v.f21167o.mo9709b()) {
            bli.m888a(f22608a, "resetSession");
            a = kow.m13873a(this.f22623o);
        } else {
            synchronized (this.f22627s) {
                a = kny.m18476a(this.f22634z, new bew(this), kpq.f8776a);
            }
        }
        kow.m13878a(kny.m18476a(a, new bex(this), kpq.f8776a), new bep(this, d), kpq.f8776a);
        return d;
    }

    /* renamed from: a */
    public final kpk mo12359a(bfs bfs) {
        kpk a;
        synchronized (this.f22627s) {
            String str;
            StringBuilder stringBuilder;
            if (this.f22626r.equals(bey.READY)) {
                jri.m13395a(this.f22626r.equals(bey.READY));
                this.f22626r = bey.STARTING_RECORD;
                Object h = m15028h();
                jri.m13404b(h);
                if (h.f21146h != ((Integer) this.f22631w.mo13673b()).intValue()) {
                    if (kbg.m4803b(h.f21141c).mo9709b()) {
                        File file = (File) kbg.m4803b(h.f21141c).mo9706a();
                        if (!file.delete()) {
                            str = f22608a;
                            String valueOf = String.valueOf(file);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                            stringBuilder.append("Failed to delete recording file: ");
                            stringBuilder.append(valueOf);
                            bli.m891b(str, stringBuilder.toString());
                        }
                    }
                    m15029i();
                }
                a = iel.m3773a(iel.m3773a(iel.m3773a(this.f22633y, this.f22634z, new bet(this)), this.f22634z, new beu(this)), this.f22634z, new bev(this, bfs));
            } else {
                str = String.valueOf(this.f22626r);
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
        synchronized (this.f22627s) {
            if (this.f22626r == bey.RECORDING) {
                jri.m13404b(this.f22625q);
                a = this.f22625q.mo1782a(asw);
            } else if (this.f22626r != bey.READY) {
                String str = f22608a;
                String valueOf = String.valueOf(this.f22626r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                stringBuilder.append("Ignore observableActiveFocusPoint callback: state=");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                a = new atl();
            } else {
                bli.m888a(f22608a, "triggerAfScan");
                asw asw2 = asw;
                a = this.f22610b.mo1949a(this.f22623o, this.f22624p, false, asw2, Arrays.asList(new Surface[]{this.f22621m}), this.f22628t);
            }
        }
        return a;
    }
}
