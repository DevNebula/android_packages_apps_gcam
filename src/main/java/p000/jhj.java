package p000;

import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jhj */
public class jhj implements jhk {
    /* renamed from: a */
    public final Executor f21507a;
    /* renamed from: b */
    public kpk f21508b = null;
    /* renamed from: c */
    public kpk f21509c;
    /* renamed from: d */
    public kpk f21510d;
    /* renamed from: e */
    public kpk f21511e;
    /* renamed from: f */
    public boolean f21512f;

    /* renamed from: a */
    public jhk mo13800a(File file) {
        this.f21508b = kow.m13873a((Object) file);
        return this;
    }

    public jhj(Executor executor) {
        this.f21507a = executor;
        this.f21509c = kow.m13873a(null);
        this.f21510d = kow.m13873a(null);
        this.f21511e = kow.m13873a(null);
        this.f21512f = true;
    }

    /* renamed from: a */
    public jgx mo13798a() {
        kpk kpk = this.f21508b;
        if (kpk != null) {
            return new jgz((koq) kny.m18475a(koq.m16958c(kpk), jhi.f21506a, this.f21507a), this.f21511e, this.f21509c, this.f21510d, this.f21512f, this.f21507a);
        }
        throw new IllegalArgumentException("Output not properly specified");
    }

    /* renamed from: b */
    public jhj mo13801b() {
        this.f21512f = false;
        return this;
    }

    /* renamed from: a */
    public jhj mo13799a(int i) {
        this.f21511e = kow.m13873a(Integer.valueOf(i));
        return this;
    }
}
