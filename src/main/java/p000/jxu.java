package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: jxu */
final class jxu implements jxy {
    /* renamed from: a */
    public final jxw f21801a;
    /* renamed from: b */
    private final FilenameFilter f21802b = new jxv(this);

    public jxu(jxw jxw) {
        jri.m13404b((Object) jxw);
        this.f21801a = jxw;
    }

    /* renamed from: a */
    public final int mo9609a(File file) {
        Matcher matcher = this.f21801a.mo9604a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f21801a.mo9603a(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }

    /* renamed from: b */
    public final boolean mo9610b(File file) {
        return this.f21801a.mo9604a().matcher(file.getName()).matches();
    }

    /* renamed from: c */
    public final boolean mo9611c(File file) {
        Matcher matcher = this.f21801a.mo9604a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f21801a.mo9606c(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }

    /* renamed from: d */
    public final boolean mo9612d(File file) {
        Matcher matcher = this.f21801a.mo9604a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f21801a.mo9607d(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }

    /* renamed from: e */
    public final boolean mo9613e(File file) {
        Matcher matcher = this.f21801a.mo9604a().matcher(file.getName());
        return matcher.matches() ? this.f21801a.mo9608e(matcher) : false;
    }

    /* renamed from: f */
    public final File[] mo9614f(File file) {
        File[] listFiles = file.listFiles(this.f21802b);
        if (listFiles != null) {
            return listFiles;
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("Cannot list ");
        stringBuilder.append(valueOf);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: g */
    public final long mo9615g(File file) {
        Matcher matcher = this.f21801a.mo9604a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f21801a.mo9605b(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }
}
