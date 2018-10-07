package p000;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: goe */
public final class goe {
    /* renamed from: a */
    private final gnu f5956a;
    /* renamed from: b */
    private final String f5957b;
    /* renamed from: c */
    private final String f5958c;
    /* renamed from: d */
    private File f5959d = null;

    public goe(gnu gnu, String str, String str2) {
        this.f5956a = gnu;
        this.f5957b = str;
        this.f5958c = str2;
    }

    /* renamed from: a */
    public final synchronized File mo7273a() {
        return this.f5959d;
    }

    /* renamed from: b */
    public final synchronized boolean mo7274b() {
        return mo7273a() != null;
    }

    /* renamed from: c */
    public final synchronized boolean mo7275c() {
        boolean z = true;
        synchronized (this) {
            if (this.f5959d == null) {
                try {
                    this.f5959d = this.f5956a.mo7266a(this.f5957b, this.f5958c);
                } catch (IOException e) {
                    z = false;
                }
            }
        }
        return z;
    }
}
