package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: krg */
final class krg implements ktq {
    /* renamed from: a */
    private final kre f21967a;
    /* renamed from: b */
    private int f21968b;
    /* renamed from: c */
    private int f21969c;
    /* renamed from: d */
    private int f21970d = 0;

    krg(kre kre) {
        this.f21967a = (kre) ksd.m5194a((Object) kre, "input");
        this.f21967a.f8804c = this;
    }

    /* renamed from: a */
    public final int mo10316a() {
        int i = this.f21970d;
        if (i != 0) {
            this.f21968b = i;
            this.f21970d = 0;
        } else {
            this.f21968b = this.f21967a.mo10261s();
        }
        i = this.f21968b;
        if (i == 0 || i == this.f21969c) {
            return LfuScheduler.MAX_PRIORITY;
        }
        return i >>> 3;
    }

    /* renamed from: b */
    public final int mo10322b() {
        return this.f21968b;
    }

    /* renamed from: c */
    public final boolean mo10328c() {
        m14009b(0);
        return this.f21967a.mo10243c();
    }

    /* renamed from: a */
    public final void mo10319a(List list) {
        int t;
        if (list instanceof kqv) {
            kqv kqv = (kqv) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        kqv.mo15160a(this.f21967a.mo10243c());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kqv.mo15160a(this.f21967a.mo10243c());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Boolean.valueOf(this.f21967a.mo10243c()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Boolean.valueOf(this.f21967a.mo10243c()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: d */
    public final kqx mo10329d() {
        m14009b(2);
        return this.f21967a.mo10245d();
    }

    /* renamed from: b */
    public final void mo10325b(List list) {
        if ((this.f21968b & 7) == 2) {
            int s;
            do {
                list.add(mo10329d());
                if (!this.f21967a.mo10241b()) {
                    s = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (s == this.f21968b);
            this.f21970d = s;
            return;
        }
        throw ksh.m5205c();
    }

    /* renamed from: e */
    public final double mo10331e() {
        m14009b(1);
        return this.f21967a.mo10246e();
    }

    /* renamed from: c */
    public final void mo10327c(List list) {
        int t;
        if (list instanceof krk) {
            krk krk = (krk) list;
            switch (this.f21968b & 7) {
                case 1:
                    break;
                case 2:
                    t = this.f21967a.mo10262t();
                    krg.m14013d(t);
                    t += this.f21967a.mo10239a();
                    do {
                        krk.mo15165a(this.f21967a.mo10246e());
                    } while (this.f21967a.mo10239a() < t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                krk.mo15165a(this.f21967a.mo10246e());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 1:
                break;
            case 2:
                t = this.f21967a.mo10262t();
                krg.m14013d(t);
                t += this.f21967a.mo10239a();
                do {
                    list.add(Double.valueOf(this.f21967a.mo10246e()));
                } while (this.f21967a.mo10239a() < t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Double.valueOf(this.f21967a.mo10246e()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: f */
    public final int mo10333f() {
        m14009b(0);
        return this.f21967a.mo10248f();
    }

    /* renamed from: d */
    public final void mo10330d(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        ksc.mo15173b(this.f21967a.mo10248f());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(this.f21967a.mo10248f());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Integer.valueOf(this.f21967a.mo10248f()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(this.f21967a.mo10248f()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: a */
    private final Object m14006a(kuw kuw, Class cls, krn krn) {
        kuw kuw2 = null;
        switch (kuw2.ordinal()) {
            case 0:
                return Double.valueOf(mo10331e());
            case 1:
                return Float.valueOf(mo10339i());
            case 2:
                return Long.valueOf(mo10343k());
            case 3:
                return Long.valueOf(mo10358s());
            case 4:
                return Integer.valueOf(mo10341j());
            case 5:
                return Long.valueOf(mo10337h());
            case 6:
                return Integer.valueOf(mo10335g());
            case 7:
                return Boolean.valueOf(mo10328c());
            case 8:
                return mo10355q();
            case 10:
                return mo10323b(cls, krn);
            case 11:
                return mo10329d();
            case 12:
                return Integer.valueOf(mo10357r());
            case 13:
                return Integer.valueOf(mo10333f());
            case 14:
                return Integer.valueOf(mo10345l());
            case 15:
                return Long.valueOf(mo10347m());
            case 16:
                return Integer.valueOf(mo10349n());
            case 17:
                return Long.valueOf(mo10351o());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: g */
    public final int mo10335g() {
        m14009b(5);
        return this.f21967a.mo10249g();
    }

    /* renamed from: e */
    public final void mo10332e(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21968b & 7) {
                case 2:
                    t = this.f21967a.mo10262t();
                    krg.m14011c(t);
                    t += this.f21967a.mo10239a();
                    do {
                        ksc.mo15173b(this.f21967a.mo10249g());
                    } while (this.f21967a.mo10239a() < t);
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(this.f21967a.mo10249g());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 2:
                t = this.f21967a.mo10262t();
                krg.m14011c(t);
                t += this.f21967a.mo10239a();
                do {
                    list.add(Integer.valueOf(this.f21967a.mo10249g()));
                } while (this.f21967a.mo10239a() < t);
                return;
            case 5:
                break;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(this.f21967a.mo10249g()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: h */
    public final long mo10337h() {
        m14009b(1);
        return this.f21967a.mo10250h();
    }

    /* renamed from: f */
    public final void mo10334f(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21968b & 7) {
                case 1:
                    break;
                case 2:
                    t = this.f21967a.mo10262t();
                    krg.m14013d(t);
                    t += this.f21967a.mo10239a();
                    do {
                        kst.mo15180a(this.f21967a.mo10250h());
                    } while (this.f21967a.mo10239a() < t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(this.f21967a.mo10250h());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 1:
                break;
            case 2:
                t = this.f21967a.mo10262t();
                krg.m14013d(t);
                t += this.f21967a.mo10239a();
                do {
                    list.add(Long.valueOf(this.f21967a.mo10250h()));
                } while (this.f21967a.mo10239a() < t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(this.f21967a.mo10250h()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: i */
    public final float mo10339i() {
        m14009b(5);
        return this.f21967a.mo10251i();
    }

    /* renamed from: g */
    public final void mo10336g(List list) {
        int t;
        if (list instanceof krv) {
            krv krv = (krv) list;
            switch (this.f21968b & 7) {
                case 2:
                    t = this.f21967a.mo10262t();
                    krg.m14011c(t);
                    t += this.f21967a.mo10239a();
                    do {
                        krv.mo15169a(this.f21967a.mo10251i());
                    } while (this.f21967a.mo10239a() < t);
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5205c();
            }
            do {
                krv.mo15169a(this.f21967a.mo10251i());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 2:
                t = this.f21967a.mo10262t();
                krg.m14011c(t);
                t += this.f21967a.mo10239a();
                do {
                    list.add(Float.valueOf(this.f21967a.mo10251i()));
                } while (this.f21967a.mo10239a() < t);
                return;
            case 5:
                break;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Float.valueOf(this.f21967a.mo10251i()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: c */
    private final Object m14010c(ktr ktr, krn krn) {
        int i = this.f21969c;
        this.f21969c = ((this.f21968b >>> 3) << 3) | 4;
        try {
            Object a = ktr.mo10361a();
            ktr.mo10362a(a, this, krn);
            ktr.mo10368d(a);
            if (this.f21968b == this.f21969c) {
                return a;
            }
            throw ksh.m5208f();
        } finally {
            this.f21969c = i;
        }
    }

    /* renamed from: a */
    public final Object mo10317a(Class cls, krn krn) {
        m14009b(3);
        return m14010c(kto.f8910a.mo10314a(cls), krn);
    }

    /* renamed from: a */
    public final Object mo10318a(ktr ktr, krn krn) {
        m14009b(3);
        return m14010c(ktr, krn);
    }

    /* renamed from: a */
    public final void mo10320a(List list, ktr ktr, krn krn) {
        int i = this.f21968b;
        if ((i & 7) == 3) {
            int s;
            do {
                list.add(m14010c(ktr, krn));
                if (!this.f21967a.mo10241b() && this.f21970d == 0) {
                    s = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (s == i);
            this.f21970d = s;
            return;
        }
        throw ksh.m5205c();
    }

    /* renamed from: j */
    public final int mo10341j() {
        m14009b(0);
        return this.f21967a.mo10252j();
    }

    /* renamed from: h */
    public final void mo10338h(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        ksc.mo15173b(this.f21967a.mo10252j());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(this.f21967a.mo10252j());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Integer.valueOf(this.f21967a.mo10252j()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(this.f21967a.mo10252j()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: k */
    public final long mo10343k() {
        m14009b(0);
        return this.f21967a.mo10253k();
    }

    /* renamed from: i */
    public final void mo10340i(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        kst.mo15180a(this.f21967a.mo10253k());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(this.f21967a.mo10253k());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Long.valueOf(this.f21967a.mo10253k()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(this.f21967a.mo10253k()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: a */
    public final void mo10321a(java.util.Map r7, p000.krn r8) {
        /*
        r6 = this;
        r1 = 0;
        r0 = 2;
        r6.m14009b(r0);
        r0 = r6.f21967a;
        r0 = r0.mo10262t();
        r2 = r6.f21967a;
        r2 = r2.mo10244d(r0);
        r0 = r1;
    L_0x0012:
        r3 = r6.mo10316a();	 Catch:{ all -> 0x0043 }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r4) goto L_0x005d;
    L_0x001b:
        r4 = r6.f21967a;	 Catch:{ all -> 0x0043 }
        r4 = r4.mo10241b();	 Catch:{ all -> 0x0043 }
        if (r4 != 0) goto L_0x005d;
    L_0x0023:
        switch(r3) {
            case 1: goto L_0x0055;
            case 2: goto L_0x004a;
            default: goto L_0x0026;
        };
    L_0x0026:
        r3 = r6.mo10359t();	 Catch:{ ksi -> 0x0034 }
        if (r3 != 0) goto L_0x0012;
    L_0x002c:
        r3 = new ksh;	 Catch:{ ksi -> 0x0034 }
        r4 = "Unable to parse map entry.";
        r3.<init>(r4);	 Catch:{ ksi -> 0x0034 }
        throw r3;	 Catch:{ ksi -> 0x0034 }
    L_0x0034:
        r3 = move-exception;
        r3 = r6.mo10359t();	 Catch:{ all -> 0x0043 }
        if (r3 != 0) goto L_0x0012;
    L_0x003b:
        r0 = new ksh;	 Catch:{ all -> 0x0043 }
        r1 = "Unable to parse map entry.";
        r0.<init>(r1);	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        r1 = r6.f21967a;
        r1.mo10242c(r2);
        throw r0;
    L_0x004a:
        r3 = 0;
        r3 = r3.getClass();	 Catch:{ ksi -> 0x0034 }
        r4 = 0;
        r1 = r6.m14006a(r4, r3, r8);	 Catch:{ ksi -> 0x0034 }
        goto L_0x0012;
    L_0x0055:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r6.m14006a(r3, r4, r5);	 Catch:{ ksi -> 0x0034 }
        goto L_0x0012;
    L_0x005d:
        r7.put(r0, r1);	 Catch:{ all -> 0x0043 }
        r0 = r6.f21967a;
        r0.mo10242c(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: krg.a(java.util.Map, krn):void");
    }

    /* renamed from: d */
    private final Object m14012d(ktr ktr, krn krn) {
        int t = this.f21967a.mo10262t();
        kre kre = this.f21967a;
        if (kre.f8802a < kre.f8803b) {
            t = kre.mo10244d(t);
            Object a = ktr.mo10361a();
            kre kre2 = this.f21967a;
            kre2.f8802a++;
            ktr.mo10362a(a, this, krn);
            ktr.mo10368d(a);
            this.f21967a.mo10240a(0);
            kre2 = this.f21967a;
            kre2.f8802a--;
            kre2.mo10242c(t);
            return a;
        }
        throw new ksh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: b */
    public final Object mo10323b(Class cls, krn krn) {
        m14009b(2);
        return m14012d(kto.f8910a.mo10314a(cls), krn);
    }

    /* renamed from: b */
    public final Object mo10324b(ktr ktr, krn krn) {
        m14009b(2);
        return m14012d(ktr, krn);
    }

    /* renamed from: b */
    public final void mo10326b(List list, ktr ktr, krn krn) {
        int i = this.f21968b;
        if ((i & 7) == 2) {
            int s;
            do {
                list.add(m14012d(ktr, krn));
                if (!this.f21967a.mo10241b() && this.f21970d == 0) {
                    s = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (s == i);
            this.f21970d = s;
            return;
        }
        throw ksh.m5205c();
    }

    /* renamed from: l */
    public final int mo10345l() {
        m14009b(5);
        return this.f21967a.mo10255m();
    }

    /* renamed from: j */
    public final void mo10342j(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21968b & 7) {
                case 2:
                    t = this.f21967a.mo10262t();
                    krg.m14011c(t);
                    t += this.f21967a.mo10239a();
                    do {
                        ksc.mo15173b(this.f21967a.mo10255m());
                    } while (this.f21967a.mo10239a() < t);
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(this.f21967a.mo10255m());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 2:
                t = this.f21967a.mo10262t();
                krg.m14011c(t);
                t += this.f21967a.mo10239a();
                do {
                    list.add(Integer.valueOf(this.f21967a.mo10255m()));
                } while (this.f21967a.mo10239a() < t);
                return;
            case 5:
                break;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(this.f21967a.mo10255m()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: m */
    public final long mo10347m() {
        m14009b(1);
        return this.f21967a.mo10256n();
    }

    /* renamed from: k */
    public final void mo10344k(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21968b & 7) {
                case 1:
                    break;
                case 2:
                    t = this.f21967a.mo10262t();
                    krg.m14013d(t);
                    t += this.f21967a.mo10239a();
                    do {
                        kst.mo15180a(this.f21967a.mo10256n());
                    } while (this.f21967a.mo10239a() < t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(this.f21967a.mo10256n());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 1:
                break;
            case 2:
                t = this.f21967a.mo10262t();
                krg.m14013d(t);
                t += this.f21967a.mo10239a();
                do {
                    list.add(Long.valueOf(this.f21967a.mo10256n()));
                } while (this.f21967a.mo10239a() < t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(this.f21967a.mo10256n()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: n */
    public final int mo10349n() {
        m14009b(0);
        return this.f21967a.mo10257o();
    }

    /* renamed from: l */
    public final void mo10346l(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        ksc.mo15173b(this.f21967a.mo10257o());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(this.f21967a.mo10257o());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Integer.valueOf(this.f21967a.mo10257o()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(this.f21967a.mo10257o()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: o */
    public final long mo10351o() {
        m14009b(0);
        return this.f21967a.mo10258p();
    }

    /* renamed from: m */
    public final void mo10348m(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        kst.mo15180a(this.f21967a.mo10258p());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(this.f21967a.mo10258p());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Long.valueOf(this.f21967a.mo10258p()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(this.f21967a.mo10258p()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: p */
    public final String mo10353p() {
        m14009b(2);
        return this.f21967a.mo10259q();
    }

    /* renamed from: n */
    public final void mo10350n(List list) {
        m14008a(list, false);
    }

    /* renamed from: a */
    private final void m14008a(List list, boolean z) {
        int s;
        if ((this.f21968b & 7) != 2) {
            throw ksh.m5205c();
        } else if ((list instanceof ksp) && !z) {
            ksp ksp = (ksp) list;
            do {
                ksp.mo10291a(mo10329d());
                if (!this.f21967a.mo10241b()) {
                    s = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (s == this.f21968b);
            this.f21970d = s;
        } else {
            do {
                Object q;
                if (z) {
                    q = mo10355q();
                } else {
                    q = mo10353p();
                }
                list.add(q);
                if (!this.f21967a.mo10241b()) {
                    s = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (s == this.f21968b);
            this.f21970d = s;
        }
    }

    /* renamed from: o */
    public final void mo10352o(List list) {
        m14008a(list, true);
    }

    /* renamed from: q */
    public final String mo10355q() {
        m14009b(2);
        return this.f21967a.mo10260r();
    }

    /* renamed from: r */
    public final int mo10357r() {
        m14009b(0);
        return this.f21967a.mo10262t();
    }

    /* renamed from: p */
    public final void mo10354p(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        ksc.mo15173b(this.f21967a.mo10262t());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(this.f21967a.mo10262t());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Integer.valueOf(this.f21967a.mo10262t()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(this.f21967a.mo10262t()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: s */
    public final long mo10358s() {
        m14009b(0);
        return this.f21967a.mo10263u();
    }

    /* renamed from: q */
    public final void mo10356q(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21968b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                    do {
                        kst.mo15180a(this.f21967a.mo10263u());
                    } while (this.f21967a.mo10239a() < t);
                    m14007a(t);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(this.f21967a.mo10263u());
                if (!this.f21967a.mo10241b()) {
                    t = this.f21967a.mo10261s();
                } else {
                    return;
                }
            } while (t == this.f21968b);
            this.f21970d = t;
            return;
        }
        switch (this.f21968b & 7) {
            case 0:
                break;
            case 2:
                t = this.f21967a.mo10262t() + this.f21967a.mo10239a();
                do {
                    list.add(Long.valueOf(this.f21967a.mo10263u()));
                } while (this.f21967a.mo10239a() < t);
                m14007a(t);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(this.f21967a.mo10263u()));
            if (!this.f21967a.mo10241b()) {
                t = this.f21967a.mo10261s();
            } else {
                return;
            }
        } while (t == this.f21968b);
        this.f21970d = t;
    }

    /* renamed from: a */
    private final void m14007a(int i) {
        if (this.f21967a.mo10239a() != i) {
            throw ksh.m5209g();
        }
    }

    /* renamed from: b */
    private final void m14009b(int i) {
        if ((this.f21968b & 7) != i) {
            throw ksh.m5205c();
        }
    }

    /* renamed from: t */
    public final boolean mo10359t() {
        if (!this.f21967a.mo10241b()) {
            int i = this.f21968b;
            if (i != this.f21969c) {
                return this.f21967a.mo10247e(i);
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m14011c(int i) {
        if ((i & 3) != 0) {
            throw ksh.m5208f();
        }
    }

    /* renamed from: d */
    private static void m14013d(int i) {
        if ((i & 7) != 0) {
            throw ksh.m5208f();
        }
    }
}
