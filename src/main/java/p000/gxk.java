package p000;

/* compiled from: PG */
/* renamed from: gxk */
public enum gxk {
    OFF(0),
    THREE_BY_THREE(1),
    FOUR_BY_FOUR(2),
    GOLDEN_RATIO(3);
    
    /* renamed from: e */
    public final int f6131e;

    private gxk(int i) {
        this.f6131e = i;
    }

    /* renamed from: a */
    public static int[] m2919a() {
        return new int[]{OFF.f6131e, THREE_BY_THREE.f6131e, FOUR_BY_FOUR.f6131e, GOLDEN_RATIO.f6131e};
    }

    /* renamed from: a */
    public static gxk m2918a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return THREE_BY_THREE;
            case 2:
                return FOUR_BY_FOUR;
            case 3:
                return GOLDEN_RATIO;
            default:
                return OFF;
        }
    }
}
