package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ab */
public final class PG {
    /* renamed from: a */
    private static Map f70a = new HashMap();
    /* renamed from: b */
    private static Map f71b = new HashMap();

    /* renamed from: a */
    private static C0467s m39a(Constructor constructor, Object obj) {
        try {
            return (C0467s) constructor.newInstance(new Object[]{obj});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        } catch (Throwable e22) {
            throw new RuntimeException(e22);
        }
    }

    /* renamed from: a */
    private static Constructor m38a(Class cls) {
        try {
            String str;
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR == null) {
                str = "";
            } else {
                str = packageR.getName();
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(canonicalName.replace(".", "_"));
            stringBuilder.append("_LifecycleAdapter");
            canonicalName = stringBuilder.toString();
            if (!str.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".");
                stringBuilder.append(canonicalName);
                canonicalName = stringBuilder.toString();
            }
            Constructor declaredConstructor = Class.forName(canonicalName).getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static C0758t m40a(Object obj) {
        int i = 0;
        if (obj instanceof C0744q) {
            return new C0837r((C0744q) obj);
        }
        if (obj instanceof C0758t) {
            return (C0758t) obj;
        }
        Class cls = obj.getClass();
        if (PG.m41b(cls) != 2) {
            return new C0807ak(obj);
        }
        List list = (List) f71b.get(cls);
        if (list.size() == 1) {
            return new C0808am(PG.m39a((Constructor) list.get(0), obj));
        }
        C0467s[] c0467sArr = new C0467s[list.size()];
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return new C0831p(c0467sArr);
            }
            c0467sArr[i2] = PG.m39a((Constructor) list.get(i2), obj);
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    private static int m41b(Class cls) {
        int i = 0;
        if (f70a.containsKey(cls)) {
            return ((Integer) f70a.get(cls)).intValue();
        }
        int i2;
        if (cls.getCanonicalName() != null) {
            Constructor a = PG.m38a(cls);
            if (a != null) {
                f71b.put(cls, Collections.singletonList(a));
                i2 = 2;
            } else {
                boolean booleanValue;
                C0378n c0378n = C0378n.f9228a;
                if (c0378n.f9229b.containsKey(cls)) {
                    booleanValue = ((Boolean) c0378n.f9229b.get(cls)).booleanValue();
                } else {
                    Method[] a2 = C0378n.m5675a(cls);
                    for (Method annotation : a2) {
                        if (((C0004aj) annotation.getAnnotation(C0004aj.class)) != null) {
                            c0378n.mo10699a(cls, a2);
                            booleanValue = true;
                            break;
                        }
                    }
                    c0378n.f9229b.put(cls, Boolean.valueOf(false));
                    booleanValue = false;
                }
                if (booleanValue) {
                    i2 = 1;
                } else {
                    List list;
                    Class superclass = cls.getSuperclass();
                    if (!PG.m42c(superclass)) {
                        list = null;
                    } else if (PG.m41b(superclass) != 1) {
                        list = new ArrayList((Collection) f71b.get(superclass));
                    } else {
                        i2 = 1;
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (i < length) {
                        Class cls2 = interfaces[i];
                        if (PG.m42c(cls2)) {
                            if (PG.m41b(cls2) == 1) {
                                i2 = 1;
                                break;
                            }
                            List arrayList;
                            if (list == null) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = list;
                            }
                            arrayList.addAll((Collection) f71b.get(cls2));
                            list = arrayList;
                        }
                        i++;
                    }
                    if (list != null) {
                        f71b.put(cls, list);
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                }
            }
        } else {
            i2 = 1;
        }
        f70a.put(cls, Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: c */
    private static boolean m42c(Class cls) {
        return cls != null && C0574x.class.isAssignableFrom(cls);
    }
}
