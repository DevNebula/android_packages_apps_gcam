package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: gte */
public final class gte implements gsx {
    /* renamed from: a */
    private static final String f19575a = bli.m887a("OvrDetachableFolder");
    /* renamed from: b */
    private final gsx f19576b;

    public gte(gsx gsx) {
        this.f19576b = gsx;
    }

    /* renamed from: a */
    public final File mo7425a() {
        return this.f19576b.mo7425a();
    }

    /* renamed from: b */
    public final String mo7426b() {
        return this.f19576b.mo7426b();
    }

    /* renamed from: a */
    public final gsx mo7424a(String str) {
        return this.f19576b.mo7424a(str);
    }

    public final String toString() {
        return this.f19576b.toString();
    }

    /* renamed from: c */
    public final boolean mo7427c() {
        while (!this.f19576b.mo7427c()) {
            File file = new File(this.f19576b.mo7426b());
            if (file.isFile() && file.delete()) {
                String str = f19575a;
                String valueOf = String.valueOf(file.getAbsolutePath());
                String str2 = "Overwriting existing file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m894c(str, valueOf);
            }
        }
        return true;
    }
}
