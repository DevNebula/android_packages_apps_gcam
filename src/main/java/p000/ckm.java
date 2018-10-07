package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: ckm */
public final class ckm {
    /* renamed from: a */
    private static final String f2295a = bli.m887a("BurstFSPM");
    /* renamed from: b */
    private final File f2296b;
    /* renamed from: c */
    private final File f2297c = new File(this.f2296b, ".burst_in_progress.lock");

    public ckm(File file) {
        jri.m13404b((Object) file);
        this.f2296b = file;
    }

    /* renamed from: a */
    public final synchronized boolean mo2351a() {
        return this.f2297c.exists() ^ 1;
    }

    /* renamed from: b */
    public final synchronized void mo2352b() {
        if (!this.f2297c.exists()) {
            bli.m898e(f2295a, "Could not find in progress lock file.");
        } else if (!this.f2297c.delete()) {
            bli.m898e(f2295a, "Could not delete in progress lock file.");
        }
    }

    /* renamed from: c */
    public final synchronized void mo2353c() {
        if (!this.f2296b.exists()) {
            this.f2296b.mkdir();
        }
        if (!this.f2297c.exists()) {
            try {
                this.f2297c.createNewFile();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}
