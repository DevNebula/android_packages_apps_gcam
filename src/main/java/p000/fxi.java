package p000;

/* compiled from: PG */
/* renamed from: fxi */
public enum fxi {
    AUTO("auto", C0252go.f5803aB),
    OFF("off", C0252go.f5802aA),
    ON("on", C0252go.f5804aC);
    
    /* renamed from: d */
    public final String f5016d;
    /* renamed from: e */
    public final int f5017e;

    private fxi(String str, int i) {
        this.f5016d = str;
        this.f5017e = i;
    }

    /* renamed from: a */
    public static fxi m2463a(String str, fxi fxi) {
        jri.m13404b((Object) str);
        if (AUTO.f5016d.equals(str)) {
            return AUTO;
        }
        if (OFF.f5016d.equals(str)) {
            return OFF;
        }
        if (ON.f5016d.equals(str)) {
            return ON;
        }
        return fxi;
    }
}
