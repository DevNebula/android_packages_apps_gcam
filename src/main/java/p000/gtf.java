package p000;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gtf */
public final class gtf {
    /* renamed from: a */
    private final gsx f6049a;
    /* renamed from: b */
    private final Set f6050b = Collections.synchronizedSet(new HashSet());

    gtf(gsx gsx) {
        this.f6049a = (gsx) jri.m13404b((Object) gsx);
    }

    /* renamed from: a */
    public final String mo7438a(long j, DateFormat dateFormat) {
        return m2861b(dateFormat.format(new Date(j)));
    }

    /* renamed from: a */
    public final File mo7436a(String str, ixx ixx) {
        File a = this.f6049a.mo7425a();
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(ixx.f7912j);
        return new File(a, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: a */
    public final String mo7437a(long j) {
        return mo7438a(j, new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US));
    }

    /* renamed from: a */
    public final File mo7435a(String str) {
        File file = new File(this.f6049a.mo7425a(), ".inflight");
        String str2 = ixx.JPEG.f7912j;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 4) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(".tmp");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: b */
    public final String mo7439b(long j) {
        return mo7438a(j, new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US));
    }

    /* renamed from: b */
    private final String m2861b(String str) {
        synchronized (this.f6050b) {
            if (this.f6050b.contains(str)) {
                String stringBuilder;
                int i = 0;
                do {
                    i++;
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 12);
                    stringBuilder2.append(str);
                    stringBuilder2.append("_");
                    stringBuilder2.append(i);
                    stringBuilder = stringBuilder2.toString();
                } while (this.f6050b.contains(stringBuilder));
                this.f6050b.add(stringBuilder);
                return stringBuilder;
            }
            this.f6050b.add(str);
            return str;
        }
    }
}
