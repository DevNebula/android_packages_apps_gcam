package p000;

import android.net.Uri;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: glo */
public final class glo implements gln {
    /* renamed from: b */
    private static final String f19285b = bli.m887a("CaptureSessMgrImpl");
    /* renamed from: a */
    public final Map f19286a = new LinkedHashMap();
    /* renamed from: c */
    private final gnu f19287c;
    /* renamed from: d */
    private final ikd f19288d;
    /* renamed from: e */
    private final iya f19289e;
    /* renamed from: f */
    private final irs f19290f;

    public glo(gnu gnu, ikd ikd, iya iya, irs irs) {
        this.f19287c = gnu;
        this.f19288d = ikd;
        this.f19289e = iya;
        this.f19290f = irs;
    }

    /* renamed from: a */
    public final void mo7200a(glq glq) {
        this.f19288d.execute(new glp(this, glq));
    }

    /* renamed from: a */
    public final void mo7198a(Uri uri) {
        gkr c;
        synchronized (this.f19286a) {
            c = m11377c(uri);
        }
        if (c != null) {
            c.mo13377e();
        } else {
            bli.m898e(f19285b, "Session was already removed, cannot be finalized");
        }
    }

    /* renamed from: b */
    public final gkr mo7201b(Uri uri) {
        gkr gkr;
        synchronized (this.f19286a) {
            gkr = (gkr) this.f19286a.get(uri.toString());
        }
        return gkr;
    }

    /* renamed from: a */
    public final File mo7197a(String str) {
        return this.f19287c.mo7265a(str);
    }

    /* renamed from: a */
    public final void mo7199a(gkr gkr) {
        glm grj = new grj(this.f19290f, this.f19289e);
        ((grg) jri.m13404b(gkr.mo7077h())).mo7370a((grj) grj);
        gkr.mo13369a(grj);
        synchronized (this.f19286a) {
            this.f19286a.put(gkr.mo13386o().toString(), gkr);
        }
    }

    /* renamed from: c */
    private final gkr m11377c(Uri uri) {
        if (uri == null) {
            return null;
        }
        gkr gkr;
        synchronized (this.f19286a) {
            gkr = (gkr) this.f19286a.remove(uri.toString());
        }
        return gkr;
    }
}
