package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: bnd */
public final class bnd implements bna {
    /* renamed from: a */
    public final fhg f11553a;
    /* renamed from: b */
    public final fjk f11554b;
    /* renamed from: c */
    public final bni f11555c;
    /* renamed from: d */
    public final ixm f11556d;
    /* renamed from: e */
    public final bnn f11557e;
    /* renamed from: f */
    public final bwq f11558f;
    /* renamed from: g */
    public final AtomicReference f11559g = new AtomicReference();
    /* renamed from: h */
    public final Map f11560h = new ConcurrentHashMap();
    /* renamed from: i */
    public final Executor f11561i;
    /* renamed from: j */
    public final ixq f11562j;
    /* renamed from: k */
    public final ixv f11563k;
    /* renamed from: l */
    public final Object f11564l = new Object();
    /* renamed from: m */
    public final int f11565m;
    /* renamed from: n */
    public final AtomicBoolean f11566n = new AtomicBoolean();
    /* renamed from: o */
    public bwp f11567o;
    /* renamed from: p */
    private final kpk f11568p;
    /* renamed from: q */
    private final fff f11569q;
    /* renamed from: r */
    private final ilp f11570r;
    /* renamed from: s */
    private final bwo f11571s;
    /* renamed from: t */
    private final Map f11572t = new ConcurrentHashMap();

    public bnd(ixm ixm, bnn bnn, kpk kpk, fhg fhg, fjk fjk, ilp ilp, fff fff, Executor executor, bwo bwo, bwq bwq, ixq ixq, ixv ixv) {
        this.f11557e = bnn;
        this.f11568p = kpk;
        this.f11553a = fhg;
        this.f11554b = fjk;
        this.f11569q = fff;
        this.f11561i = executor;
        this.f11555c = new bni(this);
        this.f11570r = ilp;
        this.f11556d = ixm;
        this.f11571s = bwo;
        this.f11558f = bwq;
        this.f11567o = null;
        this.f11562j = ixq;
        this.f11563k = ixv;
        this.f11565m = (this.f11556d.mo9153a() + 6) + 1;
    }

    /* renamed from: g */
    final fio mo12395g() {
        int i;
        if (this.f11570r.mo13673b() == fxi.ON) {
            i = 2;
        } else {
            i = 0;
        }
        ffw ffw = (ffw) kow.m13881c(this.f11568p);
        fis[] fisArr = new fis[1];
        r5 = new fin[6];
        Key key = CaptureRequest.CONTROL_AE_MODE;
        Integer valueOf = Integer.valueOf(1);
        r5[0] = new fin(key, valueOf);
        r5[1] = new fin(CaptureRequest.CONTROL_MODE, valueOf);
        r5[2] = new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(i));
        r5[3] = new fin(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        r5[4] = new fin(CaptureRequest.EDGE_MODE, valueOf);
        r5[5] = new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf);
        fisArr[0] = fds.m10417a(Arrays.asList(r5));
        return new fio((fim) ffw.mo15526a(fisArr).mo13673b()).mo6808a(5);
    }

    /* renamed from: a */
    public final void mo2035a() {
        bnh bnh = (bnh) this.f11559g.get();
        if (bnh != null) {
            mo12394a(bnh.f1366b, false);
            m7655b(null);
        }
    }

    /* renamed from: a */
    public final kpk mo2034a(gkr gkr, iqm iqm, bnx bnx, iqp iqp) {
        UUID randomUUID = UUID.randomUUID();
        kpk d = kpw.m18486d();
        this.f11572t.put(randomUUID, d);
        m7655b(new bnh(gkr, randomUUID, System.currentTimeMillis(), iqm, bnx, (BurstSessionStatistics) Instrumentation.instance().burstStats().getCurrentSession(), iqp));
        return d;
    }

    /* renamed from: a */
    final void mo12394a(UUID uuid, boolean z) {
        kpw kpw = (kpw) this.f11572t.remove(uuid);
        if (kpw != null) {
            kpw.mo15641a(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo2036b() {
        ffe ffe = this.f11555c;
        if (ffe.f11574a.compareAndSet(false, true)) {
            ffe.f11575b.f11569q.mo6772a(ffe);
        }
    }

    /* renamed from: c */
    public final void mo2037c() {
        this.f11557e.mo2054a(new bng(this));
    }

    /* renamed from: d */
    public final void mo2038d() {
        synchronized (this.f11564l) {
            try {
                bwp bwp = this.f11567o;
                if (bwp != null) {
                    bwp.close();
                    this.f11567o = null;
                }
                this.f11567o = this.f11571s.mo2187b();
            } catch (Throwable th) {
                String valueOf = String.valueOf(th);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 60);
                stringBuilder.append("Gyro is unavailable and cannot be used for burst selection: ");
                stringBuilder.append(valueOf);
                bli.m891b("BurstController", stringBuilder.toString());
                this.f11567o = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo2039e() {
        this.f11555c.mo12397b();
    }

    /* renamed from: f */
    public final void mo2040f() {
        synchronized (this.f11564l) {
            bwp bwp = this.f11567o;
            if (bwp != null) {
                bwp.close();
                this.f11567o = null;
            }
        }
    }

    /* renamed from: a */
    final void mo12393a(fhh fhh) {
        try {
            fio g = mo12395g();
            g.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
            g.mo6809a(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            fhh.mo6816a(Collections.singletonList(g.mo6807a()), fiv.REPEATING);
            fhh.mo6816a(Collections.singletonList(g.mo6807a()), fiv.NON_REPEATING);
            return;
        } catch (isr e) {
        } catch (InterruptedException e2) {
        }
        bli.m891b("BurstController", "Could not submit unlock AF request! Perhaps camera is shutting down.");
    }

    /* renamed from: b */
    private final void m7655b(bnh bnh) {
        if (bnh != null) {
            this.f11560h.put(bnh.f1366b, bnh);
        }
        bnh bnh2 = (bnh) this.f11559g.getAndSet(bnh);
        if (bnh2 != null) {
            mo12392a(bnh2);
        }
    }

    /* renamed from: a */
    final void mo12392a(bnh bnh) {
        boolean z;
        UUID uuid = bnh.f1366b;
        bnh bnh2 = (bnh) this.f11559g.get();
        if (bnh2 == null || !bnh2.f1366b.equals(uuid)) {
            for (fkp a : this.f11556d.mo9157b()) {
                if (((UUID) a.mo15528a(fkr.f4833d)).equals(uuid)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z && this.f11560h.remove(bnh.f1366b) != null) {
            if (bnh.f1370f.get() >= 3) {
                this.f11561i.execute(new bnf(bnh));
                bnh.f1365a.mo13378f();
                return;
            }
            bnh.f1365a.mo13360a();
            mo12394a(bnh.f1366b, false);
        }
    }

    /* renamed from: h */
    public final void mo12396h() {
        if (this.f11556d.mo9162g() == 0) {
            bli.m896d("BurstController", "All images drained. Shutting down save broker!");
            this.f11557e.mo2055b();
        }
    }
}
