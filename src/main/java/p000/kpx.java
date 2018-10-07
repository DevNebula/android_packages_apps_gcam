package p000;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: kpx */
public final class kpx {
    /* renamed from: a */
    public String f8778a = null;

    /* renamed from: a */
    static String m5102a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: a */
    public final kpx mo10207a(String str) {
        kpx.m5102a(str, Integer.valueOf(0));
        this.f8778a = str;
        return this;
    }
}
