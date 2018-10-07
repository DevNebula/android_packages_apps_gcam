package p000;

/* compiled from: PG */
/* renamed from: wn */
public final class C0565wn {
    /* renamed from: a */
    public String f9973a;
    /* renamed from: b */
    public int f9974b = 0;

    public C0565wn(String str) {
        this.f9973a = str;
    }

    /* renamed from: a */
    public final char mo11481a() {
        if (this.f9974b >= this.f9973a.length()) {
            return 0;
        }
        return this.f9973a.charAt(this.f9974b);
    }

    /* renamed from: a */
    public final char mo11482a(int i) {
        if (i >= this.f9973a.length()) {
            return 0;
        }
        return this.f9973a.charAt(i);
    }

    /* renamed from: a */
    public final int mo11483a(String str, int i) {
        int a = mo11482a(this.f9974b);
        Object obj = null;
        int i2 = 0;
        while (a >= 48 && a <= 57) {
            int i3 = (i2 * 10) + (a - 48);
            this.f9974b++;
            i2 = i3;
            i3 = 1;
            char a2 = mo11482a(this.f9974b);
        }
        if (obj == null) {
            throw new C0554wb(str, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: b */
    public final boolean mo11484b() {
        return this.f9974b < this.f9973a.length();
    }

    /* renamed from: c */
    public final void mo11485c() {
        this.f9974b++;
    }
}
