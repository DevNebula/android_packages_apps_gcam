package p000;

import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bni */
public final class bni implements ffe {
    /* renamed from: a */
    public final AtomicBoolean f11574a = new AtomicBoolean(false);
    /* renamed from: b */
    public final /* synthetic */ bnd f11575b;
    /* renamed from: c */
    private final AtomicReference f11576c = new AtomicReference();

    bni(bnd bnd) {
        this.f11575b = bnd;
    }

    /* renamed from: a */
    public final void mo6771a() {
        fhh a = this.f11575b.f11553a.mo6790a();
        try {
            fjl a2 = this.f11575b.f11554b.mo6830a();
            try {
                bnd bnd = this.f11575b;
                fhz x_ = a2.mo6796x_();
                fio g = bnd.mo12395g();
                g.mo6811a(x_);
                a.mo6816a(Collections.singletonList(g.mo6807a()), fiv.REPEATING);
                this.f11576c.set(a2);
                ixm ixm = this.f11575b.f11556d;
                this.f11576c.set(a2);
                while (this.f11574a.get()) {
                    Object obj;
                    int obj2;
                    if (a2.mo14895d() >= this.f11575b.f11565m) {
                        obj2 = 1;
                    } else if (a2.mo14894b(1)) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        bli.m898e("BurstController", "Could not increase capacity for burst. Will retry next frame...");
                        Thread.sleep(33);
                    } else {
                        try {
                            fjj fjj = (fjj) a2.mo12344a();
                            try {
                                fkp fkp;
                                kpk d = fjj.mo13250d();
                                iwz a3 = fds.m10424a(fjj, 35);
                                if (a3 == null) {
                                    fkp = null;
                                } else {
                                    if (this.f11575b.f11559g.get() != null) {
                                        a3.mo13739a(ion.m3994a(iqp.m4101a(a3.mo13745g(), a3.mo13742d()), ((bnh) this.f11575b.f11559g.get()).f1374j));
                                    }
                                    fkp = new fkp(a3, d);
                                }
                                if (fkp != null) {
                                    bnh bnh = (bnh) this.f11575b.f11559g.get();
                                    if (bnh != null) {
                                        fkp a4 = m7672a(fkp, bnh.f1373i);
                                        a4.mo15527a(fkr.f4833d, bnh.f1366b);
                                        a4.mo15527a(fkr.f4834e, Long.valueOf(bnh.f1367c));
                                        a4.mo15527a(fkr.f4835f, Integer.valueOf(bnh.f1369e.getAndIncrement()));
                                        a4.mo15527a(fkr.f4832c, bnh.f1368d);
                                        ixm.mo9155a(fkp.mo13744f(), a4);
                                        bnh.f1373i.mo12589d();
                                        this.f11575b.f11557e.mo2053a();
                                    }
                                }
                                if (fjj != null) {
                                    bni.m7674a(null, fjj);
                                }
                            } catch (Throwable th) {
                                if (fjj != null) {
                                    bni.m7674a(th, fjj);
                                }
                                throw th;
                            }
                        } catch (bbg e) {
                            bli.m898e("BurstController", "Burst stopped prematurely as buffer-queue was externally closed!");
                            mo12397b();
                        }
                    }
                }
                if (a2 != null) {
                    bni.m7675a(null, a2);
                }
                try {
                    this.f11575b.mo12393a(a);
                    if (a != null) {
                        bni.m7673a(null, a);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (a != null) {
                            bni.m7673a(th2, a);
                        }
                        throw th3;
                    }
                }
            } catch (InterruptedException e2) {
                bli.m898e("BurstController", "Delaying frame was interrupted.");
                Thread.currentThread().interrupt();
            } catch (Throwable th22) {
                try {
                    throw th22;
                } catch (Throwable th32) {
                    if (a2 != null) {
                        bni.m7675a(th22, a2);
                    }
                    throw th32;
                }
            }
        } catch (Throwable th222) {
            this.f11575b.mo12393a(a);
            throw th222;
        }
    }

    /* renamed from: a */
    private final fkp m7672a(fkp fkp, BurstSessionStatistics burstSessionStatistics) {
        synchronized (this.f11575b.f11564l) {
            bwp bwp = this.f11575b.f11567o;
            if (bwp != null) {
                bwp.mo12435a(fkp.mo13744f() - 3000000, fkp.mo13744f() + 3000000, this.f11575b.f11558f);
            }
        }
        kow.m13878a((kpk) jri.m13404b(fkp.mo15529h()), new bnj(this, burstSessionStatistics), kpq.f8776a);
        return fkp;
    }

    /* renamed from: b */
    public final void mo12397b() {
        if (this.f11574a.compareAndSet(true, false)) {
            fjl fjl = (fjl) this.f11576c.getAndSet(null);
            if (fjl != null) {
                fjl.close();
            }
        }
    }
}
