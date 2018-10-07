package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: kjb */
final class kjb extends kip {
    /* renamed from: a */
    private final File f21920a;
    /* renamed from: b */
    private final keu f21921b;

    kjb(File file, kiy... kiyArr) {
        this.f21920a = (File) jri.m13404b((Object) file);
        this.f21921b = keu.m13733a((Object[]) kiyArr);
    }

    /* renamed from: a */
    public final /* synthetic */ OutputStream mo10052a() {
        return new FileOutputStream(this.f21920a, this.f21921b.contains(kiy.f8690a));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21920a);
        String valueOf2 = String.valueOf(this.f21921b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length());
        stringBuilder.append("Files.asByteSink(");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
