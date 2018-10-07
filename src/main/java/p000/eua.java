package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eua */
public final class eua {
    /* renamed from: a */
    public final Object f4463a = new Object();
    /* renamed from: b */
    public final eun f4464b;
    /* renamed from: c */
    public final Executor f4465c;
    /* renamed from: d */
    public final List f4466d;
    /* renamed from: e */
    public final eue f4467e;
    /* renamed from: f */
    public final Map f4468f = new HashMap();
    /* renamed from: g */
    public volatile boolean f4469g = false;
    /* renamed from: h */
    public jgd f4470h;
    /* renamed from: i */
    private final kpw f4471i = kpw.m18486d();
    /* renamed from: j */
    private volatile boolean f4472j = false;

    public eua(List list, eue eue, eun eun, Executor executor) {
        this.f4466d = list;
        this.f4467e = eue;
        this.f4464b = eun;
        this.f4465c = executor;
        for (eux put : list) {
            this.f4468f.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    final boolean mo6592a() {
        for (eux eux : this.f4466d) {
            Boolean bool = (Boolean) this.f4468f.get(eux);
            if (bool == null) {
                String valueOf = String.valueOf(eux);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("No running state found for ");
                stringBuilder.append(valueOf);
                throw new AssertionError(stringBuilder.toString());
            } else if (bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    final void mo6593b() {
        if (!this.f4472j) {
            this.f4472j = true;
            jgd jgd = this.f4470h;
            if (jgd != null) {
                this.f4471i.mo15644b(jgd.mo9400a());
            } else {
                this.f4471i.mo15641a(izg.f7956a);
            }
            this.f4471i.mo10200a(new eub(this), this.f4465c);
        }
    }

    /* renamed from: c */
    public final void mo6594c() {
        synchronized (this.f4463a) {
            for (eux eux : this.f4466d) {
                this.f4468f.put(eux, Boolean.valueOf(true));
                eux.mo6607c();
            }
        }
    }

    /* renamed from: d */
    public final kpk mo6595d() {
        synchronized (this.f4463a) {
            this.f4469g = true;
            if (mo6592a()) {
                mo6593b();
            }
        }
        for (eux b : this.f4466d) {
            b.mo6606b();
        }
        return this.f4471i;
    }
}
