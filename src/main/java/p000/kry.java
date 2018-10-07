package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: kry */
public abstract class kry extends kqo {
    /* renamed from: f */
    public static Map f26605f = new ConcurrentHashMap();
    /* renamed from: a */
    private int f26606a = -1;
    /* renamed from: e */
    public kuh f26607e = kuh.f8940a;

    /* renamed from: a */
    public abstract Object mo15667a(int i, Object obj);

    /* renamed from: a */
    public static krl m18191a(krl krl) {
        return krl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((kry) mo15667a(C0252go.f5908ca, null)).getClass().isInstance(obj)) {
            return kto.f8910a.mo10315a((Object) this).mo10364a((Object) this, (kry) obj);
        }
        return false;
    }

    /* renamed from: a */
    static kry m18193a(Class cls) {
        kry kry = (kry) f26605f.get(cls);
        if (kry == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                kry = (kry) f26605f.get(cls);
            } catch (Throwable e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (kry != null) {
            return kry;
        }
        String valueOf = String.valueOf(cls.getName());
        String str = "Unable to get default instance for: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        throw new IllegalStateException(valueOf);
    }

    /* renamed from: d */
    public final /* synthetic */ kte mo10312d() {
        return (kry) mo15667a(C0252go.f5908ca, null);
    }

    /* renamed from: a */
    final int mo15154a() {
        return this.f26606a;
    }

    /* renamed from: e */
    public final int mo14187e() {
        if (this.f26606a == -1) {
            this.f26606a = kto.f8910a.mo10315a((Object) this).mo10360a(this);
        }
        return this.f26606a;
    }

    public int hashCode() {
        if (this.f25357d != 0) {
            return this.f25357d;
        }
        this.f25357d = kto.f8910a.mo10315a((Object) this).mo10365b(this);
        return this.f25357d;
    }

    /* renamed from: a */
    static Object m18190a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo10313f() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo15667a(C0252go.f5876bV, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean c = kto.f8910a.mo10315a((Object) this).mo10367c(this);
        if (booleanValue) {
            Object obj;
            if (c) {
                kry obj2 = this;
            } else {
                obj2 = null;
            }
            mo15667a(C0252go.f5877bW, obj2);
        }
        return c;
    }

    /* renamed from: a */
    protected static final boolean m18196a(kry kry) {
        byte byteValue = ((Byte) kry.mo15667a(C0252go.f5876bV, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        return kto.f8910a.mo10315a((Object) kry).mo10367c(kry);
    }

    /* renamed from: g */
    public final /* synthetic */ ktf mo14188g() {
        return (krz) mo15667a(C0252go.f5880bZ, null);
    }

    /* renamed from: a */
    public static krl m18192a(kte kte, Object obj, kte kte2, int i, kuw kuw) {
        return new krl(kte, obj, kte2, new krs(i, kuw));
    }

    /* renamed from: a */
    private static kry m18194a(kry kry, kre kre, krn krn) {
        Object obj = (kry) kry.mo15667a(C0252go.f5879bY, null);
        try {
            ktr a = kto.f8910a.mo10315a(obj);
            ktq ktq = kre.f8804c;
            if (ktq == null) {
                ktq = new krg(kre);
            }
            a.mo10362a(obj, ktq, krn);
            kto.f8910a.mo10315a(obj).mo10368d(obj);
            return obj;
        } catch (IOException e) {
            if (e.getCause() instanceof ksh) {
                throw ((ksh) e.getCause());
            }
            throw new ksh(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ksh) {
                throw ((ksh) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static kry m18195a(kry kry, byte[] bArr, krn krn) {
        try {
            kre a = kre.m5133a(bArr, bArr.length);
            kry a2 = kry.m18194a(kry, a, krn);
            a.mo10240a(0);
            return a2;
        } catch (ksh e) {
            throw e;
        } catch (ksh e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    final void mo15155a(int i) {
        this.f26606a = i;
    }

    /* renamed from: h */
    public final /* synthetic */ ktf mo14189h() {
        krz krz = (krz) mo15667a(C0252go.f5880bZ, null);
        krz.mo15158a(this);
        return krz;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(obj);
        ktm.m14226a((kte) this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo14185a(krh krh) {
        ktr a = kto.f8910a.mo10314a(getClass());
        kvb kvb = krh.f21973c;
        if (kvb == null) {
            kvb = new kvb(krh);
        }
        a.mo10363a((Object) this, kvb);
    }
}
