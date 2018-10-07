package p000;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jxx */
final class jxx {
    /* renamed from: a */
    private static final Pattern f8444a = Pattern.compile("Burst_stack_([0-9]{5,20})(_([0-9]{1,4}))?\\.jpg");

    /* renamed from: a */
    public static jxw m4748a() {
        return new jxs();
    }

    /* renamed from: b */
    public static jxw m4749b() {
        return new jxt(f8444a, 3);
    }

    /* renamed from: c */
    public static jxw m4750c() {
        return new jxt(Pattern.compile("med-res-frame-([0-9]+)\\.jpg"), -1);
    }
}
