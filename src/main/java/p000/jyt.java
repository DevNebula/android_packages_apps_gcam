package p000;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jyt */
public final class jyt {
    /* renamed from: a */
    private final File f8445a;
    /* renamed from: b */
    private final Map f8446b = new HashMap();
    /* renamed from: c */
    private final String f8447c;

    public jyt(File file, String str) {
        jri.m13404b((Object) file);
        jri.m13404b((Object) str);
        this.f8445a = file;
        this.f8447c = str;
    }

    /* renamed from: a */
    public final void mo9618a(String str, jyv jyv) {
        jri.m13404b((Object) str);
        jri.m13404b((Object) jyv);
        if (this.f8446b.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 57);
            stringBuilder.append("Cannot add log-writer for file '");
            stringBuilder.append(str);
            stringBuilder.append("' which is already taken!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f8446b.put(str, jyv);
    }

    /* renamed from: a */
    public final StringWriter mo9616a(String str) {
        jri.m13404b((Object) str);
        StringWriter stringWriter = new StringWriter();
        mo9618a(str, new jyu(stringWriter));
        return stringWriter;
    }

    /* renamed from: b */
    public final jyy mo9619b(String str) {
        jri.m13404b((Object) str);
        Object jyy = new jyy();
        mo9618a(str, jyy);
        return jyy;
    }

    /* renamed from: a */
    public final void mo9617a() {
        String valueOf;
        Throwable th;
        Closeable closeable;
        for (Entry entry : this.f8446b.entrySet()) {
            File file = this.f8445a;
            String valueOf2 = String.valueOf(this.f8447c);
            String valueOf3 = String.valueOf((String) entry.getKey());
            if (valueOf3.length() == 0) {
                valueOf3 = new String(valueOf2);
            } else {
                valueOf3 = valueOf2.concat(valueOf3);
            }
            File file2 = new File(file, valueOf3);
            valueOf3 = String.valueOf(file2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 16);
            stringBuilder.append("Saving log file ");
            stringBuilder.append(valueOf3);
            Log.i("LogCollectionWriter", stringBuilder.toString());
            try {
                Closeable fileWriter = new FileWriter(file2);
                try {
                    ((jyv) entry.getValue()).mo9620a(fileWriter);
                    try {
                        kit.m5024a(fileWriter, true);
                    } catch (IOException e) {
                        valueOf = String.valueOf(e.getMessage());
                        valueOf3 = "Error closing file: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(valueOf3);
                        } else {
                            valueOf = valueOf3.concat(valueOf);
                        }
                        Log.e("LogCollectionWriter", valueOf);
                    }
                } catch (Throwable th2) {
                    Closeable closeable2 = fileWriter;
                    th = th2;
                    closeable = closeable2;
                }
            } catch (Throwable th22) {
                th = th22;
                closeable = null;
            }
        }
        return;
        try {
            kit.m5024a(closeable, true);
        } catch (IOException e2) {
            valueOf = String.valueOf(e2.getMessage());
            String str = "Error closing file: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.e("LogCollectionWriter", valueOf);
        }
        throw th;
        throw th;
    }
}
