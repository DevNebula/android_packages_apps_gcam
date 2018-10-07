package p000;

import java.io.StringWriter;

/* compiled from: PG */
/* renamed from: jyk */
public final class jyk implements jmu {
    /* renamed from: a */
    private final /* synthetic */ StringWriter f21813a;

    public jyk(StringWriter stringWriter) {
        this.f21813a = stringWriter;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9523a(Object obj, String str) {
        jwa jwa = (jwa) obj;
        if (jwa instanceof jvy) {
            return new jwf(jwa, this.f21813a);
        }
        return jwa;
    }
}
