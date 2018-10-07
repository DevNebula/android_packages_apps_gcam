package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eup */
public final class eup implements jgx {
    /* renamed from: a */
    public final jgx f17839a;
    /* renamed from: b */
    public final Set f17840b = new HashSet();
    /* renamed from: c */
    public final Object f17841c = new Object();

    public eup(jgx jgx) {
        this.f17839a = jgx;
    }

    /* renamed from: a */
    public final jhf mo9414a(jhe jhe) {
        euq euq = new euq(jhe.f8198a);
        synchronized (this.f17841c) {
            this.f17840b.add(euq);
        }
        return new eur(this, this.f17839a.mo9414a(jhe), euq.f4482a, euq.f4483b);
    }

    /* renamed from: c */
    final int mo13189c() {
        int i;
        synchronized (this.f17841c) {
            i = 0;
            for (euq euq : this.f17840b) {
                if (!euq.f4483b.get()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo9415a() {
        this.f17839a.mo9415a();
    }

    /* renamed from: b */
    public final kpk mo9416b() {
        return this.f17839a.mo9416b();
    }
}
