package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* renamed from: kka */
public final class kka extends kvf {
    /* renamed from: a */
    public String f25041a;
    /* renamed from: b */
    public String f25042b;
    /* renamed from: c */
    public float f25043c;
    /* renamed from: d */
    public int f25044d;
    /* renamed from: e */
    public float f25045e;
    /* renamed from: f */
    public float f25046f;
    /* renamed from: g */
    public boolean f25047g;
    /* renamed from: h */
    public int f25048h;
    /* renamed from: i */
    public int f25049i;
    /* renamed from: j */
    public int f25050j;
    /* renamed from: k */
    public boolean f25051k;
    /* renamed from: l */
    public int f25052l;
    /* renamed from: m */
    public float f25053m;
    /* renamed from: n */
    private String f25054n;
    /* renamed from: o */
    private float f25055o;

    public kka() {
        this.f25041a = "";
        this.f25054n = "";
        this.f25042b = "";
        this.f25043c = 0.0f;
        this.f25044d = 0;
        this.f25045e = 0.0f;
        this.f25046f = 0.0f;
        this.f25055o = 0.0f;
        this.f25047g = false;
        this.f25048h = 0;
        this.f25049i = 0;
        this.f25050j = 0;
        this.f25051k = false;
        this.f25052l = 0;
        this.f25053m = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25041a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25041a);
        }
        str = this.f25054n;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(2, this.f25054n);
        }
        str = this.f25042b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(3, this.f25042b);
        }
        if (Float.floatToIntBits(this.f25043c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        int i = this.f25044d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(5, i);
        }
        if (Float.floatToIntBits(this.f25045e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(48) + 4;
        }
        if (Float.floatToIntBits(this.f25046f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(56) + 4;
        }
        if (Float.floatToIntBits(this.f25055o) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(64) + 4;
        }
        if (this.f25047g) {
            computeSerializedSize += kvd.m5484b(72) + 1;
        }
        i = this.f25048h;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(10, i);
        }
        i = this.f25049i;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(11, i);
        }
        i = this.f25050j;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(12, i);
        }
        if (this.f25051k) {
            computeSerializedSize += kvd.m5484b(104) + 1;
        }
        i = this.f25052l;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(14, i);
        }
        if (Float.floatToIntBits(this.f25053m) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(120) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f25041a = kvc.mo10487h();
                    continue;
                case 18:
                    this.f25054n = kvc.mo10487h();
                    continue;
                case 26:
                    this.f25042b = kvc.mo10487h();
                    continue;
                case 37:
                    this.f25043c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 40:
                    this.f25044d = kvc.mo10485f();
                    continue;
                case 53:
                    this.f25045e = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 61:
                    this.f25046f = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 69:
                    this.f25055o = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 72:
                    this.f25047g = kvc.mo10480c();
                    continue;
                case 80:
                    this.f25048h = kvc.mo10485f();
                    continue;
                case 88:
                    this.f25049i = kvc.mo10485f();
                    continue;
                case 96:
                    this.f25050j = kvc.mo10485f();
                    continue;
                case 104:
                    this.f25051k = kvc.mo10480c();
                    continue;
                case 112:
                    this.f25052l = kvc.mo10485f();
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_cgemm /*125*/:
                    this.f25053m = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }

    public final void writeTo(kvd kvd) {
        String str = this.f25041a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25041a);
        }
        str = this.f25054n;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f25054n);
        }
        str = this.f25042b;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(3, this.f25042b);
        }
        if (Float.floatToIntBits(this.f25043c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25043c);
        }
        int i = this.f25044d;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        if (Float.floatToIntBits(this.f25045e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f25045e);
        }
        if (Float.floatToIntBits(this.f25046f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(7, this.f25046f);
        }
        if (Float.floatToIntBits(this.f25055o) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(8, this.f25055o);
        }
        boolean z = this.f25047g;
        if (z) {
            kvd.mo10491a(9, z);
        }
        i = this.f25048h;
        if (i != 0) {
            kvd.mo10493b(10, i);
        }
        i = this.f25049i;
        if (i != 0) {
            kvd.mo10493b(11, i);
        }
        i = this.f25050j;
        if (i != 0) {
            kvd.mo10493b(12, i);
        }
        z = this.f25051k;
        if (z) {
            kvd.mo10491a(13, z);
        }
        i = this.f25052l;
        if (i != 0) {
            kvd.mo10493b(14, i);
        }
        if (Float.floatToIntBits(this.f25053m) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(15, this.f25053m);
        }
        super.writeTo(kvd);
    }
}
