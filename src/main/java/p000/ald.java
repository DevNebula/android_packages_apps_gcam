package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ald */
public final class ald implements ajz {
    /* renamed from: a */
    private static final Set f10379a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    /* renamed from: b */
    private final ajz f10380b;

    public ald(ajz ajz) {
        this.f10380b = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        return this.f10380b.mo343a(new ajl(((Uri) obj).toString()), i, i2, adp);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo344a(Object obj) {
        return f10379a.contains(((Uri) obj).getScheme());
    }
}
