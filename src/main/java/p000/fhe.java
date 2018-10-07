package p000;

import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fhe */
final class fhe implements fip {
    /* renamed from: a */
    public final AtomicInteger f18274a;
    /* renamed from: b */
    public final ird f18275b;
    /* renamed from: c */
    private final iwg f18276c;
    /* renamed from: d */
    private final ivr f18277d;
    /* renamed from: e */
    private final Handler f18278e;
    /* renamed from: f */
    private final fje f18279f = new fje();

    public fhe(iwg iwg, ivr ivr, Handler handler, ird ird) {
        this.f18276c = iwg;
        this.f18277d = ivr;
        this.f18278e = handler;
        this.f18275b = ird;
        this.f18274a = new AtomicInteger(0);
    }

    /* renamed from: a */
    public final synchronized void mo6816a(List list, fiv fiv) {
        this.f18275b.mo8856a("submitRequest");
        try {
            Object obj;
            Map hashMap = new HashMap();
            List arrayList = new ArrayList(list.size());
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (fim fim : list) {
                iwn a;
                Object a2 = this.f18279f.mo6829a();
                Collection arrayList4 = new ArrayList();
                arrayList4.addAll(fim.f4797c);
                if (fim.f4799e.mo9709b()) {
                    jri.m13396a(fiv.equals(fiv.REPEATING) ^ 1, (Object) "Repeating reprocessing requests are not supported.");
                    a = this.f18276c.mo13715b().mo13719a((iwp) fim.f4799e.mo9706a());
                } else {
                    a = this.f18276c.mo13715b().mo13718a(fim.f4795a);
                }
                Set<Surface> hashSet = new HashSet();
                for (fhz fhz : fim.f4798d) {
                    fia b;
                    if (fiv == fiv.NON_REPEATING) {
                        b = fhz.mo6798b();
                    } else {
                        b = fhz.mo6797a();
                    }
                    arrayList2.add(b);
                    arrayList4.add(b.mo6800b());
                    hashSet.addAll(b.mo6801c());
                }
                if (!hashSet.isEmpty()) {
                    for (Surface a3 : hashSet) {
                        if (!this.f18277d.mo9107a(a3)) {
                            obj = null;
                            break;
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        for (Surface a32 : hashSet) {
                            a.mo9135a(a32);
                        }
                        for (fin fin : fim.f4796b) {
                            a.mo9134a(fin.f4800a, fin.f4801b);
                        }
                        hashMap.put(a2, fds.m10427b(arrayList4));
                        a.mo9136a(a2);
                        arrayList.add(a.mo9133a());
                    }
                }
                arrayList3.add(fim);
            }
            int size;
            try {
                if (!arrayList.isEmpty()) {
                    if (fiv == fiv.REPEATING) {
                        this.f18276c.mo13714b(arrayList, new fhf(this, hashMap), this.f18278e);
                    } else {
                        this.f18276c.mo13711a(arrayList, new fhf(this, hashMap), this.f18278e);
                    }
                }
                size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    obj = arrayList3.get(i);
                    i++;
                    for (fiw a4 : ((fim) obj).f4797c) {
                        a4.mo6821a(-1);
                    }
                }
                this.f18275b.mo8857b();
            } catch (Throwable e) {
                throw new isr(e);
            } catch (Throwable e2) {
                Throwable th = e2;
                int size2 = arrayList2.size();
                size = 0;
                while (size < size2) {
                    obj = arrayList2.get(size);
                    size++;
                    ((fia) obj).mo6799a();
                }
                size2 = arrayList3.size();
                size = 0;
                while (size < size2) {
                    obj = arrayList3.get(size);
                    size++;
                    for (fiw a42 : ((fim) obj).f4797c) {
                        a42.mo6821a(-1);
                    }
                }
            }
        } catch (Throwable e22) {
            throw new isr(e22);
        } catch (Throwable th2) {
            this.f18275b.mo8857b();
        }
    }
}
