package p000;

import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bnr */
final class bnr implements kov {
    /* renamed from: a */
    private final /* synthetic */ bno f11610a;
    /* renamed from: b */
    private final /* synthetic */ fkp f11611b;

    bnr(bno bno, fkp fkp) {
        this.f11610a = bno;
        this.f11611b = fkp;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bno bno = this.f11610a;
        fkp fkp = this.f11611b;
        bno.mo2059a((UUID) fkp.mo15528a(fkr.f4833d), fkp.mo13744f(), new IOException(th));
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        obj = (foz) obj;
        jri.m13404b(obj);
        this.f11610a.mo2056a(obj.f4881a);
    }
}
