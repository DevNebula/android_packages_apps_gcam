package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: kqt */
final class kqt implements ktq {
    /* renamed from: a */
    private final boolean f21953a;
    /* renamed from: b */
    private final byte[] f21954b;
    /* renamed from: c */
    private int f21955c;
    /* renamed from: d */
    private int f21956d;
    /* renamed from: e */
    private int f21957e;
    /* renamed from: f */
    private int f21958f;

    kqt() {
    }

    public kqt(ByteBuffer byteBuffer) {
        this();
        this.f21953a = true;
        this.f21954b = byteBuffer.array();
        this.f21955c = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f21956d = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* renamed from: a */
    public final int mo10316a() {
        if (m13923u()) {
            return LfuScheduler.MAX_PRIORITY;
        }
        this.f21957e = m13909A();
        int i = this.f21957e;
        if (i != this.f21958f) {
            return i >>> 3;
        }
        return LfuScheduler.MAX_PRIORITY;
    }

    /* renamed from: b */
    public final int mo10322b() {
        return this.f21957e;
    }

    /* renamed from: u */
    private final boolean m13923u() {
        return this.f21955c == this.f21956d;
    }

    /* renamed from: c */
    public final boolean mo10328c() {
        m13918c(0);
        if (m13909A() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10319a(List list) {
        int A;
        int i;
        if (list instanceof kqv) {
            kqv kqv = (kqv) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = this.f21955c + m13909A();
                    while (this.f21955c < A) {
                        kqv.mo15160a(m13909A() != 0);
                    }
                    m13916b(A);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kqv.mo15160a(mo10328c());
                if (!m13923u()) {
                    i = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = i;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = this.f21955c + m13909A();
                while (this.f21955c < A) {
                    boolean z;
                    if (m13909A() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                m13916b(A);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Boolean.valueOf(mo10328c()));
            if (!m13923u()) {
                i = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = i;
    }

    /* renamed from: v */
    private final byte m13924v() {
        int i = this.f21955c;
        if (i == this.f21956d) {
            throw ksh.m5209g();
        }
        byte[] bArr = this.f21954b;
        this.f21955c = i + 1;
        return bArr[i];
    }

    /* renamed from: d */
    public final kqx mo10329d() {
        m13918c(2);
        int A = m13909A();
        if (A == 0) {
            return kqx.f8795a;
        }
        kqx b;
        m13914a(A);
        if (this.f21953a) {
            b = kqx.m5118b(this.f21954b, this.f21955c, A);
        } else {
            b = kqx.m5117a(this.f21954b, this.f21955c, A);
        }
        this.f21955c = A + this.f21955c;
        return b;
    }

    /* renamed from: b */
    public final void mo10325b(List list) {
        if ((this.f21957e & 7) == 2) {
            int i;
            do {
                list.add(mo10329d());
                if (!m13923u()) {
                    i = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = i;
            return;
        }
        throw ksh.m5205c();
    }

    /* renamed from: e */
    public final double mo10331e() {
        m13918c(1);
        return Double.longBitsToDouble(m13927y());
    }

    /* renamed from: c */
    public final void mo10327c(List list) {
        int A;
        if (list instanceof krk) {
            krk krk = (krk) list;
            switch (this.f21957e & 7) {
                case 1:
                    break;
                case 2:
                    A = m13909A();
                    m13922f(A);
                    A += this.f21955c;
                    while (this.f21955c < A) {
                        krk.mo15165a(Double.longBitsToDouble(m13928z()));
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                krk.mo15165a(mo10331e());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 1:
                break;
            case 2:
                A = m13909A();
                m13922f(A);
                A += this.f21955c;
                while (this.f21955c < A) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m13928z())));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Double.valueOf(mo10331e()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: f */
    public final int mo10333f() {
        m13918c(0);
        return m13909A();
    }

    /* renamed from: d */
    public final void mo10330d(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        ksc.mo15173b(m13909A());
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(mo10333f());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Integer.valueOf(m13909A()));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(mo10333f()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: a */
    private final Object m13912a(kuw kuw, Class cls, krn krn) {
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
                return m13913a(true);
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
        m13918c(5);
        return m13925w();
    }

    /* renamed from: e */
    public final void mo10332e(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21957e & 7) {
                case 2:
                    A = m13909A();
                    m13921e(A);
                    A += this.f21955c;
                    while (this.f21955c < A) {
                        ksc.mo15173b(m13926x());
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(mo10335g());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 2:
                A = m13909A();
                m13921e(A);
                A += this.f21955c;
                while (this.f21955c < A) {
                    list.add(Integer.valueOf(m13926x()));
                }
                return;
            case 5:
                break;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(mo10335g()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: h */
    public final long mo10337h() {
        m13918c(1);
        return m13927y();
    }

    /* renamed from: f */
    public final void mo10334f(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21957e & 7) {
                case 1:
                    break;
                case 2:
                    A = m13909A();
                    m13922f(A);
                    A += this.f21955c;
                    while (this.f21955c < A) {
                        kst.mo15180a(m13928z());
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(mo10337h());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 1:
                break;
            case 2:
                A = m13909A();
                m13922f(A);
                A += this.f21955c;
                while (this.f21955c < A) {
                    list.add(Long.valueOf(m13928z()));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(mo10337h()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: i */
    public final float mo10339i() {
        m13918c(5);
        return Float.intBitsToFloat(m13925w());
    }

    /* renamed from: g */
    public final void mo10336g(List list) {
        int A;
        if (list instanceof krv) {
            krv krv = (krv) list;
            switch (this.f21957e & 7) {
                case 2:
                    A = m13909A();
                    m13921e(A);
                    A += this.f21955c;
                    while (this.f21955c < A) {
                        krv.mo15169a(Float.intBitsToFloat(m13926x()));
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5205c();
            }
            do {
                krv.mo15169a(mo10339i());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 2:
                A = m13909A();
                m13921e(A);
                A += this.f21955c;
                while (this.f21955c < A) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m13926x())));
                }
                return;
            case 5:
                break;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Float.valueOf(mo10339i()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: c */
    private final Object m13917c(ktr ktr, krn krn) {
        int i = this.f21958f;
        this.f21958f = ((this.f21957e >>> 3) << 3) | 4;
        try {
            Object a = ktr.mo10361a();
            ktr.mo10362a(a, this, krn);
            ktr.mo10368d(a);
            if (this.f21957e == this.f21958f) {
                return a;
            }
            throw ksh.m5208f();
        } finally {
            this.f21958f = i;
        }
    }

    /* renamed from: a */
    public final Object mo10317a(Class cls, krn krn) {
        m13918c(3);
        return m13917c(kto.f8910a.mo10314a(cls), krn);
    }

    /* renamed from: a */
    public final Object mo10318a(ktr ktr, krn krn) {
        m13918c(3);
        return m13917c(ktr, krn);
    }

    /* renamed from: a */
    public final void mo10320a(List list, ktr ktr, krn krn) {
        int i = this.f21957e;
        if ((i & 7) == 3) {
            int i2;
            do {
                list.add(m13917c(ktr, krn));
                if (!m13923u()) {
                    i2 = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == i);
            this.f21955c = i2;
            return;
        }
        throw ksh.m5205c();
    }

    /* renamed from: j */
    public final int mo10341j() {
        m13918c(0);
        return m13909A();
    }

    /* renamed from: h */
    public final void mo10338h(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        ksc.mo15173b(m13909A());
                    }
                    m13916b(A);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(mo10341j());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Integer.valueOf(m13909A()));
                }
                m13916b(A);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(mo10341j()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: k */
    public final long mo10343k() {
        m13918c(0);
        return m13910B();
    }

    /* renamed from: i */
    public final void mo10340i(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        kst.mo15180a(m13910B());
                    }
                    m13916b(A);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(mo10343k());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Long.valueOf(m13910B()));
                }
                m13916b(A);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(mo10343k()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: w */
    private final int m13925w() {
        m13914a(4);
        return m13926x();
    }

    /* renamed from: x */
    private final int m13926x() {
        int i = this.f21955c;
        byte[] bArr = this.f21954b;
        this.f21955c = i + 4;
        return ((bArr[i + 3] & Illuminant.kOther) << 24) | (((bArr[i] & Illuminant.kOther) | ((bArr[i + 1] & Illuminant.kOther) << 8)) | ((bArr[i + 2] & Illuminant.kOther) << 16));
    }

    /* renamed from: y */
    private final long m13927y() {
        m13914a(8);
        return m13928z();
    }

    /* renamed from: z */
    private final long m13928z() {
        int i = this.f21955c;
        byte[] bArr = this.f21954b;
        this.f21955c = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    /* renamed from: a */
    public final void mo10321a(java.util.Map r7, p000.krn r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 2;
        r6.m13918c(r1);
        r1 = r6.m13909A();
        r6.m13914a(r1);
        r2 = r6.f21956d;
        r3 = r6.f21955c;
        r1 = r1 + r3;
        r6.f21956d = r1;
        r1 = r0;
    L_0x0014:
        r3 = r6.mo10316a();	 Catch:{ all -> 0x003d }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r4) goto L_0x0054;
    L_0x001d:
        switch(r3) {
            case 1: goto L_0x004c;
            case 2: goto L_0x0041;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r6.mo10359t();	 Catch:{ ksi -> 0x002e }
        if (r3 != 0) goto L_0x0014;
    L_0x0026:
        r3 = new ksh;	 Catch:{ ksi -> 0x002e }
        r4 = "Unable to parse map entry.";
        r3.<init>(r4);	 Catch:{ ksi -> 0x002e }
        throw r3;	 Catch:{ ksi -> 0x002e }
    L_0x002e:
        r3 = move-exception;
        r3 = r6.mo10359t();	 Catch:{ all -> 0x003d }
        if (r3 != 0) goto L_0x0014;
    L_0x0035:
        r0 = new ksh;	 Catch:{ all -> 0x003d }
        r1 = "Unable to parse map entry.";
        r0.<init>(r1);	 Catch:{ all -> 0x003d }
        throw r0;	 Catch:{ all -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        r6.f21956d = r2;
        throw r0;
    L_0x0041:
        r3 = 0;
        r3 = r3.getClass();	 Catch:{ ksi -> 0x002e }
        r4 = 0;
        r0 = r6.m13912a(r4, r3, r8);	 Catch:{ ksi -> 0x002e }
        goto L_0x0014;
    L_0x004c:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r6.m13912a(r3, r4, r5);	 Catch:{ ksi -> 0x002e }
        goto L_0x0014;
    L_0x0054:
        r7.put(r1, r0);	 Catch:{ all -> 0x003d }
        r6.f21956d = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kqt.a(java.util.Map, krn):void");
    }

    /* renamed from: d */
    private final Object m13919d(ktr ktr, krn krn) {
        int A = m13909A();
        m13914a(A);
        int i = this.f21956d;
        Object obj = this.f21955c;
        A += obj;
        this.f21956d = A;
        try {
            obj = ktr.mo10361a();
            ktr.mo10362a(obj, this, krn);
            ktr.mo10368d(obj);
            if (this.f21955c == A) {
                return obj;
            }
            throw ksh.m5208f();
        } finally {
            this.f21956d = i;
        }
    }

    /* renamed from: b */
    public final Object mo10323b(Class cls, krn krn) {
        m13918c(2);
        return m13919d(kto.f8910a.mo10314a(cls), krn);
    }

    /* renamed from: b */
    public final Object mo10324b(ktr ktr, krn krn) {
        m13918c(2);
        return m13919d(ktr, krn);
    }

    /* renamed from: b */
    public final void mo10326b(List list, ktr ktr, krn krn) {
        int i = this.f21957e;
        if ((i & 7) == 2) {
            int i2;
            do {
                list.add(m13919d(ktr, krn));
                if (!m13923u()) {
                    i2 = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == i);
            this.f21955c = i2;
            return;
        }
        throw ksh.m5205c();
    }

    /* renamed from: l */
    public final int mo10345l() {
        m13918c(5);
        return m13925w();
    }

    /* renamed from: j */
    public final void mo10342j(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21957e & 7) {
                case 2:
                    A = m13909A();
                    m13921e(A);
                    A += this.f21955c;
                    while (this.f21955c < A) {
                        ksc.mo15173b(m13926x());
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(mo10345l());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 2:
                A = m13909A();
                m13921e(A);
                A += this.f21955c;
                while (this.f21955c < A) {
                    list.add(Integer.valueOf(m13926x()));
                }
                return;
            case 5:
                break;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(mo10345l()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: m */
    public final long mo10347m() {
        m13918c(1);
        return m13927y();
    }

    /* renamed from: k */
    public final void mo10344k(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21957e & 7) {
                case 1:
                    break;
                case 2:
                    A = m13909A();
                    m13922f(A);
                    A += this.f21955c;
                    while (this.f21955c < A) {
                        kst.mo15180a(m13928z());
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(mo10347m());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 1:
                break;
            case 2:
                A = m13909A();
                m13922f(A);
                A += this.f21955c;
                while (this.f21955c < A) {
                    list.add(Long.valueOf(m13928z()));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(mo10347m()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: n */
    public final int mo10349n() {
        m13918c(0);
        return kre.m5134b(m13909A());
    }

    /* renamed from: l */
    public final void mo10346l(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        ksc.mo15173b(kre.m5134b(m13909A()));
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(mo10349n());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Integer.valueOf(kre.m5134b(m13909A())));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(mo10349n()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: o */
    public final long mo10351o() {
        m13918c(0);
        return kre.m5132a(m13910B());
    }

    /* renamed from: m */
    public final void mo10348m(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        kst.mo15180a(kre.m5132a(m13910B()));
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(mo10351o());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Long.valueOf(kre.m5132a(m13910B())));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(mo10351o()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: p */
    public final String mo10353p() {
        return m13913a(false);
    }

    /* renamed from: a */
    private final String m13913a(boolean z) {
        m13918c(2);
        int A = m13909A();
        if (A == 0) {
            return "";
        }
        m13914a(A);
        if (z) {
            byte[] bArr = this.f21954b;
            int i = this.f21955c;
            if (!kur.m5420b(bArr, i, i + A)) {
                throw ksh.m5204b();
            }
        }
        String str = new String(this.f21954b, this.f21955c, A, ksd.f8883a);
        this.f21955c = A + this.f21955c;
        return str;
    }

    /* renamed from: n */
    public final void mo10350n(List list) {
        m13915a(list, false);
    }

    /* renamed from: a */
    private final void m13915a(List list, boolean z) {
        int i;
        if ((this.f21957e & 7) != 2) {
            throw ksh.m5205c();
        } else if ((list instanceof ksp) && !z) {
            ksp ksp = (ksp) list;
            do {
                ksp.mo10291a(mo10329d());
                if (!m13923u()) {
                    i = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = i;
        } else {
            do {
                list.add(m13913a(z));
                if (!m13923u()) {
                    i = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = i;
        }
    }

    /* renamed from: o */
    public final void mo10352o(List list) {
        m13915a(list, true);
    }

    /* renamed from: q */
    public final String mo10355q() {
        return m13913a(true);
    }

    /* renamed from: r */
    public final int mo10357r() {
        m13918c(0);
        return m13909A();
    }

    /* renamed from: p */
    public final void mo10354p(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        ksc.mo15173b(m13909A());
                    }
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                ksc.mo15173b(mo10357r());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Integer.valueOf(m13909A()));
                }
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Integer.valueOf(mo10357r()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: s */
    public final long mo10358s() {
        m13918c(0);
        return m13910B();
    }

    /* renamed from: q */
    public final void mo10356q(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f21957e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13909A() + this.f21955c;
                    while (this.f21955c < A) {
                        kst.mo15180a(m13910B());
                    }
                    m13916b(A);
                    return;
                default:
                    throw ksh.m5205c();
            }
            do {
                kst.mo15180a(mo10358s());
                if (!m13923u()) {
                    A = this.f21955c;
                } else {
                    return;
                }
            } while (m13909A() == this.f21957e);
            this.f21955c = A;
            return;
        }
        switch (this.f21957e & 7) {
            case 0:
                break;
            case 2:
                A = m13909A() + this.f21955c;
                while (this.f21955c < A) {
                    list.add(Long.valueOf(m13910B()));
                }
                m13916b(A);
                return;
            default:
                throw ksh.m5205c();
        }
        do {
            list.add(Long.valueOf(mo10358s()));
            if (!m13923u()) {
                A = this.f21955c;
            } else {
                return;
            }
        } while (m13909A() == this.f21957e);
        this.f21955c = A;
    }

    /* renamed from: A */
    private final int m13909A() {
        int i = this.f21955c;
        int i2 = this.f21956d;
        if (i2 == i) {
            throw ksh.m5209g();
        }
        byte[] bArr = this.f21954b;
        int i3 = i + 1;
        byte b = bArr[i];
        if (b >= (byte) 0) {
            this.f21955c = i3;
            return b;
        } else if (i2 - i3 < 9) {
            return (int) m13911C();
        } else {
            i2 = i3 + 1;
            i = b ^ (bArr[i3] << 7);
            if (i >= 0) {
                i3 = i2 + 1;
                i ^= bArr[i2] << 14;
                if (i < 0) {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 21;
                    if (i >= 0) {
                        i3 = i2 + 1;
                        byte b2 = bArr[i2];
                        i = (i ^ (b2 << 28)) ^ 266354560;
                        if (b2 < (byte) 0) {
                            i2 = i3 + 1;
                            if (bArr[i3] < (byte) 0) {
                                i3 = i2 + 1;
                                if (bArr[i2] < (byte) 0) {
                                    i2 = i3 + 1;
                                    if (bArr[i3] < (byte) 0) {
                                        i3 = i2 + 1;
                                        if (bArr[i2] < (byte) 0) {
                                            i2 = i3 + 1;
                                            if (bArr[i3] < (byte) 0) {
                                                throw ksh.m5206d();
                                            }
                                        }
                                        i2 = i3;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            }
                        } else {
                            i2 = i3;
                        }
                    } else {
                        i ^= -2080896;
                    }
                } else {
                    i ^= 16256;
                    i2 = i3;
                }
            } else {
                i ^= -128;
            }
            this.f21955c = i2;
            return i;
        }
    }

    /* renamed from: B */
    private final long m13910B() {
        int i = this.f21955c;
        int i2 = this.f21956d;
        if (i2 == i) {
            throw ksh.m5209g();
        }
        byte[] bArr = this.f21954b;
        int i3 = i + 1;
        byte b = bArr[i];
        if (b >= (byte) 0) {
            this.f21955c = i3;
            return (long) b;
        } else if (i2 - i3 < 9) {
            return m13911C();
        } else {
            long j;
            int i4 = i3 + 1;
            i = b ^ (bArr[i3] << 7);
            if (i >= 0) {
                i3 = i4 + 1;
                i ^= bArr[i4] << 14;
                if (i < 0) {
                    i4 = i3 + 1;
                    i ^= bArr[i3] << 21;
                    if (i < 0) {
                        j = (long) (i ^ -2080896);
                    } else {
                        i3 = i4 + 1;
                        j = ((long) i) ^ (((long) bArr[i4]) << 28);
                        if (j < 0) {
                            i4 = i3 + 1;
                            j ^= ((long) bArr[i3]) << 35;
                            if (j >= 0) {
                                i3 = i4 + 1;
                                j ^= ((long) bArr[i4]) << 42;
                                if (j < 0) {
                                    i4 = i3 + 1;
                                    j ^= ((long) bArr[i3]) << 49;
                                    if (j >= 0) {
                                        i3 = i4 + 1;
                                        j = (j ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                        if (j < 0) {
                                            i4 = i3 + 1;
                                            if (((long) bArr[i3]) < 0) {
                                                throw ksh.m5206d();
                                            }
                                        }
                                        i4 = i3;
                                    } else {
                                        j ^= -558586000294016L;
                                    }
                                } else {
                                    j ^= 4363953127296L;
                                    i4 = i3;
                                }
                            } else {
                                j ^= -34093383808L;
                            }
                        } else {
                            j ^= 266354560;
                            i4 = i3;
                        }
                    }
                } else {
                    j = (long) (i ^ 16256);
                    i4 = i3;
                }
            } else {
                j = (long) (i ^ -128);
            }
            this.f21955c = i4;
            return j;
        }
    }

    /* renamed from: C */
    private final long m13911C() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte v = m13924v();
            j |= ((long) (v & ScriptIntrinsicBLAS.RsBlas_csyrk)) << i;
            if ((v & 128) == 0) {
                return j;
            }
        }
        throw ksh.m5206d();
    }

    /* renamed from: a */
    private final void m13914a(int i) {
        if (i < 0 || i > this.f21956d - this.f21955c) {
            throw ksh.m5209g();
        }
    }

    /* renamed from: b */
    private final void m13916b(int i) {
        if (this.f21955c != i) {
            throw ksh.m5209g();
        }
    }

    /* renamed from: c */
    private final void m13918c(int i) {
        if ((this.f21957e & 7) != i) {
            throw ksh.m5205c();
        }
    }

    /* renamed from: d */
    private final void m13920d(int i) {
        m13914a(i);
        this.f21955c += i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* renamed from: t */
    public final boolean mo10359t() {
        /*
        r7 = this;
        r6 = 10;
        r1 = 0;
        r0 = 1;
        r2 = r7.m13923u();
        if (r2 != 0) goto L_0x0010;
    L_0x000a:
        r2 = r7.f21957e;
        r3 = r7.f21958f;
        if (r2 != r3) goto L_0x0012;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        return r0;
    L_0x0012:
        r4 = r2 & 7;
        switch(r4) {
            case 0: goto L_0x0054;
            case 1: goto L_0x0046;
            case 2: goto L_0x004c;
            case 3: goto L_0x0021;
            case 4: goto L_0x0017;
            case 5: goto L_0x001c;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = p000.ksh.m5205c();
        throw r0;
    L_0x001c:
        r1 = 4;
        r7.m13920d(r1);
        goto L_0x0011;
    L_0x0021:
        r1 = r2 >>> 3;
        r1 = r1 << 3;
        r1 = r1 | 4;
        r7.f21958f = r1;
    L_0x0029:
        r1 = r7.mo10316a();
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == r2) goto L_0x0038;
    L_0x0032:
        r1 = r7.mo10359t();
        if (r1 != 0) goto L_0x0029;
    L_0x0038:
        r1 = r7.f21957e;
        r2 = r7.f21958f;
        if (r1 == r2) goto L_0x0043;
    L_0x003e:
        r0 = p000.ksh.m5208f();
        throw r0;
    L_0x0043:
        r7.f21958f = r3;
        goto L_0x0011;
    L_0x0046:
        r1 = 8;
        r7.m13920d(r1);
        goto L_0x0011;
    L_0x004c:
        r1 = r7.m13909A();
        r7.m13920d(r1);
        goto L_0x0011;
    L_0x0054:
        r3 = r7.f21956d;
        r2 = r7.f21955c;
        r3 = r3 - r2;
        if (r3 < r6) goto L_0x006e;
    L_0x005b:
        r5 = r7.f21954b;
        r3 = r2;
        r2 = r1;
    L_0x005f:
        if (r2 >= r6) goto L_0x006e;
    L_0x0061:
        r4 = r3 + 1;
        r3 = r5[r3];
        if (r3 >= 0) goto L_0x006b;
    L_0x0067:
        r2 = r2 + 1;
        r3 = r4;
        goto L_0x005f;
    L_0x006b:
        r7.f21955c = r4;
        goto L_0x0011;
    L_0x006e:
        if (r1 >= r6) goto L_0x0079;
    L_0x0070:
        r2 = r7.m13924v();
        if (r2 >= 0) goto L_0x0011;
    L_0x0076:
        r1 = r1 + 1;
        goto L_0x006e;
    L_0x0079:
        r0 = p000.ksh.m5206d();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kqt.t():boolean");
    }

    /* renamed from: e */
    private final void m13921e(int i) {
        m13914a(i);
        if ((i & 3) != 0) {
            throw ksh.m5208f();
        }
    }

    /* renamed from: f */
    private final void m13922f(int i) {
        m13914a(i);
        if ((i & 7) != 0) {
            throw ksh.m5208f();
        }
    }
}
