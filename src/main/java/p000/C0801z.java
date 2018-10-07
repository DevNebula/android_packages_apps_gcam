package p000;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: z */
public final class C0801z extends C0510u {
    /* renamed from: a */
    private C0676f f22457a = new C0676f();
    /* renamed from: b */
    private C0552w f22458b;
    /* renamed from: c */
    private final WeakReference f22459c;
    /* renamed from: d */
    private int f22460d = 0;
    /* renamed from: e */
    private boolean f22461e = false;
    /* renamed from: f */
    private boolean f22462f = false;
    /* renamed from: g */
    private ArrayList f22463g = new ArrayList();

    public C0801z(C0587y c0587y) {
        this.f22459c = new WeakReference(c0587y);
        this.f22458b = C0552w.INITIALIZED;
    }

    /* renamed from: a */
    public final void mo11198a(C0574x c0574x) {
        C0552w c0552w;
        Object obj = 1;
        if (this.f22458b != C0552w.DESTROYED) {
            c0552w = C0552w.INITIALIZED;
        } else {
            c0552w = C0552w.DESTROYED;
        }
        C0180cz c0180cz = new C0180cz(c0574x, c0552w);
        if (((C0180cz) this.f22457a.mo6983a(c0574x, c0180cz)) == null) {
            C0587y c0587y = (C0587y) this.f22459c.get();
            if (c0587y != null) {
                if (this.f22460d == 0 && !this.f22461e) {
                    obj = null;
                }
                Enum c = m14871c(c0574x);
                this.f22460d++;
                while (c0180cz.f3049a.compareTo(c) < 0 && this.f22457a.mo13213a(c0574x)) {
                    m14869b(c0180cz.f3049a);
                    c0180cz.mo5891a(c0587y, C0801z.m14870c(c0180cz.f3049a));
                    m14868b();
                    c = m14871c(c0574x);
                }
                if (obj == null) {
                    m14872c();
                }
                this.f22460d--;
            }
        }
    }

    /* renamed from: c */
    private final C0552w m14871c(C0574x c0574x) {
        Entry entry;
        C0552w c0552w;
        C0552w c0552w2;
        C0676f c0676f = this.f22457a;
        if (c0676f.mo13213a(c0574x)) {
            entry = ((C0302j) c0676f.f18082a.get(c0574x)).f7962d;
        } else {
            entry = null;
        }
        if (entry != null) {
            c0552w = ((C0180cz) entry.getValue()).f3049a;
        } else {
            c0552w = null;
        }
        if (this.f22463g.isEmpty()) {
            c0552w2 = null;
        } else {
            ArrayList arrayList = this.f22463g;
            c0552w2 = (C0552w) arrayList.get(arrayList.size() - 1);
        }
        return C0801z.m14867a(C0801z.m14867a(this.f22458b, c0552w), c0552w2);
    }

    /* renamed from: a */
    public final C0552w mo11197a() {
        return this.f22458b;
    }

    /* renamed from: a */
    public static C0552w m14866a(C0531v c0531v) {
        switch (c0531v.ordinal()) {
            case 0:
            case 4:
                return C0552w.CREATED;
            case 1:
            case 3:
                return C0552w.STARTED;
            case 2:
                return C0552w.RESUMED;
            case 5:
                return C0552w.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected event value ");
                stringBuilder.append(c0531v);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public final void mo14475b(C0531v c0531v) {
        mo14474a(C0801z.m14866a(c0531v));
    }

    /* renamed from: a */
    public static C0552w m14867a(C0552w c0552w, C0552w c0552w2) {
        return (c0552w2 == null || c0552w2.compareTo(c0552w) >= 0) ? c0552w : c0552w2;
    }

    /* renamed from: a */
    public final void mo14474a(C0552w c0552w) {
        if (this.f22458b != c0552w) {
            this.f22458b = c0552w;
            if (this.f22461e || this.f22460d != 0) {
                this.f22462f = true;
                return;
            }
            this.f22461e = true;
            m14872c();
            this.f22461e = false;
        }
    }

    /* renamed from: b */
    private final void m14868b() {
        ArrayList arrayList = this.f22463g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: b */
    private final void m14869b(C0552w c0552w) {
        this.f22463g.add(c0552w);
    }

    /* renamed from: b */
    public final void mo11199b(C0574x c0574x) {
        this.f22457a.mo6987c(c0574x);
    }

    /* renamed from: c */
    private final void m14872c() {
        C0587y c0587y = (C0587y) this.f22459c.get();
        if (c0587y != null) {
            while (true) {
                boolean z;
                C0239g c0239g = this.f22457a;
                if (c0239g.f5177e != 0) {
                    C0552w c0552w = ((C0180cz) c0239g.f5174b.getValue()).f3049a;
                    C0552w c0552w2 = ((C0180cz) this.f22457a.f5175c.getValue()).f3049a;
                    z = c0552w == c0552w2 ? this.f22458b == c0552w2 : false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f22462f = false;
                    return;
                }
                Entry entry;
                this.f22462f = false;
                if (this.f22458b.compareTo(((C0180cz) this.f22457a.f5174b.getValue()).f3049a) < 0) {
                    c0239g = this.f22457a;
                    Iterator c0820i = new C0820i(c0239g.f5175c, c0239g.f5174b);
                    c0239g.f5176d.put(c0820i, Boolean.valueOf(false));
                    while (c0820i.hasNext() && !this.f22462f) {
                        entry = (Entry) c0820i.next();
                        C0180cz c0180cz = (C0180cz) entry.getValue();
                        while (c0180cz.f3049a.compareTo(this.f22458b) > 0 && !this.f22462f && this.f22457a.mo13213a(entry.getKey())) {
                            C0531v c0531v;
                            C0552w c0552w3 = c0180cz.f3049a;
                            switch (c0552w3.ordinal()) {
                                case 0:
                                    throw new IllegalArgumentException();
                                case 1:
                                    throw new IllegalArgumentException();
                                case 2:
                                    c0531v = C0531v.ON_DESTROY;
                                    break;
                                case 3:
                                    c0531v = C0531v.ON_STOP;
                                    break;
                                case 4:
                                    c0531v = C0531v.ON_PAUSE;
                                    break;
                                default:
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unexpected state value ");
                                    stringBuilder.append(c0552w3);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            m14869b(C0801z.m14866a(c0531v));
                            c0180cz.mo5891a(c0587y, c0531v);
                            m14868b();
                        }
                    }
                }
                entry = this.f22457a.f5175c;
                if (!(this.f22462f || entry == null || this.f22458b.compareTo(((C0180cz) entry.getValue()).f3049a) <= 0)) {
                    Iterator a = this.f22457a.mo6984a();
                    while (a.hasNext() && !this.f22462f) {
                        Entry entry2 = (Entry) a.next();
                        C0180cz c0180cz2 = (C0180cz) entry2.getValue();
                        while (c0180cz2.f3049a.compareTo(this.f22458b) < 0 && !this.f22462f && this.f22457a.mo13213a(entry2.getKey())) {
                            m14869b(c0180cz2.f3049a);
                            c0180cz2.mo5891a(c0587y, C0801z.m14870c(c0180cz2.f3049a));
                            m14868b();
                        }
                    }
                }
            }
        } else {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
        }
    }

    /* renamed from: c */
    private static C0531v m14870c(C0552w c0552w) {
        switch (c0552w.ordinal()) {
            case 0:
            case 1:
                return C0531v.ON_CREATE;
            case 2:
                return C0531v.ON_START;
            case 3:
                return C0531v.ON_RESUME;
            case 4:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(c0552w);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
