package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jyw */
public final class jyw implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jxm f21821a;

    public jyw(jxm jxm) {
        this.f21821a = jxm;
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        Object obj = this.f21821a;
        jri.m13404b(obj);
        jri.m13404b((Object) writer);
        int i = 0;
        for (jxa jxa : obj.mo9598a()) {
            int i2 = i + 1;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("== Metadata Record ");
            stringBuilder.append(i);
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
            for (jxi jxi : jxa.f8433w.keySet()) {
                Object a = jxa.mo9589a(jxi);
                String valueOf = String.valueOf(jxi);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(valueOf2).length());
                stringBuilder2.append("= ");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" -> ");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
            }
            writer.write("==================\n\n");
            i = i2;
        }
    }
}
