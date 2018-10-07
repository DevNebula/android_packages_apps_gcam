package p000;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bns */
final class bns implements kov {
    /* renamed from: a */
    private final /* synthetic */ gik f11612a;
    /* renamed from: b */
    private final /* synthetic */ fkp f11613b;
    /* renamed from: c */
    private final /* synthetic */ bno f11614c;
    /* renamed from: d */
    private final /* synthetic */ gil f11615d;
    /* renamed from: e */
    private final /* synthetic */ bnp f11616e;

    bns(bnp bnp, gik gik, fkp fkp, bno bno, gil gil) {
        this.f11616e = bnp;
        this.f11612a = gik;
        this.f11613b = fkp;
        this.f11614c = bno;
        this.f11615d = gil;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bno bno = this.f11614c;
        fkp fkp = this.f11613b;
        bno.mo2059a((UUID) fkp.mo15528a(fkr.f4833d), fkp.mo13744f(), new IOException(th));
        this.f11616e.mo12405a(this.f11615d);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        File file = (File) obj;
        foz foz = (foz) kow.m13881c(this.f11612a.f5482a);
        fkp fkp = this.f11613b;
        int intValue = ((Integer) fkp.mo15528a(fkr.f4835f)).intValue();
        long longValue = ((Long) fkp.mo15528a(fkr.f4834e)).longValue();
        long j = foz.f4881a;
        UUID uuid = (UUID) fkp.mo15528a(fkr.f4833d);
        iqm a = iqm.m4095a(foz.f4883c);
        iqp iqp = foz.f4885e;
        this.f11614c.mo2057a(new bnk(intValue, longValue, j, uuid, file, a, iqp.f7695a, iqp.f7696b));
        this.f11616e.mo12405a(this.f11615d);
    }
}
