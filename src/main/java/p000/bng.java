package p000;

import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bng */
final class bng implements bno {
    /* renamed from: a */
    private final /* synthetic */ bnd f11573a;

    bng(bnd bnd) {
        this.f11573a = bnd;
    }

    /* renamed from: a */
    public final void mo2056a(long j) {
    }

    /* renamed from: a */
    public final void mo2059a(UUID uuid, long j, IOException iOException) {
        bnh bnh = (bnh) this.f11573a.f11560h.get(uuid);
        if (bnh != null) {
            bnh.f1373i.mo12590e();
        }
    }

    /* renamed from: a */
    public final void mo2057a(bnk bnk) {
        bnh bnh = (bnh) this.f11573a.f11560h.get(bnk.f11579a);
        if (bnh != null) {
            if (bnh.f1370f.incrementAndGet() == 3) {
                this.f11573a.f11561i.execute(new bne(bnh, bnk));
            }
            bnh.f1365a.mo13367a((bnl) bnk);
            bnh.f1373i.mo12591f();
            this.f11573a.mo12392a(bnh);
        } else {
            bnk.mo2045a();
        }
        if (this.f11573a.f11566n.get()) {
            this.f11573a.mo12396h();
        }
    }

    /* renamed from: a */
    public final void mo2058a(fkp fkp) {
        UUID uuid = (UUID) fkp.mo15528a(fkr.f4833d);
        bnh bnh = (bnh) this.f11573a.f11560h.get(uuid);
        if (bnh != null) {
            int incrementAndGet = bnh.f1371g.incrementAndGet();
            bnh.f1372h.mo2064a(incrementAndGet);
            if (incrementAndGet >= 3) {
                this.f11573a.mo12394a(uuid, true);
            }
        }
    }
}
