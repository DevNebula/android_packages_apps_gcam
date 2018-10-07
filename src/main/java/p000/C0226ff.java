package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ff */
final class C0226ff implements OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: a */
    public ViewGroup f4750a;
    /* renamed from: b */
    private C0219ex f4751b;

    C0226ff(C0219ex c0219ex, ViewGroup viewGroup) {
        this.f4751b = c0219ex;
        this.f4750a = viewGroup;
    }

    public final boolean onPreDraw() {
        m2321a();
        if (!C0225fe.f4723b.remove(this.f4750a)) {
            return true;
        }
        ArrayList arrayList;
        int size;
        int i;
        C0691ih a = C0225fe.m2316a();
        ArrayList arrayList2 = (ArrayList) a.get(this.f4750a);
        if (arrayList2 == null) {
            arrayList = new ArrayList();
            a.put(this.f4750a, arrayList);
            arrayList2 = arrayList;
            arrayList = null;
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.add(this.f4751b);
        this.f4751b.mo6630a(new C0814fg(this, a));
        this.f4751b.mo6634a(this.f4750a, false);
        if (arrayList != null) {
            size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                i = i2 + 1;
                ((C0219ex) arrayList.get(i2)).mo6654e(this.f4750a);
                i2 = i;
            }
        }
        C0219ex c0219ex = this.f4751b;
        View view = this.f4750a;
        c0219ex.f4541j = new ArrayList();
        c0219ex.f4542k = new ArrayList();
        C0229fm c0229fm = c0219ex.f4537f;
        C0229fm c0229fm2 = c0219ex.f4538g;
        C0691ih c0691ih = new C0691ih(c0229fm.f4846a);
        C0691ih c0691ih2 = new C0691ih(c0229fm2.f4846a);
        i = 0;
        while (true) {
            int i3 = i;
            int[] iArr = c0219ex.f4540i;
            int size2;
            C0228fl c0228fl;
            if (i3 < iArr.length) {
                View view2;
                View view3;
                int size3;
                int i4;
                C0228fl c0228fl2;
                C0228fl c0228fl3;
                switch (iArr[i3]) {
                    case 1:
                        for (size2 = c0691ih.size() - 1; size2 >= 0; size2--) {
                            view2 = (View) c0691ih.mo9195b(size2);
                            if (view2 != null && c0219ex.mo6647b(view2)) {
                                c0228fl = (C0228fl) c0691ih2.remove(view2);
                                if (c0228fl != null) {
                                    view3 = c0228fl.f4837b;
                                    if (view3 != null && c0219ex.mo6647b(view3)) {
                                        c0219ex.f4541j.add((C0228fl) c0691ih.mo9196c(size2));
                                        c0219ex.f4542k.add(c0228fl);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        C0691ih c0691ih3 = c0229fm.f4849d;
                        C0691ih c0691ih4 = c0229fm2.f4849d;
                        size3 = c0691ih3.size();
                        i = 0;
                        while (true) {
                            i4 = i;
                            if (i4 >= size3) {
                                break;
                            }
                            view2 = (View) c0691ih3.mo9200d(i4);
                            if (view2 != null && c0219ex.mo6647b(view2)) {
                                view3 = (View) c0691ih4.get(c0691ih3.mo9195b(i4));
                                if (view3 != null && c0219ex.mo6647b(view3)) {
                                    c0228fl2 = (C0228fl) c0691ih.get(view2);
                                    c0228fl3 = (C0228fl) c0691ih2.get(view3);
                                    if (!(c0228fl2 == null || c0228fl3 == null)) {
                                        c0219ex.f4541j.add(c0228fl2);
                                        c0219ex.f4542k.add(c0228fl3);
                                        c0691ih.remove(view2);
                                        c0691ih2.remove(view3);
                                    }
                                }
                            }
                            i = i4 + 1;
                        }
                    case 3:
                        SparseArray sparseArray = c0229fm.f4847b;
                        SparseArray sparseArray2 = c0229fm2.f4847b;
                        size3 = sparseArray.size();
                        i = 0;
                        while (true) {
                            i4 = i;
                            if (i4 >= size3) {
                                break;
                            }
                            view2 = (View) sparseArray.valueAt(i4);
                            if (view2 != null && c0219ex.mo6647b(view2)) {
                                view3 = (View) sparseArray2.get(sparseArray.keyAt(i4));
                                if (view3 != null && c0219ex.mo6647b(view3)) {
                                    c0228fl2 = (C0228fl) c0691ih.get(view2);
                                    c0228fl3 = (C0228fl) c0691ih2.get(view3);
                                    if (!(c0228fl2 == null || c0228fl3 == null)) {
                                        c0219ex.f4541j.add(c0228fl2);
                                        c0219ex.f4542k.add(c0228fl3);
                                        c0691ih.remove(view2);
                                        c0691ih2.remove(view3);
                                    }
                                }
                            }
                            i = i4 + 1;
                        }
                    case 4:
                        C0291in c0291in = c0229fm.f4848c;
                        C0291in c0291in2 = c0229fm2.f4848c;
                        size3 = c0291in.mo8631c();
                        i = 0;
                        while (true) {
                            i4 = i;
                            if (i4 >= size3) {
                                break;
                            }
                            View view4 = (View) c0291in.mo8628b(i4);
                            if (view4 != null && c0219ex.mo6647b(view4)) {
                                Object obj;
                                i = C0289il.m3868a(c0291in2.f7485c, c0291in2.f7487e, c0291in.mo8624a(i4));
                                if (i < 0) {
                                    obj = null;
                                } else if (c0291in2.f7486d[i] != C0291in.f7483a) {
                                    obj = c0291in2.f7486d[i];
                                } else {
                                    obj = null;
                                }
                                view2 = (View) obj;
                                if (view2 != null && c0219ex.mo6647b(view2)) {
                                    C0228fl c0228fl4 = (C0228fl) c0691ih.get(view4);
                                    c0228fl2 = (C0228fl) c0691ih2.get(view2);
                                    if (!(c0228fl4 == null || c0228fl2 == null)) {
                                        c0219ex.f4541j.add(c0228fl4);
                                        c0219ex.f4542k.add(c0228fl2);
                                        c0691ih.remove(view4);
                                        c0691ih2.remove(view2);
                                    }
                                }
                            }
                            i = i4 + 1;
                        }
                    default:
                        break;
                }
                i = i3 + 1;
            } else {
                i = 0;
                while (true) {
                    size = i;
                    if (size < c0691ih.size()) {
                        c0228fl = (C0228fl) c0691ih.mo9200d(size);
                        if (c0219ex.mo6647b(c0228fl.f4837b)) {
                            c0219ex.f4541j.add(c0228fl);
                            c0219ex.f4542k.add(null);
                        }
                        i = size + 1;
                    } else {
                        i = 0;
                        while (true) {
                            size = i;
                            if (size < c0691ih2.size()) {
                                c0228fl = (C0228fl) c0691ih2.mo9200d(size);
                                if (c0219ex.mo6647b(c0228fl.f4837b)) {
                                    c0219ex.f4542k.add(c0228fl);
                                    c0219ex.f4541j.add(null);
                                }
                                i = size + 1;
                            } else {
                                C0691ih d = C0219ex.m2196d();
                                i = d.size();
                                C0240ga a2 = C0231fo.m2402a(view);
                                for (size2 = i - 1; size2 >= 0; size2--) {
                                    Animator animator = (Animator) d.mo9195b(size2);
                                    if (animator != null) {
                                        C0222fa c0222fa = (C0222fa) d.get(animator);
                                        if (!(c0222fa == null || c0222fa.f4625a == null || !a2.equals(c0222fa.f4628d))) {
                                            Object obj2;
                                            C0228fl c0228fl5 = c0222fa.f4627c;
                                            View view5 = c0222fa.f4625a;
                                            C0228fl b = c0219ex.mo6645b(view5, true);
                                            C0228fl a3 = c0219ex.mo6631a(view5, true);
                                            if (b == null && a3 == null) {
                                                obj2 = null;
                                            } else if (c0222fa.f4629e.mo6640a(c0228fl5, a3)) {
                                                obj2 = 1;
                                            } else {
                                                obj2 = null;
                                            }
                                            if (obj2 != null) {
                                                if (animator.isRunning() || animator.isStarted()) {
                                                    animator.cancel();
                                                } else {
                                                    d.remove(animator);
                                                }
                                            }
                                        }
                                    }
                                }
                                c0219ex.mo6633a(view, c0219ex.f4537f, c0219ex.f4538g, c0219ex.f4541j, c0219ex.f4542k);
                                c0219ex.mo6653e();
                                return true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        m2321a();
        C0225fe.f4723b.remove(this.f4750a);
        ArrayList arrayList = (ArrayList) C0225fe.m2316a().get(this.f4750a);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((C0219ex) arrayList.get(i)).mo6654e(this.f4750a);
                i = i2;
            }
        }
        this.f4751b.mo6639a(true);
    }

    /* renamed from: a */
    private final void m2321a() {
        this.f4750a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f4750a.removeOnAttachStateChangeListener(this);
    }
}
