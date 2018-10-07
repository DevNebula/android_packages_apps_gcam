package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cfw */
final class cfw implements iqt {
    /* renamed from: a */
    private final /* synthetic */ int f12334a;
    /* renamed from: b */
    private final /* synthetic */ AtomicReference f12335b;
    /* renamed from: c */
    private final /* synthetic */ cfk f12336c;

    cfw(cfk cfk, int i, AtomicReference atomicReference) {
        this.f12336c = cfk;
        this.f12334a = i;
        this.f12335b = atomicReference;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((grt) this.f12336c.f23174i.modeSwitch().getCurrentSession()).mo13464b();
            this.f12336c.f23069Q.mo8907b(this.f12334a, 0, ((grt) this.f12336c.f23174i.modeSwitch().getCurrentSession()).f2597k, ((grt) this.f12336c.f23174i.modeSwitch().getCurrentSession()).f19531a);
            if (this.f12335b.get() != null) {
                ((iqo) this.f12335b.get()).close();
            }
        }
    }
}
