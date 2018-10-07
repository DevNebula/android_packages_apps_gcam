package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jbh */
final class jbh extends izy {
    /* renamed from: a */
    private final /* synthetic */ int f24728a;
    /* renamed from: b */
    private final /* synthetic */ jbg f24729b;

    jbh(jbg jbg, int i) {
        this.f24729b = jbg;
        this.f24728a = i;
    }

    /* renamed from: a_ */
    public final void mo13769a_(Object obj) {
        jbg jbg = this.f24729b;
        jbg.f7999b[this.f24728a] = obj;
        if (jbg.f8001d.decrementAndGet() != 0) {
            return;
        }
        if (jbg.f8002e) {
            jar[] jarArr = jbg.f8000c;
            int length = jarArr.length;
            jar jar = null;
            int i = 0;
            while (i < length) {
                Throwable th = jarArr[i];
                if (th == null) {
                    th = jar;
                } else if (jar != null) {
                    kqg.m5105a(jar, th);
                    th = jar;
                }
                i++;
                Throwable jar2 = th;
            }
            if (jar2 != null) {
                jbg.f7998a.mo13777a(jar2);
                return;
            } else {
                jbg.f7998a.mo13777a(jar.m4449a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
                return;
            }
        }
        jbg.f7998a.mo13778a(Arrays.asList(jbg.f7999b));
    }
}
