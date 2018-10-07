package p000;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jur */
public final class jur extends jul {
    /* renamed from: a */
    private final List f24812a = khb.m4945b();

    /* renamed from: a */
    public final jur mo15055a(jul jul) {
        this.f24812a.add(jul);
        return this;
    }

    /* renamed from: a */
    public final Set mo13867a(juh juh) {
        Iterable e = khb.m4963e();
        for (jul a : this.f24812a) {
            e.addAll(a.mo13867a(juh));
        }
        return khb.m4950b(e);
    }

    public final String toString() {
        String a = kaz.m4791a(", ").mo9694a().mo9693a(this.f24812a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 34);
        stringBuilder.append("[CompositeSegmentClassifier: { ");
        stringBuilder.append(a);
        stringBuilder.append(" }]");
        return stringBuilder.toString();
    }
}
