package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jyb */
final class jyb implements jxy {
    /* renamed from: a */
    private final jxy f21803a;
    /* renamed from: b */
    private final List f21804b;

    public jyb(jxy jxy, List list) {
        this.f21803a = jxy;
        this.f21804b = new ArrayList(list);
        Collections.sort(list);
    }

    /* renamed from: a */
    public final int mo9609a(File file) {
        return this.f21803a.mo9609a(file);
    }

    /* renamed from: b */
    public final boolean mo9610b(File file) {
        return this.f21803a.mo9610b(file);
    }

    /* renamed from: c */
    public final boolean mo9611c(File file) {
        return this.f21803a.mo9611c(file);
    }

    /* renamed from: d */
    public final boolean mo9612d(File file) {
        return this.f21803a.mo9612d(file);
    }

    /* renamed from: e */
    public final boolean mo9613e(File file) {
        return this.f21803a.mo9613e(file);
    }

    /* renamed from: f */
    public final File[] mo9614f(File file) {
        return this.f21803a.mo9614f(file);
    }

    /* renamed from: g */
    public final long mo9615g(File file) {
        try {
            return this.f21803a.mo9615g(file);
        } catch (jya e) {
            jya jya = e;
            try {
                return ((Long) this.f21804b.get(this.f21803a.mo9609a(file))).longValue();
            } catch (jya e2) {
                throw new jya(String.format(Locale.US, "timestamp (from %s OR %s)", new Object[]{jya.getMessage(), e2.getMessage()}));
            }
        }
    }
}
