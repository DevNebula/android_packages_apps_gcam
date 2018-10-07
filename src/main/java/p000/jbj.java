package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbj */
public final class jbj implements jaq {
    /* renamed from: a */
    public volatile Object f21418a = null;
    /* renamed from: b */
    public volatile jar f21419b = null;
    /* renamed from: c */
    private jbv f21420c = null;
    /* renamed from: d */
    private jbv f21421d = null;

    private jbj() {
    }

    /* renamed from: a */
    private final void m12998a(Executor executor, Runnable runnable, jbj jbj, jcc jcc) {
        synchronized (this) {
            if (mo9285c()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            jbv jbv = new jbv(executor, runnable, jbj, jcc);
            jbv jbv2 = this.f21421d;
            if (jbv2 != null) {
                jbv2.f8042a = jbv;
            } else {
                this.f21420c = jbv;
            }
            this.f21421d = jbv;
        }
    }

    /* renamed from: a */
    final void mo13776a(Executor executor, Runnable runnable, jcc jcc) {
        synchronized (this) {
            if (mo9285c()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            jbv jbv = new jbv(executor, runnable, jcc);
            jbv jbv2 = this.f21421d;
            if (jbv2 != null) {
                jbv2.f8042a = jbv;
            } else {
                this.f21420c = jbv;
            }
            this.f21421d = jbv;
        }
    }

    /* renamed from: a */
    static void m12989a(jar jar, izi izi, jbj jbj) {
        try {
            jbj.mo13778a(izi.mo9217a(jar));
        } catch (jar e) {
            jbj.mo13777a(e);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    static void m12994a(Object obj, izi izi, jbj jbj) {
        try {
            jbj.mo13778a(izi.mo9217a(obj));
        } catch (jar e) {
            jbj.mo13777a(e);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: b */
    private static void m12999b(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        try {
            jau.mo9286a(obj, executor).mo9276a(kpq.f8776a, new jbx(jbj), new jbw(jbj, jcc)).mo9282a(izw.f21401a);
        } catch (jar e) {
            jbj.mo13777a(e);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: d */
    public static jbj m13001d() {
        return new jbj();
    }

    /* JADX WARNING: Missing block: B:12:0x0019, code:
            if (r2 != null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:13:0x001b, code:
            r4.mo9216a(r0);
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo9282a(p000.izh r4) {
        /*
        r3 = this;
        r1 = p000.jcd.f21428b;
        r0 = r3.f21418a;
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r3.f21419b;
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r4.mo9216a(r0);
        goto L_0x0006;
    L_0x000f:
        monitor-enter(r3);
        r2 = r3.f21418a;	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x0018;
    L_0x0014:
        r0 = r3.f21419b;	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x001f;
    L_0x0018:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x0006;
    L_0x001b:
        r4.mo9216a(r0);
        goto L_0x0006;
    L_0x001f:
        r0 = p000.kpq.f8776a;	 Catch:{ all -> 0x002b }
        r2 = new jbn;	 Catch:{ all -> 0x002b }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x002b }
        r3.mo13776a(r0, r2, r1);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0006;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jbj.a(izh):void");
    }

    /* renamed from: a */
    public final kpk mo9281a() {
        return new jca(this);
    }

    /* renamed from: b */
    public final Object mo9284b() {
        Object obj = this.f21418a;
        if (obj == null) {
            if (this.f21419b != null) {
                throw this.f21419b;
            }
            synchronized (this) {
                while (!mo9285c()) {
                    wait();
                }
                obj = this.f21418a;
                if (obj != null) {
                } else {
                    throw this.f21419b;
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    private static void m12988a(jar jar, izi izi, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbt(jar, izi, jbj, jcc));
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    private static void m12990a(jar jar, jau jau, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbu(jar, jau, executor, jbj, jcc));
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    private static void m12991a(jar jar, Runnable runnable, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jby(jar, runnable, jbj, jcc));
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    private static void m12993a(Object obj, izi izi, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbt(obj, izi, jbj, jcc));
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: c */
    private static void m13000c(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbu(obj, jau, executor, jbj, jcc));
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    private static void m12996a(Object obj, Runnable runnable, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbz(obj, runnable, jbj, jcc));
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: c */
    public final boolean mo9285c() {
        return (this.f21418a == null && this.f21419b == null) ? false : true;
    }

    /* renamed from: a */
    static void m12992a(jar jar, Runnable runnable, jbj jbj) {
        try {
            runnable.run();
            jbj.mo13777a(jar);
        } catch (Throwable th) {
            kqg.m5105a(jar, jar.m4449a(th));
            jbj.mo13777a(jar);
        }
    }

    /* renamed from: a */
    static void m12997a(Object obj, Runnable runnable, jbj jbj) {
        try {
            runnable.run();
            jbj.mo13778a(obj);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    public final boolean mo13778a(Object obj) {
        if (mo9285c()) {
            return false;
        }
        synchronized (this) {
            if (mo9285c()) {
                return false;
            }
            this.f21418a = obj;
            m13002e();
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo13777a(jar jar) {
        if (mo9285c()) {
            return false;
        }
        synchronized (this) {
            if (mo9285c()) {
                return false;
            }
            this.f21419b = jar;
            m13002e();
            return true;
        }
    }

    /* renamed from: a */
    public final jaq mo9275a(Executor executor, izi izi) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        Object obj = this.f21418a;
        if (obj != null) {
            jbj.m12993a(obj, izi, executor, d, jcc);
        } else {
            jar jar = this.f21419b;
            if (jar != null) {
                d.mo13777a(jar);
            } else {
                synchronized (this) {
                    Object obj2 = this.f21418a;
                    if (obj2 == null) {
                        jar = this.f21419b;
                        if (jar == null) {
                            m12998a(executor, new jbk(this, izi, d, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12993a(obj2, izi, executor, d, jcc);
                    } else {
                        d.mo13777a(jar);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo9276a(Executor executor, izi izi, izi izi2) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        Object obj = this.f21418a;
        if (obj != null) {
            jbj.m12993a(obj, izi, executor, d, jcc);
        } else {
            jar jar = this.f21419b;
            if (jar != null) {
                jbj.m12988a(jar, izi2, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f21418a;
                    if (obj2 == null) {
                        jar = this.f21419b;
                        if (jar == null) {
                            m12998a(executor, new jbo(this, izi, d, jcc, izi2), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12993a(obj2, izi, executor, d, jcc);
                    } else {
                        jbj.m12988a(jar, izi2, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo9277a(Executor executor, jau jau) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        Object obj = this.f21418a;
        if (obj != null) {
            jbj.m13000c(obj, jau, executor, d, jcc);
        } else {
            jar jar = this.f21419b;
            if (jar != null) {
                d.mo13777a(jar);
            } else {
                synchronized (this) {
                    Object obj2 = this.f21418a;
                    if (obj2 == null) {
                        jar = this.f21419b;
                        if (jar == null) {
                            m12998a(executor, new jbp(this, jau, executor, d, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m13000c(obj2, jau, executor, d, jcc);
                    } else {
                        d.mo13777a(jar);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo9278a(Executor executor, jau jau, jau jau2) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        Object obj = this.f21418a;
        if (obj != null) {
            jbj.m13000c(obj, jau, executor, d, jcc);
        } else {
            jar jar = this.f21419b;
            if (jar != null) {
                jbj.m12990a(jar, jau2, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f21418a;
                    if (obj2 == null) {
                        jar = this.f21419b;
                        if (jar == null) {
                            m12998a(executor, new jbq(this, jau, executor, d, jcc, jau2), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m13000c(obj2, jau, executor, d, jcc);
                    } else {
                        jbj.m12990a(jar, jau2, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo9279a(Executor executor, Runnable runnable) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        Object obj = this.f21418a;
        if (obj != null) {
            jbj.m12996a(obj, runnable, executor, d, jcc);
        } else {
            jar jar = this.f21419b;
            if (jar != null) {
                jbj.m12991a(jar, runnable, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f21418a;
                    if (obj2 == null) {
                        jar = this.f21419b;
                        if (jar == null) {
                            m12998a(executor, new jbs(this, runnable, d, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12996a(obj2, runnable, executor, d, jcc);
                    } else {
                        jbj.m12991a(jar, runnable, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo9280a(Executor executor, jlf jlf) {
        return mo9278a(executor, new jbl(this, jlf), new jbm(this, jlf));
    }

    /* renamed from: b */
    public final jaq mo9283b(Executor executor, izi izi) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        Object obj = this.f21418a;
        if (obj != null) {
            d.mo13778a(obj);
        } else {
            jar jar = this.f21419b;
            if (jar != null) {
                jbj.m12988a(jar, izi, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f21418a;
                    if (obj2 == null) {
                        jar = this.f21419b;
                        if (jar == null) {
                            m12998a(executor, new jbr(this, d, izi, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        d.mo13778a(obj2);
                    } else {
                        jbj.m12988a(jar, izi, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: e */
    private final void m13002e() {
        jbv jbv;
        synchronized (this) {
            jbv = this.f21420c;
            this.f21420c = null;
            this.f21421d = null;
            notifyAll();
        }
        for (jbv jbv2 = jbv; jbv2 != null; jbv2 = jbv2.f8042a) {
            try {
                jbv2.f8043b.execute(jbv2.f8044c);
            } catch (Throwable th) {
                jbj jbj = jbv2.f8045d;
                if (jbj != null) {
                    jbj.mo13777a(jar.m4449a(th));
                }
            }
        }
    }
}
