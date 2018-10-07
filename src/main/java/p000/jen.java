package p000;

/* compiled from: PG */
/* renamed from: jen */
public final class jen {
    /* renamed from: b */
    private static final jhv f8111b = jhv.m4554a(33321, 36756, 33325, 33326, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 36757, 33327, 33328, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 34837, 36221, 36239, 36215, 36233, 36209, 36227, 32856, 35907, 36759, 32855, 32854, 32857, 34842, 34836, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
    /* renamed from: c */
    private static final jhv f8112c = jhv.m4554a(33321, 36756, 33325, 33323, 36757, 33327, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 32856, 35907, 36759, 32855, 32854, 32857, 34842);
    /* renamed from: d */
    private static final int[][][][] f8113d;
    /* renamed from: a */
    public final int f8114a;

    static {
        jhv.m4554a(33321, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 36194, 32856, 35907, 32855, 32854, 32857, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
        r0 = new int[4][][][];
        int[][][] iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{33329, 33331, 33333};
        r2[1] = new int[]{33330, 33332, 33334};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 33325, 33326};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[0] = iArr;
        iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{33335, 33337, 33339};
        r2[1] = new int[]{33336, 33338, 33340};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 33327, 33328};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[1] = iArr;
        iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{36239, 36233, 36227};
        r2[1] = new int[]{36221, 36215, 36209};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 34843, 34837};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[2] = iArr;
        iArr = new int[2][][];
        r2 = new int[2][];
        r2[0] = new int[]{36238, 36232, 36226};
        r2[1] = new int[]{36220, 36214, 36208};
        iArr[0] = r2;
        r2 = new int[2][];
        r2[0] = new int[]{0, 34842, 34836};
        r2[1] = new int[]{0, 0, 0};
        iArr[1] = r2;
        r0[3] = iArr;
        f8113d = r0;
    }

    private jen(int i) {
        boolean a = f8111b.mo9438a(i);
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Not a valid GL sized format: ");
        stringBuilder.append(i);
        jri.m13396a(a, stringBuilder.toString());
        this.f8114a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jen)) {
            return false;
        }
        if (this.f8114a != ((jen) obj).f8114a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static jen m4490a(jdc jdc) {
        int i;
        String d;
        StringBuilder stringBuilder;
        int i2 = 1;
        int i3 = 0;
        jcg jcg = jdc.f21431c;
        int length = jdc.f21430b.length;
        switch (jcg.mo9321b() - 1) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                if (jcg.mo9320a() == 8) {
                    switch (length) {
                        case 1:
                            return new jen(33321);
                        case 2:
                            return new jen(33323);
                        case 3:
                            return new jen(32849);
                        case 4:
                            return new jen(32856);
                        default:
                            StringBuilder stringBuilder2 = new StringBuilder(40);
                            stringBuilder2.append("Unsupported channel count '");
                            stringBuilder2.append(length);
                            stringBuilder2.append("'!");
                            throw new jeo(stringBuilder2.toString());
                    }
                }
                i2 = jcg.mo9320a();
                StringBuilder stringBuilder3 = new StringBuilder(46);
                stringBuilder3.append("Unsupported normalized bit size '");
                stringBuilder3.append(i2);
                stringBuilder3.append("'!");
                throw new jeo(stringBuilder3.toString());
            default:
                d = jcg.mo9323d();
                stringBuilder = new StringBuilder(String.valueOf(d).length() + 18);
                stringBuilder.append("Unsupported type ");
                stringBuilder.append(d);
                stringBuilder.append("!");
                throw new jeo(stringBuilder.toString());
        }
        int c = jcg.mo9322c() ^ 1;
        switch (jcg.mo9320a()) {
            case 8:
                i2 = 0;
                break;
            case 16:
                break;
            case 32:
                i2 = 2;
                break;
            default:
                i2 = -1;
                break;
        }
        if (i2 >= 0) {
            i3 = f8113d[length - 1][i][c][i2];
        }
        if (i3 != 0) {
            return new jen(i3);
        }
        d = String.valueOf(jcg);
        stringBuilder = new StringBuilder(String.valueOf(d).length() + 27);
        stringBuilder.append("Unsupported format type '");
        stringBuilder.append(d);
        stringBuilder.append("'!");
        throw new jeo(stringBuilder.toString());
    }

    public final int hashCode() {
        return this.f8114a;
    }

    /* renamed from: a */
    public final boolean mo9358a() {
        return f8112c.mo9438a(this.f8114a);
    }

    public final String toString() {
        int i = this.f8114a;
        StringBuilder stringBuilder = new StringBuilder(21);
        stringBuilder.append("GLFormat[");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
