package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jxt */
final class jxt implements jxw {
    /* renamed from: a */
    private final Pattern f21798a;
    /* renamed from: b */
    private final int f21799b = 1;
    /* renamed from: c */
    private final int f21800c;

    public jxt(Pattern pattern, int i) {
        this.f21798a = pattern;
        this.f21800c = i;
    }

    /* renamed from: a */
    public final Pattern mo9604a() {
        return this.f21798a;
    }

    /* renamed from: a */
    public final int mo9603a(Matcher matcher) {
        int i = this.f21800c;
        if (i != -1) {
            String group = matcher.group(i);
            if (group != null) {
                return Integer.parseInt(group);
            }
            throw new jya("timestamp");
        }
        throw new jya("timestamp");
    }

    /* renamed from: b */
    public final long mo9605b(Matcher matcher) {
        return Long.parseLong(matcher.group(this.f21799b));
    }

    /* renamed from: c */
    public final boolean mo9606c(Matcher matcher) {
        return false;
    }

    /* renamed from: d */
    public final boolean mo9607d(Matcher matcher) {
        return false;
    }

    /* renamed from: e */
    public final boolean mo9608e(Matcher matcher) {
        return false;
    }
}
