package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jbi */
final class jbi extends izy {
    /* renamed from: a */
    private final /* synthetic */ int f24730a;
    /* renamed from: b */
    private final /* synthetic */ jbg f24731b;

    jbi(jbg jbg, int i) {
        this.f24731b = jbg;
        this.f24730a = i;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        jar jar = (jar) obj;
        jbg jbg = this.f24731b;
        jbg.f8000c[this.f24730a] = jar;
        jbg.f8002e = true;
        if (jbg.f8001d.decrementAndGet() != 0) {
            return;
        }
        if (jbg.f8002e) {
            jar[] jarArr = jbg.f8000c;
            int length = jarArr.length;
            jar jar2 = null;
            int i = 0;
            while (i < length) {
                Throwable th = jarArr[i];
                if (th == null) {
                    th = jar2;
                } else if (jar2 != null) {
                    kqg.m5105a(jar2, th);
                    th = jar2;
                }
                i++;
                Throwable jar22 = th;
            }
            if (jar22 != null) {
                jbg.f7998a.mo13777a(jar22);
                return;
            } else {
                jbg.f7998a.mo13777a(jar.m4449a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
                return;
            }
        }
        jbg.f7998a.mo13778a(Arrays.asList(jbg.f7999b));
    }
}
