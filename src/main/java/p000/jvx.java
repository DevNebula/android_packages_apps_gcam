package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvx */
public class jvx implements jwa {
    /* renamed from: a */
    private final jwa f24867a;
    /* renamed from: b */
    private final Set f24868b = new HashSet();

    public jvx(jwa jwa) {
        jri.m13404b((Object) jwa);
        this.f24867a = jwa;
    }

    /* renamed from: a */
    public final synchronized void mo15057a(jwc jwc) {
        this.f24868b.add(jwc);
    }

    /* renamed from: a */
    public final Set mo13879a() {
        return this.f24867a.mo13879a();
    }

    /* renamed from: a */
    public final void mo9575a(long j) {
        this.f24867a.mo9575a(j);
        synchronized (this) {
            for (jwc a : this.f24868b) {
                a.mo9575a(j);
            }
        }
    }

    /* renamed from: b */
    public final void mo9576b(long j) {
        this.f24867a.mo9576b(j);
        synchronized (this) {
            for (jwc b : this.f24868b) {
                b.mo9576b(j);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo15058b(jwc jwc) {
        this.f24868b.remove(jwc);
    }

    /* renamed from: b */
    public final kbg mo13880b() {
        return this.f24867a.mo13880b();
    }

    /* renamed from: c */
    public final void mo13881c() {
        this.f24867a.mo13881c();
    }

    /* renamed from: d */
    public final long mo13882d() {
        return this.f24867a.mo13882d();
    }
}
