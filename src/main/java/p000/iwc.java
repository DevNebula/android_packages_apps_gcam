package p000;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: iwc */
public final class iwc {
    /* renamed from: a */
    private final Method f7881a;
    /* renamed from: b */
    private final Method f7882b;
    /* renamed from: c */
    private final Method f7883c;

    iwc() {
        Method method;
        Method method2;
        Throwable e;
        Method method3 = null;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", new Class[]{String.class, String.class});
            try {
                method2 = cls.getMethod("set", new Class[]{String.class, String.class});
            } catch (Throwable e2) {
                e = e2;
                method2 = method3;
            } catch (Throwable e22) {
                e = e22;
                method2 = method3;
                this.f7881a = method;
                this.f7882b = method2;
                this.f7883c = method3;
                throw e;
            }
            try {
                method3 = cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
                try {
                    cls.getMethod("getLong", new Class[]{String.class, Long.TYPE});
                    this.f7881a = method;
                    this.f7882b = method2;
                    this.f7883c = method3;
                } catch (Exception e3) {
                    e = e3;
                    try {
                        throw new IllegalStateException("Unable to reflect SystemProperties.", e);
                    } catch (Throwable th) {
                        e = th;
                        this.f7881a = method;
                        this.f7882b = method2;
                        this.f7883c = method3;
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    this.f7881a = method;
                    this.f7882b = method2;
                    this.f7883c = method3;
                    throw e;
                }
            } catch (Exception e4) {
                e = e4;
            } catch (Throwable th3) {
                e = th3;
                this.f7881a = method;
                this.f7882b = method2;
                this.f7883c = method3;
                throw e;
            }
        } catch (Throwable e222) {
            method = method3;
            e = e222;
            method2 = method3;
        } catch (Throwable e2222) {
            method = method3;
            e = e2222;
            method2 = method3;
            this.f7881a = method;
            this.f7882b = method2;
            this.f7883c = method3;
            throw e;
        }
    }

    /* renamed from: a */
    public final int mo9115a(String str, int i) {
        jri.m13391a((Object) str, (Object) "Key cannot be null!");
        try {
            Method method = this.f7883c;
            if (method == null) {
                return i;
            }
            Integer num = (Integer) method.invoke(null, new Object[]{str, Integer.valueOf(i)});
            if (num != null) {
                return num.intValue();
            }
            return i;
        } catch (Throwable e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return i;
        }
    }

    /* renamed from: a */
    public final String mo9116a(String str) {
        jri.m13391a((Object) str, (Object) "Key cannot be null!");
        try {
            String str2;
            Method method = this.f7881a;
            if (method != null) {
                str2 = (String) method.invoke(null, new Object[]{str, null});
                if ("".equals(str2)) {
                    return null;
                }
            }
            str2 = null;
            return str2;
        } catch (Throwable e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo9117a(String str, String str2) {
        jri.m13391a((Object) str, (Object) "Key cannot be null!");
        try {
            Method method = this.f7882b;
            if (method != null) {
                method.invoke(null, new Object[]{str, str2});
                return true;
            }
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length());
            stringBuilder.append("Could not set SystemProperty key: ");
            stringBuilder.append(str);
            stringBuilder.append(" to value: ");
            stringBuilder.append(str2);
            Log.e("CAM_SystemProperties", stringBuilder.toString(), e);
        }
        return false;
    }
}
