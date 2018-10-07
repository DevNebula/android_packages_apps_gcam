package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: bja */
public final class bja {
    /* renamed from: a */
    private final gsx f1228a;

    public bja(gsx gsx) {
        this.f1228a = gsx;
    }

    /* renamed from: a */
    public final void mo1979a() {
        File[] listFiles = this.f1228a.mo7425a().listFiles(new bjb());
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.length() == 0) {
                    file.delete();
                }
            }
        }
    }
}
