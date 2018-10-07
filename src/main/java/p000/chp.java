package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: chp */
final class chp extends izx {
    /* renamed from: a */
    private final /* synthetic */ ExecutorService f25791a;
    /* renamed from: b */
    private final /* synthetic */ chj f25792b;

    chp(chj chj, ExecutorService executorService) {
        this.f25792b = chj;
        this.f25791a = executorService;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo15029b(Object obj, Object obj2) {
        chr chr = (chr) obj;
        FeatureTable featureTable = (FeatureTable) obj2;
        bli.m888a(chj.f12507a, "startAnalysis : start postprocessing");
        chj chj = this.f25792b;
        if (chj.f12537t) {
            chj.f12529l.mo8856a("BurstControllerImpl#startAnalysis_startPostProcessing");
            try {
                chj chj2 = this.f25792b;
                jrg jrg = chr.f2177a;
                jrg jrg2 = chr.f2178b;
                ExecutorService executorService = this.f25791a;
                chj2.f12529l.mo8856a("BurstControllerImpl#filterAndPostProcess");
                try {
                    AutoCloseable[] autoCloseableArr = new AutoCloseable[]{jrg, jrg2};
                    kaf kaf = new kaf();
                    for (int i = 0; i < 2; i++) {
                        kaf.mo9675a(autoCloseableArr[i]);
                    }
                    try {
                        AutoCloseable autoCloseable = (jrg) chj2.f12538u.getAndSet(null);
                        if (autoCloseable == null) {
                            throw new IllegalStateException("Null captured images.");
                        }
                        AutoCloseable autoCloseable2;
                        kaf.mo9675a(autoCloseable);
                        Set<Long> e = autoCloseable.mo13835e();
                        jrg a;
                        if (jrg.mo13836f() > 0) {
                            a = jqk.m13338a((Set) e, jrg);
                            a.mo13828a(autoCloseable.f21670c);
                            jrg = autoCloseable.mo13830b((Set) e);
                            jrg.mo13828a(autoCloseable.f21670c);
                            autoCloseable = jrg;
                            autoCloseable2 = a;
                        } else {
                            chi chi = chj2.f12532o;
                            int i2 = chi.f2174c;
                            int i3 = chi.f2172a;
                            int i4 = chi.f2173b;
                            int i5 = i2 % MediaDecoder.ROTATE_180;
                            if (i5 == 90) {
                                i2 = i3;
                            } else {
                                i2 = i4;
                            }
                            if (i5 != 90) {
                                i4 = i3;
                            }
                            iqp iqp = new iqp(i4, i2);
                            jqr a2 = chj2.f12534q.mo9529a("placeholder", iqp.f7695a, iqp.f7696b, Config.ARGB_8888);
                            ((Bitmap) a2.mo9674e()).eraseColor(-12303292);
                            kah kah = (kah) kaf.mo9676a(jqk.m13341a(new kab(jqk.m13349b(new jqx(a2)))));
                            jrj jrj = new jrj();
                            for (Long longValue : e) {
                                jrj.mo9539a(longValue.longValue(), kah.mo9217a(), false);
                            }
                            a = jrj.mo9217a();
                            a.mo13828a(autoCloseable.f21670c);
                            jrg = autoCloseable.mo13830b((Set) e);
                            jrg.mo13828a(autoCloseable.f21670c);
                            Object obj3 = jrg;
                            Object autoCloseable22 = a;
                        }
                        kae a3 = kaf.mo9675a(autoCloseable22);
                        kae a4 = kaf.mo9675a(autoCloseable);
                        Set hashSet = new HashSet(((jrg) a3.mo9674e()).mo13835e());
                        hashSet.addAll(jrg2.mo13835e());
                        kae a5 = kaf.mo9675a(jqk.m13338a(hashSet, jrg2));
                        chj2.f12520c.f2262a.f2231m.mo15641a(null);
                        autoCloseable = (jrg) a3.mo9673d();
                        autoCloseable22 = (jrg) a5.mo9673d();
                        AutoCloseable autoCloseable3 = (jrg) a4.mo9673d();
                        kae jzy = new jzy(jqk.m13349b(autoCloseable));
                        try {
                            jzy = new jzy(jqk.m13349b(autoCloseable22));
                            try {
                                jzy = new jzy(jqk.m13349b(autoCloseable3));
                                try {
                                    boolean z;
                                    jrg jrg3 = (jrg) jzy.mo9674e();
                                    if (jrg3.mo13836f() > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    jri.m13395a(z);
                                    jrg3.mo13829b(((Long) jrg3.mo13835e().iterator().next()).longValue()).mo9275a(jlk.f8281a, new chq(chj2));
                                    chj2.f12523f.mo7085a(ciq.m8329a(chj2.f12527j, (jrg) jzy.mo9673d(), (jrg) jzy.mo9673d(), featureTable, (jrg) jzy.mo9673d(), chj2.f12519b, chj2.f12534q, chj2.f12525h, chj2.f12536s, (dpu) chj2.f12535r.getAndSet(null), chj2.f12524g, chj2.f12521d, chj2.f12522e, chj2.f12520c, chj2.f12531n, jlo.m4600c(), chj2.f12533p, executorService, chj2.f12528k, chj2.f12539v, chj2.f12529l, chj2.f12540w, chj2.f12541x));
                                    chj.m8300a(null, jzy);
                                    chj.m8300a(null, jzy);
                                    chj.m8300a(null, jzy);
                                    chj.m8301a(null, kaf);
                                    chj2.f12529l.mo8857b();
                                    this.f25792b.f12529l.mo8857b();
                                    return;
                                } catch (Throwable th) {
                                    chj.m8300a(th, jzy);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                chj.m8300a(th, jzy);
                                throw th2;
                            }
                        } catch (Throwable th22) {
                            chj.m8300a(th, jzy);
                            throw th22;
                        }
                    } catch (Throwable th222) {
                        chj.m8301a(th, kaf);
                        throw th222;
                    }
                } catch (Throwable th3) {
                    chj2.f12529l.mo8857b();
                    throw th3;
                }
            } catch (Throwable th32) {
                this.f25792b.f12529l.mo8857b();
                throw th32;
            }
        }
        throw new RuntimeException("Burst stopped and canceled.");
    }
}
