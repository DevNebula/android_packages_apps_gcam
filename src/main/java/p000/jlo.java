package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: jlo */
public final class jlo {
    /* renamed from: a */
    private static String f8284a = null;

    /* renamed from: a */
    public static File m4598a() {
        return new File(jcc.m4454a("sb.eval.logdirpath", ""));
    }

    /* renamed from: b */
    public static boolean m4599b() {
        if (f8284a == null) {
            f8284a = jcc.m4454a("sb.debugtracking", "false");
        }
        return f8284a.equalsIgnoreCase("true");
    }

    /* renamed from: c */
    public static boolean m4600c() {
        File a = jlo.m4598a();
        return a.exists() && a.isDirectory();
    }
}
