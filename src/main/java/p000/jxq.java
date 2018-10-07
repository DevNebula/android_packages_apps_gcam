package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: jxq */
final class jxq implements jxy {
    /* renamed from: a */
    private final jxy f21795a;
    /* renamed from: b */
    private final jxy f21796b;

    public jxq(jxy jxy, jxy jxy2) {
        this.f21795a = jxy;
        this.f21796b = jxy2;
    }

    /* renamed from: a */
    public final int mo9609a(File file) {
        try {
            return this.f21795a.mo9609a(file);
        } catch (jxz e) {
            return this.f21796b.mo9609a(file);
        }
    }

    /* renamed from: b */
    public final boolean mo9610b(File file) {
        return this.f21795a.mo9610b(file) || this.f21796b.mo9610b(file);
    }

    /* renamed from: c */
    public final boolean mo9611c(File file) {
        try {
            return this.f21795a.mo9611c(file);
        } catch (jxz e) {
            return this.f21796b.mo9611c(file);
        }
    }

    /* renamed from: d */
    public final boolean mo9612d(File file) {
        try {
            return this.f21795a.mo9612d(file);
        } catch (jxz e) {
            return this.f21796b.mo9612d(file);
        }
    }

    /* renamed from: e */
    public final boolean mo9613e(File file) {
        return this.f21795a.mo9613e(file) || this.f21796b.mo9613e(file);
    }

    /* renamed from: f */
    public final File[] mo9614f(File file) {
        File[] f = this.f21795a.mo9614f(file);
        return f.length > 0 ? f : this.f21796b.mo9614f(file);
    }

    /* renamed from: g */
    public final long mo9615g(File file) {
        try {
            return this.f21795a.mo9615g(file);
        } catch (jxz e) {
            return this.f21796b.mo9615g(file);
        }
    }
}
