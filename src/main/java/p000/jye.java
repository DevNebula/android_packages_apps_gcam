package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jye */
public final class jye implements jmu {
    /* renamed from: a */
    private final /* synthetic */ Writer f21807a;

    public jye(Writer writer) {
        this.f21807a = writer;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9523a(Object obj, String str) {
        juk juk = (juk) obj;
        if (juk instanceof juf) {
            return new juj((juf) juk, str, this.f21807a);
        }
        return juk;
    }
}
