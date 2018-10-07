package p000;

import android.util.Log;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: juj */
public final class juj implements juk {
    /* renamed from: a */
    private final Writer f21764a;
    /* renamed from: b */
    private final juf f21765b;
    /* renamed from: c */
    private final String f21766c;

    public juj(juf juf, String str, Writer writer) {
        this.f21765b = juf;
        this.f21766c = str;
        this.f21764a = writer;
    }

    /* renamed from: b */
    private final List m13492b(List list) {
        Writer stringWriter = new StringWriter();
        String str = this.f21766c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append("NEW CHAIN: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringWriter.write(stringBuilder.toString());
        juj.m13491a(list, stringWriter);
        for (juk juk : this.f21765b.f21762a) {
            String a = juj.m13490a(juk);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 23);
            stringBuilder2.append("  Applying Segmenter: ");
            stringBuilder2.append(a);
            stringBuilder2.append("\n");
            stringWriter.write(stringBuilder2.toString());
            list = juk.mo9570a(list);
            juj.m13491a(list, stringWriter);
        }
        stringWriter.write("CHAIN END. Final Result:\n");
        juj.m13491a(list, stringWriter);
        stringWriter.write("\n\n");
        synchronized (this.f21764a) {
            this.f21764a.write(stringWriter.toString());
        }
        return list;
    }

    /* renamed from: a */
    public final List mo9570a(List list) {
        try {
            return m13492b(list);
        } catch (IOException e) {
            Log.w("LoggingChainedResegmenter", "Cannot log segmentation chain. Reverting back to standard implementation.");
            return this.f21765b.mo9570a(list);
        }
    }

    /* renamed from: a */
    private static String m13490a(juk juk) {
        if (juk instanceof jvi) {
            return String.valueOf(((jvi) juk).f21767a.getClass().getSimpleName()).concat(" (cached)");
        }
        if (!(juk instanceof juj)) {
            return juk.getClass().getSimpleName();
        }
        juj juj = (juj) juk;
        String a = juj.m13490a(juj.f21765b);
        String str = juj.f21766c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 3) + String.valueOf(str).length());
        stringBuilder.append(a);
        stringBuilder.append(" (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m13491a(List list, Writer writer) {
        if (list.isEmpty()) {
            writer.write("    > [EMPTY SEGMENT LIST]\n");
        }
        for (juh juh : list) {
            String valueOf = String.valueOf(juh);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
            stringBuilder.append("    > ");
            stringBuilder.append(valueOf);
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
            writer.write("      [\n");
            Iterator it = juh.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                StringBuilder stringBuilder2 = new StringBuilder(40);
                stringBuilder2.append("        timestamp: ");
                stringBuilder2.append(longValue);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
            }
            writer.write("      ]\n");
        }
    }
}
