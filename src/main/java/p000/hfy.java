package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: hfy */
public final class hfy implements OnScrollListener {
    /* renamed from: a */
    private static final String f6546a = bli.m887a("Preloader");
    /* renamed from: b */
    private final int f6547b;
    /* renamed from: c */
    private int f6548c = -1;
    /* renamed from: d */
    private int f6549d;
    /* renamed from: e */
    private final int f6550e;
    /* renamed from: f */
    private hfz f6551f;
    /* renamed from: g */
    private hfz f6552g;
    /* renamed from: h */
    private Queue f6553h = new LinkedBlockingQueue();
    /* renamed from: i */
    private int f6554i;
    /* renamed from: j */
    private boolean f6555j = false;

    public hfy(hfz hfz, hfz hfz2) {
        this.f6551f = hfz;
        this.f6552g = hfz2;
        this.f6550e = 5;
        this.f6547b = 6;
    }

    /* renamed from: a */
    public final void mo7810a() {
        for (List a : this.f6553h) {
            this.f6552g.mo7824a(a);
        }
        this.f6553h.clear();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = this.f6555j;
        int i4 = this.f6554i;
        if (i > i4) {
            this.f6555j = true;
            i4 = i;
        } else if (i >= i4) {
            i4 = -1;
        } else {
            this.f6555j = false;
            i4 = i;
        }
        if (z != this.f6555j) {
            mo7810a();
        }
        if (i4 != -1) {
            int max;
            int min;
            boolean z2 = this.f6555j;
            if (z2) {
                max = Math.max(i4, this.f6548c);
                min = Math.min(this.f6550e + i4, this.f6551f.mo7832c());
            } else {
                max = Math.max(0, i4 - this.f6550e);
                min = Math.min(i4, this.f6549d);
            }
            String str = f6546a;
            StringBuilder stringBuilder = new StringBuilder(76);
            stringBuilder.append("preload first=");
            stringBuilder.append(i4);
            stringBuilder.append(" increasing=");
            stringBuilder.append(z2);
            stringBuilder.append(" start=");
            stringBuilder.append(max);
            stringBuilder.append(" end=");
            stringBuilder.append(min);
            bli.m896d(str, stringBuilder.toString());
            this.f6548c = min;
            this.f6549d = max;
            if (!(max == 0 && min == 0)) {
                List a = this.f6551f.mo7817a(max, min);
                if (!z2) {
                    Collections.reverse(a);
                }
                this.f6553h.offer(this.f6552g.mo7828b(a));
                if (this.f6553h.size() > this.f6547b) {
                    a = (List) this.f6553h.poll();
                    if (a != null) {
                        this.f6552g.mo7824a(a);
                    }
                }
            }
        }
        this.f6554i = i;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
