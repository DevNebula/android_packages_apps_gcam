package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbm */
final class jbm implements jau {
    /* renamed from: a */
    private final /* synthetic */ jlf f21424a;
    /* renamed from: b */
    private final /* synthetic */ jbj f21425b;

    jbm(jbj jbj, jlf jlf) {
        this.f21425b = jbj;
        this.f21424a = jlf;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        Throwable th = (jar) obj;
        return this.f21424a.mo9510a().mo9276a(executor, ion.m4017b(th), ion.m4000a(th));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21425b);
        String valueOf2 = String.valueOf(this.f21424a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenAlways[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
