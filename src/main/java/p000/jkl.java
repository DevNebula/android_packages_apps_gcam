package p000;

import android.util.Log;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jkl */
final class jkl extends izy {
    /* renamed from: a */
    private final /* synthetic */ juh f24774a;
    /* renamed from: b */
    private final /* synthetic */ jkk f24775b;

    jkl(jkk jkk, juh juh) {
        this.f24775b = jkk;
        this.f24774a = juh;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        jip jip = (jip) obj;
        Writer stringWriter = new StringWriter();
        String str = this.f24775b.f21580b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
        stringBuilder.append("Chain: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringWriter.write(stringBuilder.toString());
        str = jip.f21537a;
        stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
        stringBuilder.append("Artifact: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringWriter.write(stringBuilder.toString());
        int i = jip.f21538b;
        StringBuilder stringBuilder2 = new StringBuilder(22);
        stringBuilder2.append("Priority: ");
        stringBuilder2.append(i);
        stringBuilder2.append("\n");
        stringWriter.write(stringBuilder2.toString());
        try {
            stringWriter.write("Artifact timestamps: [");
            if (jip != null) {
                str = String.valueOf(jip.getClass().getSimpleName());
                String str2 = "cannot log timestamps from ";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                stringWriter.write(str);
            }
            stringWriter.write("]\n");
            juh juh = this.f24774a;
            stringWriter.write("Frame timestamps: [");
            if (juh != null) {
                Iterator it = juh.iterator();
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    StringBuilder stringBuilder3 = new StringBuilder(22);
                    stringBuilder3.append(longValue);
                    stringBuilder3.append(", ");
                    stringWriter.write(stringBuilder3.toString());
                }
            }
            stringWriter.write("]\n");
            stringWriter.write("CHAIN END. ");
            stringWriter.write("\n\n");
            synchronized (this.f24775b.f21579a) {
                this.f24775b.f21579a.write(stringWriter.toString());
            }
        } catch (Throwable e) {
            Log.w("LoggingArtifactRenderer", "Cannot log artifact composition.", e);
        }
    }
}
