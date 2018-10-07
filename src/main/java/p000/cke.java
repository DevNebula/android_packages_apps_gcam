package p000;

import android.annotation.TargetApi;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: cke */
public final class cke implements ckj {
    /* renamed from: a */
    public final Set f23203a;
    /* renamed from: b */
    public final ExecutorService f23204b = cht.m1157c();
    /* renamed from: c */
    public volatile boolean f23205c = false;
    /* renamed from: d */
    private final fre f23206d;
    /* renamed from: e */
    private final kpk f23207e;
    /* renamed from: f */
    private final iqm f23208f;
    /* renamed from: g */
    private final bcz f23209g = new bcz();
    /* renamed from: h */
    private final Collection f23210h;

    public cke(fre fre, Collection collection, kpk kpk, iqm iqm) {
        jri.m13404b((Object) fre);
        jri.m13404b((Object) collection);
        jri.m13404b((Object) kpk);
        jri.m13404b((Object) iqm);
        this.f23206d = fre;
        this.f23210h = collection;
        this.f23207e = kpk;
        this.f23208f = iqm;
        this.f23203a = new HashSet(((Integer) fre.mo6873b().mo13673b()).intValue());
    }

    public final void close() {
        synchronized (this.f23203a) {
            this.f23205c = true;
            if (this.f23203a.isEmpty()) {
                this.f23204b.shutdown();
            }
        }
    }

    /* renamed from: a */
    public final kpk mo12507a(ckk ckk) {
        kpk d;
        jri.m13404b((Object) ckk);
        jri.m13404b(ckk.mo2350a());
        fyr a = this.f23209g.mo15475a();
        synchronized (this.f23203a) {
            if (this.f23203a.contains(ckk)) {
                d = kpw.m18486d();
                d.mo10200a(new ckf(this, ckk), this.f23204b);
                Object a2 = ckk.mo2350a();
                fkp fkp = new fkp(new ckg(a2, a), a2.mo15529h());
                fre fre = this.f23206d;
                Executor executor = this.f23204b;
                Collection collection = this.f23210h;
                kpk kpk = this.f23207e;
                iqm iqm = this.f23208f;
                C0556wd c0556wd = (C0556wd) ckk.f2292b.get();
                if (c0556wd == null) {
                    c0556wd = C0557we.m6180a();
                }
                this.f23204b.execute(new ckh(fkp, fre, executor, collection, d, kpk, iqm, c0556wd));
            } else {
                throw new IllegalArgumentException("Invalid frame saving task.");
            }
        }
        return d;
    }

    /* renamed from: b */
    public final void mo12508b(ckk ckk) {
        iwz a = ckk.mo2350a();
        if (a != null) {
            a.close();
        }
        synchronized (this.f23203a) {
            if (this.f23203a.remove(ckk)) {
            } else {
                throw new IllegalArgumentException("Invalid frame saving task.");
            }
        }
    }

    /* renamed from: a */
    public final kbg mo12506a() {
        kbg c;
        synchronized (this.f23203a) {
            if (((Integer) this.f23209g.f24630c).intValue() <= ((Integer) this.f23206d.mo6873b().mo13673b()).intValue()) {
                ckk ckk = new ckk();
                this.f23203a.add(ckk);
                c = kbg.m4804c(ckk);
            } else {
                c = kau.f21835a;
            }
        }
        return c;
    }
}
