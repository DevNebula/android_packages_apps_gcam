package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ts */
public final class C0502ts {
    /* renamed from: a */
    public final ArrayList f9793a;
    /* renamed from: b */
    public final ArrayList f9794b;
    /* renamed from: c */
    public final C0428qi f9795c;
    /* renamed from: d */
    public final C0501tr f9796d;
    /* renamed from: e */
    private C0300iw f9797e;

    public C0502ts(C0428qi c0428qi) {
        this(c0428qi, (byte) 0);
    }

    private C0502ts(C0428qi c0428qi, byte b) {
        this.f9797e = new C0694ix(30);
        this.f9793a = new ArrayList();
        this.f9794b = new ArrayList();
        this.f9795c = c0428qi;
        this.f9796d = new C0501tr(this);
    }

    /* renamed from: a */
    public final boolean mo11163a(int i) {
        int size = this.f9794b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0429qj c0429qj = (C0429qj) this.f9794b.get(i2);
            int i3 = c0429qj.f9551a;
            if (i3 == 8) {
                if (mo11159a(c0429qj.f9554d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                i3 = c0429qj.f9552b;
                int i4 = i3 + c0429qj.f9554d;
                for (int i5 = i3; i5 < i4; i5++) {
                    if (mo11159a(i5, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11161a() {
        int i;
        int i2 = 0;
        int size = this.f9794b.size();
        for (i = 0; i < size; i++) {
            this.f9795c.mo10895a((C0429qj) this.f9794b.get(i));
        }
        m5901a(this.f9794b);
        i = this.f9793a.size();
        while (i2 < i) {
            C0429qj c0429qj = (C0429qj) this.f9793a.get(i2);
            switch (c0429qj.f9551a) {
                case 1:
                    this.f9795c.mo10895a(c0429qj);
                    this.f9795c.mo10893a(c0429qj.f9552b, c0429qj.f9554d);
                    break;
                case 2:
                    this.f9795c.mo10895a(c0429qj);
                    this.f9795c.mo10897c(c0429qj.f9552b, c0429qj.f9554d);
                    break;
                case 4:
                    this.f9795c.mo10895a(c0429qj);
                    this.f9795c.mo10894a(c0429qj.f9552b, c0429qj.f9554d, c0429qj.f9553c);
                    break;
                case 8:
                    this.f9795c.mo10895a(c0429qj);
                    this.f9795c.mo10896b(c0429qj.f9552b, c0429qj.f9554d);
                    break;
                default:
                    break;
            }
            i2++;
        }
        m5901a(this.f9793a);
    }

    /* renamed from: a */
    public final void mo11162a(C0429qj c0429qj) {
        int i = c0429qj.f9551a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m5903b(c0429qj.f9552b, i);
        int i2 = c0429qj.f9552b;
        switch (c0429qj.f9551a) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("op should be remove or update.");
                stringBuilder.append(c0429qj);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i3 = 1;
        int i4 = b;
        b = i2;
        for (i2 = 1; i2 < c0429qj.f9554d; i2++) {
            Object obj;
            int b2 = m5903b(c0429qj.f9552b + (i * i2), c0429qj.f9551a);
            int i5 = c0429qj.f9551a;
            int obj2;
            switch (i5) {
                case 2:
                    if (b2 != i4) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = 1;
                        break;
                    }
                case 4:
                    if (b2 != i4 + 1) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = 1;
                        break;
                    }
                default:
                    obj2 = null;
                    break;
            }
            if (obj2 != null) {
                i3++;
            } else {
                C0429qj a = mo11160a(i5, i4, i3, c0429qj.f9553c);
                m5902a(a, b);
                mo11167c(a);
                if (c0429qj.f9551a == 4) {
                    b += i3;
                }
                i3 = 1;
                i4 = b2;
            }
        }
        Object obj3 = c0429qj.f9553c;
        mo11167c(c0429qj);
        if (i3 > 0) {
            C0429qj a2 = mo11160a(c0429qj.f9551a, i4, i3, obj3);
            m5902a(a2, b);
            mo11167c(a2);
        }
    }

    /* renamed from: a */
    private final void m5902a(C0429qj c0429qj, int i) {
        this.f9795c.mo10895a(c0429qj);
        switch (c0429qj.f9551a) {
            case 2:
                this.f9795c.mo10897c(i, c0429qj.f9554d);
                return;
            case 4:
                this.f9795c.mo10894a(i, c0429qj.f9554d, c0429qj.f9553c);
                return;
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: a */
    final int mo11159a(int i, int i2) {
        int size = this.f9794b.size();
        int i3 = i;
        while (i2 < size) {
            C0429qj c0429qj = (C0429qj) this.f9794b.get(i2);
            int i4 = c0429qj.f9551a;
            if (i4 == 8) {
                i4 = c0429qj.f9552b;
                if (i4 == i3) {
                    i3 = c0429qj.f9554d;
                } else {
                    if (i4 < i3) {
                        i3--;
                    }
                    if (c0429qj.f9554d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i5 = c0429qj.f9552b;
                if (i5 > i3) {
                    continue;
                } else if (i4 == 2) {
                    int i6 = c0429qj.f9554d;
                    if (i3 < i5 + i6) {
                        return -1;
                    }
                    i3 -= i6;
                } else if (i4 == 1) {
                    i3 += c0429qj.f9554d;
                }
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: b */
    public final boolean mo11165b() {
        return this.f9793a.size() > 0;
    }

    /* renamed from: a */
    public final C0429qj mo11160a(int i, int i2, int i3, Object obj) {
        C0429qj c0429qj = (C0429qj) this.f9797e.mo9113a();
        if (c0429qj == null) {
            return new C0429qj(i, i2, i3, obj);
        }
        c0429qj.f9551a = i;
        c0429qj.f9552b = i2;
        c0429qj.f9554d = i3;
        c0429qj.f9553c = obj;
        return c0429qj;
    }

    /* renamed from: b */
    public final void mo11164b(C0429qj c0429qj) {
        this.f9794b.add(c0429qj);
        switch (c0429qj.f9551a) {
            case 1:
                this.f9795c.mo10893a(c0429qj.f9552b, c0429qj.f9554d);
                return;
            case 2:
                C0428qi c0428qi = this.f9795c;
                c0428qi.f9550a.mo1115a(c0429qj.f9552b, c0429qj.f9554d, false);
                c0428qi.f9550a.f664C = true;
                return;
            case 4:
                this.f9795c.mo10894a(c0429qj.f9552b, c0429qj.f9554d, c0429qj.f9553c);
                return;
            case 8:
                this.f9795c.mo10896b(c0429qj.f9552b, c0429qj.f9554d);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown update op type for ");
                stringBuilder.append(c0429qj);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public final void mo11167c(C0429qj c0429qj) {
        c0429qj.f9553c = null;
        this.f9797e.mo9114a(c0429qj);
    }

    /* renamed from: a */
    private final void m5901a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo11167c((C0429qj) list.get(i));
        }
        list.clear();
    }

    /* renamed from: c */
    public final void mo11166c() {
        m5901a(this.f9793a);
        m5901a(this.f9794b);
    }

    /* renamed from: b */
    private final int m5903b(int i, int i2) {
        C0429qj c0429qj;
        int i3;
        int i4;
        int size = this.f9794b.size() - 1;
        int i5 = i;
        while (size >= 0) {
            int i6;
            c0429qj = (C0429qj) this.f9794b.get(size);
            i3 = c0429qj.f9551a;
            if (i3 == 8) {
                i4 = c0429qj.f9552b;
                int i7 = c0429qj.f9554d;
                int i8;
                if (i4 < i7) {
                    i8 = i7;
                } else {
                    i8 = i4;
                }
                if (i4 < i7) {
                    i3 = i4;
                } else {
                    i3 = i7;
                }
                if (i5 < i3 || i5 > i8) {
                    if (i5 >= i4) {
                        i6 = i5;
                    } else if (i2 == 1) {
                        c0429qj.f9552b = i4 + 1;
                        c0429qj.f9554d = i7 + 1;
                        i6 = i5;
                    } else if (i2 == 2) {
                        c0429qj.f9552b = i4 - 1;
                        c0429qj.f9554d = i7 - 1;
                        i6 = i5;
                    } else {
                        i6 = i5;
                    }
                } else if (i3 == i4) {
                    if (i2 == 1) {
                        c0429qj.f9554d = i7 + 1;
                    } else if (i2 == 2) {
                        c0429qj.f9554d = i7 - 1;
                    }
                    i6 = i5 + 1;
                } else {
                    if (i2 == 1) {
                        c0429qj.f9552b = i4 + 1;
                    } else if (i2 == 2) {
                        c0429qj.f9552b = i4 - 1;
                    }
                    i6 = i5 - 1;
                }
            } else {
                i4 = c0429qj.f9552b;
                if (i4 <= i5) {
                    i6 = i3 == 1 ? i5 - c0429qj.f9554d : i3 == 2 ? c0429qj.f9554d + i5 : i5;
                } else if (i2 == 1) {
                    c0429qj.f9552b = i4 + 1;
                    i6 = i5;
                } else if (i2 == 2) {
                    c0429qj.f9552b = i4 - 1;
                    i6 = i5;
                } else {
                    i6 = i5;
                }
            }
            size--;
            i5 = i6;
        }
        for (i3 = this.f9794b.size() - 1; i3 >= 0; i3--) {
            c0429qj = (C0429qj) this.f9794b.get(i3);
            if (c0429qj.f9551a == 8) {
                i4 = c0429qj.f9554d;
                if (i4 == c0429qj.f9552b || i4 < 0) {
                    this.f9794b.remove(i3);
                    mo11167c(c0429qj);
                }
            } else if (c0429qj.f9554d <= 0) {
                this.f9794b.remove(i3);
                mo11167c(c0429qj);
            }
        }
        return i5;
    }
}
