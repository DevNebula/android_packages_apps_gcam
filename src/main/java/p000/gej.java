package p000;

/* compiled from: PG */
/* renamed from: gej */
final class gej implements iqb {
    /* renamed from: a */
    private final /* synthetic */ geg f19114a;

    gej(geg geg) {
        this.f19114a = geg;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8765a(Object obj) {
        geu geu = (geu) obj;
        geg geg = this.f19114a;
        synchronized (geg.f19106d) {
            geg.f19107e = false;
            ilb ilb = geg.f19103a;
            ilb.mo8826a(Long.valueOf(((Long) ilb.mo13673b()).longValue() - geg.f19104b));
            geg.mo13334c();
        }
        geu.removeFinishedCallback(this);
    }
}
