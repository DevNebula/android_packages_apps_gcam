package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import com.google.android.libraries.smartburst.filterfw.FrameType;

/* compiled from: PG */
/* renamed from: kkf */
public final class kkf extends kvf {
    /* renamed from: A */
    public float f25088A;
    /* renamed from: B */
    public boolean f25089B;
    /* renamed from: C */
    public float f25090C;
    /* renamed from: D */
    public float f25091D;
    /* renamed from: E */
    public float f25092E;
    /* renamed from: F */
    public boolean f25093F;
    /* renamed from: G */
    private boolean f25094G;
    /* renamed from: H */
    private float f25095H;
    /* renamed from: I */
    private int[] f25096I;
    /* renamed from: J */
    private int[] f25097J;
    /* renamed from: K */
    private float f25098K;
    /* renamed from: L */
    private int f25099L;
    /* renamed from: a */
    public float f25100a;
    /* renamed from: b */
    public float f25101b;
    /* renamed from: c */
    public float f25102c;
    /* renamed from: d */
    public float f25103d;
    /* renamed from: e */
    public float f25104e;
    /* renamed from: f */
    public float f25105f;
    /* renamed from: g */
    public float f25106g;
    /* renamed from: h */
    public float f25107h;
    /* renamed from: i */
    public int f25108i;
    /* renamed from: j */
    public int f25109j;
    /* renamed from: k */
    public float[] f25110k;
    /* renamed from: l */
    public int f25111l;
    /* renamed from: m */
    public int f25112m;
    /* renamed from: n */
    public float f25113n;
    /* renamed from: o */
    public float f25114o;
    /* renamed from: p */
    public boolean f25115p;
    /* renamed from: q */
    public boolean f25116q;
    /* renamed from: r */
    public float[] f25117r;
    /* renamed from: s */
    public boolean[] f25118s;
    /* renamed from: t */
    public float f25119t;
    /* renamed from: u */
    public float f25120u;
    /* renamed from: v */
    public float f25121v;
    /* renamed from: w */
    public float f25122w;
    /* renamed from: x */
    public float f25123x;
    /* renamed from: y */
    public float f25124y;
    /* renamed from: z */
    public float f25125z;

    public kkf() {
        this.f25094G = false;
        this.f25100a = 0.0f;
        this.f25101b = 0.0f;
        this.f25102c = 0.0f;
        this.f25103d = 0.0f;
        this.f25104e = 0.0f;
        this.f25095H = 0.0f;
        this.f25105f = 0.0f;
        this.f25106g = 0.0f;
        this.f25107h = 0.0f;
        this.f25108i = 0;
        this.f25109j = 0;
        this.f25110k = kvn.f9032g;
        this.f25096I = kvn.f9030e;
        this.f25097J = kvn.f9030e;
        this.f25111l = 0;
        this.f25112m = 0;
        this.f25098K = 0.0f;
        this.f25113n = 0.0f;
        this.f25114o = 0.0f;
        this.f25115p = false;
        this.f25116q = false;
        this.f25117r = kvn.f9032g;
        this.f25118s = kvn.f9033h;
        this.f25119t = 0.0f;
        this.f25120u = 0.0f;
        this.f25121v = 0.0f;
        this.f25122w = 0.0f;
        this.f25123x = 0.0f;
        this.f25124y = 0.0f;
        this.f25125z = 0.0f;
        this.f25088A = 0.0f;
        this.f25099L = 0;
        this.f25089B = false;
        this.f25090C = 0.0f;
        this.f25091D = 0.0f;
        this.f25092E = 0.0f;
        this.f25093F = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int i;
        int i2 = 0;
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f25094G) {
            computeSerializedSize += kvd.m5484b(8) + 1;
        }
        if (Float.floatToIntBits(this.f25100a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        if (Float.floatToIntBits(this.f25101b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (Float.floatToIntBits(this.f25102c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        if (Float.floatToIntBits(this.f25103d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(40) + 4;
        }
        if (Float.floatToIntBits(this.f25104e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(48) + 4;
        }
        if (Float.floatToIntBits(this.f25095H) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(56) + 4;
        }
        if (Float.floatToIntBits(this.f25105f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(64) + 4;
        }
        if (Float.floatToIntBits(this.f25106g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(72) + 4;
        }
        if (Float.floatToIntBits(this.f25107h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(80) + 4;
        }
        int i3 = this.f25108i;
        if (i3 != 0) {
            computeSerializedSize += kvd.m5476a(12, i3);
        }
        i3 = this.f25109j;
        if (i3 != 0) {
            computeSerializedSize += kvd.m5476a(13, i3);
        }
        float[] fArr = this.f25110k;
        if (fArr != null) {
            i3 = fArr.length;
            if (i3 > 0) {
                i = (computeSerializedSize + (i3 << 2)) + i3;
            } else {
                i = computeSerializedSize;
            }
        } else {
            i = computeSerializedSize;
        }
        int[] iArr = this.f25096I;
        if (iArr == null) {
            computeSerializedSize = i;
        } else if (iArr.length > 0) {
            int length;
            computeSerializedSize = 0;
            i3 = 0;
            while (true) {
                int[] iArr2 = this.f25096I;
                length = iArr2.length;
                if (computeSerializedSize >= length) {
                    break;
                }
                i3 += kvd.m5475a(iArr2[computeSerializedSize]);
                computeSerializedSize++;
            }
            computeSerializedSize = (i + i3) + length;
        } else {
            computeSerializedSize = i;
        }
        int[] iArr3 = this.f25097J;
        if (iArr3 != null && iArr3.length > 0) {
            int length2;
            i3 = 0;
            while (true) {
                int[] iArr4 = this.f25097J;
                length2 = iArr4.length;
                if (i2 >= length2) {
                    break;
                }
                i3 += kvd.m5475a(iArr4[i2]);
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (length2 + length2);
        }
        i2 = this.f25111l;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5476a(17, i2);
        }
        i2 = this.f25112m;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5476a(18, i2);
        }
        if (Float.floatToIntBits(this.f25098K) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(152) + 4;
        }
        if (Float.floatToIntBits(this.f25113n) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(160) + 4;
        }
        if (Float.floatToIntBits(this.f25114o) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(168) + 4;
        }
        if (this.f25115p) {
            computeSerializedSize += kvd.m5484b(176) + 1;
        }
        if (this.f25116q) {
            computeSerializedSize += kvd.m5484b(184) + 1;
        }
        float[] fArr2 = this.f25117r;
        if (fArr2 != null) {
            i2 = fArr2.length;
            if (i2 > 0) {
                computeSerializedSize = (computeSerializedSize + (i2 << 2)) + (i2 + i2);
            }
        }
        boolean[] zArr = this.f25118s;
        if (zArr != null) {
            i2 = zArr.length;
            if (i2 > 0) {
                computeSerializedSize = (computeSerializedSize + i2) + (i2 + i2);
            }
        }
        if (Float.floatToIntBits(this.f25119t) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(208) + 4;
        }
        if (Float.floatToIntBits(this.f25120u) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b((int) XmpUtil.M_SOI) + 4;
        }
        if (Float.floatToIntBits(this.f25121v) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(224) + 4;
        }
        if (Float.floatToIntBits(this.f25122w) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(232) + 4;
        }
        if (Float.floatToIntBits(this.f25123x) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(240) + 4;
        }
        if (Float.floatToIntBits(this.f25124y) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(248) + 4;
        }
        if (Float.floatToIntBits(this.f25125z) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(256) + 4;
        }
        if (Float.floatToIntBits(this.f25088A) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(264) + 4;
        }
        i2 = this.f25099L;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5476a(34, i2);
        }
        if (this.f25089B) {
            computeSerializedSize += kvd.m5484b(280) + 1;
        }
        if (Float.floatToIntBits(this.f25090C) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(288) + 4;
        }
        if (Float.floatToIntBits(this.f25091D) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(296) + 4;
        }
        if (Float.floatToIntBits(this.f25092E) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(304) + 4;
        }
        if (this.f25093F) {
            return computeSerializedSize + (kvd.m5484b(312) + 1);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            int c;
            int i2;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25094G = kvc.mo10480c();
                    continue;
                case 21:
                    this.f25100a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 29:
                    this.f25101b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 37:
                    this.f25102c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 45:
                    this.f25103d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 53:
                    this.f25104e = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 61:
                    this.f25095H = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 69:
                    this.f25105f = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 77:
                    this.f25106g = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 85:
                    this.f25107h = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 96:
                    this.f25108i = kvc.mo10485f();
                    continue;
                case 104:
                    this.f25109j = kvc.mo10485f();
                    continue;
                case 114:
                    i = kvc.mo10485f();
                    c = kvc.mo10479c(i);
                    i2 = i / 4;
                    obj = this.f25110k;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new float[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length) {
                        obj2[i] = Float.intBitsToFloat(kvc.mo10481d());
                        i++;
                    }
                    this.f25110k = obj2;
                    kvc.mo10477b(c);
                    continue;
                case 117:
                    c = kvn.m5518a(kvc, 117);
                    obj2 = this.f25110k;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new float[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = Float.intBitsToFloat(kvc.mo10481d());
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = Float.intBitsToFloat(kvc.mo10481d());
                    this.f25110k = obj3;
                    continue;
                case 120:
                    c = kvn.m5518a(kvc, 120);
                    obj2 = this.f25096I;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new int[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.mo10485f();
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = kvc.mo10485f();
                    this.f25096I = obj3;
                    continue;
                case 122:
                    i2 = kvc.mo10479c(kvc.mo10485f());
                    c = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10485f();
                        i++;
                    }
                    kvc.mo10482d(c);
                    obj = this.f25096I;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    obj4 = new int[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.mo10485f();
                        c++;
                    }
                    this.f25096I = obj4;
                    kvc.mo10477b(i2);
                    continue;
                case 128:
                    c = kvn.m5518a(kvc, 128);
                    obj2 = this.f25097J;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new int[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.mo10485f();
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = kvc.mo10485f();
                    this.f25097J = obj3;
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                    i2 = kvc.mo10479c(kvc.mo10485f());
                    c = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10485f();
                        i++;
                    }
                    kvc.mo10482d(c);
                    obj = this.f25097J;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    obj4 = new int[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.mo10485f();
                        c++;
                    }
                    this.f25097J = obj4;
                    kvc.mo10477b(i2);
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ztrsm /*136*/:
                    this.f25111l = kvc.mo10485f();
                    continue;
                case 144:
                    this.f25112m = kvc.mo10485f();
                    continue;
                case 157:
                    this.f25098K = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case ShutterButton.DISABLED_FILTER_COLOR_VALUE /*165*/:
                    this.f25113n = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 173:
                    this.f25114o = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 176:
                    this.f25115p = kvc.mo10480c();
                    continue;
                case 184:
                    this.f25116q = kvc.mo10480c();
                    continue;
                case 194:
                    i = kvc.mo10485f();
                    c = kvc.mo10479c(i);
                    i2 = i / 4;
                    obj = this.f25117r;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new float[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length) {
                        obj2[i] = Float.intBitsToFloat(kvc.mo10481d());
                        i++;
                    }
                    this.f25117r = obj2;
                    kvc.mo10477b(c);
                    continue;
                case 197:
                    c = kvn.m5518a(kvc, 197);
                    obj2 = this.f25117r;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new float[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = Float.intBitsToFloat(kvc.mo10481d());
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = Float.intBitsToFloat(kvc.mo10481d());
                    this.f25117r = obj3;
                    continue;
                case 200:
                    c = kvn.m5518a(kvc, 200);
                    obj2 = this.f25118s;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new boolean[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.mo10480c();
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = kvc.mo10480c();
                    this.f25118s = obj3;
                    continue;
                case 202:
                    i2 = kvc.mo10479c(kvc.mo10485f());
                    c = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10480c();
                        i++;
                    }
                    kvc.mo10482d(c);
                    obj = this.f25118s;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    obj4 = new boolean[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.mo10480c();
                        c++;
                    }
                    this.f25118s = obj4;
                    kvc.mo10477b(i2);
                    continue;
                case 213:
                    this.f25119t = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 221:
                    this.f25120u = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 229:
                    this.f25121v = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 237:
                    this.f25122w = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 245:
                    this.f25123x = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 253:
                    this.f25124y = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 261:
                    this.f25125z = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 269:
                    this.f25088A = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 272:
                    this.f25099L = kvc.mo10485f();
                    continue;
                case 280:
                    this.f25089B = kvc.mo10480c();
                    continue;
                case 293:
                    this.f25090C = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case FrameType.ELEMENT_RGBA8888 /*301*/:
                    this.f25091D = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 309:
                    this.f25092E = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 312:
                    this.f25093F = kvc.mo10480c();
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
        float[] fArr;
        int[] iArr;
        int i = 0;
        boolean z = this.f25094G;
        if (z) {
            kvd.mo10491a(1, z);
        }
        if (Float.floatToIntBits(this.f25100a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25100a);
        }
        if (Float.floatToIntBits(this.f25101b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25101b);
        }
        if (Float.floatToIntBits(this.f25102c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25102c);
        }
        if (Float.floatToIntBits(this.f25103d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f25103d);
        }
        if (Float.floatToIntBits(this.f25104e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f25104e);
        }
        if (Float.floatToIntBits(this.f25095H) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(7, this.f25095H);
        }
        if (Float.floatToIntBits(this.f25105f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(8, this.f25105f);
        }
        if (Float.floatToIntBits(this.f25106g) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(9, this.f25106g);
        }
        if (Float.floatToIntBits(this.f25107h) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(10, this.f25107h);
        }
        int i2 = this.f25108i;
        if (i2 != 0) {
            kvd.mo10493b(12, i2);
        }
        i2 = this.f25109j;
        if (i2 != 0) {
            kvd.mo10493b(13, i2);
        }
        float[] fArr2 = this.f25110k;
        if (fArr2 != null && fArr2.length > 0) {
            i2 = 0;
            while (true) {
                fArr = this.f25110k;
                if (i2 >= fArr.length) {
                    break;
                }
                kvd.mo10490a(14, fArr[i2]);
                i2++;
            }
        }
        int[] iArr2 = this.f25096I;
        if (iArr2 != null && iArr2.length > 0) {
            i2 = 0;
            while (true) {
                iArr = this.f25096I;
                if (i2 >= iArr.length) {
                    break;
                }
                kvd.mo10493b(15, iArr[i2]);
                i2++;
            }
        }
        iArr2 = this.f25097J;
        if (iArr2 != null && iArr2.length > 0) {
            i2 = 0;
            while (true) {
                iArr = this.f25097J;
                if (i2 >= iArr.length) {
                    break;
                }
                kvd.mo10493b(16, iArr[i2]);
                i2++;
            }
        }
        i2 = this.f25111l;
        if (i2 != 0) {
            kvd.mo10493b(17, i2);
        }
        i2 = this.f25112m;
        if (i2 != 0) {
            kvd.mo10493b(18, i2);
        }
        if (Float.floatToIntBits(this.f25098K) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(19, this.f25098K);
        }
        if (Float.floatToIntBits(this.f25113n) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(20, this.f25113n);
        }
        if (Float.floatToIntBits(this.f25114o) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(21, this.f25114o);
        }
        z = this.f25115p;
        if (z) {
            kvd.mo10491a(22, z);
        }
        z = this.f25116q;
        if (z) {
            kvd.mo10491a(23, z);
        }
        fArr2 = this.f25117r;
        if (fArr2 != null && fArr2.length > 0) {
            i2 = 0;
            while (true) {
                fArr = this.f25117r;
                if (i2 >= fArr.length) {
                    break;
                }
                kvd.mo10490a(24, fArr[i2]);
                i2++;
            }
        }
        boolean[] zArr = this.f25118s;
        if (zArr != null && zArr.length > 0) {
            while (true) {
                zArr = this.f25118s;
                if (i >= zArr.length) {
                    break;
                }
                kvd.mo10491a(25, zArr[i]);
                i++;
            }
        }
        if (Float.floatToIntBits(this.f25119t) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(26, this.f25119t);
        }
        if (Float.floatToIntBits(this.f25120u) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(27, this.f25120u);
        }
        if (Float.floatToIntBits(this.f25121v) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(28, this.f25121v);
        }
        if (Float.floatToIntBits(this.f25122w) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(29, this.f25122w);
        }
        if (Float.floatToIntBits(this.f25123x) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(30, this.f25123x);
        }
        if (Float.floatToIntBits(this.f25124y) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(31, this.f25124y);
        }
        if (Float.floatToIntBits(this.f25125z) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(32, this.f25125z);
        }
        if (Float.floatToIntBits(this.f25088A) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(33, this.f25088A);
        }
        i2 = this.f25099L;
        if (i2 != 0) {
            kvd.mo10493b(34, i2);
        }
        z = this.f25089B;
        if (z) {
            kvd.mo10491a(35, z);
        }
        if (Float.floatToIntBits(this.f25090C) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(36, this.f25090C);
        }
        if (Float.floatToIntBits(this.f25091D) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(37, this.f25091D);
        }
        if (Float.floatToIntBits(this.f25092E) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(38, this.f25092E);
        }
        z = this.f25093F;
        if (z) {
            kvd.mo10491a(39, z);
        }
        super.writeTo(kvd);
    }
}
