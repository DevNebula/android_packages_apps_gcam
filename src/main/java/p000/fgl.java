package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fgl */
public final class fgl extends imq {
    /* renamed from: b */
    private final int f26349b;

    public fgl(ilp ilp, ilp ilp2, ilb ilb, ffc ffc) {
        super(ilq.m3880a(ilp, ilp2, ilb));
        this.f26349b = ffc.mo9077p();
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        List list = (List) obj;
        Boolean bool = (Boolean) list.get(0);
        ius ius = (ius) list.get(1);
        if (((gig) list.get(2)) != gig.AUTO) {
            if (this.f26349b == C0252go.f5869bO && bool.booleanValue()) {
                return Integer.valueOf(2);
            }
            if (ius == ius.FULL || ius == ius.SIMPLE) {
                return Integer.valueOf(2);
            }
        }
        return Integer.valueOf(1);
    }
}
