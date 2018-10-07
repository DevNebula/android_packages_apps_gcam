package p000;

import android.os.Trace;
import android.support.p002v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ss */
public final class C0483ss implements Runnable {
    /* renamed from: a */
    public static final ThreadLocal f9738a = new ThreadLocal();
    /* renamed from: f */
    private static Comparator f9739f = new C0484st();
    /* renamed from: b */
    public ArrayList f9740b = new ArrayList();
    /* renamed from: c */
    public long f9741c;
    /* renamed from: d */
    private long f9742d;
    /* renamed from: e */
    private ArrayList f9743e = new ArrayList();

    /* renamed from: a */
    public final void mo11112a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f9742d == 0) {
            this.f9742d = RecyclerView.m457h();
            recyclerView.post(this);
        }
        C0518uj c0518uj = recyclerView.f726z;
        c0518uj.f9828a = i;
        c0518uj.f9829b = i2;
    }

    /* renamed from: a */
    private static C0530ux m5877a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b = recyclerView.f706f.mo11032b();
        for (int i2 = 0; i2 < b; i2++) {
            C0530ux c = RecyclerView.m453c(recyclerView.f706f.mo11037d(i2));
            if (c.f9879c == i && !c.mo11324h()) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return null;
        }
        C0524up c0524up = recyclerView.f704d;
        try {
            recyclerView.mo1167m();
            C0530ux a = c0524up.mo11289a(i, j);
            if (a != null) {
                if ((a.f9886j & 1) == 0 || a.mo11324h()) {
                    c0524up.mo11293a(a, false);
                } else {
                    c0524up.mo11296b(a.f9877a);
                }
            }
            recyclerView.mo1122a(false);
            return a;
        } catch (Throwable th) {
            recyclerView.mo1122a(false);
        }
    }

    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (this.f9740b.isEmpty()) {
                this.f9742d = 0;
                Trace.endSection();
                return;
            }
            RecyclerView recyclerView;
            int size = this.f9740b.size();
            long j = 0;
            int i = 0;
            while (i < size) {
                long max;
                recyclerView = (RecyclerView) this.f9740b.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    max = Math.max(recyclerView.getDrawingTime(), j);
                } else {
                    max = j;
                }
                i++;
                j = max;
            }
            if (j != 0) {
                int i2;
                int i3;
                long toNanos = TimeUnit.MILLISECONDS.toNanos(j) + this.f9741c;
                int size2 = this.f9740b.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size2) {
                    recyclerView = (RecyclerView) this.f9740b.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        recyclerView.f726z.mo11281a(recyclerView, false);
                        i2 = recyclerView.f726z.f9831d + i4;
                    } else {
                        i2 = i4;
                    }
                    i5++;
                    i4 = i2;
                }
                this.f9743e.ensureCapacity(i4);
                i4 = 0;
                size = 0;
                while (size < size2) {
                    recyclerView = (RecyclerView) this.f9740b.get(size);
                    if (recyclerView.getWindowVisibility() != 0) {
                        i2 = i4;
                    } else {
                        C0518uj c0518uj = recyclerView.f726z;
                        int abs = Math.abs(c0518uj.f9828a) + Math.abs(c0518uj.f9829b);
                        i3 = 0;
                        while (true) {
                            i5 = i4;
                            i4 = c0518uj.f9831d;
                            if (i3 >= i4 + i4) {
                                break;
                            }
                            C0527uu c0527uu;
                            boolean z;
                            if (i5 >= this.f9743e.size()) {
                                c0527uu = new C0527uu();
                                this.f9743e.add(c0527uu);
                            } else {
                                c0527uu = (C0527uu) this.f9743e.get(i5);
                            }
                            int[] iArr = c0518uj.f9830c;
                            int i6 = iArr[i3 + 1];
                            if (i6 <= abs) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c0527uu.f9850a = z;
                            c0527uu.f9851b = abs;
                            c0527uu.f9852c = i6;
                            c0527uu.f9853d = recyclerView;
                            c0527uu.f9854e = iArr[i3];
                            i5++;
                            i4 = i3 + 2;
                        }
                        i2 = i5;
                    }
                    size++;
                    i4 = i2;
                }
                Collections.sort(this.f9743e, f9739f);
                i2 = 0;
                while (true) {
                    i3 = i2;
                    if (i3 >= this.f9743e.size()) {
                        break;
                    }
                    C0527uu c0527uu2 = (C0527uu) this.f9743e.get(i3);
                    RecyclerView recyclerView2 = c0527uu2.f9853d;
                    if (recyclerView2 == null) {
                        break;
                    }
                    long j2;
                    if (c0527uu2.f9850a) {
                        j2 = Long.MAX_VALUE;
                    } else {
                        j2 = toNanos;
                    }
                    C0530ux a = C0483ss.m5877a(recyclerView2, c0527uu2.f9854e, j2);
                    if (!(a == null || a.f9878b == null || (a.f9886j & 1) == 0 || a.mo11324h())) {
                        recyclerView2 = (RecyclerView) a.f9878b.get();
                        if (recyclerView2 == null) {
                            continue;
                        } else {
                            if (recyclerView2.f719s && recyclerView2.f706f.mo11032b() != 0) {
                                recyclerView2.mo1169o();
                            }
                            C0518uj c0518uj2 = recyclerView2.f726z;
                            c0518uj2.mo11281a(recyclerView2, true);
                            if (c0518uj2.f9831d != 0) {
                                Trace.beginSection("RV Nested Prefetch");
                                C0528uv c0528uv = recyclerView2.f662A;
                                C0507tx c0507tx = recyclerView2.f710j;
                                c0528uv.f9858d = 1;
                                c0528uv.f9859e = c0507tx.mo11186a();
                                c0528uv.f9861g = false;
                                c0528uv.f9862h = false;
                                c0528uv.f9863i = false;
                                i5 = 0;
                                while (true) {
                                    size = c0518uj2.f9831d;
                                    if (i5 >= size + size) {
                                        break;
                                    }
                                    C0483ss.m5877a(recyclerView2, c0518uj2.f9830c[i5], toNanos);
                                    i5 += 2;
                                }
                                Trace.endSection();
                            } else {
                                continue;
                            }
                        }
                    }
                    c0527uu2.f9850a = false;
                    c0527uu2.f9851b = 0;
                    c0527uu2.f9852c = 0;
                    c0527uu2.f9853d = null;
                    c0527uu2.f9854e = 0;
                    i2 = i3 + 1;
                }
                this.f9742d = 0;
                Trace.endSection();
                return;
            }
            this.f9742d = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f9742d = 0;
            Trace.endSection();
            throw th;
        }
    }
}
