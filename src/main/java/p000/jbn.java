package p000;

/* compiled from: PG */
/* renamed from: jbn */
final class jbn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ izh f8007a;
    /* renamed from: b */
    private final /* synthetic */ jbj f8008b;

    jbn(jbj jbj, izh izh) {
        this.f8008b = jbj;
        this.f8007a = izh;
    }

    public final void run() {
        jbj jbj = this.f8008b;
        if (jbj.f21418a == null) {
            this.f8007a.mo9216a(jbj.f21419b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8008b);
        String valueOf2 = String.valueOf(this.f8007a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("finallyHandleException[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
