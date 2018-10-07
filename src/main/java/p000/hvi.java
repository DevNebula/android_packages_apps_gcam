package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hvi */
public final class hvi {
    /* renamed from: a */
    private final List f7080a = new ArrayList();
    /* renamed from: b */
    private final Object f7081b;

    public hvi(Object obj) {
        this.f7081b = htl.m3488b(obj);
    }

    /* renamed from: a */
    public final hvi mo8170a(String str, Object obj) {
        List list = this.f7080a;
        String str2 = (String) htl.m3488b((Object) str);
        String valueOf = String.valueOf(String.valueOf(obj));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("=");
        stringBuilder.append(valueOf);
        list.add(stringBuilder.toString());
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.f7081b.getClass().getSimpleName());
        stringBuilder.append('{');
        int size = this.f7080a.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) this.f7080a.get(i));
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
