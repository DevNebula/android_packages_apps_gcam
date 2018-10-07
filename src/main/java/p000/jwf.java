package p000;

import java.io.Writer;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: jwf */
public final class jwf implements jwa {
    /* renamed from: a */
    public final Writer f24883a;
    /* renamed from: b */
    private final jwa f24884b;
    /* renamed from: c */
    private final ExecutorService f24885c = Executors.newSingleThreadExecutor();

    public jwf(jwa jwa, Writer writer) {
        this.f24884b = jwa;
        this.f24883a = writer;
    }

    /* renamed from: a */
    public final Set mo13879a() {
        return this.f24884b.mo13879a();
    }

    /* renamed from: a */
    private final void m16743a(String str, long j) {
        this.f24885c.execute(new jwg(this, str, j));
    }

    /* renamed from: a */
    public final void mo9575a(long j) {
        this.f24884b.mo9575a(j);
        m16743a("ON_DROPPED", j);
    }

    /* renamed from: b */
    public final void mo9576b(long j) {
        m16743a("ON_INSERTED", j);
        this.f24884b.mo9576b(j);
    }

    /* renamed from: b */
    public final kbg mo13880b() {
        return this.f24884b.mo13880b();
    }

    /* renamed from: c */
    public final void mo13881c() {
        m16743a("RESET", 0);
        this.f24884b.mo13881c();
    }

    /* renamed from: d */
    public final long mo13882d() {
        long d = this.f24884b.mo13882d();
        m16743a("SELECT", d);
        return d;
    }
}
