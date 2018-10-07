package p000;

import com.google.common.p006io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* renamed from: kjc */
final class kjc extends kiq {
    /* renamed from: a */
    private final File f21922a;

    kjc(File file) {
        this.f21922a = (File) jri.m13404b((Object) file);
    }

    /* renamed from: d */
    private final FileInputStream m13822d() {
        return new FileInputStream(this.f21922a);
    }

    /* renamed from: b */
    public final byte[] mo10055b() {
        kiu a = kiu.m5025a();
        try {
            FileInputStream fileInputStream = (FileInputStream) a.mo10067a(m13822d());
            byte[] toByteArray = ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
            a.close();
            return toByteArray;
        } catch (Throwable th) {
            a.close();
        }
    }

    /* renamed from: c */
    public final kbg mo10056c() {
        if (this.f21922a.isFile()) {
            return kbg.m4804c(Long.valueOf(this.f21922a.length()));
        }
        return kau.f21835a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21922a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("Files.asByteSource(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
