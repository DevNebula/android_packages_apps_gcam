package p000;

/* compiled from: PG */
/* renamed from: cyn */
final class cyn implements iqt {
    /* renamed from: a */
    public final /* synthetic */ cyd f13480a;

    cyn(cyd cyd) {
        this.f13480a = cyd;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        boolean z;
        fbi fbi = (fbi) obj;
        cyd cyd = this.f13480a;
        if (fbi == fbi.RUNNING) {
            z = true;
        } else {
            z = false;
        }
        cyd.f25828N = z;
        cyd cyd2 = this.f13480a;
        if (!cyd2.f25828N) {
            cyd2.f25829O.execute(new cyo(this));
        }
    }
}
