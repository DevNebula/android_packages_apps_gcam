package p000;

/* compiled from: PG */
/* renamed from: jdc */
public abstract class jdc implements jcf {
    /* renamed from: a */
    public final izv f21429a;
    /* renamed from: b */
    public final jce[] f21430b;
    /* renamed from: c */
    public final jcg f21431c;
    /* renamed from: d */
    private final int f21432d;

    protected jdc(jcg jcg, izv izv) {
        this(jcg, izv, (byte) 0);
    }

    private jdc(jcg jcg, izv izv, byte b) {
        this(jcg, izv, 4, (jcg.mo9320a() << 2) * izv.f7958a[0]);
    }

    private jdc(jcg jcg, izv izv, int i, int i2) {
        boolean z;
        int i3 = 0;
        if (i2 >= (izv.f7958a[0] << 2) * jcg.mo9320a()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "row stride that is shorter than row data size");
        this.f21431c = jcg;
        this.f21429a = izv;
        this.f21432d = i2;
        int[] iArr = new int[]{this.f21431c.mo9320a() << 2, this.f21432d};
        this.f21430b = new jce[4];
        while (i3 < 4) {
            this.f21430b[i3] = new jce(this.f21431c, i3 * r0, iArr);
            i3++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdc)) {
            return false;
        }
        jdc jdc = (jdc) obj;
        if (this.f21430b.length == jdc.f21430b.length && this.f21432d == jdc.f21432d && this.f21429a.equals(jdc.f21429a) && this.f21431c.equals(jdc.f21431c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f21429a.hashCode() * 31) + this.f21430b.length) * 31) + this.f21432d) * 31) + this.f21431c.hashCode();
    }
}
