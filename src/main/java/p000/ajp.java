package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ajp */
public final class ajp implements ajm {
    /* renamed from: b */
    private final Map f10347b;
    /* renamed from: c */
    private volatile Map f10348c;

    ajp(Map map) {
        this.f10347b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajp)) {
            return false;
        }
        return this.f10347b.equals(((ajp) obj).f10347b);
    }

    /* renamed from: a */
    public final Map mo336a() {
        if (this.f10348c == null) {
            synchronized (this) {
                if (this.f10348c == null) {
                    Map hashMap = new HashMap();
                    for (Entry entry : this.f10347b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder stringBuilder = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            Object a = ((ajo) list.get(i)).mo337a();
                            if (!TextUtils.isEmpty(a)) {
                                stringBuilder.append(a);
                                if (i != list.size() - 1) {
                                    stringBuilder.append(',');
                                }
                            }
                        }
                        CharSequence stringBuilder2 = stringBuilder.toString();
                        if (!TextUtils.isEmpty(stringBuilder2)) {
                            hashMap.put((String) entry.getKey(), stringBuilder2);
                        }
                    }
                    this.f10348c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.f10348c;
    }

    public final int hashCode() {
        return this.f10347b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10347b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
        stringBuilder.append("LazyHeaders{headers=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
