package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: khv */
final class khv {
    /* renamed from: a */
    public final Object f8665a;
    /* renamed from: b */
    public int f8666b;
    /* renamed from: c */
    public int f8667c;
    /* renamed from: d */
    public long f8668d;
    /* renamed from: e */
    public khv f8669e;
    /* renamed from: f */
    public khv f8670f;
    /* renamed from: g */
    public khv f8671g;
    /* renamed from: h */
    public khv f8672h;
    /* renamed from: i */
    private int f8673i;

    khv(Object obj, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f8665a = obj;
        this.f8666b = i;
        this.f8668d = (long) i;
        this.f8667c = 1;
        this.f8673i = 1;
        this.f8669e = null;
        this.f8670f = null;
    }

    /* renamed from: a */
    final khv mo10001a(Comparator comparator, Object obj, int i, int[] iArr) {
        boolean z = false;
        int compare = comparator.compare(obj, this.f8665a);
        khv khv;
        int i2;
        if (compare < 0) {
            khv = this.f8669e;
            if (khv == null) {
                iArr[0] = 0;
                return m4976a(obj, i);
            }
            i2 = khv.f8673i;
            this.f8669e = khv.mo10001a(comparator, obj, i, iArr);
            if (iArr[0] == 0) {
                this.f8667c++;
            }
            this.f8668d += (long) i;
            if (this.f8669e.f8673i != i2) {
                return m4980c();
            }
            return this;
        } else if (compare > 0) {
            khv = this.f8670f;
            if (khv == null) {
                iArr[0] = 0;
                return m4978b(obj, i);
            }
            i2 = khv.f8673i;
            this.f8670f = khv.mo10001a(comparator, obj, i, iArr);
            if (iArr[0] == 0) {
                this.f8667c++;
            }
            this.f8668d += (long) i;
            if (this.f8670f.f8673i != i2) {
                return m4980c();
            }
            return this;
        } else {
            compare = this.f8666b;
            iArr[0] = compare;
            long j = (long) i;
            if (((long) compare) + j <= 2147483647L) {
                z = true;
            }
            jri.m13395a(z);
            this.f8666b += i;
            this.f8668d += j;
            return this;
        }
    }

    /* renamed from: a */
    private final khv m4976a(Object obj, int i) {
        this.f8669e = new khv(obj, i);
        kho.m18142a(this.f8671g, this.f8669e, this);
        this.f8673i = Math.max(2, this.f8673i);
        this.f8667c++;
        this.f8668d += (long) i;
        return this;
    }

    /* renamed from: b */
    private final khv m4978b(Object obj, int i) {
        this.f8670f = new khv(obj, i);
        kho.m18142a(this, this.f8670f, this.f8672h);
        this.f8673i = Math.max(2, this.f8673i);
        this.f8667c++;
        this.f8668d += (long) i;
        return this;
    }

    /* renamed from: a */
    private final int m4974a() {
        return khv.m4975a(this.f8669e) - khv.m4975a(this.f8670f);
    }

    /* renamed from: a */
    final khv mo9999a(Comparator comparator, Object obj) {
        do {
            int compare = comparator.compare(obj, this.f8665a);
            if (compare < 0) {
                khv khv = this.f8669e;
                if (khv != null) {
                    return (khv) jqk.m13330a(khv.mo9999a(comparator, obj), this);
                }
                return this;
            } else if (compare == 0) {
                return this;
            } else {
                this = this.f8670f;
            }
        } while (this != null);
        return null;
    }

    /* renamed from: b */
    private final khv m4977b() {
        int i = this.f8666b;
        this.f8666b = 0;
        kho.m18141a(this.f8671g, this.f8672h);
        khv khv = this.f8669e;
        if (khv == null) {
            return this.f8670f;
        }
        khv khv2 = this.f8670f;
        if (khv2 == null) {
            return khv;
        }
        if (khv.f8673i >= khv2.f8673i) {
            khv2 = this.f8671g;
            khv2.f8669e = khv.m4979b(khv2);
            khv2.f8670f = this.f8670f;
            khv2.f8667c = this.f8667c - 1;
            khv2.f8668d = this.f8668d - ((long) i);
            return khv2.m4980c();
        }
        khv = this.f8672h;
        khv.f8670f = khv2.m4981c(khv);
        khv.f8669e = this.f8669e;
        khv.f8667c = this.f8667c - 1;
        khv.f8668d = this.f8668d - ((long) i);
        return khv.m4980c();
    }

    /* renamed from: b */
    final khv mo10002b(Comparator comparator, Object obj) {
        do {
            int compare = comparator.compare(obj, this.f8665a);
            if (compare > 0) {
                khv khv = this.f8670f;
                if (khv != null) {
                    return (khv) jqk.m13330a(khv.mo10002b(comparator, obj), this);
                }
                return this;
            } else if (compare == 0) {
                return this;
            } else {
                this = this.f8669e;
            }
        } while (this != null);
        return null;
    }

    /* renamed from: a */
    private static int m4975a(khv khv) {
        return khv != null ? khv.f8673i : 0;
    }

    /* renamed from: c */
    private final khv m4980c() {
        switch (m4974a()) {
            case -2:
                if (this.f8670f.m4974a() > 0) {
                    this.f8670f = this.f8670f.m4986g();
                }
                return m4985f();
            case 2:
                if (this.f8669e.m4974a() < 0) {
                    this.f8669e = this.f8669e.m4985f();
                }
                return m4986g();
            default:
                m4984e();
                return this;
        }
    }

    /* renamed from: d */
    private final void m4983d() {
        this.f8667c = (kho.m18138a(this.f8669e) + 1) + kho.m18138a(this.f8670f);
        this.f8668d = (((long) this.f8666b) + khv.m4982d(this.f8669e)) + khv.m4982d(this.f8670f);
        m4984e();
    }

    /* renamed from: e */
    private final void m4984e() {
        this.f8673i = Math.max(khv.m4975a(this.f8669e), khv.m4975a(this.f8670f)) + 1;
    }

    /* renamed from: b */
    final khv mo10003b(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f8665a);
        khv khv;
        if (compare < 0) {
            khv = this.f8669e;
            if (khv == null) {
                iArr[0] = 0;
                return this;
            }
            this.f8669e = khv.mo10003b(comparator, obj, i, iArr);
            compare = iArr[0];
            if (compare > 0) {
                if (i >= compare) {
                    this.f8667c--;
                    this.f8668d -= (long) compare;
                } else {
                    this.f8668d -= (long) i;
                }
            }
            if (compare != 0) {
                return m4980c();
            }
            return this;
        } else if (compare > 0) {
            khv = this.f8670f;
            if (khv == null) {
                iArr[0] = 0;
                return this;
            }
            this.f8670f = khv.mo10003b(comparator, obj, i, iArr);
            compare = iArr[0];
            if (compare > 0) {
                if (i >= compare) {
                    this.f8667c--;
                    this.f8668d -= (long) compare;
                } else {
                    this.f8668d -= (long) i;
                }
            }
            return m4980c();
        } else {
            compare = this.f8666b;
            iArr[0] = compare;
            if (i >= compare) {
                return m4977b();
            }
            this.f8666b = compare - i;
            this.f8668d -= (long) i;
            return this;
        }
    }

    /* renamed from: b */
    private final khv m4979b(khv khv) {
        khv khv2 = this.f8670f;
        if (khv2 == null) {
            return this.f8669e;
        }
        this.f8670f = khv2.m4979b(khv);
        this.f8667c--;
        this.f8668d -= (long) khv.f8666b;
        return m4980c();
    }

    /* renamed from: c */
    private final khv m4981c(khv khv) {
        khv khv2 = this.f8669e;
        if (khv2 == null) {
            return this.f8670f;
        }
        this.f8669e = khv2.m4981c(khv);
        this.f8667c--;
        this.f8668d -= (long) khv.f8666b;
        return m4980c();
    }

    /* renamed from: f */
    private final khv m4985f() {
        boolean z;
        if (this.f8670f != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        khv khv = this.f8670f;
        this.f8670f = khv.f8669e;
        khv.f8669e = this;
        khv.f8668d = this.f8668d;
        khv.f8667c = this.f8667c;
        m4983d();
        khv.m4984e();
        return khv;
    }

    /* renamed from: g */
    private final khv m4986g() {
        boolean z;
        if (this.f8669e != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        khv khv = this.f8669e;
        this.f8669e = khv.f8670f;
        khv.f8670f = this;
        khv.f8668d = this.f8668d;
        khv.f8667c = this.f8667c;
        m4983d();
        khv.m4984e();
        return khv;
    }

    /* renamed from: a */
    final khv mo10000a(Comparator comparator, Object obj, int i, int i2, int[] iArr) {
        int compare = comparator.compare(obj, this.f8665a);
        khv khv;
        if (compare < 0) {
            khv = this.f8669e;
            if (khv == null) {
                iArr[0] = 0;
                if (i != 0 || i2 <= 0) {
                    return this;
                }
                return m4976a(obj, i2);
            }
            this.f8669e = khv.mo10000a(comparator, obj, i, i2, iArr);
            compare = iArr[0];
            if (compare == i) {
                if (i2 == 0 && compare != 0) {
                    this.f8667c--;
                } else if (i2 > 0 && compare == 0) {
                    this.f8667c++;
                }
                this.f8668d = ((long) (i2 - compare)) + this.f8668d;
            }
            return m4980c();
        } else if (compare > 0) {
            khv = this.f8670f;
            if (khv == null) {
                iArr[0] = 0;
                if (i != 0 || i2 <= 0) {
                    return this;
                }
                return m4978b(obj, i2);
            }
            this.f8670f = khv.mo10000a(comparator, obj, i, i2, iArr);
            compare = iArr[0];
            if (compare == i) {
                if (i2 == 0 && compare != 0) {
                    this.f8667c--;
                } else if (i2 > 0 && compare == 0) {
                    this.f8667c++;
                }
                this.f8668d = ((long) (i2 - compare)) + this.f8668d;
            }
            return m4980c();
        } else {
            compare = this.f8666b;
            iArr[0] = compare;
            if (i != compare) {
                return this;
            }
            if (i2 == 0) {
                return m4977b();
            }
            this.f8668d = ((long) (i2 - compare)) + this.f8668d;
            this.f8666b = i2;
            return this;
        }
    }

    /* renamed from: c */
    final khv mo10004c(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f8665a);
        khv khv;
        if (compare < 0) {
            khv = this.f8669e;
            if (khv == null) {
                iArr[0] = 0;
                return i > 0 ? m4976a(obj, i) : this;
            } else {
                this.f8669e = khv.mo10004c(comparator, obj, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f8667c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f8667c++;
                }
                this.f8668d += (long) (i - iArr[0]);
                return m4980c();
            }
        } else if (compare > 0) {
            khv = this.f8670f;
            if (khv == null) {
                iArr[0] = 0;
                if (i > 0) {
                    return m4978b(obj, i);
                }
                return this;
            }
            this.f8670f = khv.mo10004c(comparator, obj, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.f8667c--;
            } else if (i > 0 && iArr[0] == 0) {
                this.f8667c++;
            }
            this.f8668d += (long) (i - iArr[0]);
            return m4980c();
        } else {
            compare = this.f8666b;
            iArr[0] = compare;
            if (i == 0) {
                return m4977b();
            }
            this.f8668d = ((long) (i - compare)) + this.f8668d;
            this.f8666b = i;
            return this;
        }
    }

    public final String toString() {
        return khb.m4951b(this.f8665a, this.f8666b).toString();
    }

    /* renamed from: d */
    private static long m4982d(khv khv) {
        return khv != null ? khv.f8668d : 0;
    }
}
