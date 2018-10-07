package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: aky */
public final class aky implements ajz {
    /* renamed from: a */
    private static final Set f10374a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    /* renamed from: b */
    private final alb f10375b;

    public aky(alb alb) {
        this.f10375b = alb;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        return new aka(new arf(uri), this.f10375b.mo360a(uri));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo344a(Object obj) {
        return f10374a.contains(((Uri) obj).getScheme());
    }
}
