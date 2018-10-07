package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kho */
public final class kho extends kct implements Serializable {
    public static final long serialVersionUID = 1;
    /* renamed from: a */
    public final transient keb f26592a;
    /* renamed from: b */
    public final transient khv f26593b;
    /* renamed from: c */
    private final transient khw f26594c;

    private kho(khw khw, keb keb, khv khv) {
        super(keb.f8612a);
        this.f26594c = khw;
        this.f26592a = keb;
        this.f26593b = khv;
    }

    public kho(Comparator comparator) {
        super(comparator);
        this.f26592a = keb.m4852a(comparator);
        this.f26593b = new khv(null, 1);
        khv khv = this.f26593b;
        kho.m18141a(khv, khv);
        this.f26594c = new khw();
    }

    /* renamed from: a */
    public final int mo9939a(Object obj, int i) {
        khb.m4919a(i, "occurrences");
        if (i == 0) {
            return mo9938a(obj);
        }
        jri.m13395a(this.f26592a.mo9826a(obj));
        khv khv = (khv) this.f26594c.f8674a;
        if (khv != null) {
            int[] iArr = new int[1];
            this.f26594c.mo10006a(khv, khv.mo10001a(super.mo14051a(), obj, i, iArr));
            return iArr[0];
        }
        super.mo14051a().compare(obj, obj);
        khv khv2 = new khv(obj, i);
        khv khv3 = this.f26593b;
        kho.m18142a(khv3, khv2, khv3);
        this.f26594c.mo10006a(khv, khv2);
        return 0;
    }

    /* renamed from: a */
    private final long m18140a(khs khs, khv khv) {
        while (khv != null) {
            int compare = super.mo14051a().compare(this.f26592a.f8617f, khv.f8665a);
            if (compare > 0) {
                khv = khv.f8670f;
            } else if (compare != 0) {
                return (khs.mo9998b(khv.f8670f) + ((long) khs.mo9997a(khv))) + m18140a(khs, khv.f8669e);
            } else {
                switch (this.f26592a.f8618g.ordinal()) {
                    case 0:
                        return ((long) khs.mo9997a(khv)) + khs.mo9998b(khv.f8670f);
                    case 1:
                        return khs.mo9998b(khv.f8670f);
                    default:
                        throw new AssertionError();
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    private final long m18143b(khs khs, khv khv) {
        while (khv != null) {
            int compare = super.mo14051a().compare(this.f26592a.f8614c, khv.f8665a);
            if (compare < 0) {
                khv = khv.f8669e;
            } else if (compare != 0) {
                return (khs.mo9998b(khv.f8669e) + ((long) khs.mo9997a(khv))) + m18143b(khs, khv.f8670f);
            } else {
                switch (this.f26592a.f8615d.ordinal()) {
                    case 0:
                        return ((long) khs.mo9997a(khv)) + khs.mo9998b(khv.f8669e);
                    case 1:
                        return khs.mo9998b(khv.f8669e);
                    default:
                        throw new AssertionError();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final long m18139a(khs khs) {
        khv khv = (khv) this.f26594c.f8674a;
        long b = khs.mo9998b(khv);
        if (this.f26592a.f8613b) {
            b -= m18143b(khs, khv);
        }
        if (this.f26592a.f8616e) {
            return b - m18140a(khs, khv);
        }
        return b;
    }

    public final void clear() {
        keb keb = this.f26592a;
        if (keb.f8613b || keb.f8616e) {
            khb.m4936a(mo13957f());
            return;
        }
        khv khv = this.f26593b.f8672h;
        while (true) {
            khv khv2 = this.f26593b;
            if (khv != khv2) {
                khv2 = khv.f8672h;
                khv.f8666b = 0;
                khv.f8669e = null;
                khv.f8670f = null;
                khv.f8671g = null;
                khv.f8672h = null;
                khv = khv2;
            } else {
                kho.m18141a(khv2, khv2);
                this.f26594c.f8674a = null;
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo9938a(Object obj) {
        try {
            khv khv = (khv) this.f26594c.f8674a;
            if (!this.f26592a.mo9826a(obj) || khv == null) {
                return 0;
            }
            int i;
            Comparator a = super.mo14051a();
            while (true) {
                int compare = a.compare(obj, khv.f8665a);
                if (compare >= 0) {
                    if (compare <= 0) {
                        i = khv.f8666b;
                        break;
                    }
                    khv = khv.f8670f;
                    if (khv == null) {
                        i = 0;
                        break;
                    }
                } else {
                    khv = khv.f8669e;
                    if (khv == null) {
                        i = 0;
                        break;
                    }
                }
            }
            return i;
        } catch (ClassCastException e) {
            return 0;
        } catch (NullPointerException e2) {
            return 0;
        }
    }

    /* renamed from: h */
    final Iterator mo15078h() {
        return new khr(this);
    }

    /* renamed from: c */
    final int mo13955c() {
        return khx.m4994a(m18139a(khs.f8663b));
    }

    /* renamed from: a */
    static int m18138a(khv khv) {
        if (khv == null) {
            return 0;
        }
        return khv.f8667c;
    }

    /* renamed from: d */
    final Iterator mo13956d() {
        return khb.m4947b(mo13957f());
    }

    /* renamed from: f */
    final Iterator mo13957f() {
        return new khq(this);
    }

    /* renamed from: o */
    final khv mo15637o() {
        khv khv = (khv) this.f26594c.f8674a;
        if (khv == null) {
            return null;
        }
        keb keb = this.f26592a;
        if (keb.f8613b) {
            Object obj = keb.f8614c;
            khv = khv.mo9999a(super.mo14051a(), obj);
            if (khv == null) {
                return null;
            }
            if (this.f26592a.f8615d == kcy.OPEN && super.mo14051a().compare(obj, khv.f8665a) == 0) {
                khv = khv.f8672h;
            }
        } else {
            khv = this.f26593b.f8672h;
        }
        if (khv == this.f26593b || !this.f26592a.mo9826a(khv.f8665a)) {
            return null;
        }
        return khv;
    }

    /* renamed from: a */
    public final kgx mo14052a(Object obj, kcy kcy) {
        return new kho(this.f26594c, this.f26592a.mo9825a(new keb(super.mo14051a(), false, null, kcy.OPEN, true, obj, kcy)), this.f26593b);
    }

    public final Iterator iterator() {
        return khb.m4926a((kft) this);
    }

    /* renamed from: p */
    final khv mo15638p() {
        khv khv = (khv) this.f26594c.f8674a;
        if (khv == null) {
            return null;
        }
        keb keb = this.f26592a;
        if (keb.f8616e) {
            Object obj = keb.f8617f;
            khv = khv.mo10002b(super.mo14051a(), obj);
            if (khv == null) {
                return null;
            }
            if (this.f26592a.f8618g == kcy.OPEN && super.mo14051a().compare(obj, khv.f8665a) == 0) {
                khv = khv.f8671g;
            }
        } else {
            khv = this.f26593b.f8671g;
        }
        if (khv == this.f26593b || !this.f26592a.mo9826a(khv.f8665a)) {
            return null;
        }
        return khv;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        kgy.m4912a(kct.class, "comparator").mo9980a((Object) this, (Object) comparator);
        kgy.m4912a(kho.class, "range").mo9980a((Object) this, keb.m4852a(comparator));
        kgy.m4912a(kho.class, "rootReference").mo9980a((Object) this, new khw());
        khv khv = new khv(null, 1);
        kgy.m4912a(kho.class, "header").mo9980a((Object) this, (Object) khv);
        kho.m18141a(khv, khv);
        kgy.m4915a((kft) this, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: b */
    public final int mo9942b(Object obj, int i) {
        khb.m4919a(i, "occurrences");
        if (i == 0) {
            return mo9938a(obj);
        }
        khv khv = (khv) this.f26594c.f8674a;
        int[] iArr = new int[1];
        try {
            if (!this.f26592a.mo9826a(obj) || khv == null) {
                return 0;
            }
            this.f26594c.mo10006a(khv, khv.mo10003b(super.mo14051a(), obj, i, iArr));
            return iArr[0];
        } catch (ClassCastException e) {
            return 0;
        } catch (NullPointerException e2) {
            return 0;
        }
    }

    /* renamed from: c */
    public final int mo9943c(Object obj, int i) {
        khb.m4919a(i, "count");
        if (this.f26592a.mo9826a(obj)) {
            khv khv = (khv) this.f26594c.f8674a;
            if (khv != null) {
                int[] iArr = new int[1];
                this.f26594c.mo10006a(khv, khv.mo10004c(super.mo14051a(), obj, i, iArr));
                return iArr[0];
            } else if (i <= 0) {
                return 0;
            } else {
                mo9939a(obj, i);
                return 0;
            }
        }
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        return 0;
    }

    /* renamed from: a */
    public final boolean mo9940a(Object obj, int i, int i2) {
        khb.m4919a(i2, "newCount");
        khb.m4919a(i, "oldCount");
        jri.m13395a(this.f26592a.mo9826a(obj));
        khv khv = (khv) this.f26594c.f8674a;
        if (khv != null) {
            int[] iArr = new int[1];
            this.f26594c.mo10006a(khv, khv.mo10000a(super.mo14051a(), obj, i, i2, iArr));
            return iArr[0] == i;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                mo9939a(obj, i2);
            }
            return true;
        }
    }

    public final int size() {
        return khx.m4994a(m18139a(khs.f8662a));
    }

    /* renamed from: a */
    static void m18141a(khv khv, khv khv2) {
        khv.f8672h = khv2;
        khv2.f8671g = khv;
    }

    /* renamed from: a */
    static void m18142a(khv khv, khv khv2, khv khv3) {
        kho.m18141a(khv, khv2);
        kho.m18141a(khv2, khv3);
    }

    /* renamed from: b */
    public final kgx mo14054b(Object obj, kcy kcy) {
        return new kho(this.f26594c, this.f26592a.mo9825a(new keb(super.mo14051a(), true, obj, kcy, false, null, kcy.OPEN)), this.f26593b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.mo9946e().comparator());
        kgy.m4916a((kft) this, objectOutputStream);
    }
}
