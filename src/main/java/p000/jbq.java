package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbq */
final class jbq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jau f8019a;
    /* renamed from: b */
    private final /* synthetic */ Executor f8020b;
    /* renamed from: c */
    private final /* synthetic */ jbj f8021c;
    /* renamed from: d */
    private final /* synthetic */ jcc f8022d;
    /* renamed from: e */
    private final /* synthetic */ jau f8023e;
    /* renamed from: f */
    private final /* synthetic */ jbj f8024f;

    jbq(jbj jbj, jau jau, Executor executor, jbj jbj2, jcc jcc, jau jau2) {
        this.f8024f = jbj;
        this.f8019a = jau;
        this.f8020b = executor;
        this.f8021c = jbj2;
        this.f8022d = jcc;
        this.f8023e = jau2;
    }

    public final void run() {
        jbj jbj = this.f8024f;
        Object obj = jbj.f21418a;
        if (obj != null) {
            jbj.m12999b(obj, this.f8019a, this.f8020b, this.f8021c, this.f8022d);
            return;
        }
        jar jar = jbj.f21419b;
        jau jau = this.f8023e;
        Executor executor = this.f8020b;
        jbj jbj2 = this.f8021c;
        try {
            jau.mo9286a(jar, executor).mo9276a(kpq.f8776a, new jbx(jbj2), new jbw(jbj2, this.f8022d)).mo9282a(izw.f21401a);
        } catch (jar jar2) {
            jbj2.mo13777a(jar2);
        } catch (Throwable th) {
            jbj2.mo13777a(jar.m4449a(th));
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8024f);
        String valueOf2 = String.valueOf(this.f8019a);
        String valueOf3 = String.valueOf(this.f8023e);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 8) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("then[");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
