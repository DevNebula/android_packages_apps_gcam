package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbp */
final class jbp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jau f8014a;
    /* renamed from: b */
    private final /* synthetic */ Executor f8015b;
    /* renamed from: c */
    private final /* synthetic */ jbj f8016c;
    /* renamed from: d */
    private final /* synthetic */ jcc f8017d;
    /* renamed from: e */
    private final /* synthetic */ jbj f8018e;

    jbp(jbj jbj, jau jau, Executor executor, jbj jbj2, jcc jcc) {
        this.f8018e = jbj;
        this.f8014a = jau;
        this.f8015b = executor;
        this.f8016c = jbj2;
        this.f8017d = jcc;
    }

    public final void run() {
        jbj jbj = this.f8018e;
        Object obj = jbj.f21418a;
        if (obj != null) {
            jbj.m12999b(obj, this.f8014a, this.f8015b, this.f8016c, this.f8017d);
        } else {
            this.f8016c.mo13777a(jbj.f21419b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8018e);
        String valueOf2 = String.valueOf(this.f8014a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("then[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
