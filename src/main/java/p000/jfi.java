package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jfi */
final class jfi implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jdo f8122a;
    /* renamed from: b */
    private final /* synthetic */ jdc f8123b;

    jfi(jdo jdo, jdc jdc) {
        this.f8122a = jdo;
        this.f8123b = jdc;
    }

    /* renamed from: a */
    private final jfb m4505a() {
        jfb jfe = new jfe(this.f8122a.mo15032d(), jfe.m18391f(), 3553, this.f8123b);
        try {
            jfe.mo15575b();
            return jfe;
        } catch (Exception e) {
            jfe.close();
            throw e;
        }
    }
}
