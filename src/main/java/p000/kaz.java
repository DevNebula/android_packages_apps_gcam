package p000;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kaz */
public class kaz {
    /* renamed from: a */
    public final String f8544a;

    kaz(kaz kaz) {
        this.f8544a = kaz.f8544a;
    }

    public kaz(String str) {
        this.f8544a = (String) jri.m13404b((Object) str);
    }

    /* renamed from: a */
    public Appendable mo9691a(Appendable appendable, Iterator it) {
        jri.m13404b((Object) appendable);
        if (it.hasNext()) {
            appendable.append(mo9692a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f8544a);
                appendable.append(mo9692a(it.next()));
            }
        }
        return appendable;
    }

    /* renamed from: a */
    private final StringBuilder m4790a(StringBuilder stringBuilder, Iterator it) {
        try {
            mo9691a((Appendable) stringBuilder, it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final String mo9693a(Iterable iterable) {
        return m4790a(new StringBuilder(), iterable.iterator()).toString();
    }

    /* renamed from: a */
    public static kaz m4791a(String str) {
        return new kaz(str);
    }

    /* renamed from: a */
    public kaz mo9694a() {
        return new kbb(this, this);
    }

    /* renamed from: a */
    CharSequence mo9692a(Object obj) {
        jri.m13404b(obj);
        return !(obj instanceof CharSequence) ? obj.toString() : (CharSequence) obj;
    }

    /* renamed from: b */
    public kaz mo9695b(String str) {
        jri.m13404b((Object) str);
        return new kba(this, this, str);
    }

    /* renamed from: c */
    public kbc mo9696c(String str) {
        return new kbc(this, str);
    }
}
