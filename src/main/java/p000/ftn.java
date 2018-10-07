package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ftn */
final class ftn {
    /* renamed from: a */
    public final String f4938a;
    /* renamed from: b */
    public List f4939b;

    ftn(String str, List list) {
        this.f4938a = str;
        this.f4939b = list;
    }

    public final String toString() {
        return jqk.m13351b("ValidationResult").mo9703a("strategy", this.f4938a).mo9703a("valid", (Object) "false").mo9703a("failed constraints", this.f4939b).toString();
    }
}
