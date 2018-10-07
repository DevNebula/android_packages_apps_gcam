package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jli */
public final class jli implements kov {
    /* renamed from: a */
    private final /* synthetic */ jbj f21623a;

    public jli(jbj jbj, jcc jcc) {
        this.f21623a = jbj;
    }

    /* renamed from: a */
    public static jaq m13191a(kpk kpk) {
        return new izz(kpk);
    }

    /* renamed from: a */
    public static jaq m13190a(Executor executor, Callable callable) {
        Object d = jbj.m13001d();
        try {
            executor.execute(new jav(d, callable, jcd.f21428b));
        } catch (Throwable e) {
            d.mo13777a(jar.m4449a(e));
        }
        return d;
    }

    /* renamed from: b */
    public static jaq m13199b(Object obj) {
        return new jcb(obj);
    }

    /* renamed from: b */
    private static List m13201b(Iterable iterable) {
        List arrayList = new ArrayList();
        for (Object b : iterable) {
            arrayList.add(jli.m13199b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m13193a(Iterable iterable, Executor executor, jau jau) {
        Iterable<jaq> b = jli.m13201b(iterable);
        List arrayList = new ArrayList();
        for (jaq a : b) {
            arrayList.add(a.mo9277a(executor, jau));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static List m13203c(Iterable iterable, Executor executor, izi izi) {
        List arrayList = new ArrayList();
        for (jaq a : iterable) {
            arrayList.add(a.mo9275a(executor, izi));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static jaq m13189a(Iterable iterable, Executor executor, izi izi) {
        return jli.m13188a(jli.m13203c(jli.m13201b(iterable), executor, izi));
    }

    /* renamed from: b */
    public static jaq m13198b(Iterable iterable, Executor executor, jau jau) {
        return jli.m13188a(jli.m13193a(iterable, executor, jau));
    }

    /* renamed from: b */
    public static jaq m13197b(Iterable iterable, Executor executor, izi izi) {
        return jli.m13188a(jli.m13203c(iterable, executor, izi));
    }

    /* JADX WARNING: Missing block: B:10:0x0047, code:
            p000.jli.m13195a(r0, r3);
     */
    /* renamed from: a */
    public static p000.jxm m13194a(java.io.File r10) {
        /*
        r1 = 0;
        r0 = new java.io.File;
        r2 = "metadatastore.bin";
        r0.<init>(r10, r2);
        r3 = new java.io.DataInputStream;
        r2 = new java.io.BufferedInputStream;
        r4 = new java.io.FileInputStream;
        r4.<init>(r0);
        r2.<init>(r4);
        r3.<init>(r2);
        r0 = r3.readInt();	 Catch:{ all -> 0x0044 }
        if (r0 > 0) goto L_0x004b;
    L_0x001d:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0044 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0044 }
        r4 = 61;
        r2.<init>(r4);	 Catch:{ all -> 0x0044 }
        r4 = "Unsupported serialization version (";
        r2.append(r4);	 Catch:{ all -> 0x0044 }
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = ", minimum is ";
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = 1;
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = ")";
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = r2.toString();	 Catch:{ all -> 0x0044 }
        r1.<init>(r0);	 Catch:{ all -> 0x0044 }
        throw r1;	 Catch:{ all -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0046 }
    L_0x0046:
        r1 = move-exception;
        p000.jli.m13195a(r0, r3);
        throw r1;
    L_0x004b:
        r4 = new jxm;	 Catch:{ all -> 0x0044 }
        r4.<init>();	 Catch:{ all -> 0x0044 }
        r5 = r3.readInt();	 Catch:{ all -> 0x0044 }
        r0 = r1;
    L_0x0055:
        if (r0 >= r5) goto L_0x007b;
    L_0x0057:
        r6 = new jxa;	 Catch:{ all -> 0x0044 }
        r6.<init>();	 Catch:{ all -> 0x0044 }
        r7 = r3.readInt();	 Catch:{ all -> 0x0044 }
        r2 = r1;
    L_0x0061:
        if (r2 < r7) goto L_0x0069;
    L_0x0063:
        r4.mo9600a(r6);	 Catch:{ all -> 0x0044 }
        r0 = r0 + 1;
        goto L_0x0055;
    L_0x0069:
        r8 = r3.readUTF();	 Catch:{ all -> 0x0044 }
        r8 = p000.jxa.m4723a(r8);	 Catch:{ all -> 0x0044 }
        r9 = r8.mo9593a(r3);	 Catch:{ all -> 0x0044 }
        r6.mo9590a(r8, r9);	 Catch:{ all -> 0x0044 }
        r2 = r2 + 1;
        goto L_0x0061;
    L_0x007b:
        r0 = 0;
        p000.jli.m13195a(r0, r3);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: jli.a(java.io.File):jxm");
    }

    /* renamed from: a */
    public static Object m13192a(jaq jaq) {
        Object b = jli.m13200b(jaq);
        if (b != null) {
            return b;
        }
        String valueOf = String.valueOf(jaq);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append("Attempting to get value of ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" which is not yet available!");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static Object m13200b(jaq jaq) {
        return jaq.mo9285c() ? jli.m13202c(jaq) : null;
    }

    /* renamed from: c */
    public static Object m13202c(jaq jaq) {
        try {
            return jli.m13204d(jaq);
        } catch (Throwable e) {
            throw new kqe(e);
        }
    }

    /* renamed from: d */
    public static Object m13204d(jaq jaq) {
        Object obj = null;
        while (true) {
            try {
                Object b = jaq.mo9284b();
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
                return b;
            } catch (InterruptedException e) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f21623a.mo13777a(jar.m4449a(th));
    }

    /* renamed from: b_ */
    public final void mo10186b_(Object obj) {
        if (obj == null) {
            this.f21623a.mo13777a(jar.m4449a(new NullPointerException("Function output is null")));
        } else {
            this.f21623a.mo13778a(obj);
        }
    }

    /* renamed from: a */
    public static jaq m13187a(jaq jaq, jaq jaq2) {
        return jaq.mo9278a(kpq.f8776a, new jba(jaq2), new jax(jaq2));
    }

    /* renamed from: a */
    public static jaq m13188a(Iterable iterable) {
        boolean isEmpty;
        if (iterable instanceof Collection) {
            isEmpty = ((Collection) iterable).isEmpty();
        } else {
            isEmpty = iterable.iterator().hasNext() ^ 1;
        }
        if (isEmpty) {
            return jli.m13199b(Collections.emptyList());
        }
        return new jbg(iterable).f7998a;
    }
}
