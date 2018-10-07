package p000;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* renamed from: jxv */
final class jxv implements FilenameFilter {
    /* renamed from: a */
    private final /* synthetic */ jxu f8443a;

    jxv(jxu jxu) {
        this.f8443a = jxu;
    }

    public final boolean accept(File file, String str) {
        return this.f8443a.f21801a.mo9604a().matcher(str).matches();
    }
}
