package p000;

/* compiled from: PG */
/* renamed from: gon */
public enum gon {
    MICRO_OFF(0),
    MICRO_AUTO(1),
    MICRO_ON(2);
    
    /* renamed from: d */
    public final int f5971d;

    private gon(int i) {
        this.f5971d = i;
    }

    /* renamed from: a */
    public static gon m2713a(int i) {
        switch (i) {
            case 0:
                return MICRO_OFF;
            case 1:
                return MICRO_AUTO;
            case 2:
                return MICRO_ON;
            default:
                return MICRO_AUTO;
        }
    }
}
