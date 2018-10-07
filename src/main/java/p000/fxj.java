package p000;

/* compiled from: PG */
/* renamed from: fxj */
public enum fxj {
    ON("on", C0252go.f5804aC),
    AUTO("auto", C0252go.f5803aB),
    OFF("off", C0252go.f5802aA);
    
    /* renamed from: d */
    public final String f5022d;
    /* renamed from: e */
    public final int f5023e;

    private fxj(String str, int i) {
        this.f5022d = str;
        this.f5023e = i;
    }

    /* renamed from: a */
    public static fxj m2464a(String str, fxj fxj) {
        jri.m13404b((Object) str);
        if (AUTO.f5022d.equals(str)) {
            return AUTO;
        }
        if (OFF.f5022d.equals(str)) {
            return OFF;
        }
        if (ON.f5022d.equals(str)) {
            return ON;
        }
        return fxj;
    }
}
