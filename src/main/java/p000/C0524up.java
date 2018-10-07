package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: up */
public final class C0524up {
    /* renamed from: a */
    public final ArrayList f9842a = new ArrayList();
    /* renamed from: b */
    public ArrayList f9843b = null;
    /* renamed from: c */
    public final ArrayList f9844c = new ArrayList();
    /* renamed from: d */
    public final List f9845d = Collections.unmodifiableList(this.f9842a);
    /* renamed from: e */
    public final /* synthetic */ RecyclerView f9846e;
    /* renamed from: f */
    private int f9847f = 2;
    /* renamed from: g */
    private int f9848g = 2;
    /* renamed from: h */
    private C0522un f9849h;

    public C0524up(RecyclerView recyclerView) {
        this.f9846e = recyclerView;
    }

    /* renamed from: a */
    final void mo11293a(C0530ux c0530ux, boolean z) {
        RecyclerView.m452b(c0530ux);
        if (c0530ux.mo11318b(16384)) {
            c0530ux.mo11312a(0, 16384);
            C0315jm.m4618a(c0530ux.f9877a, null);
        }
        if (z) {
            RecyclerView recyclerView = this.f9846e;
            C0525uq c0525uq = recyclerView.f712l;
            C0507tx c0507tx = recyclerView.f710j;
            if (recyclerView.f662A != null) {
                recyclerView.f707g.mo11480d(c0530ux);
            }
        }
        c0530ux.f9891o = null;
        C0522un b = mo11294b();
        int i = c0530ux.f9882f;
        ArrayList arrayList = b.mo11287a(i).f9838a;
        if (((C0523uo) b.f9836a.get(i)).f9839b > arrayList.size()) {
            c0530ux.mo11331o();
            arrayList.add(c0530ux);
        }
    }

    /* renamed from: a */
    public final void mo11290a() {
        this.f9842a.clear();
        mo11298c();
    }

    /* renamed from: a */
    public final int mo11288a(int i) {
        if (i < 0 || i >= this.f9846e.f662A.mo11304a()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid position ");
            stringBuilder.append(i);
            stringBuilder.append(". State ");
            stringBuilder.append("item count is ");
            stringBuilder.append(this.f9846e.f662A.mo11304a());
            stringBuilder.append(this.f9846e.mo1154g());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        RecyclerView recyclerView = this.f9846e;
        if (recyclerView.f662A.f9861g) {
            return recyclerView.f705e.mo11159a(i, 0);
        }
        return i;
    }

    /* renamed from: b */
    public final C0522un mo11294b() {
        if (this.f9849h == null) {
            this.f9849h = new C0522un();
        }
        return this.f9849h;
    }

    /* renamed from: a */
    final void mo11291a(View view) {
        C0530ux c = RecyclerView.m453c(view);
        c.f9887k = null;
        c.f9888l = false;
        c.mo11319c();
        mo11292a(c);
    }

    /* renamed from: c */
    public final void mo11298c() {
        for (int size = this.f9844c.size() - 1; size >= 0; size--) {
            mo11295b(size);
        }
        this.f9844c.clear();
        if (RecyclerView.f661b) {
            this.f9846e.f726z.mo11279a();
        }
    }

    /* renamed from: b */
    public final void mo11295b(int i) {
        mo11293a((C0530ux) this.f9844c.get(i), true);
        this.f9844c.remove(i);
    }

    /* renamed from: b */
    public final void mo11296b(View view) {
        C0530ux c = RecyclerView.m453c(view);
        if (c.mo11328l()) {
            this.f9846e.removeDetachedView(view, false);
        }
        if (c.mo11327k()) {
            c.mo11333q();
        } else if (c.mo11334r()) {
            c.mo11319c();
        }
        mo11292a(c);
    }

    /* renamed from: a */
    final void mo11292a(C0530ux c0530ux) {
        boolean z = true;
        int i = 0;
        boolean z2;
        StringBuilder stringBuilder;
        if (c0530ux.mo11327k() || c0530ux.f9877a.getParent() != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder2.append(c0530ux.mo11327k());
            stringBuilder2.append(" isAttached:");
            if (c0530ux.f9877a.getParent() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            stringBuilder2.append(z2);
            stringBuilder2.append(this.f9846e.mo1154g());
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (c0530ux.mo11328l()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            stringBuilder.append(c0530ux);
            stringBuilder.append(this.f9846e.mo1154g());
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (c0530ux.mo11332p()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            stringBuilder.append(this.f9846e.mo1154g());
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            boolean z3;
            if ((c0530ux.f9886j & 16) != 0) {
                z3 = false;
            } else if (C0315jm.m4647v(c0530ux.f9877a)) {
                z3 = true;
            } else {
                z3 = false;
            }
            C0507tx c0507tx = this.f9846e.f710j;
            if (c0530ux.mo11325i()) {
                if (this.f9848g <= 0) {
                    z2 = false;
                } else if (c0530ux.mo11318b(526)) {
                    z2 = false;
                } else {
                    int size = this.f9844c.size();
                    if (size >= this.f9848g && size > 0) {
                        mo11295b(0);
                        size--;
                    }
                    if (RecyclerView.f661b && size > 0 && !this.f9846e.f726z.mo11282a(c0530ux.f9879c)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!this.f9846e.f726z.mo11282a(((C0530ux) this.f9844c.get(i2)).f9879c)) {
                                break;
                            }
                            i2--;
                        }
                        size = i2 + 1;
                    }
                    this.f9844c.add(size, c0530ux);
                    z2 = true;
                }
                if (z2) {
                    z = false;
                    boolean i3 = z2;
                } else {
                    mo11293a(c0530ux, true);
                    i3 = z2;
                }
            } else {
                z = false;
            }
            this.f9846e.f707g.mo11480d(c0530ux);
            if (i3 == 0 && !z && z3) {
                c0530ux.f9891o = null;
            }
        }
    }

    /* renamed from: c */
    final void mo11299c(View view) {
        C0530ux c = RecyclerView.m453c(view);
        if (!c.mo11318b(12) && c.mo11329m()) {
            boolean z;
            C0512ub c0512ub = this.f9846e.f724x;
            if (c0512ub == null) {
                z = true;
            } else if (c0512ub.mo11200a(c, c.mo11323g())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f9843b == null) {
                    this.f9843b = new ArrayList();
                }
                c.mo11315a(this, true);
                this.f9843b.add(c);
                return;
            }
        }
        if (!c.mo11324h() || c.mo11326j() || this.f9846e.f710j.f9804b) {
            c.mo11315a(this, false);
            this.f9842a.add(c);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        stringBuilder.append(this.f9846e.mo1154g());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fb  */
    /* renamed from: a */
    final p000.C0530ux mo11289a(int r11, long r12) {
        /*
        r10 = this;
        if (r11 < 0) goto L_0x000c;
    L_0x0002:
        r0 = r10.f9846e;
        r0 = r0.f662A;
        r0 = r0.mo11304a();
        if (r11 < r0) goto L_0x0044;
    L_0x000c:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid item position ";
        r1.append(r2);
        r1.append(r11);
        r2 = "(";
        r1.append(r2);
        r1.append(r11);
        r2 = "). Item count:";
        r1.append(r2);
        r2 = r10.f9846e;
        r2 = r2.f662A;
        r2 = r2.mo11304a();
        r1.append(r2);
        r2 = r10.f9846e;
        r2 = r2.mo1154g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0044:
        r0 = r10.f9846e;
        r0 = r0.f662A;
        r0 = r0.f9861g;
        if (r0 != 0) goto L_0x0511;
    L_0x004c:
        r1 = 0;
        r0 = 0;
    L_0x004e:
        if (r0 == 0) goto L_0x0352;
    L_0x0050:
        if (r0 != 0) goto L_0x034e;
    L_0x0052:
        r2 = r10.f9846e;
        r2 = r2.f705e;
        r3 = 0;
        r3 = r2.mo11159a(r11, r3);
        if (r3 < 0) goto L_0x0067;
    L_0x005d:
        r2 = r10.f9846e;
        r2 = r2.f710j;
        r2 = r2.mo11186a();
        if (r3 < r2) goto L_0x00a4;
    L_0x0067:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Inconsistency detected. Invalid item position ";
        r1.append(r2);
        r1.append(r11);
        r2 = "(offset:";
        r1.append(r2);
        r1.append(r3);
        r2 = ").";
        r1.append(r2);
        r2 = "state:";
        r1.append(r2);
        r2 = r10.f9846e;
        r2 = r2.f662A;
        r2 = r2.mo11304a();
        r1.append(r2);
        r2 = r10.f9846e;
        r2 = r2.mo1154g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00a4:
        r2 = r10.f9846e;
        r2 = r2.f710j;
        r4 = r2.mo11192b(r3);
        r2 = r10.f9846e;
        r2 = r2.f710j;
        r5 = r2.f9804b;
        if (r5 == 0) goto L_0x034b;
    L_0x00b4:
        r6 = r2.mo11187a(r3);
        r0 = r10.f9842a;
        r0 = r0.size();
        r0 = r0 + -1;
        r2 = r0;
    L_0x00c1:
        if (r2 < 0) goto L_0x0317;
    L_0x00c3:
        r0 = r10.f9842a;
        r0 = r0.get(r2);
        r0 = (p000.C0530ux) r0;
        r8 = r0.f9881e;
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 != 0) goto L_0x00d7;
    L_0x00d1:
        r5 = r0.mo11334r();
        if (r5 == 0) goto L_0x00db;
    L_0x00d7:
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x00c1;
    L_0x00db:
        r5 = r0.f9882f;
        if (r4 != r5) goto L_0x0303;
    L_0x00df:
        r2 = 32;
        r0.mo11311a(r2);
        r2 = r0.mo11326j();
        if (r2 == 0) goto L_0x0300;
    L_0x00ea:
        r2 = r10.f9846e;
        r2 = r2.f662A;
        r2 = r2.f9861g;
        if (r2 != 0) goto L_0x02fd;
    L_0x00f2:
        r2 = 2;
        r5 = 14;
        r0.mo11312a(r2, r5);
        r2 = r0;
    L_0x00f9:
        if (r2 == 0) goto L_0x00fe;
    L_0x00fb:
        r2.f9879c = r3;
        r1 = 1;
    L_0x00fe:
        if (r2 != 0) goto L_0x012a;
    L_0x0100:
        r0 = r10.mo11294b();
        r0 = r0.f9836a;
        r0 = r0.get(r4);
        r0 = (p000.C0523uo) r0;
        if (r0 == 0) goto L_0x02fa;
    L_0x010e:
        r2 = r0.f9838a;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x02f7;
    L_0x0116:
        r0 = r0.f9838a;
        r2 = r0.size();
        r2 = r2 + -1;
        r0 = r0.remove(r2);
        r0 = (p000.C0530ux) r0;
        r2 = r0;
    L_0x0125:
        if (r2 == 0) goto L_0x012a;
    L_0x0127:
        r2.mo11331o();
    L_0x012a:
        if (r2 != 0) goto L_0x02f4;
    L_0x012c:
        r6 = android.support.p002v7.widget.RecyclerView.m457h();
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0155;
    L_0x0139:
        r0 = r10.f9849h;
        r0 = r0.mo11287a(r4);
        r2 = r0.f9840c;
        r8 = 0;
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0153;
    L_0x0147:
        r2 = r2 + r6;
        r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r0 < 0) goto L_0x0151;
    L_0x014c:
        r0 = 0;
    L_0x014d:
        if (r0 != 0) goto L_0x0155;
    L_0x014f:
        r0 = 0;
    L_0x0150:
        return r0;
    L_0x0151:
        r0 = 1;
        goto L_0x014d;
    L_0x0153:
        r0 = 1;
        goto L_0x014d;
    L_0x0155:
        r0 = r10.f9846e;
        r2 = r0.f710j;
        r2 = r2.mo11188a(r0, r4);
        r0 = android.support.p002v7.widget.RecyclerView.f661b;
        if (r0 == 0) goto L_0x0170;
    L_0x0161:
        r0 = r2.f9877a;
        r0 = android.support.p002v7.widget.RecyclerView.m451b(r0);
        if (r0 == 0) goto L_0x0170;
    L_0x0169:
        r3 = new java.lang.ref.WeakReference;
        r3.<init>(r0);
        r2.f9878b = r3;
    L_0x0170:
        r8 = android.support.p002v7.widget.RecyclerView.m457h();
        r0 = r10.f9849h;
        r0 = r0.mo11287a(r4);
        r4 = r0.f9840c;
        r6 = r8 - r6;
        r4 = p000.C0522un.m6056a(r4, r6);
        r0.f9840c = r4;
        r3 = r1;
    L_0x0185:
        if (r3 == 0) goto L_0x01ce;
    L_0x0187:
        r0 = r10.f9846e;
        r0 = r0.f662A;
        r0 = r0.f9861g;
        if (r0 != 0) goto L_0x01ce;
    L_0x018f:
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r2.mo11318b(r0);
        if (r0 == 0) goto L_0x01ce;
    L_0x0197:
        r0 = 0;
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2.mo11312a(r0, r1);
        r0 = r10.f9846e;
        r0 = r0.f662A;
        r0 = r0.f9864j;
        if (r0 == 0) goto L_0x01ce;
    L_0x01a5:
        p000.C0512ub.m5960d(r2);
        r0 = r10.f9846e;
        r1 = r0.f724x;
        r0 = r0.f662A;
        r2.mo11323g();
        r0 = p000.C0512ub.m5961f();
        r1 = r2.f9877a;
        r4 = r1.getLeft();
        r0.f9812a = r4;
        r4 = r1.getTop();
        r0.f9813b = r4;
        r1.getRight();
        r1.getBottom();
        r1 = r10.f9846e;
        r1.mo1121a(r2, r0);
    L_0x01ce:
        r0 = r10.f9846e;
        r0 = r0.f662A;
        r0 = r0.f9861g;
        if (r0 == 0) goto L_0x021e;
    L_0x01d6:
        r0 = r2.f9886j;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x021e;
    L_0x01dc:
        r2.f9883g = r11;
        r0 = 0;
        r1 = r0;
    L_0x01e0:
        r0 = r2.f9877a;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x0205;
    L_0x01e8:
        r0 = r10.f9846e;
        r0 = r0.generateDefaultLayoutParams();
        r0 = (p000.C0519uk) r0;
        r4 = r2.f9877a;
        r4.setLayoutParams(r0);
    L_0x01f5:
        r0.f9832c = r2;
        if (r3 != 0) goto L_0x01ff;
    L_0x01f9:
        r1 = 0;
    L_0x01fa:
        r0.f9835f = r1;
        r0 = r2;
        goto L_0x0150;
    L_0x01ff:
        if (r1 == 0) goto L_0x0203;
    L_0x0201:
        r1 = 1;
        goto L_0x01fa;
    L_0x0203:
        r1 = 0;
        goto L_0x01fa;
    L_0x0205:
        r4 = r10.f9846e;
        r4 = r4.checkLayoutParams(r0);
        if (r4 != 0) goto L_0x021b;
    L_0x020d:
        r4 = r10.f9846e;
        r0 = r4.generateLayoutParams(r0);
        r0 = (p000.C0519uk) r0;
        r4 = r2.f9877a;
        r4.setLayoutParams(r0);
        goto L_0x01f5;
    L_0x021b:
        r0 = (p000.C0519uk) r0;
        goto L_0x01f5;
    L_0x021e:
        r0 = r2.f9886j;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x0233;
    L_0x0224:
        r0 = r2.mo11330n();
        if (r0 != 0) goto L_0x0233;
    L_0x022a:
        r0 = r2.mo11324h();
        if (r0 != 0) goto L_0x0233;
    L_0x0230:
        r0 = 0;
        r1 = r0;
        goto L_0x01e0;
    L_0x0233:
        r0 = r10.f9846e;
        r0 = r0.f705e;
        r1 = 0;
        r1 = r0.mo11159a(r11, r1);
        r0 = r10.f9846e;
        r2.f9891o = r0;
        r0 = r2.f9882f;
        r4 = android.support.p002v7.widget.RecyclerView.m457h();
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r6 == 0) goto L_0x0265;
    L_0x024f:
        r6 = r10.f9849h;
        r0 = r6.mo11287a(r0);
        r6 = r0.f9841d;
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x02f1;
    L_0x025d:
        r6 = r6 + r4;
        r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r0 < 0) goto L_0x02ee;
    L_0x0262:
        r0 = 0;
    L_0x0263:
        if (r0 == 0) goto L_0x02ea;
    L_0x0265:
        r0 = r10.f9846e;
        r0 = r0.f710j;
        r2.f9879c = r1;
        r6 = r0.f9804b;
        if (r6 == 0) goto L_0x0275;
    L_0x026f:
        r6 = r0.mo11187a(r1);
        r2.f9881e = r6;
    L_0x0275:
        r6 = 1;
        r7 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r2.mo11312a(r6, r7);
        r6 = "RV OnBindView";
        android.os.Trace.beginSection(r6);
        r2.mo11323g();
        r0.mo11191a(r2, r1);
        r2.mo11317b();
        r0 = r2.f9877a;
        r0 = r0.getLayoutParams();
        r1 = r0 instanceof p000.C0519uk;
        if (r1 == 0) goto L_0x0298;
    L_0x0293:
        r0 = (p000.C0519uk) r0;
        r1 = 1;
        r0.f9834e = r1;
    L_0x0298:
        android.os.Trace.endSection();
        r0 = android.support.p002v7.widget.RecyclerView.m457h();
        r6 = r10.f9849h;
        r7 = r2.f9882f;
        r6 = r6.mo11287a(r7);
        r8 = r6.f9841d;
        r0 = r0 - r4;
        r0 = p000.C0522un.m6056a(r8, r0);
        r6.f9841d = r0;
        r0 = r10.f9846e;
        r0 = r0.mo1165k();
        if (r0 == 0) goto L_0x02d8;
    L_0x02b8:
        r0 = r2.f9877a;
        r1 = p000.C0315jm.m4633h(r0);
        if (r1 != 0) goto L_0x02c4;
    L_0x02c0:
        r1 = 1;
        p000.C0315jm.m4627c(r0, r1);
    L_0x02c4:
        r1 = p000.C0315jm.m4644s(r0);
        if (r1 != 0) goto L_0x02d8;
    L_0x02ca:
        r1 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r2.mo11311a(r1);
        r1 = r10.f9846e;
        r1 = r1.f667F;
        r1 = r1.f22344d;
        p000.C0315jm.m4618a(r0, r1);
    L_0x02d8:
        r0 = r10.f9846e;
        r0 = r0.f662A;
        r0 = r0.f9861g;
        if (r0 == 0) goto L_0x02e6;
    L_0x02e0:
        r2.f9883g = r11;
        r0 = 1;
        r1 = r0;
        goto L_0x01e0;
    L_0x02e6:
        r0 = 1;
        r1 = r0;
        goto L_0x01e0;
    L_0x02ea:
        r0 = 0;
        r1 = r0;
        goto L_0x01e0;
    L_0x02ee:
        r0 = 1;
        goto L_0x0263;
    L_0x02f1:
        r0 = 1;
        goto L_0x0263;
    L_0x02f4:
        r3 = r1;
        goto L_0x0185;
    L_0x02f7:
        r2 = 0;
        goto L_0x0125;
    L_0x02fa:
        r2 = 0;
        goto L_0x0125;
    L_0x02fd:
        r2 = r0;
        goto L_0x00f9;
    L_0x0300:
        r2 = r0;
        goto L_0x00f9;
    L_0x0303:
        r5 = r10.f9842a;
        r5.remove(r2);
        r5 = r10.f9846e;
        r8 = r0.f9877a;
        r9 = 0;
        r5.removeDetachedView(r8, r9);
        r0 = r0.f9877a;
        r10.mo11291a(r0);
        goto L_0x00d7;
    L_0x0317:
        r0 = r10.f9844c;
        r0 = r0.size();
        r0 = r0 + -1;
        r2 = r0;
    L_0x0320:
        if (r2 < 0) goto L_0x0347;
    L_0x0322:
        r0 = r10.f9844c;
        r0 = r0.get(r2);
        r0 = (p000.C0530ux) r0;
        r8 = r0.f9881e;
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 == 0) goto L_0x0334;
    L_0x0330:
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x0320;
    L_0x0334:
        r5 = r0.f9882f;
        if (r4 != r5) goto L_0x0340;
    L_0x0338:
        r5 = r10.f9844c;
        r5.remove(r2);
        r2 = r0;
        goto L_0x00f9;
    L_0x0340:
        r10.mo11295b(r2);
        r0 = 0;
        r2 = r0;
        goto L_0x00f9;
    L_0x0347:
        r0 = 0;
        r2 = r0;
        goto L_0x00f9;
    L_0x034b:
        r2 = r0;
        goto L_0x00fe;
    L_0x034e:
        r3 = r1;
        r2 = r0;
        goto L_0x0185;
    L_0x0352:
        r0 = r10.f9842a;
        r3 = r0.size();
        r0 = 0;
        r2 = r0;
    L_0x035a:
        if (r2 >= r3) goto L_0x0427;
    L_0x035c:
        r0 = r10.f9842a;
        r0 = r0.get(r2);
        r0 = (p000.C0530ux) r0;
        r4 = r0.mo11334r();
        if (r4 != 0) goto L_0x0422;
    L_0x036a:
        r4 = r0.mo11322f();
        if (r4 != r11) goto L_0x0422;
    L_0x0370:
        r4 = r0.mo11324h();
        if (r4 != 0) goto L_0x0422;
    L_0x0376:
        r4 = r10.f9846e;
        r4 = r4.f662A;
        r4 = r4.f9861g;
        if (r4 != 0) goto L_0x0384;
    L_0x037e:
        r4 = r0.mo11326j();
        if (r4 != 0) goto L_0x0422;
    L_0x0384:
        r2 = 32;
        r0.mo11311a(r2);
    L_0x0389:
        if (r0 == 0) goto L_0x0050;
    L_0x038b:
        r2 = r0.mo11326j();
        if (r2 == 0) goto L_0x03c1;
    L_0x0391:
        r2 = r10.f9846e;
        r2 = r2.f662A;
        r2 = r2.f9861g;
    L_0x0397:
        if (r2 != 0) goto L_0x03be;
    L_0x0399:
        r2 = 4;
        r0.mo11311a(r2);
        r2 = r0.mo11327k();
        if (r2 == 0) goto L_0x03b4;
    L_0x03a3:
        r2 = r10.f9846e;
        r3 = r0.f9877a;
        r4 = 0;
        r2.removeDetachedView(r3, r4);
        r0.mo11333q();
    L_0x03ae:
        r10.mo11292a(r0);
        r0 = 0;
        goto L_0x0050;
    L_0x03b4:
        r2 = r0.mo11334r();
        if (r2 == 0) goto L_0x03ae;
    L_0x03ba:
        r0.mo11319c();
        goto L_0x03ae;
    L_0x03be:
        r1 = 1;
        goto L_0x0050;
    L_0x03c1:
        r2 = r0.f9879c;
        if (r2 < 0) goto L_0x03cf;
    L_0x03c5:
        r3 = r10.f9846e;
        r3 = r3.f710j;
        r3 = r3.mo11186a();
        if (r2 < r3) goto L_0x03ef;
    L_0x03cf:
        r1 = new java.lang.IndexOutOfBoundsException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Inconsistency detected. Invalid view holder adapter position";
        r2.append(r3);
        r2.append(r0);
        r0 = r10.f9846e;
        r0 = r0.mo1154g();
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x03ef:
        r2 = r10.f9846e;
        r3 = r2.f662A;
        r3 = r3.f9861g;
        if (r3 != 0) goto L_0x0403;
    L_0x03f7:
        r2 = r2.f710j;
        r3 = r0.f9879c;
        r2 = r2.mo11192b(r3);
        r3 = r0.f9882f;
        if (r2 != r3) goto L_0x041f;
    L_0x0403:
        r2 = r10.f9846e;
        r2 = r2.f710j;
        r3 = r2.f9804b;
        if (r3 != 0) goto L_0x040d;
    L_0x040b:
        r2 = 1;
        goto L_0x0397;
    L_0x040d:
        r4 = r0.f9881e;
        r3 = r0.f9879c;
        r2 = r2.mo11187a(r3);
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x041c;
    L_0x0419:
        r2 = 0;
        goto L_0x0397;
    L_0x041c:
        r2 = 1;
        goto L_0x0397;
    L_0x041f:
        r2 = 0;
        goto L_0x0397;
    L_0x0422:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x035a;
    L_0x0427:
        r0 = r10.f9846e;
        r3 = r0.f706f;
        r0 = r3.f9649c;
        r4 = r0.size();
        r0 = 0;
        r2 = r0;
    L_0x0433:
        if (r2 >= r4) goto L_0x0457;
    L_0x0435:
        r0 = r3.f9649c;
        r0 = r0.get(r2);
        r0 = (android.view.View) r0;
        r5 = android.support.p002v7.widget.RecyclerView.m453c(r0);
        r6 = r5.mo11322f();
        if (r6 != r11) goto L_0x0453;
    L_0x0447:
        r6 = r5.mo11324h();
        if (r6 != 0) goto L_0x0453;
    L_0x044d:
        r5 = r5.mo11326j();
        if (r5 == 0) goto L_0x0458;
    L_0x0453:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0433;
    L_0x0457:
        r0 = 0;
    L_0x0458:
        if (r0 != 0) goto L_0x0486;
    L_0x045a:
        r0 = r10.f9844c;
        r3 = r0.size();
        r0 = 0;
        r2 = r0;
    L_0x0462:
        if (r2 >= r3) goto L_0x0483;
    L_0x0464:
        r0 = r10.f9844c;
        r0 = r0.get(r2);
        r0 = (p000.C0530ux) r0;
        r4 = r0.mo11324h();
        if (r4 != 0) goto L_0x047f;
    L_0x0472:
        r4 = r0.mo11322f();
        if (r4 != r11) goto L_0x047f;
    L_0x0478:
        r3 = r10.f9844c;
        r3.remove(r2);
        goto L_0x0389;
    L_0x047f:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0462;
    L_0x0483:
        r0 = 0;
        goto L_0x0389;
    L_0x0486:
        r2 = android.support.p002v7.widget.RecyclerView.m453c(r0);
        r3 = r10.f9846e;
        r3 = r3.f706f;
        r4 = r3.f9647a;
        r4 = r4.mo11047a(r0);
        if (r4 >= 0) goto L_0x04ad;
    L_0x0496:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "view is not a child, cannot hide ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x04ad:
        r5 = r3.f9648b;
        r5 = r5.mo11043c(r4);
        if (r5 != 0) goto L_0x04cc;
    L_0x04b5:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "trying to unhide a view that was not hidden";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x04cc:
        r5 = r3.f9648b;
        r5.mo11040a(r4);
        r3.mo11038d(r0);
        r3 = r10.f9846e;
        r3 = r3.f706f;
        r3 = r3.mo11033b(r0);
        r4 = -1;
        if (r3 != r4) goto L_0x04ff;
    L_0x04df:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = "layout index should not be -1 after unhiding a view:";
        r1.append(r3);
        r1.append(r2);
        r2 = r10.f9846e;
        r2 = r2.mo1154g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x04ff:
        r4 = r10.f9846e;
        r4 = r4.f706f;
        r4.mo11028a(r3);
        r10.mo11299c(r0);
        r0 = 8224; // 0x2020 float:1.1524E-41 double:4.063E-320;
        r2.mo11311a(r0);
        r0 = r2;
        goto L_0x0389;
    L_0x0511:
        r0 = r10.f9843b;
        if (r0 == 0) goto L_0x0593;
    L_0x0515:
        r2 = r0.size();
        if (r2 == 0) goto L_0x0591;
    L_0x051b:
        r0 = 0;
        r1 = r0;
    L_0x051d:
        if (r1 >= r2) goto L_0x0544;
    L_0x051f:
        r0 = r10.f9843b;
        r0 = r0.get(r1);
        r0 = (p000.C0530ux) r0;
        r3 = r0.mo11334r();
        if (r3 != 0) goto L_0x0540;
    L_0x052d:
        r3 = r0.mo11322f();
        if (r3 != r11) goto L_0x0540;
    L_0x0533:
        r1 = 32;
        r0.mo11311a(r1);
    L_0x0538:
        if (r0 == 0) goto L_0x053d;
    L_0x053a:
        r1 = 1;
        goto L_0x004e;
    L_0x053d:
        r1 = 0;
        goto L_0x004e;
    L_0x0540:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x051d;
    L_0x0544:
        r0 = r10.f9846e;
        r1 = r0.f710j;
        r1 = r1.f9804b;
        if (r1 == 0) goto L_0x058f;
    L_0x054c:
        r0 = r0.f705e;
        r1 = 0;
        r0 = r0.mo11159a(r11, r1);
        if (r0 <= 0) goto L_0x058d;
    L_0x0555:
        r1 = r10.f9846e;
        r1 = r1.f710j;
        r1 = r1.mo11186a();
        if (r0 >= r1) goto L_0x058b;
    L_0x055f:
        r1 = r10.f9846e;
        r1 = r1.f710j;
        r4 = r1.mo11187a(r0);
        r0 = 0;
        r1 = r0;
    L_0x0569:
        if (r1 >= r2) goto L_0x0589;
    L_0x056b:
        r0 = r10.f9843b;
        r0 = r0.get(r1);
        r0 = (p000.C0530ux) r0;
        r3 = r0.mo11334r();
        if (r3 == 0) goto L_0x057d;
    L_0x0579:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0569;
    L_0x057d:
        r6 = r0.f9881e;
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x0579;
    L_0x0583:
        r1 = 32;
        r0.mo11311a(r1);
        goto L_0x0538;
    L_0x0589:
        r0 = 0;
        goto L_0x0538;
    L_0x058b:
        r0 = 0;
        goto L_0x0538;
    L_0x058d:
        r0 = 0;
        goto L_0x0538;
    L_0x058f:
        r0 = 0;
        goto L_0x0538;
    L_0x0591:
        r0 = 0;
        goto L_0x0538;
    L_0x0593:
        r0 = 0;
        goto L_0x0538;
        */
        throw new UnsupportedOperationException("Method not decompiled: up.a(int, long):ux");
    }

    /* renamed from: b */
    public final void mo11297b(C0530ux c0530ux) {
        if (c0530ux.f9888l) {
            this.f9843b.remove(c0530ux);
        } else {
            this.f9842a.remove(c0530ux);
        }
        c0530ux.f9887k = null;
        c0530ux.f9888l = false;
        c0530ux.mo11319c();
    }

    /* renamed from: d */
    public final void mo11300d() {
        int i;
        C0517ug c0517ug = this.f9846e.f711k;
        if (c0517ug != null) {
            i = c0517ug.f9822l;
        } else {
            i = 0;
        }
        this.f9848g = i + this.f9847f;
        for (i = this.f9844c.size() - 1; i >= 0 && this.f9844c.size() > this.f9848g; i--) {
            mo11295b(i);
        }
    }
}
