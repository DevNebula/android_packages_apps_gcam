package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: gsy */
public final class gsy implements gsx {
    /* renamed from: a */
    private final File f19567a;

    public gsy(File file) {
        this.f19567a = (File) jri.m13404b((Object) file);
    }

    /* renamed from: a */
    public final File mo7425a() {
        boolean c = mo7427c();
        String valueOf = String.valueOf(this.f19567a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 44);
        stringBuilder.append("Folder doesn't exist and cannot be created: ");
        stringBuilder.append(valueOf);
        jri.m13406b(c, stringBuilder.toString());
        return this.f19567a;
    }

    /* renamed from: b */
    public final String mo7426b() {
        return this.f19567a.getAbsolutePath();
    }

    /* renamed from: a */
    public final gsx mo7424a(String str) {
        return new gsy(new File(this.f19567a, str));
    }

    public final String toString() {
        return this.f19567a.toString();
    }

    /* renamed from: c */
    public final boolean mo7427c() {
        return this.f19567a.mkdirs() || this.f19567a.isDirectory();
    }
}
