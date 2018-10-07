package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: bwh */
public final class bwh implements bwp {
    /* renamed from: a */
    private final List f22862a = new ArrayList(100);
    /* renamed from: b */
    private boolean f22863b = true;
    /* renamed from: c */
    private final /* synthetic */ bxq f22864c;

    public bwh(bxq bxq) {
        this.f22864c = bxq;
    }

    public final synchronized void close() {
        this.f22863b = false;
        this.f22864c.mo12441a(this);
    }

    /* renamed from: a */
    public final synchronized void mo12435a(long j, long j2, bwq bwq) {
        if (this.f22863b) {
            cci cci;
            synchronized (this.f22864c) {
                cci = this.f22864c.f11928a;
                if (cci != null) {
                    cci.f12148d.mo12445a(j, j2, this.f22862a);
                }
            }
            bwq.mo2188a(this.f22862a);
            synchronized (this.f22864c) {
                cci = this.f22864c.f11928a;
                if (cci != null) {
                    cci.f12148d.mo12446a(this.f22862a);
                }
            }
        } else {
            bwq.mo2188a(Collections.emptyList());
        }
    }
}
