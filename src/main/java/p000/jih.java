package p000;

import java.io.Writer;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jih */
public final class jih implements jyv {
    /* renamed from: a */
    private final /* synthetic */ Set f21524a;
    /* renamed from: b */
    private final /* synthetic */ jig f21525b;

    public jih(jig jig, Set set) {
        this.f21525b = jig;
        this.f21524a = set;
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        jig jig = this.f21525b;
        for (jza jza : this.f21524a) {
            jzr a = jig.mo9457a(jza);
            if (a.f8522e != 0) {
                int assignmentCount = jig.f8215a.getAssignmentCount(jza);
                String valueOf = String.valueOf(jza);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 1);
                stringBuilder.append(valueOf);
                stringBuilder.append("\n");
                writer.write(stringBuilder.toString());
                int i = jza.f8493A;
                StringBuilder stringBuilder2 = new StringBuilder(26);
                stringBuilder2.append("  dimensions: ");
                stringBuilder2.append(i);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
                i = a.f8522e;
                stringBuilder2 = new StringBuilder(21);
                stringBuilder2.append("  count: ");
                stringBuilder2.append(i);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder(27);
                stringBuilder3.append("  assignments: ");
                stringBuilder3.append(assignmentCount);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                double d = a.f8518a;
                stringBuilder3 = new StringBuilder(32);
                stringBuilder3.append("  min: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                d = a.f8519b;
                stringBuilder3 = new StringBuilder(32);
                stringBuilder3.append("  max: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                d = a.f8520c;
                stringBuilder3 = new StringBuilder(33);
                stringBuilder3.append("  mean: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                d = Math.sqrt(a.f8521d);
                stringBuilder3 = new StringBuilder(36);
                stringBuilder3.append("  stddev: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n\n");
                writer.write(stringBuilder3.toString());
            }
        }
    }
}
