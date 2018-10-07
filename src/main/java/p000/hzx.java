package p000;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: hzx */
public final class hzx {
    /* renamed from: a */
    public static final Status f7219a = new Status(8, "The connection to Google Play services was lost");
    /* renamed from: b */
    public static final ick[] f7220b = new ick[0];
    /* renamed from: c */
    public final Set f7221c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: d */
    private final hzy f7222d = new hzy(this);

    /* renamed from: a */
    final void mo8293a(ick ick) {
        this.f7221c.add(ick);
        ick.mo13622a(this.f7222d);
    }
}
