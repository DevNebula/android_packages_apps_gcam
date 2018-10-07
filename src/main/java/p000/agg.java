package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: agg */
public final class agg extends Exception {
    /* renamed from: a */
    private static final StackTraceElement[] f430a = new StackTraceElement[0];
    public static final long serialVersionUID = 1;
    /* renamed from: b */
    private final List f431b;
    /* renamed from: c */
    private adl f432c;
    /* renamed from: d */
    private adf f433d;
    /* renamed from: e */
    private Class f434e;
    /* renamed from: f */
    private String f435f;

    public agg(String str) {
        this(str, Collections.emptyList());
    }

    public agg(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public agg(String str, List list) {
        this.f435f = str;
        setStackTrace(f430a);
        this.f431b = list;
    }

    /* renamed from: a */
    private final void m235a(Throwable th, List list) {
        if (th instanceof agg) {
            for (Throwable a : ((agg) th).f431b) {
                m235a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private static void m234a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException e) {
            throw new RuntimeException(th);
        }
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String valueOf;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(71);
        stringBuilder2.append(this.f435f);
        Class cls = this.f434e;
        if (cls != null) {
            valueOf = String.valueOf(cls);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
            stringBuilder.append(", ");
            stringBuilder.append(valueOf);
            valueOf = stringBuilder.toString();
        } else {
            valueOf = "";
        }
        stringBuilder2.append(valueOf);
        adf adf = this.f433d;
        if (adf != null) {
            valueOf = String.valueOf(adf);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
            stringBuilder.append(", ");
            stringBuilder.append(valueOf);
            valueOf = stringBuilder.toString();
        } else {
            valueOf = "";
        }
        stringBuilder2.append(valueOf);
        adl adl = this.f432c;
        if (adl != null) {
            valueOf = String.valueOf(adl);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
            stringBuilder.append(", ");
            stringBuilder.append(valueOf);
            valueOf = stringBuilder.toString();
        } else {
            valueOf = "";
        }
        stringBuilder2.append(valueOf);
        List<Throwable> a = mo247a();
        if (a.isEmpty()) {
            return stringBuilder2.toString();
        }
        if (a.size() == 1) {
            stringBuilder2.append("\nThere was 1 cause:");
        } else {
            stringBuilder2.append("\nThere were ");
            stringBuilder2.append(a.size());
            stringBuilder2.append(" causes:");
        }
        for (Throwable th : a) {
            stringBuilder2.append(10);
            stringBuilder2.append(th.getClass().getName());
            stringBuilder2.append('(');
            stringBuilder2.append(th.getMessage());
            stringBuilder2.append(')');
        }
        stringBuilder2.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder2.toString();
    }

    /* renamed from: a */
    public final List mo247a() {
        List arrayList = new ArrayList();
        m235a((Throwable) this, arrayList);
        return arrayList;
    }

    public final void printStackTrace() {
        kqg.f8786a.mo10210a((Throwable) this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        m233a(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m233a(printWriter);
    }

    /* renamed from: a */
    private final void m233a(Appendable appendable) {
        agg.m234a((Throwable) this, appendable);
        List list = this.f431b;
        Appendable agh = new agh(appendable);
        Throwable th;
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                agh.append("Cause (").append(String.valueOf(i + 1)).append(" of ").append(String.valueOf(size)).append("): ");
                th = (Throwable) list.get(i);
                if (th instanceof agg) {
                    ((agg) th).m233a(agh);
                } else {
                    agg.m234a(th, agh);
                }
            }
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    /* renamed from: a */
    final void mo248a(adl adl, adf adf, Class cls) {
        this.f432c = adl;
        this.f433d = adf;
        this.f434e = cls;
    }
}
