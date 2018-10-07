package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: exd */
public final class exd {
    /* renamed from: a */
    public final ixm f4555a = ion.m4022c(68);
    /* renamed from: b */
    private final Map f4556b = new HashMap();

    /* renamed from: a */
    public final synchronized void mo6664a(exf exf, Executor executor) {
        this.f4556b.put(exf, executor);
    }

    /* renamed from: a */
    public final void mo6662a() {
        for (gid close : this.f4555a.mo9160e()) {
            close.close();
        }
    }

    /* renamed from: a */
    public final synchronized void mo6665a(gid gid) {
        for (Entry entry : this.f4556b.entrySet()) {
            ((Executor) entry.getValue()).execute(new exe(entry, gid));
        }
    }

    /* renamed from: b */
    public final List mo6666b() {
        return this.f4555a.mo9157b();
    }

    /* renamed from: a */
    public final synchronized void mo6663a(exf exf) {
        if (this.f4556b.containsKey(exf)) {
            this.f4556b.remove(exf);
        }
    }
}
