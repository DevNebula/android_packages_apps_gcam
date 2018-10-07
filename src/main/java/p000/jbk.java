package p000;

/* compiled from: PG */
/* renamed from: jbk */
final class jbk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ izi f8003a;
    /* renamed from: b */
    private final /* synthetic */ jbj f8004b;
    /* renamed from: c */
    private final /* synthetic */ jcc f8005c;
    /* renamed from: d */
    private final /* synthetic */ jbj f8006d;

    jbk(jbj jbj, izi izi, jbj jbj2, jcc jcc) {
        this.f8006d = jbj;
        this.f8003a = izi;
        this.f8004b = jbj2;
        this.f8005c = jcc;
    }

    public final void run() {
        jbj jbj = this.f8006d;
        Object obj = jbj.f21418a;
        if (obj != null) {
            jbj.m12994a(obj, this.f8003a, this.f8004b);
        } else {
            this.f8004b.mo13777a(jbj.f21419b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8006d);
        String valueOf2 = String.valueOf(this.f8003a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("then[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
