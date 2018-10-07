package p000;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: clc */
final class clc extends izy {
    /* renamed from: a */
    private final /* synthetic */ jiy f23211a;
    /* renamed from: b */
    private final /* synthetic */ jbj f23212b;
    /* renamed from: c */
    private final /* synthetic */ ckx f23213c;

    clc(ckx ckx, jiy jiy, jbj jbj) {
        this.f23213c = ckx;
        this.f23211a = jiy;
        this.f23212b = jbj;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        Map map = (Map) obj;
        gev b = this.f23213c.f12682h;
        ckx ckx = this.f23213c;
        gln gln = ckx.f12676b;
        File file = ckx.f12677c;
        jip jip = (jip) map.get(this.f23211a);
        jyt jyt = this.f23213c.f12681g;
        jqo jrd = new jrd();
        Executor a = cht.m1154a();
        ckx ckx2 = this.f23213c;
        b.mo7085a(new cof(gln, file, jip, jyt, jrd, a, ckx2.f12679e, this.f23212b, ckx2.f12685k, this.f23213c.f12680f));
    }
}
