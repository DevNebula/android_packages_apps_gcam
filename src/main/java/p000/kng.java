package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* compiled from: PG */
/* renamed from: kng */
final class kng implements InvocationHandler {
    /* renamed from: b */
    private static final kes f8735b;
    /* renamed from: a */
    public final knf f8736a;

    static {
        khb e = kes.m4869e();
        for (Object obj : knf.class.getMethods()) {
            if (obj.getDeclaringClass().equals(knf.class)) {
                try {
                    obj.setAccessible(true);
                } catch (AccessControlException e2) {
                }
                e.mo9983a(obj.getName(), obj);
            }
        }
        f8735b = e.mo9981a();
    }

    kng(knf knf) {
        this.f8736a = knf;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Method method2 = (Method) f8735b.get(name);
        if (method2 == null) {
            throw new UnsupportedOperationException(name);
        }
        try {
            return method2.invoke(this.f8736a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
