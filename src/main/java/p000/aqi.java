package p000;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aqi */
public final class aqi implements aqb, aqh, aqr, ary {
    /* renamed from: a */
    public static final C0300iw f10639a = ars.m686a(new aqj());
    /* renamed from: r */
    private static final boolean f10640r = Log.isLoggable("Request", 2);
    /* renamed from: A */
    private int f10641A;
    /* renamed from: B */
    private int f10642B;
    /* renamed from: b */
    public aqf f10643b;
    /* renamed from: c */
    public aqc f10644c;
    /* renamed from: d */
    public Context f10645d;
    /* renamed from: e */
    public ace f10646e;
    /* renamed from: f */
    public Object f10647f;
    /* renamed from: g */
    public Class f10648g;
    /* renamed from: h */
    public aqg f10649h;
    /* renamed from: i */
    public int f10650i;
    /* renamed from: j */
    public int f10651j;
    /* renamed from: k */
    public acg f10652k;
    /* renamed from: l */
    public aqs f10653l;
    /* renamed from: m */
    public List f10654m;
    /* renamed from: n */
    public afs f10655n;
    /* renamed from: o */
    public arc f10656o;
    /* renamed from: p */
    public int f10657p;
    /* renamed from: q */
    private boolean f10658q;
    /* renamed from: s */
    private final String f10659s;
    /* renamed from: t */
    private final asa f10660t;
    /* renamed from: u */
    private agn f10661u;
    /* renamed from: v */
    private afx f10662v;
    /* renamed from: w */
    private long f10663w;
    /* renamed from: x */
    private Drawable f10664x;
    /* renamed from: y */
    private Drawable f10665y;
    /* renamed from: z */
    private Drawable f10666z;

    public aqi() {
        String valueOf;
        if (f10640r) {
            valueOf = String.valueOf(super.hashCode());
        } else {
            valueOf = null;
        }
        this.f10659s = valueOf;
        this.f10660t = asa.m692a();
    }

    /* renamed from: j */
    private final void m6962j() {
        if (this.f10658q) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: b */
    public final void mo1677b() {
        m6962j();
        this.f10660t.mo1767b();
        this.f10663w = arm.m655a();
        if (this.f10647f == null) {
            int i;
            if (arq.m682b(this.f10650i, this.f10651j)) {
                this.f10641A = this.f10650i;
                this.f10642B = this.f10651j;
            }
            if (m6964l() == null) {
                i = 5;
            } else {
                i = 3;
            }
            m6959a(new agg("Received null model"), i);
        } else if (this.f10657p == C0252go.f5938j) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (this.f10657p == C0252go.f5940l) {
            mo1716a(this.f10661u, adf.MEMORY_CACHE);
        } else {
            this.f10657p = C0252go.f5939k;
            if (arq.m682b(this.f10650i, this.f10651j)) {
                mo1717a(this.f10650i, this.f10651j);
            } else {
                this.f10653l.mo12306a((aqr) this);
            }
            if ((this.f10657p == C0252go.f5938j || this.f10657p == C0252go.f5939k) && m6963k()) {
                this.f10653l.mo12310c(m6965m());
            }
            if (f10640r) {
                double a = arm.m654a(this.f10663w);
                StringBuilder stringBuilder = new StringBuilder(47);
                stringBuilder.append("finished run method in ");
                stringBuilder.append(a);
                m6961a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: k */
    private final boolean m6963k() {
        aqc aqc = this.f10644c;
        return aqc == null || aqc.mo1687c(this);
    }

    /* renamed from: c */
    public final void mo1678c() {
        boolean z = true;
        arq.m678a();
        m6962j();
        this.f10660t.mo1767b();
        if (this.f10657p != C0252go.f5943o) {
            m6962j();
            this.f10660t.mo1767b();
            this.f10653l.mo12309b((aqr) this);
            this.f10657p = C0252go.f5942n;
            afx afx = this.f10662v;
            if (afx != null) {
                afy afy = afx.f424a;
                aqh aqh = afx.f425b;
                arq.m678a();
                afy.f10221b.mo1767b();
                if (afy.f10232m || afy.f10234o) {
                    if (afy.f10235p == null) {
                        afy.f10235p = new ArrayList(2);
                    }
                    if (!afy.f10235p.contains(aqh)) {
                        afy.f10235p.add(aqh);
                    }
                } else {
                    afy.f10220a.remove(aqh);
                    if (!(!afy.f10220a.isEmpty() || afy.f10234o || afy.f10232m || afy.f10238s)) {
                        afy.f10238s = true;
                        afd afd = afy.f10237r;
                        afd.f10200s = true;
                        afa afa = afd.f10199r;
                        if (afa != null) {
                            afa.mo213a();
                        }
                        afy.f10223d.mo244a(afy, afy.f10225f);
                    }
                }
                this.f10662v = null;
            }
            agn agn = this.f10661u;
            if (agn != null) {
                m6960a(agn);
            }
            aqc aqc = this.f10644c;
            if (!(aqc == null || aqc.mo1686b(this))) {
                z = false;
            }
            if (z) {
                this.f10653l.mo12304a(m6965m());
            }
            this.f10657p = C0252go.f5943o;
        }
    }

    /* renamed from: l */
    private final Drawable m6964l() {
        if (this.f10666z == null) {
            aqg aqg = this.f10649h;
            this.f10666z = aqg.f910q;
            if (this.f10666z == null) {
                int i = aqg.f911r;
                if (i > 0) {
                    this.f10666z = m6958a(i);
                }
            }
        }
        return this.f10666z;
    }

    /* renamed from: m */
    private final Drawable m6965m() {
        if (this.f10665y == null) {
            aqg aqg = this.f10649h;
            this.f10665y = aqg.f902i;
            if (this.f10665y == null) {
                int i = aqg.f903j;
                if (i > 0) {
                    this.f10665y = m6958a(i);
                }
            }
        }
        return this.f10665y;
    }

    /* renamed from: a */
    public final asa mo1764a() {
        return this.f10660t;
    }

    /* renamed from: d */
    public final boolean mo1679d() {
        return this.f10657p == C0252go.f5942n || this.f10657p == C0252go.f5943o;
    }

    /* renamed from: e */
    public final boolean mo1680e() {
        return this.f10657p == C0252go.f5940l;
    }

    /* renamed from: a */
    public final boolean mo1676a(aqb aqb) {
        if (!(aqb instanceof aqi)) {
            return false;
        }
        aqi aqi = (aqi) aqb;
        if (this.f10650i == aqi.f10650i && this.f10651j == aqi.f10651j && arq.m679a(this.f10647f, aqi.f10647f) && this.f10648g.equals(aqi.f10648g) && this.f10649h.equals(aqi.f10649h) && this.f10652k == aqi.f10652k) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m6966n() {
        aqc aqc = this.f10644c;
        return aqc == null || !aqc.mo1685a();
    }

    /* renamed from: f */
    public final boolean mo1681f() {
        return mo1680e();
    }

    /* renamed from: g */
    public final boolean mo1682g() {
        return this.f10657p == C0252go.f5938j || this.f10657p == C0252go.f5939k;
    }

    /* renamed from: a */
    private final Drawable m6958a(int i) {
        Theme theme = this.f10649h.f916w;
        if (theme == null) {
            theme = this.f10645d.getTheme();
        }
        Context context = this.f10646e;
        return anp.m540a(context, context, i, theme);
    }

    /* renamed from: a */
    private final void m6961a(String str) {
        String str2 = this.f10659s;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(str2);
        Log.v("Request", stringBuilder.toString());
    }

    /* renamed from: a */
    private static int m6957a(int i, float f) {
        return i != kvl.UNSET_ENUM_VALUE ? Math.round(((float) i) * f) : i;
    }

    /* renamed from: a */
    public final void mo1715a(agg agg) {
        m6959a(agg, 5);
    }

    /* renamed from: a */
    private final void m6959a(agg agg, int i) {
        this.f10660t.mo1767b();
        int i2 = this.f10646e.f215h;
        if (i2 <= i) {
            String valueOf = String.valueOf(this.f10647f);
            int i3 = this.f10641A;
            int i4 = this.f10642B;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("Load failed for ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with size [");
            stringBuilder.append(i3);
            stringBuilder.append("x");
            stringBuilder.append(i4);
            stringBuilder.append("]");
            Log.w("Glide", stringBuilder.toString(), agg);
            if (i2 <= 4) {
                List a = agg.mo247a();
                i4 = a.size();
                for (int i5 = 0; i5 < i4; i5++) {
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("Root cause (");
                    stringBuilder2.append(i5 + 1);
                    stringBuilder2.append(" of ");
                    stringBuilder2.append(i4);
                    stringBuilder2.append(")");
                    Log.i("Glide", stringBuilder2.toString(), (Throwable) a.get(i5));
                }
            }
        }
        this.f10662v = null;
        this.f10657p = C0252go.f5941m;
        this.f10658q = true;
        try {
            aqf aqf = this.f10643b;
            if (aqf != null) {
                m6966n();
                aqf.mo1691a(agg);
            }
            if (m6963k()) {
                Drawable l;
                if (this.f10647f == null) {
                    l = m6964l();
                } else {
                    l = null;
                }
                if (l == null) {
                    if (this.f10664x == null) {
                        aqg aqg = this.f10649h;
                        this.f10664x = aqg.f900g;
                        if (this.f10664x == null) {
                            i2 = aqg.f901h;
                            if (i2 > 0) {
                                this.f10664x = m6958a(i2);
                            }
                        }
                    }
                    l = this.f10664x;
                }
                if (l == null) {
                    l = m6965m();
                }
                this.f10653l.mo12308b(l);
            }
            this.f10658q = false;
            aqc aqc = this.f10644c;
            if (aqc != null) {
                aqc.mo1689e(this);
            }
        } catch (Throwable th) {
            this.f10658q = false;
        }
    }

    /* renamed from: a */
    public final void mo1716a(agn agn, adf adf) {
        this.f10660t.mo1767b();
        this.f10662v = null;
        if (agn == null) {
            String valueOf = String.valueOf(this.f10648g);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 82);
            stringBuilder.append("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" inside, but instead got null.");
            m6959a(new agg(stringBuilder.toString()), 5);
            return;
        }
        Object b = agn.mo262b();
        Object obj;
        String simpleName;
        String valueOf2;
        StringBuilder stringBuilder2;
        if (b != null && this.f10648g.isAssignableFrom(b.getClass())) {
            aqc aqc = this.f10644c;
            obj = aqc != null ? !aqc.mo1688d(this) ? null : 1 : 1;
            if (obj == null) {
                m6960a(agn);
                this.f10657p = C0252go.f5940l;
                return;
            }
            m6966n();
            this.f10657p = C0252go.f5940l;
            this.f10661u = agn;
            if (this.f10646e.f215h <= 3) {
                simpleName = b.getClass().getSimpleName();
                String valueOf3 = String.valueOf(adf);
                valueOf2 = String.valueOf(this.f10647f);
                int i = this.f10641A;
                int i2 = this.f10642B;
                double a = arm.m654a(this.f10663w);
                stringBuilder2 = new StringBuilder(((String.valueOf(simpleName).length() + 95) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf2).length());
                stringBuilder2.append("Finished loading ");
                stringBuilder2.append(simpleName);
                stringBuilder2.append(" from ");
                stringBuilder2.append(valueOf3);
                stringBuilder2.append(" for ");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append(" with size [");
                stringBuilder2.append(i);
                stringBuilder2.append("x");
                stringBuilder2.append(i2);
                stringBuilder2.append("] in ");
                stringBuilder2.append(a);
                stringBuilder2.append(" ms");
                Log.d("Glide", stringBuilder2.toString());
            }
            this.f10658q = true;
            try {
                aqf aqf = this.f10643b;
                if (aqf != null) {
                    aqf.mo1692a(b);
                }
                this.f10653l.mo12307a(b, this.f10656o.mo1722a(adf));
                aqc = this.f10644c;
                if (aqc != null) {
                    aqc.mo1690f(this);
                }
            } finally {
                this.f10658q = false;
            }
        } else {
            m6960a(agn);
            valueOf2 = String.valueOf(this.f10648g);
            if (b == null) {
                obj = "";
            } else {
                obj = b.getClass();
            }
            String valueOf4 = String.valueOf(obj);
            String valueOf5 = String.valueOf(b);
            String valueOf6 = String.valueOf(agn);
            if (b == null) {
                simpleName = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            } else {
                simpleName = "";
            }
            int length = String.valueOf(valueOf2).length();
            stringBuilder2 = new StringBuilder(((((length + 71) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(simpleName).length());
            stringBuilder2.append("Expected to receive an object of ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(" but instead got ");
            stringBuilder2.append(valueOf4);
            stringBuilder2.append("{");
            stringBuilder2.append(valueOf5);
            stringBuilder2.append("} inside Resource{");
            stringBuilder2.append(valueOf6);
            stringBuilder2.append("}.");
            stringBuilder2.append(simpleName);
            m6959a(new agg(stringBuilder2.toString()), 5);
        }
    }

    /* renamed from: a */
    public final void mo1717a(int i, int i2) {
        double a;
        StringBuilder stringBuilder;
        this.f10660t.mo1767b();
        if (f10640r) {
            a = arm.m654a(this.f10663w);
            stringBuilder = new StringBuilder(43);
            stringBuilder.append("Got onSizeReady in ");
            stringBuilder.append(a);
            m6961a(stringBuilder.toString());
        }
        if (this.f10657p == C0252go.f5939k) {
            long a2;
            agn agn;
            Object agn2;
            afx afx;
            this.f10657p = C0252go.f5938j;
            float f = this.f10649h.f897d;
            this.f10641A = aqi.m6957a(i, f);
            this.f10642B = aqi.m6957a(i2, f);
            if (f10640r) {
                a = arm.m654a(this.f10663w);
                stringBuilder = new StringBuilder(59);
                stringBuilder.append("finished setup for calling load in ");
                stringBuilder.append(a);
                m6961a(stringBuilder.toString());
            }
            afs afs = this.f10655n;
            ace ace = this.f10646e;
            Object obj = this.f10647f;
            aqg aqg = this.f10649h;
            adl adl = aqg.f907n;
            int i3 = this.f10641A;
            int i4 = this.f10642B;
            Class cls = aqg.f914u;
            Class cls2 = this.f10648g;
            acg acg = this.f10652k;
            afm afm = aqg.f898e;
            Map map = aqg.f913t;
            boolean z = aqg.f908o;
            boolean z2 = aqg.f894A;
            adp adp = aqg.f912s;
            boolean z3 = aqg.f904k;
            boolean z4 = aqg.f918y;
            boolean z5 = aqg.f895B;
            boolean z6 = aqg.f919z;
            arq.m678a();
            if (afs.f10208a) {
                a2 = arm.m655a();
            } else {
                a2 = 0;
            }
            adl agc = new agc(obj, adl, i3, i4, map, cls, cls2, adp);
            if (z3) {
                aet aet = afs.f10213f;
                aex aex = (aex) aet.f356b.get(agc);
                if (aex != null) {
                    age age = (age) aex.get();
                    if (age == null) {
                        aet.mo209a(aex);
                        agn2 = age;
                    } else {
                        agn2 = age;
                    }
                } else {
                    agn2 = null;
                }
                if (agn2 != null) {
                    agn2.mo11634a();
                }
            } else {
                agn2 = null;
            }
            if (agn2 != null) {
                mo1716a(agn2, adf.MEMORY_CACHE);
                if (afs.f10208a) {
                    afs.m6445a("Loaded resource from active resources", a2, agc);
                    afx = null;
                } else {
                    afx = null;
                }
            } else {
                if (z3) {
                    agn2 = afs.f10210c.mo303a(agc);
                    if (agn2 == null) {
                        agn2 = null;
                    } else if (agn2 instanceof age) {
                        agn2 = (age) agn2;
                    } else {
                        agn2 = new age(agn2, true, true);
                    }
                    if (agn2 != null) {
                        agn2.mo11634a();
                        afs.f10213f.mo208a(agc, agn2);
                    }
                } else {
                    agn2 = null;
                }
                if (agn2 != null) {
                    mo1716a(agn2, adf.MEMORY_CACHE);
                    if (afs.f10208a) {
                        afs.m6445a("Loaded resource from cache", a2, agc);
                        afx = null;
                    } else {
                        afx = null;
                    }
                } else {
                    afy afy = (afy) afs.f10209b.mo258a(z6).get(agc);
                    if (afy != null) {
                        afy.mo11630a((aqh) this);
                        if (afs.f10208a) {
                            afs.m6445a("Added to existing load", a2, agc);
                        }
                        afx = new afx(this, afy);
                    } else {
                        aie aie;
                        afy afy2 = (afy) aqe.m610a((afy) afs.f10211d.f423f.mo9113a(), "Argument must not be null");
                        afy2.f10225f = agc;
                        afy2.f10226g = z3;
                        afy2.f10227h = z4;
                        afy2.f10228i = z5;
                        afy2.f10229j = z6;
                        aft aft = afs.f10212e;
                        afd afd = (afd) aqe.m610a((afd) aft.f416b.mo9113a(), "Argument must not be null");
                        int i5 = aft.f417c;
                        aft.f417c = i5 + 1;
                        afc afc = afd.f10182a;
                        afg afg = afd.f10183b;
                        afc.f370c = ace;
                        afc.f371d = obj;
                        afc.f381n = adl;
                        afc.f372e = i3;
                        afc.f373f = i4;
                        afc.f383p = afm;
                        afc.f374g = cls;
                        afc.f375h = afg;
                        afc.f378k = cls2;
                        afc.f382o = acg;
                        afc.f376i = adp;
                        afc.f377j = map;
                        afc.f384q = z;
                        afc.f385r = z2;
                        afd.f10186e = ace;
                        afd.f10187f = adl;
                        afd.f10188g = acg;
                        afd.f10189h = agc;
                        afd.f10190i = i3;
                        afd.f10191j = i4;
                        afd.f10192k = afm;
                        afd.f10197p = z6;
                        afd.f10193l = adp;
                        afd.f10194m = afy2;
                        afd.f10195n = i5;
                        afd.f10196o = afi.INITIALIZE;
                        afs.f10209b.mo258a(afy2.f10229j).put(agc, afy2);
                        afy2.mo11630a((aqh) this);
                        afy2.f10237r = afd;
                        afj a3 = afd.mo11626a(afj.INITIALIZE);
                        if (a3 == afj.RESOURCE_CACHE) {
                            obj = 1;
                        } else if (a3 != afj.DATA_CACHE) {
                            obj = null;
                        } else {
                            obj = 1;
                        }
                        if (obj != null) {
                            aie = afy2.f10224e;
                        } else {
                            aie = afy2.mo11631b();
                        }
                        aie.execute(afd);
                        if (afs.f10208a) {
                            afs.m6445a("Started new load", a2, agc);
                        }
                        afx = new afx(this, afy2);
                    }
                }
            }
            this.f10662v = afx;
            if (this.f10657p != C0252go.f5938j) {
                this.f10662v = null;
            }
            if (f10640r) {
                a = arm.m654a(this.f10663w);
                stringBuilder = new StringBuilder(48);
                stringBuilder.append("finished onSizeReady in ");
                stringBuilder.append(a);
                m6961a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: h */
    public final void mo1683h() {
        mo1678c();
        this.f10657p = C0252go.f5944p;
    }

    /* renamed from: i */
    public final void mo1684i() {
        m6962j();
        this.f10645d = null;
        this.f10646e = null;
        this.f10647f = null;
        this.f10648g = null;
        this.f10649h = null;
        this.f10650i = -1;
        this.f10651j = -1;
        this.f10653l = null;
        this.f10643b = null;
        this.f10644c = null;
        this.f10656o = null;
        this.f10662v = null;
        this.f10664x = null;
        this.f10665y = null;
        this.f10666z = null;
        this.f10641A = -1;
        this.f10642B = -1;
        f10639a.mo9114a(this);
    }

    /* renamed from: a */
    private final void m6960a(agn agn) {
        afs.m6446b(agn);
        this.f10661u = null;
    }
}
