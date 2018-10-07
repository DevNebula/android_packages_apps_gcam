package p000;

/* compiled from: PG */
/* renamed from: jbo */
final class jbo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ izi f8009a;
    /* renamed from: b */
    private final /* synthetic */ jbj f8010b;
    /* renamed from: c */
    private final /* synthetic */ jcc f8011c;
    /* renamed from: d */
    private final /* synthetic */ izi f8012d;
    /* renamed from: e */
    private final /* synthetic */ jbj f8013e;

    jbo(jbj jbj, izi izi, jbj jbj2, jcc jcc, izi izi2) {
        this.f8013e = jbj;
        this.f8009a = izi;
        this.f8010b = jbj2;
        this.f8011c = jcc;
        this.f8012d = izi2;
    }

    public final void run() {
        jbj jbj = this.f8013e;
        Object obj = jbj.f21418a;
        if (obj != null) {
            jbj.m12994a(obj, this.f8009a, this.f8010b);
        } else {
            jbj.m12989a(jbj.f21419b, this.f8012d, this.f8010b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8013e);
        String valueOf2 = String.valueOf(this.f8009a);
        String valueOf3 = String.valueOf(this.f8012d);
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
