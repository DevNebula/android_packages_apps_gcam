package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ilq */
public final class ilq {
    /* renamed from: a */
    public static final iqo f7453a = new iql();

    /* renamed from: a */
    public static iqo m3882a(ilp ilp, Runnable runnable, Executor executor) {
        jri.m13404b((Object) ilp);
        jri.m13404b((Object) runnable);
        jri.m13404b((Object) executor);
        return ilp.mo13672a(new ilu(runnable), executor);
    }

    /* renamed from: a */
    public static iqo m3881a(ilp ilp, iqt iqt) {
        return ilp.mo13672a(iqt, khx.m5000a());
    }

    /* renamed from: a */
    public static ilp m3878a(Collection collection) {
        return new ilk(collection);
    }

    @SafeVarargs
    /* renamed from: a */
    public static ilp m3880a(ilp... ilpArr) {
        Collection arrayList = new ArrayList();
        for (Object add : ilpArr) {
            arrayList.add(add);
        }
        return ilq.m3878a(arrayList);
    }

    /* renamed from: b */
    public static ilp m3891b(Collection collection) {
        return ilq.m3875a(ilq.m3878a(collection), ilr.f21049a);
    }

    @SafeVarargs
    /* renamed from: b */
    public static ilp m3892b(ilp... ilpArr) {
        return ilq.m3891b(Arrays.asList(ilpArr));
    }

    /* renamed from: a */
    public static ilp m3872a(ilp ilp) {
        return new ilh(new ilf(ilp));
    }

    /* renamed from: a */
    public static ilp m3874a(ilp ilp, Comparable comparable) {
        return ilq.m3875a(ilp, new ilw(comparable));
    }

    /* renamed from: b */
    public static ilp m3889b(ilp ilp) {
        return new ilh(ilp);
    }

    /* renamed from: a */
    public static ilp m3877a(Object obj, kpk kpk) {
        ilp ilb = new ilb(ilq.m3876a(obj));
        kow.m13878a(kpk, new imf(ilb), kpq.f8776a);
        return ilq.m3872a(ilb);
    }

    /* renamed from: c */
    public static List m3896c(Collection collection) {
        List arrayList = new ArrayList();
        for (ilp b : collection) {
            arrayList.add(b.mo13673b());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static ilp m3890b(ilp ilp, Comparable comparable) {
        return ilq.m3875a(ilp, new ilv(comparable));
    }

    /* renamed from: d */
    public static ilp m3897d(Collection collection) {
        jri.m13395a(collection.isEmpty() ^ 1);
        return ilq.m3875a(ilq.m3878a(collection), ilz.f21058a);
    }

    /* renamed from: a */
    public static ilp m3876a(Object obj) {
        return new imc(obj);
    }

    /* renamed from: a */
    public static ilp m3879a(kpk kpk) {
        ilp ilb = new ilb(Boolean.valueOf(false));
        kow.m13878a(kpk, new ime(ilb), kpq.f8776a);
        return ilb;
    }

    /* renamed from: e */
    public static ilp m3899e(Collection collection) {
        jri.m13395a(collection.isEmpty() ^ 1);
        return ilq.m3875a(ilq.m3878a(collection), ils.f21050a);
    }

    /* renamed from: a */
    public static ilp m3873a(ilp ilp, ilp ilp2) {
        return ilq.m3875a(ilq.m3880a(ilp, ilp2), ily.f21057a);
    }

    /* renamed from: f */
    public static ilp m3901f(Collection collection) {
        return ilq.m3875a(ilq.m3878a(collection), ilx.f21056a);
    }

    /* renamed from: a */
    public static ilp m3875a(ilp ilp, kaw kaw) {
        return ilq.m3889b(new imb(ilp, kaw, ilp));
    }

    /* renamed from: a */
    public static kpk m3885a(ilp ilp, ikb ikb) {
        kpk d = kpw.m18486d();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ikb b = ikb.mo8558b();
        b.mo8557a(ilp.mo13672a(new ima(atomicBoolean, b), kpq.f8776a));
        b.mo8557a(new ilt(d, atomicBoolean));
        return d;
    }
}
