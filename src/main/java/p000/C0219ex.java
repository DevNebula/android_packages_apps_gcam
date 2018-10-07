package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ex */
public abstract class C0219ex implements Cloneable {
    /* renamed from: p */
    private static final int[] f4529p = new int[]{2, 1, 3, 4};
    /* renamed from: q */
    private static final C0216eu f4530q = new C0216eu((byte) 0);
    /* renamed from: s */
    private static ThreadLocal f4531s = new ThreadLocal();
    /* renamed from: a */
    public long f4532a = -1;
    /* renamed from: b */
    public long f4533b = -1;
    /* renamed from: c */
    public TimeInterpolator f4534c = null;
    /* renamed from: d */
    public ArrayList f4535d = new ArrayList();
    /* renamed from: e */
    public ArrayList f4536e = new ArrayList();
    /* renamed from: f */
    public C0229fm f4537f = new C0229fm();
    /* renamed from: g */
    public C0229fm f4538g = new C0229fm();
    /* renamed from: h */
    public C0678fh f4539h = null;
    /* renamed from: i */
    public int[] f4540i = f4529p;
    /* renamed from: j */
    public ArrayList f4541j;
    /* renamed from: k */
    public ArrayList f4542k;
    /* renamed from: l */
    public ArrayList f4543l = new ArrayList();
    /* renamed from: m */
    public C0635ax f4544m;
    /* renamed from: n */
    public C0223fb f4545n;
    /* renamed from: o */
    public C0216eu f4546o = f4530q;
    /* renamed from: r */
    private String f4547r = getClass().getName();
    /* renamed from: t */
    private int f4548t = 0;
    /* renamed from: u */
    private boolean f4549u = false;
    /* renamed from: v */
    private boolean f4550v = false;
    /* renamed from: w */
    private ArrayList f4551w = null;
    /* renamed from: x */
    private ArrayList f4552x = new ArrayList();

    /* renamed from: a */
    public abstract void mo6638a(C0228fl c0228fl);

    /* renamed from: b */
    public abstract void mo6646b(C0228fl c0228fl);

    /* renamed from: a */
    public C0219ex mo6630a(C0224fc c0224fc) {
        if (this.f4551w == null) {
            this.f4551w = new ArrayList();
        }
        this.f4551w.add(c0224fc);
        return this;
    }

    /* renamed from: a */
    public C0219ex mo6629a(View view) {
        this.f4536e.add(view);
        return this;
    }

    /* renamed from: a */
    private static void m2193a(C0229fm c0229fm, View view, C0228fl c0228fl) {
        c0229fm.f4846a.put(view, c0228fl);
        int id = view.getId();
        if (id >= 0) {
            if (c0229fm.f4847b.indexOfKey(id) >= 0) {
                c0229fm.f4847b.put(id, null);
            } else {
                c0229fm.f4847b.put(id, view);
            }
        }
        String p = C0315jm.m4641p(view);
        if (p != null) {
            if (c0229fm.f4849d.containsKey(p)) {
                c0229fm.f4849d.put(p, null);
            } else {
                c0229fm.f4849d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0291in c0291in = c0229fm.f4848c;
                if (c0291in.f7484b) {
                    c0291in.mo8630b();
                }
                if (C0289il.m3868a(c0291in.f7485c, c0291in.f7487e, itemIdAtPosition) >= 0) {
                    Object obj;
                    c0291in = c0229fm.f4848c;
                    int a = C0289il.m3868a(c0291in.f7485c, c0291in.f7487e, itemIdAtPosition);
                    if (a < 0) {
                        obj = null;
                    } else if (c0291in.f7486d[a] != C0291in.f7483a) {
                        obj = c0291in.f7486d[a];
                    } else {
                        obj = null;
                    }
                    View view2 = (View) obj;
                    if (view2 != null) {
                        C0315jm.m4620a(view2, false);
                        c0229fm.f4848c.mo8627a(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0315jm.m4620a(view, true);
                c0229fm.f4848c.mo8627a(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: c */
    private final void m2195c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C0228fl c0228fl = new C0228fl();
                c0228fl.f4837b = view;
                if (z) {
                    mo6646b(c0228fl);
                } else {
                    mo6638a(c0228fl);
                }
                c0228fl.f4838c.add(this);
                mo6650c(c0228fl);
                if (z) {
                    C0219ex.m2193a(this.f4537f, view, c0228fl);
                } else {
                    C0219ex.m2193a(this.f4538g, view, c0228fl);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m2195c(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: c */
    void mo6650c(C0228fl c0228fl) {
        Object obj = null;
        if (this.f4544m != null && !c0228fl.f4836a.isEmpty()) {
            String[] c = this.f4544m.mo12329c();
            if (c != null) {
                for (Object containsKey : c) {
                    if (!c0228fl.f4836a.containsKey(containsKey)) {
                        break;
                    }
                }
                obj = 1;
                if (obj == null) {
                    this.f4544m.mo12327a();
                }
            }
        }
    }

    /* renamed from: a */
    final void mo6634a(ViewGroup viewGroup, boolean z) {
        int i;
        View findViewById;
        int i2 = 0;
        mo6639a(z);
        if (this.f4535d.size() > 0) {
            i = 0;
        } else if (this.f4536e.size() > 0) {
            i = 0;
        } else {
            m2195c(viewGroup, z);
            return;
        }
        while (i < this.f4535d.size()) {
            findViewById = viewGroup.findViewById(((Integer) this.f4535d.get(i)).intValue());
            if (findViewById != null) {
                C0228fl c0228fl = new C0228fl();
                c0228fl.f4837b = findViewById;
                if (z) {
                    mo6646b(c0228fl);
                } else {
                    mo6638a(c0228fl);
                }
                c0228fl.f4838c.add(this);
                mo6650c(c0228fl);
                if (z) {
                    C0219ex.m2193a(this.f4537f, findViewById, c0228fl);
                } else {
                    C0219ex.m2193a(this.f4538g, findViewById, c0228fl);
                }
            }
            i++;
        }
        while (i2 < this.f4536e.size()) {
            findViewById = (View) this.f4536e.get(i2);
            C0228fl c0228fl2 = new C0228fl();
            c0228fl2.f4837b = findViewById;
            if (z) {
                mo6646b(c0228fl2);
            } else {
                mo6638a(c0228fl2);
            }
            c0228fl2.f4838c.add(this);
            mo6650c(c0228fl2);
            if (z) {
                C0219ex.m2193a(this.f4537f, findViewById, c0228fl2);
            } else {
                C0219ex.m2193a(this.f4538g, findViewById, c0228fl2);
            }
            i2++;
        }
    }

    /* renamed from: a */
    final void mo6639a(boolean z) {
        if (z) {
            this.f4537f.f4846a.clear();
            this.f4537f.f4847b.clear();
            this.f4537f.f4848c.mo8625a();
            return;
        }
        this.f4538g.f4846a.clear();
        this.f4538g.f4847b.clear();
        this.f4538g.f4848c.mo8625a();
    }

    /* renamed from: b */
    public C0219ex clone() {
        try {
            C0219ex c0219ex = (C0219ex) super.clone();
            c0219ex.f4552x = new ArrayList();
            c0219ex.f4537f = new C0229fm();
            c0219ex.f4538g = new C0229fm();
            c0219ex.f4541j = null;
            c0219ex.f4542k = null;
            return c0219ex;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* renamed from: a */
    public Animator mo6626a(ViewGroup viewGroup, C0228fl c0228fl, C0228fl c0228fl2) {
        return null;
    }

    /* renamed from: a */
    protected void mo6633a(ViewGroup viewGroup, C0229fm c0229fm, C0229fm c0229fm2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        C0691ih d = C0219ex.m2196d();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            C0228fl c0228fl;
            C0228fl c0228fl2 = (C0228fl) arrayList.get(i2);
            C0228fl c0228fl3 = (C0228fl) arrayList2.get(i2);
            if (c0228fl2 == null) {
                c0228fl = c0228fl2;
            } else if (c0228fl2.f4838c.contains(this)) {
                c0228fl = c0228fl2;
            } else {
                c0228fl = null;
            }
            if (!(c0228fl3 == null || c0228fl3.f4838c.contains(this))) {
                c0228fl3 = null;
            }
            if (c0228fl != null || c0228fl3 != null) {
                Object obj = c0228fl == null ? 1 : c0228fl3 != null ? !mo6640a(c0228fl, c0228fl3) ? null : 1 : 1;
                if (obj != null) {
                    Animator a = mo6626a(viewGroup, c0228fl, c0228fl3);
                    if (a != null) {
                        C0228fl c0228fl4;
                        Object obj2;
                        View view;
                        if (c0228fl3 != null) {
                            Object obj3;
                            View view2 = c0228fl3.f4837b;
                            String[] a2 = mo6641a();
                            Animator obj32;
                            if (view2 == null) {
                                c0228fl2 = null;
                                obj32 = a;
                            } else if (a2 == null) {
                                c0228fl2 = null;
                                obj32 = a;
                            } else if (a2.length > 0) {
                                c0228fl = new C0228fl();
                                c0228fl.f4837b = view2;
                                c0228fl2 = (C0228fl) c0229fm2.f4846a.get(view2);
                                if (c0228fl2 != null) {
                                    for (Object obj4 : a2) {
                                        Map map = c0228fl.f4836a;
                                        map.put(obj4, c0228fl2.f4836a.get(obj4));
                                    }
                                }
                                int size2 = d.size();
                                for (i = 0; i < size2; i++) {
                                    C0222fa c0222fa = (C0222fa) d.get((Animator) d.mo9195b(i));
                                    if (c0222fa.f4627c != null && c0222fa.f4625a == view2 && c0222fa.f4626b.equals(this.f4547r) && c0222fa.f4627c.equals(c0228fl)) {
                                        obj32 = null;
                                        c0228fl2 = c0228fl;
                                        break;
                                    }
                                }
                                c0228fl2 = c0228fl;
                                obj32 = a;
                            } else {
                                c0228fl2 = null;
                                obj32 = a;
                            }
                            c0228fl4 = c0228fl2;
                            obj2 = obj32;
                            view = view2;
                        } else {
                            view = c0228fl.f4837b;
                            c0228fl4 = null;
                            Animator obj22 = a;
                        }
                        if (obj22 != null) {
                            C0635ax c0635ax = this.f4544m;
                            if (c0635ax != null) {
                                long d2 = c0635ax.mo12330d();
                                sparseIntArray.put(this.f4552x.size(), (int) d2);
                                j = Math.min(d2, j);
                            }
                            d.put(obj22, new C0222fa(view, this.f4547r, this, C0231fo.m2402a(viewGroup), c0228fl4));
                            this.f4552x.add(obj22);
                        }
                    }
                }
            }
        }
        if (j != 0) {
            int i3 = 0;
            while (true) {
                i = i3;
                if (i < sparseIntArray.size()) {
                    Animator animator = (Animator) this.f4552x.get(sparseIntArray.keyAt(i));
                    animator.setStartDelay((((long) sparseIntArray.valueAt(i)) - j) + animator.getStartDelay());
                    i3 = i + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    protected final void mo6648c() {
        this.f4548t--;
        if (this.f4548t == 0) {
            int i;
            View view;
            ArrayList arrayList = this.f4551w;
            if (arrayList == null) {
                i = 0;
            } else if (arrayList.size() > 0) {
                arrayList = (ArrayList) this.f4551w.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0224fc) arrayList.get(i2)).mo6738a(this);
                }
                i = 0;
            } else {
                i = 0;
            }
            while (i < this.f4537f.f4848c.mo8631c()) {
                view = (View) this.f4537f.f4848c.mo8628b(i);
                if (view != null) {
                    C0315jm.m4620a(view, false);
                }
                i++;
            }
            for (i = 0; i < this.f4538g.f4848c.mo8631c(); i++) {
                view = (View) this.f4538g.f4848c.mo8628b(i);
                if (view != null) {
                    C0315jm.m4620a(view, false);
                }
            }
            this.f4550v = true;
        }
    }

    /* renamed from: a */
    final C0228fl mo6631a(View view, boolean z) {
        ArrayList arrayList;
        while (true) {
            C0219ex c0219ex = this.f4539h;
            if (c0219ex == null) {
                break;
            }
            this = c0219ex;
        }
        if (z) {
            arrayList = this.f4541j;
        } else {
            arrayList = this.f4542k;
        }
        if (arrayList == null) {
            return null;
        }
        C0228fl c0228fl;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            c0228fl = (C0228fl) arrayList.get(i);
            if (c0228fl != null) {
                if (c0228fl.f4837b == view) {
                    break;
                }
                i++;
            } else {
                return null;
            }
        }
        i = -1;
        if (i >= 0) {
            ArrayList arrayList2;
            if (z) {
                arrayList2 = this.f4542k;
            } else {
                arrayList2 = this.f4541j;
            }
            c0228fl = (C0228fl) arrayList2.get(i);
        } else {
            c0228fl = null;
        }
        return c0228fl;
    }

    /* renamed from: d */
    static C0691ih m2196d() {
        C0691ih c0691ih = (C0691ih) f4531s.get();
        if (c0691ih != null) {
            return c0691ih;
        }
        c0691ih = new C0691ih();
        f4531s.set(c0691ih);
        return c0691ih;
    }

    /* renamed from: a */
    public String[] mo6641a() {
        return null;
    }

    /* renamed from: b */
    public final C0228fl mo6645b(View view, boolean z) {
        C0229fm c0229fm;
        while (true) {
            C0219ex c0219ex = this.f4539h;
            if (c0219ex == null) {
                break;
            }
            this = c0219ex;
        }
        if (z) {
            c0229fm = this.f4537f;
        } else {
            c0229fm = this.f4538g;
        }
        return (C0228fl) c0229fm.f4846a.get(view);
    }

    /* renamed from: a */
    public boolean mo6640a(C0228fl c0228fl, C0228fl c0228fl2) {
        if (c0228fl == null) {
            return false;
        }
        if (c0228fl2 == null) {
            return false;
        }
        String[] a = mo6641a();
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!C0219ex.m2194a(c0228fl, c0228fl2, a[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a2 : c0228fl.f4836a.keySet()) {
            if (C0219ex.m2194a(c0228fl, c0228fl2, a2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    final boolean mo6647b(View view) {
        int id = view.getId();
        if ((this.f4535d.size() == 0 && this.f4536e.size() == 0) || this.f4535d.contains(Integer.valueOf(id)) || this.f4536e.contains(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2194a(C0228fl c0228fl, C0228fl c0228fl2, String str) {
        Object obj = c0228fl.f4836a.get(str);
        Object obj2 = c0228fl2.f4836a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return obj.equals(obj2) ^ 1;
    }

    /* renamed from: c */
    public void mo6649c(View view) {
        if (!this.f4550v) {
            C0691ih d = C0219ex.m2196d();
            int size = d.size();
            C0240ga a = C0231fo.m2402a(view);
            for (int i = size - 1; i >= 0; i--) {
                C0222fa c0222fa = (C0222fa) d.mo9200d(i);
                if (c0222fa.f4625a != null && a.equals(c0222fa.f4628d)) {
                    C0186df.m1644a((Animator) d.mo9195b(i));
                }
            }
            ArrayList arrayList = this.f4551w;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.f4551w.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0224fc) arrayList.get(i2)).mo6737a();
                }
            }
            this.f4549u = true;
        }
    }

    /* renamed from: b */
    public C0219ex mo6644b(C0224fc c0224fc) {
        ArrayList arrayList = this.f4551w;
        if (arrayList != null) {
            arrayList.remove(c0224fc);
            if (this.f4551w.size() == 0) {
                this.f4551w = null;
            }
        }
        return this;
    }

    /* renamed from: d */
    public C0219ex mo6652d(View view) {
        this.f4536e.remove(view);
        return this;
    }

    /* renamed from: e */
    public void mo6654e(View view) {
        if (this.f4549u) {
            if (!this.f4550v) {
                C0691ih d = C0219ex.m2196d();
                int size = d.size();
                C0240ga a = C0231fo.m2402a(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0222fa c0222fa = (C0222fa) d.mo9200d(i);
                    if (c0222fa.f4625a != null && a.equals(c0222fa.f4628d)) {
                        C0186df.m1658b((Animator) d.mo9195b(i));
                    }
                }
                ArrayList arrayList = this.f4551w;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList = (ArrayList) this.f4551w.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0224fc) arrayList.get(i2)).mo6739b();
                    }
                }
            }
            this.f4549u = false;
        }
    }

    /* renamed from: e */
    protected void mo6653e() {
        mo6655f();
        C0691ih d = C0219ex.m2196d();
        ArrayList arrayList = this.f4552x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Animator animator = (Animator) arrayList.get(i);
            if (d.containsKey(animator)) {
                mo6655f();
                if (animator != null) {
                    animator.addListener(new C0220ey(this, d));
                    if (animator == null) {
                        mo6648c();
                        i = i2;
                    } else {
                        long j = this.f4533b;
                        if (j >= 0) {
                            animator.setDuration(j);
                        }
                        j = this.f4532a;
                        if (j >= 0) {
                            animator.setStartDelay(j);
                        }
                        TimeInterpolator timeInterpolator = this.f4534c;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        animator.addListener(new C0221ez(this));
                        animator.start();
                        i = i2;
                    }
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
        }
        this.f4552x.clear();
        mo6648c();
    }

    /* renamed from: a */
    public C0219ex mo6627a(long j) {
        this.f4533b = j;
        return this;
    }

    /* renamed from: a */
    public void mo6637a(C0223fb c0223fb) {
        this.f4545n = c0223fb;
    }

    /* renamed from: a */
    public C0219ex mo6628a(TimeInterpolator timeInterpolator) {
        this.f4534c = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public void mo6636a(C0216eu c0216eu) {
        if (c0216eu == null) {
            this.f4546o = f4530q;
        } else {
            this.f4546o = c0216eu;
        }
    }

    /* renamed from: a */
    public void mo6635a(C0635ax c0635ax) {
        this.f4544m = c0635ax;
    }

    /* renamed from: b */
    public C0219ex mo6643b(long j) {
        this.f4532a = j;
        return this;
    }

    /* renamed from: f */
    protected final void mo6655f() {
        if (this.f4548t == 0) {
            ArrayList arrayList = this.f4551w;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.f4551w.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0224fc) arrayList.get(i)).mo6740c();
                }
            }
            this.f4550v = false;
        }
        this.f4548t++;
    }

    public String toString() {
        return mo6632a("");
    }

    /* renamed from: a */
    String mo6632a(String str) {
        StringBuilder stringBuilder;
        int i = 0;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(getClass().getSimpleName());
        stringBuilder2.append("@");
        stringBuilder2.append(Integer.toHexString(hashCode()));
        stringBuilder2.append(": ");
        String stringBuilder3 = stringBuilder2.toString();
        if (this.f4533b != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("dur(");
            stringBuilder.append(this.f4533b);
            stringBuilder.append(") ");
            stringBuilder3 = stringBuilder.toString();
        }
        if (this.f4532a != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("dly(");
            stringBuilder.append(this.f4532a);
            stringBuilder.append(") ");
            stringBuilder3 = stringBuilder.toString();
        }
        if (this.f4534c != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("interp(");
            stringBuilder.append(this.f4534c);
            stringBuilder.append(") ");
            stringBuilder3 = stringBuilder.toString();
        }
        if (this.f4535d.size() <= 0 && this.f4536e.size() <= 0) {
            return stringBuilder3;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder3);
        stringBuilder.append("tgts(");
        stringBuilder3 = stringBuilder.toString();
        if (this.f4535d.size() > 0) {
            String str2 = stringBuilder3;
            for (int i2 = 0; i2 < this.f4535d.size(); i2++) {
                StringBuilder stringBuilder4;
                if (i2 > 0) {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(str2);
                    stringBuilder4.append(", ");
                    str2 = stringBuilder4.toString();
                }
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append(this.f4535d.get(i2));
                str2 = stringBuilder4.toString();
            }
            stringBuilder3 = str2;
        }
        if (this.f4536e.size() > 0) {
            while (i < this.f4536e.size()) {
                if (i > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder3);
                    stringBuilder.append(", ");
                    stringBuilder3 = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder3);
                stringBuilder.append(this.f4536e.get(i));
                stringBuilder3 = stringBuilder.toString();
                i++;
            }
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder3);
        stringBuilder5.append(")");
        return stringBuilder5.toString();
    }
}
