package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: gz */
public final class C0844gz extends C0818gy {
    /* renamed from: a */
    protected final Typeface mo14934a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(this.f24450a, 1), 0, obj);
            Method method = this.f24451b;
            r2 = new Object[4];
            Integer valueOf = Integer.valueOf(-1);
            r2[2] = valueOf;
            r2[3] = valueOf;
            return (Typeface) method.invoke(null, r2);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected final Method mo14935a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
