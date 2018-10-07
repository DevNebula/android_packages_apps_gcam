package p000;

/* compiled from: PG */
/* renamed from: jbs */
final class jbs implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f8029a;
    /* renamed from: b */
    private final /* synthetic */ jbj f8030b;
    /* renamed from: c */
    private final /* synthetic */ jcc f8031c;
    /* renamed from: d */
    private final /* synthetic */ jbj f8032d;

    jbs(jbj jbj, Runnable runnable, jbj jbj2, jcc jcc) {
        this.f8032d = jbj;
        this.f8029a = runnable;
        this.f8030b = jbj2;
        this.f8031c = jcc;
    }

    public final void run() {
        jbj jbj = this.f8032d;
        Object obj = jbj.f21418a;
        if (obj != null) {
            jbj.m12997a(obj, this.f8029a, this.f8030b);
        } else {
            jbj.m12992a(jbj.f21419b, this.f8029a, this.f8030b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8032d);
        String valueOf2 = String.valueOf(this.f8029a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenAlways[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
