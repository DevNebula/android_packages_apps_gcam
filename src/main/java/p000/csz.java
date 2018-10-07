package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: csz */
public final class csz implements csj {
    /* renamed from: a */
    public final csj f13245a;
    /* renamed from: b */
    private final Executor f13246b = new cte();

    public csz(csj csj) {
        this.f13245a = csj;
    }

    /* renamed from: a */
    public final void mo5731a(int i, cre cre) {
        this.f13246b.execute(new ctc(this, i, cre));
    }

    /* renamed from: b */
    public final void mo5733b(int i, cre cre) {
        this.f13246b.execute(new ctd(this, i, cre));
    }

    /* renamed from: a */
    public final void mo5732a(csk csk) {
        this.f13246b.execute(new ctb(this, csk));
    }

    /* renamed from: a */
    public final void mo5730a() {
        this.f13246b.execute(new cta(this));
    }
}
