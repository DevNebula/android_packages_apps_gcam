package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jyx */
public final class jyx implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jrj f21822a;

    public jyx(jrj jrj) {
        this.f21822a = jrj;
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        int i = 0;
        for (Long longValue : this.f21822a.mo9217a().mo13834d()) {
            long longValue2 = longValue.longValue();
            writer.write(String.format("%d,%d%n", new Object[]{Integer.valueOf(i), Long.valueOf(longValue2)}));
            i++;
        }
    }
}
