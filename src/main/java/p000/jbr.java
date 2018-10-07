package p000;

/* compiled from: PG */
/* renamed from: jbr */
final class jbr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jbj f8025a;
    /* renamed from: b */
    private final /* synthetic */ izi f8026b;
    /* renamed from: c */
    private final /* synthetic */ jcc f8027c;
    /* renamed from: d */
    private final /* synthetic */ jbj f8028d;

    jbr(jbj jbj, jbj jbj2, izi izi, jcc jcc) {
        this.f8028d = jbj;
        this.f8025a = jbj2;
        this.f8026b = izi;
        this.f8027c = jcc;
    }

    public final void run() {
        jbj jbj = this.f8028d;
        Object obj = jbj.f21418a;
        if (obj != null) {
            this.f8025a.mo13778a(obj);
        } else {
            jbj.m12989a(jbj.f21419b, this.f8026b, this.f8025a);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8028d);
        String valueOf2 = String.valueOf(this.f8026b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenCatch[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
