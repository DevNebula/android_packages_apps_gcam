package p000;

/* compiled from: PG */
/* renamed from: fer */
public final class fer extends imt {
    /* renamed from: a */
    public ilp f26345a;

    public fer(ilp ilp) {
        super(ilp);
        this.f26345a = ilp;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15011b(Object obj) {
        switch (((Integer) obj).intValue()) {
            case 1:
                return feq.AUTO;
            case 2:
                return feq.INCANDESCENT;
            case 3:
                return feq.FLUORESCENT;
            case 5:
                return feq.SUNNY;
            case 6:
                return feq.CLOUDY;
            default:
                throw new RuntimeException("Unknown WB input value");
        }
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo15012c(Object obj) {
        switch (((feq) obj).ordinal()) {
            case 0:
                return Integer.valueOf(1);
            case 1:
                return Integer.valueOf(6);
            case 2:
                return Integer.valueOf(5);
            case 3:
                return Integer.valueOf(2);
            case 4:
                return Integer.valueOf(3);
            default:
                throw new RuntimeException("Unknown WB output value");
        }
    }
}
