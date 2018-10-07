package p000;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvn */
public final class jvn extends jun {
    /* renamed from: a */
    private final jui[] f24853a;

    public jvn(jui... juiArr) {
        this.f24853a = juiArr;
    }

    /* renamed from: a */
    public final boolean mo13871a(juh juh) {
        Set set = juh.f8351b;
        for (Object contains : this.f24853a) {
            if (set.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f24853a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 31);
        stringBuilder.append("LabeledSegmentSelector[labels=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
