package p000;

import java.io.Writer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkk */
public final class jkk implements jiq {
    /* renamed from: a */
    public final Writer f21579a;
    /* renamed from: b */
    public final String f21580b;
    /* renamed from: c */
    private final jiq f21581c;

    public jkk(jiq jiq, String str, Writer writer) {
        this.f21581c = jiq;
        this.f21580b = str;
        this.f21579a = writer;
    }

    /* renamed from: a */
    public final int mo9460a() {
        return this.f21581c.mo9460a();
    }

    /* renamed from: b */
    public final String mo9462b() {
        return this.f21581c.mo9462b();
    }

    /* renamed from: a */
    public final jaq mo9461a(juh juh, Executor executor) {
        jaq a = this.f21581c.mo9461a(juh, executor);
        a.mo9275a(jlk.f8281a, new jkl(this, juh)).mo9282a(izw.f21401a);
        return a;
    }
}
