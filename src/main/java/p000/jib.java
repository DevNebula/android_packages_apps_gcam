package p000;

import java.io.Writer;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jib */
public final class jib implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jia f21522a;

    public jib(jia jia) {
        this.f21522a = jia;
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        synchronized (this.f21522a) {
            long nanoTime = System.nanoTime() - this.f21522a.f21519e;
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("Measurement duration: ");
            stringBuilder.append(nanoTime);
            stringBuilder.append(" NS\n");
            writer.write(stringBuilder.toString());
            int size = this.f21522a.f21515a.size();
            StringBuilder stringBuilder2 = new StringBuilder(33);
            stringBuilder2.append("Decoded frame count: ");
            stringBuilder2.append(size);
            stringBuilder2.append("\n");
            writer.write(stringBuilder2.toString());
            for (Entry entry : this.f21522a.f21516b.entrySet()) {
                int intValue;
                String num;
                Integer num2 = (Integer) this.f21522a.f21517c.get(entry.getKey());
                if (num2 != null) {
                    intValue = num2.intValue();
                } else {
                    intValue = 0;
                }
                num2 = (Integer) this.f21522a.f21518d.get(entry.getKey());
                if (num2 != null) {
                    num = num2.toString();
                } else {
                    num = "unknown";
                }
                String str = num;
                String name = ((Thread) entry.getKey()).getName();
                size = ((List) entry.getValue()).size();
                StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(name).length() + 80) + String.valueOf(str).length());
                stringBuilder3.append("Thread '");
                stringBuilder3.append(name);
                stringBuilder3.append("' [max-dimension: ");
                stringBuilder3.append(str);
                stringBuilder3.append("] saw ");
                stringBuilder3.append(size);
                stringBuilder3.append(" frames, skipped ");
                stringBuilder3.append(intValue);
                stringBuilder3.append(" frames.\n");
                writer.write(stringBuilder3.toString());
            }
        }
    }
}
