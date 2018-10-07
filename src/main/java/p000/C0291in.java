package p000;

/* compiled from: PG */
/* renamed from: in */
public final class C0291in implements Cloneable {
    /* renamed from: a */
    public static final Object f7483a = new Object();
    /* renamed from: b */
    public boolean f7484b;
    /* renamed from: c */
    public long[] f7485c;
    /* renamed from: d */
    public Object[] f7486d;
    /* renamed from: e */
    public int f7487e;

    public C0291in() {
        this((byte) 0);
    }

    private C0291in(byte b) {
        this.f7484b = false;
        int b2 = C0289il.m3870b(10);
        this.f7485c = new long[b2];
        this.f7486d = new Object[b2];
        this.f7487e = 0;
    }

    /* renamed from: a */
    public final void mo8625a() {
        int i = this.f7487e;
        Object[] objArr = this.f7486d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f7487e = 0;
        this.f7484b = false;
    }

    /* renamed from: d */
    private final C0291in m3921d() {
        try {
            C0291in c0291in = (C0291in) super.clone();
            try {
                c0291in.f7485c = (long[]) this.f7485c.clone();
                c0291in.f7486d = (Object[]) this.f7486d.clone();
                return c0291in;
            } catch (CloneNotSupportedException e) {
                return c0291in;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo8626a(long j) {
        int a = C0289il.m3868a(this.f7485c, this.f7487e, j);
        if (a >= 0 && this.f7486d[a] != f7483a) {
            this.f7486d[a] = f7483a;
            this.f7484b = true;
        }
    }

    /* renamed from: b */
    public final void mo8630b() {
        int i = this.f7487e;
        long[] jArr = this.f7485c;
        Object[] objArr = this.f7486d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f7483a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f7484b = false;
        this.f7487e = i2;
    }

    /* renamed from: b */
    public final Object mo8629b(long j) {
        int a = C0289il.m3868a(this.f7485c, this.f7487e, j);
        if (a < 0 || this.f7486d[a] == f7483a) {
            return null;
        }
        return this.f7486d[a];
    }

    /* renamed from: a */
    public final long mo8624a(int i) {
        if (this.f7484b) {
            mo8630b();
        }
        return this.f7485c[i];
    }

    /* renamed from: a */
    public final void mo8627a(long j, Object obj) {
        int a = C0289il.m3868a(this.f7485c, this.f7487e, j);
        if (a >= 0) {
            this.f7486d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f7487e || this.f7486d[a] != f7483a) {
            Object obj2;
            Object obj3;
            if (this.f7484b && this.f7487e >= this.f7485c.length) {
                mo8630b();
                a = C0289il.m3868a(this.f7485c, this.f7487e, j) ^ -1;
            }
            int i = this.f7487e;
            if (i >= this.f7485c.length) {
                i = C0289il.m3870b(i + 1);
                obj2 = new long[i];
                obj3 = new Object[i];
                Object obj4 = this.f7485c;
                System.arraycopy(obj4, 0, obj2, 0, obj4.length);
                obj4 = this.f7486d;
                System.arraycopy(obj4, 0, obj3, 0, obj4.length);
                this.f7485c = obj2;
                this.f7486d = obj3;
            }
            i = this.f7487e - a;
            if (i != 0) {
                obj2 = this.f7485c;
                int i2 = a + 1;
                System.arraycopy(obj2, a, obj2, i2, i);
                obj3 = this.f7486d;
                System.arraycopy(obj3, a, obj3, i2, this.f7487e - a);
            }
            this.f7485c[a] = j;
            this.f7486d[a] = obj;
            this.f7487e++;
            return;
        }
        this.f7485c[a] = j;
        this.f7486d[a] = obj;
    }

    /* renamed from: c */
    public final int mo8631c() {
        if (this.f7484b) {
            mo8630b();
        }
        return this.f7487e;
    }

    public final String toString() {
        if (mo8631c() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7487e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7487e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(mo8624a(i));
            stringBuilder.append('=');
            C0291in b = mo8628b(i);
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
    public final Object mo8628b(int i) {
        if (this.f7484b) {
            mo8630b();
        }
        return this.f7486d[i];
    }
}
