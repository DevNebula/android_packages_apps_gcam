package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: n */
final class C0378n {
    /* renamed from: a */
    public static C0378n f9228a = new C0378n();
    /* renamed from: b */
    public final Map f9229b = new HashMap();
    /* renamed from: c */
    private final Map f9230c = new HashMap();

    C0378n() {
    }

    /* renamed from: a */
    final C0178cx mo10699a(Class cls, Method[] methodArr) {
        C0178cx b;
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            b = mo10700b(superclass);
            if (b != null) {
                hashMap.putAll(b.f3036b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : mo10700b(b2).f3036b.entrySet()) {
                C0378n.m5674a(hashMap, (C0397o) entry.getKey(), (C0531v) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = C0378n.m5675a(cls);
        }
        int length = methodArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            boolean z2;
            Method method = methodArr[i];
            C0004aj c0004aj = (C0004aj) method.getAnnotation(C0004aj.class);
            if (c0004aj == null) {
                z2 = z;
            } else {
                int i2;
                Class[] parameterTypes = method.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0587y.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0531v a = c0004aj.mo332a();
                if (length2 > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0531v.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0531v.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length2 > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                C0378n.m5674a(hashMap, new C0397o(i2, method), a, cls);
                z2 = true;
            }
            i++;
            z = z2;
        }
        b = new C0178cx(hashMap);
        this.f9230c.put(cls, b);
        this.f9229b.put(cls, Boolean.valueOf(z));
        return b;
    }

    /* renamed from: a */
    static Method[] m5675a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Throwable e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: b */
    final C0178cx mo10700b(Class cls) {
        C0178cx c0178cx = (C0178cx) this.f9230c.get(cls);
        if (c0178cx != null) {
            return c0178cx;
        }
        return mo10699a(cls, null);
    }

    /* renamed from: a */
    private static void m5674a(Map map, C0397o c0397o, C0531v c0531v, Class cls) {
        C0531v c0531v2 = (C0531v) map.get(c0397o);
        if (c0531v2 != null && c0531v != c0531v2) {
            Method method = c0397o.f9500b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(method.getName());
            stringBuilder.append(" in ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous");
            stringBuilder.append(" value ");
            stringBuilder.append(c0531v2);
            stringBuilder.append(", new value ");
            stringBuilder.append(c0531v);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (c0531v2 == null) {
            map.put(c0397o, c0531v);
        }
    }
}
