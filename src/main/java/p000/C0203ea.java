package p000;

/* compiled from: PG */
/* renamed from: ea */
class C0203ea {
    /* renamed from: n */
    public C0438qt[] f3638n = null;
    /* renamed from: o */
    public String f3639o;
    /* renamed from: p */
    public int f3640p;

    public C0203ea(C0203ea c0203ea) {
        this.f3639o = c0203ea.f3639o;
        this.f3640p = c0203ea.f3640p;
        this.f3638n = C0437qr.m5799a(c0203ea.f3638n);
    }

    /* renamed from: getPathData$50KLMJ31DPI74RR9CGNN6TBGE1NN4T1FEOQ2UPRIC5O6GQB3ECNL0OBKD1862SJJCLP28K31EHK48OBKC576UP357C______0 */
    public C0438qt[] mo6155xea56d990() {
        return this.f3638n;
    }

    public String getPathName() {
        return this.f3639o;
    }

    /* renamed from: a */
    public boolean mo6154a() {
        return false;
    }

    /* renamed from: setPathData$51DKOOBECHP6UQB45TPNAS3GDTP78BRM6GNMESJ1E1K6IORJ5T862T38A1GN4SR5E8I50OBKD1262T319PNM8P9R55B0____0 */
    public void mo6157xe86a3a9b(C0438qt[] c0438qtArr) {
        if (C0437qr.m5796a(this.f3638n, c0438qtArr)) {
            C0438qt[] c0438qtArr2 = this.f3638n;
            for (int i = 0; i < c0438qtArr.length; i++) {
                c0438qtArr2[i].f9591a = c0438qtArr[i].f9591a;
                int i2 = 0;
                while (true) {
                    float[] fArr = c0438qtArr[i].f9592b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    c0438qtArr2[i].f9592b[i2] = fArr[i2];
                    i2++;
                }
            }
            return;
        }
        this.f3638n = C0437qr.m5799a(c0438qtArr);
    }
}
