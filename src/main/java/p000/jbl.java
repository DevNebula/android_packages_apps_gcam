package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbl */
final class jbl implements jau {
    /* renamed from: a */
    private final /* synthetic */ jlf f21422a;
    /* renamed from: b */
    private final /* synthetic */ jbj f21423b;

    jbl(jbj jbj, jlf jlf) {
        this.f21423b = jbj;
        this.f21422a = jlf;
    }

    /* renamed from: a */
    public final jaq mo9286a(Object obj, Executor executor) {
        return this.f21422a.mo9510a().mo9275a(executor, ion.m3999a(obj));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21423b);
        String valueOf2 = String.valueOf(this.f21422a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenAlways[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
