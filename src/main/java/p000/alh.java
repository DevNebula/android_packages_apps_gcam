package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: alh */
public final class alh implements ajz {
    /* renamed from: a */
    private static final Set f10384a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    /* renamed from: b */
    private final ajz f10385b;

    public alh(ajz ajz) {
        this.f10385b = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        return this.f10385b.mo343a(new ajl(((Uri) obj).toString()), i, i2, adp);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo344a(Object obj) {
        return f10384a.contains(((Uri) obj).getScheme());
    }
}
