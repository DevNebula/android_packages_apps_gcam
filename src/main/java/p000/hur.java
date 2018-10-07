package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: hur */
public final class hur {
    /* renamed from: a */
    public Account f7047a;
    /* renamed from: b */
    public final ArrayList f7048b;
    /* renamed from: c */
    public final ArrayList f7049c;
    /* renamed from: d */
    private final Set f7050d;
    /* renamed from: e */
    private final Set f7051e;
    /* renamed from: f */
    private String f7052f;
    /* renamed from: g */
    private String f7053g;
    /* renamed from: h */
    private final Map f7054h;
    /* renamed from: i */
    private final Context f7055i;
    /* renamed from: j */
    private final Map f7056j;
    /* renamed from: k */
    private int f7057k;
    /* renamed from: l */
    private Looper f7058l;
    /* renamed from: m */
    private hua f7059m;
    /* renamed from: n */
    private huk f7060n;

    public hur(Context context) {
        this.f7050d = new HashSet();
        this.f7051e = new HashSet();
        this.f7054h = new C0691ih();
        this.f7056j = new C0691ih();
        this.f7057k = -1;
        this.f7059m = hua.f20814a;
        this.f7060n = iaq.f7241a;
        this.f7048b = new ArrayList();
        this.f7049c = new ArrayList();
        this.f7055i = context;
        this.f7058l = context.getMainLooper();
        this.f7052f = context.getPackageName();
        this.f7053g = context.getClass().getName();
    }

    public hur(Context context, hus hus, hut hut) {
        this(context);
        htl.m3489b((Object) hus, (Object) "Must provide a connected listener");
        this.f7048b.add(hus);
        htl.m3489b((Object) hut, (Object) "Must provide a connection failed listener");
        this.f7049c.add(hut);
    }

    /* renamed from: b */
    public final hvx mo8147b() {
        iav iav = iav.f7248a;
        if (this.f7056j.containsKey(iaq.f7242b)) {
            iav = (iav) this.f7056j.get(iaq.f7242b);
        }
        return new hvx(this.f7047a, this.f7050d, this.f7054h, this.f7052f, this.f7053g, iav);
    }

    /* renamed from: a */
    public final hur mo8146a(huh huh) {
        htl.m3489b((Object) huh, (Object) "Api must not be null");
        this.f7056j.put(huh, null);
        Collection emptyList = Collections.emptyList();
        this.f7051e.addAll(emptyList);
        this.f7050d.addAll(emptyList);
        return this;
    }

    /* renamed from: a */
    public final huq mo8145a() {
        htl.m3493b(this.f7056j.isEmpty() ^ 1, (Object) "must call addApi() to add at least one API");
        hvx b = mo8147b();
        Map map = b.f7114d;
        Map c0691ih = new C0691ih();
        Map c0691ih2 = new C0691ih();
        ArrayList arrayList = new ArrayList();
        for (huh huh : this.f7056j.keySet()) {
            Object obj = this.f7056j.get(huh);
            boolean z = map.get(huh) != null;
            c0691ih.put(huh, Boolean.valueOf(z));
            hus ico = new ico(huh, z);
            arrayList.add(ico);
            c0691ih2.put(huh.mo8131b(), huh.mo8130a().mo13572a(this.f7055i, this.f7058l, b, obj, ico, ico));
        }
        huq idn = new idn(this.f7055i, new ReentrantLock(), this.f7058l, b, this.f7059m, this.f7060n, c0691ih, this.f7048b, this.f7049c, c0691ih2, this.f7057k, idn.m12410a(c0691ih2.values()), arrayList);
        synchronized (huq.f7046a) {
            huq.f7046a.add(idn);
        }
        if (this.f7057k < 0) {
            return idn;
        }
        throw new NoSuchMethodError();
    }
}
