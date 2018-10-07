package p000;

/* compiled from: PG */
/* renamed from: ja */
public final class C0303ja implements Cloneable {
    /* renamed from: a */
    public static final Object f7963a = new Object();
    /* renamed from: b */
    public boolean f7964b;
    /* renamed from: c */
    public int[] f7965c;
    /* renamed from: d */
    public Object[] f7966d;
    /* renamed from: e */
    public int f7967e;

    public C0303ja() {
        this(10);
    }

    public C0303ja(int i) {
        this.f7964b = false;
        if (i == 0) {
            this.f7965c = C0289il.f7438a;
            this.f7966d = C0289il.f7439b;
        } else {
            int a = C0289il.m3866a(i);
            this.f7965c = new int[a];
            this.f7966d = new Object[a];
        }
        this.f7967e = 0;
    }

    /* renamed from: c */
    private final C0303ja m4429c() {
        try {
            C0303ja c0303ja = (C0303ja) super.clone();
            try {
                c0303ja.f7965c = (int[]) this.f7965c.clone();
                c0303ja.f7966d = (Object[]) this.f7966d.clone();
                return c0303ja;
            } catch (CloneNotSupportedException e) {
                return c0303ja;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo9255a() {
        int i = this.f7967e;
        int[] iArr = this.f7965c;
        Object[] objArr = this.f7966d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f7963a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f7964b = false;
        this.f7967e = i2;
    }

    /* renamed from: a */
    public final int mo9254a(int i) {
        if (this.f7964b) {
            mo9255a();
        }
        return this.f7965c[i];
    }

    /* renamed from: a */
    public final void mo9256a(int i, Object obj) {
        int a = C0289il.m3867a(this.f7965c, this.f7967e, i);
        if (a >= 0) {
            this.f7966d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f7967e || this.f7966d[a] != f7963a) {
            Object obj2;
            Object obj3;
            if (this.f7964b && this.f7967e >= this.f7965c.length) {
                mo9255a();
                a = C0289il.m3867a(this.f7965c, this.f7967e, i) ^ -1;
            }
            int i2 = this.f7967e;
            if (i2 >= this.f7965c.length) {
                i2 = C0289il.m3866a(i2 + 1);
                obj2 = new int[i2];
                obj3 = new Object[i2];
                Object obj4 = this.f7965c;
                System.arraycopy(obj4, 0, obj2, 0, obj4.length);
                obj4 = this.f7966d;
                System.arraycopy(obj4, 0, obj3, 0, obj4.length);
                this.f7965c = obj2;
                this.f7966d = obj3;
            }
            i2 = this.f7967e - a;
            if (i2 != 0) {
                obj2 = this.f7965c;
                int i3 = a + 1;
                System.arraycopy(obj2, a, obj2, i3, i2);
                obj3 = this.f7966d;
                System.arraycopy(obj3, a, obj3, i3, this.f7967e - a);
            }
            this.f7965c[a] = i;
            this.f7966d[a] = obj;
            this.f7967e++;
            return;
        }
        this.f7965c[a] = i;
        this.f7966d[a] = obj;
    }

    /* renamed from: b */
    public final int mo9257b() {
        if (this.f7964b) {
            mo9255a();
        }
        return this.f7967e;
    }

    public final String toString() {
        if (mo9257b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7967e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7967e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(mo9254a(i));
            stringBuilder.append('=');
            C0303ja b = mo9258b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final Object mo9258b(int i) {
        if (this.f7964b) {
            mo9255a();
        }
        return this.f7966d[i];
    }
}
