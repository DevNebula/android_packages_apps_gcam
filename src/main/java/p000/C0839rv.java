package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: rv */
public final class C0839rv extends C0768ve {
    /* renamed from: m */
    private static TimeInterpolator f25454m;
    /* renamed from: a */
    public ArrayList f25455a = new ArrayList();
    /* renamed from: b */
    public ArrayList f25456b = new ArrayList();
    /* renamed from: c */
    public ArrayList f25457c = new ArrayList();
    /* renamed from: d */
    public ArrayList f25458d = new ArrayList();
    /* renamed from: e */
    public ArrayList f25459e = new ArrayList();
    /* renamed from: f */
    public ArrayList f25460f = new ArrayList();
    /* renamed from: g */
    public ArrayList f25461g = new ArrayList();
    /* renamed from: n */
    private ArrayList f25462n = new ArrayList();
    /* renamed from: o */
    private ArrayList f25463o = new ArrayList();
    /* renamed from: p */
    private ArrayList f25464p = new ArrayList();
    /* renamed from: q */
    private ArrayList f25465q = new ArrayList();

    /* renamed from: a */
    public final boolean mo14438a(C0530ux c0530ux) {
        m17126g(c0530ux);
        c0530ux.f9877a.setAlpha(0.0f);
        this.f25463o.add(c0530ux);
        return true;
    }

    /* renamed from: a */
    public final boolean mo14440a(C0530ux c0530ux, C0530ux c0530ux2, int i, int i2, int i3, int i4) {
        if (c0530ux == c0530ux2) {
            return mo14439a(c0530ux, i, i2, i3, i4);
        }
        float translationX = c0530ux.f9877a.getTranslationX();
        float translationY = c0530ux.f9877a.getTranslationY();
        float alpha = c0530ux.f9877a.getAlpha();
        m17126g(c0530ux);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        c0530ux.f9877a.setTranslationX(translationX);
        c0530ux.f9877a.setTranslationY(translationY);
        c0530ux.f9877a.setAlpha(alpha);
        if (c0530ux2 != null) {
            m17126g(c0530ux2);
            c0530ux2.f9877a.setTranslationX((float) (-i5));
            c0530ux2.f9877a.setTranslationY((float) (-i6));
            c0530ux2.f9877a.setAlpha(0.0f);
        }
        this.f25465q.add(new C0472se(c0530ux, c0530ux2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public final boolean mo14439a(C0530ux c0530ux, int i, int i2, int i3, int i4) {
        View view = c0530ux.f9877a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c0530ux.f9877a.getTranslationY());
        m17126g(c0530ux);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo11211f(c0530ux);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f25464p.add(new C0473sf(c0530ux, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: b */
    public final boolean mo14441b(C0530ux c0530ux) {
        m17126g(c0530ux);
        this.f25462n.add(c0530ux);
        return true;
    }

    /* renamed from: a */
    public final boolean mo11200a(C0530ux c0530ux, List list) {
        return !list.isEmpty() || super.mo11200a(c0530ux, list);
    }

    /* renamed from: a */
    private static void m17122a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0530ux) list.get(size)).f9877a.animate().cancel();
        }
    }

    /* renamed from: a */
    final void mo15286a() {
        if (!mo11206c()) {
            mo11209e();
        }
    }

    /* renamed from: c */
    public final void mo11205c(C0530ux c0530ux) {
        int size;
        ArrayList arrayList;
        View view = c0530ux.f9877a;
        view.animate().cancel();
        for (size = this.f25464p.size() - 1; size >= 0; size--) {
            if (((C0473sf) this.f25464p.get(size)).f9704a == c0530ux) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo11211f(c0530ux);
                this.f25464p.remove(size);
            }
        }
        m17123a(this.f25465q, c0530ux);
        if (this.f25462n.remove(c0530ux)) {
            view.setAlpha(1.0f);
            mo11211f(c0530ux);
        }
        if (this.f25463o.remove(c0530ux)) {
            view.setAlpha(1.0f);
            mo11211f(c0530ux);
        }
        for (size = this.f25457c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.f25457c.get(size);
            m17123a(list, c0530ux);
            if (list.isEmpty()) {
                this.f25457c.remove(size);
            }
        }
        for (int size2 = this.f25456b.size() - 1; size2 >= 0; size2--) {
            arrayList = (ArrayList) this.f25456b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((C0473sf) arrayList.get(size3)).f9704a == c0530ux) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo11211f(c0530ux);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f25456b.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.f25455a.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.f25455a.get(size);
            if (arrayList.remove(c0530ux)) {
                view.setAlpha(1.0f);
                mo11211f(c0530ux);
                if (arrayList.isEmpty()) {
                    this.f25455a.remove(size);
                }
            }
        }
        this.f25460f.remove(c0530ux);
        this.f25458d.remove(c0530ux);
        this.f25461g.remove(c0530ux);
        this.f25459e.remove(c0530ux);
        mo15286a();
    }

    /* renamed from: b */
    public final void mo11203b() {
        int size;
        for (size = this.f25464p.size() - 1; size >= 0; size--) {
            C0473sf c0473sf = (C0473sf) this.f25464p.get(size);
            View view = c0473sf.f9704a.f9877a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo11211f(c0473sf.f9704a);
            this.f25464p.remove(size);
        }
        for (size = this.f25462n.size() - 1; size >= 0; size--) {
            mo11211f((C0530ux) this.f25462n.get(size));
            this.f25462n.remove(size);
        }
        for (size = this.f25463o.size() - 1; size >= 0; size--) {
            C0530ux c0530ux = (C0530ux) this.f25463o.get(size);
            c0530ux.f9877a.setAlpha(1.0f);
            mo11211f(c0530ux);
            this.f25463o.remove(size);
        }
        for (size = this.f25465q.size() - 1; size >= 0; size--) {
            m17124a((C0472se) this.f25465q.get(size));
        }
        this.f25465q.clear();
        if (mo11206c()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.f25456b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f25456b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    C0473sf c0473sf2 = (C0473sf) arrayList.get(size3);
                    View view2 = c0473sf2.f9704a.f9877a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo11211f(c0473sf2.f9704a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f25456b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f25455a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f25455a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    C0530ux c0530ux2 = (C0530ux) arrayList.get(size3);
                    c0530ux2.f9877a.setAlpha(1.0f);
                    mo11211f(c0530ux2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f25455a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f25457c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f25457c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    m17124a((C0472se) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.f25457c.remove(arrayList);
                    }
                }
            }
            C0839rv.m17122a(this.f25460f);
            C0839rv.m17122a(this.f25459e);
            C0839rv.m17122a(this.f25458d);
            C0839rv.m17122a(this.f25461g);
            mo11209e();
        }
    }

    /* renamed from: a */
    private final void m17123a(List list, C0530ux c0530ux) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0472se c0472se = (C0472se) list.get(size);
            if (m17125a(c0472se, c0530ux) && c0472se.f9698a == null && c0472se.f9699b == null) {
                list.remove(c0472se);
            }
        }
    }

    /* renamed from: a */
    private final void m17124a(C0472se c0472se) {
        C0530ux c0530ux = c0472se.f9698a;
        if (c0530ux != null) {
            m17125a(c0472se, c0530ux);
        }
        c0530ux = c0472se.f9699b;
        if (c0530ux != null) {
            m17125a(c0472se, c0530ux);
        }
    }

    /* renamed from: a */
    private final boolean m17125a(C0472se c0472se, C0530ux c0530ux) {
        if (c0472se.f9699b == c0530ux) {
            c0472se.f9699b = null;
        } else if (c0472se.f9698a != c0530ux) {
            return false;
        } else {
            c0472se.f9698a = null;
        }
        c0530ux.f9877a.setAlpha(1.0f);
        c0530ux.f9877a.setTranslationX(0.0f);
        c0530ux.f9877a.setTranslationY(0.0f);
        mo11211f(c0530ux);
        return true;
    }

    /* renamed from: c */
    public final boolean mo11206c() {
        return (this.f25463o.isEmpty() && this.f25465q.isEmpty() && this.f25464p.isEmpty() && this.f25462n.isEmpty() && this.f25459e.isEmpty() && this.f25460f.isEmpty() && this.f25458d.isEmpty() && this.f25461g.isEmpty() && this.f25456b.isEmpty() && this.f25455a.isEmpty() && this.f25457c.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    private final void m17126g(C0530ux c0530ux) {
        if (f25454m == null) {
            f25454m = new ValueAnimator().getInterpolator();
        }
        c0530ux.f9877a.animate().setInterpolator(f25454m);
        mo11205c(c0530ux);
    }

    /* renamed from: d */
    public final void mo11208d() {
        int isEmpty = this.f25462n.isEmpty() ^ 1;
        int isEmpty2 = this.f25464p.isEmpty() ^ 1;
        int isEmpty3 = this.f25465q.isEmpty() ^ 1;
        int isEmpty4 = this.f25463o.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            ArrayList arrayList;
            Runnable c0463rw;
            ArrayList arrayList2 = this.f25462n;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                C0530ux c0530ux = (C0530ux) arrayList2.get(i);
                View view = c0530ux.f9877a;
                ViewPropertyAnimator animate = view.animate();
                this.f25460f.add(c0530ux);
                animate.setDuration(this.f9808j).alpha(0.0f).setListener(new C0466rz(this, c0530ux, animate, view)).start();
                i = i2;
            }
            this.f25462n.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f25464p);
                this.f25456b.add(arrayList);
                this.f25464p.clear();
                c0463rw = new C0463rw(this, arrayList);
                if (isEmpty != 0) {
                    C0315jm.m4616a(((C0473sf) arrayList.get(0)).f9704a.f9877a, c0463rw, this.f9808j);
                } else {
                    c0463rw.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f25465q);
                this.f25457c.add(arrayList);
                this.f25465q.clear();
                c0463rw = new C0464rx(this, arrayList);
                if (isEmpty != 0) {
                    C0315jm.m4616a(((C0472se) arrayList.get(0)).f9698a.f9877a, c0463rw, this.f9808j);
                } else {
                    c0463rw.run();
                }
            }
            if (isEmpty4 != 0) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f25463o);
                this.f25455a.add(arrayList3);
                this.f25463o.clear();
                Runnable c0465ry = new C0465ry(this, arrayList3);
                if (isEmpty == 0 && isEmpty2 == 0 && isEmpty3 == 0) {
                    c0465ry.run();
                    return;
                }
                long j;
                long j2;
                long j3;
                if (isEmpty != 0) {
                    j = this.f9808j;
                } else {
                    j = 0;
                }
                if (isEmpty2 != 0) {
                    j2 = this.f9809k;
                } else {
                    j2 = 0;
                }
                if (isEmpty3 != 0) {
                    j3 = this.f9810l;
                } else {
                    j3 = 0;
                }
                C0315jm.m4616a(((C0530ux) arrayList3.get(0)).f9877a, c0465ry, Math.max(j2, j3) + j);
            }
        }
    }
}
