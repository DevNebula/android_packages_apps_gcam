package p000;

/* compiled from: PG */
/* renamed from: cyl */
final class cyl implements iqt {
    /* renamed from: a */
    private final /* synthetic */ cyd f13478a;

    cyl(cyd cyd) {
        this.f13478a = cyd;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            bli.m888a(cyd.f25814c, "progress overlay shows");
            this.f13478a.f25833S.mo7136e();
            return;
        }
        this.f13478a.f25833S.mo7135d();
        bli.m888a(cyd.f25814c, "progress overlay hides");
    }
}
