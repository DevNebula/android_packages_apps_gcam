package p000;

/* compiled from: PG */
/* renamed from: gcb */
public class gcb {
    /* renamed from: a */
    public static final int f5289a = 1;
    /* renamed from: b */
    public static final int f5290b = 2;
    /* renamed from: c */
    public static final int f5291c = 1;
    /* renamed from: d */
    public static final int f5292d = 2;
    /* renamed from: e */
    public static final int f5293e = 3;
    /* renamed from: f */
    public static final int f5294f = 4;
    /* renamed from: g */
    public static final int f5295g = 5;
    /* renamed from: h */
    public static final int f5296h = 6;
    /* renamed from: i */
    public static final int f5297i = 7;
    /* renamed from: j */
    public static final int f5298j = 8;
    /* renamed from: k */
    public static final int f5299k = 9;
    /* renamed from: l */
    public static final /* synthetic */ int[] f5300l = new int[]{f5291c, f5292d, f5293e, f5294f, f5295g, f5296h, f5297i, f5298j, f5299k};
    /* renamed from: m */
    private static final int f5301m = 3;
    /* renamed from: n */
    private static final int f5302n = 4;
    /* renamed from: o */
    private static final /* synthetic */ int[] f5303o = new int[]{f5289a, f5290b, f5301m, f5302n};

    /* renamed from: a */
    public static int m2522a(iqm iqm, boolean z) {
        if (z) {
            if (iqm == iqm.CLOCKWISE_0) {
                return f5289a;
            }
            if (iqm == iqm.CLOCKWISE_90) {
                return f5301m;
            }
            if (iqm == iqm.CLOCKWISE_180) {
                return f5290b;
            }
            return f5302n;
        } else if (iqm == iqm.CLOCKWISE_0) {
            return f5301m;
        } else {
            if (iqm == iqm.CLOCKWISE_90) {
                return f5289a;
            }
            if (iqm == iqm.CLOCKWISE_180) {
                return f5302n;
            }
            return f5290b;
        }
    }

    /* renamed from: a */
    public static boolean m2523a(int i) {
        if (i != 0) {
            return i == f5301m || i == f5302n;
        } else {
            throw null;
        }
    }
}
