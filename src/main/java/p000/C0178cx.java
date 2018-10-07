package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: cx */
public final class C0178cx {
    /* renamed from: a */
    public final Map f3035a;
    /* renamed from: b */
    public final Map f3036b;

    public C0178cx(Map map) {
        this.f3036b = map;
        this.f3035a = new HashMap();
        for (Entry entry : map.entrySet()) {
            C0531v c0531v = (C0531v) entry.getValue();
            List list = (List) this.f3035a.get(c0531v);
            if (list == null) {
                list = new ArrayList();
                this.f3035a.put(c0531v, list);
            }
            list.add(entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1598a(List list, C0587y c0587y, C0531v c0531v, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0397o c0397o = (C0397o) list.get(size);
                try {
                    switch (c0397o.f9499a) {
                        case 0:
                            c0397o.f9500b.invoke(obj, new Object[0]);
                            break;
                        case 1:
                            c0397o.f9500b.invoke(obj, new Object[]{c0587y});
                            break;
                        case 2:
                            c0397o.f9500b.invoke(obj, new Object[]{c0587y, c0531v});
                            break;
                        default:
                            break;
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
