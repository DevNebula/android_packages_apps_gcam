package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: uj */
public final class C0518uj {
    /* renamed from: a */
    public int f9828a;
    /* renamed from: b */
    public int f9829b;
    /* renamed from: c */
    public int[] f9830c;
    /* renamed from: d */
    public int f9831d;

    /* renamed from: a */
    public final void mo11280a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        } else {
            int i3 = this.f9831d;
            i3 += i3;
            Object obj = this.f9830c;
            if (obj == null) {
                this.f9830c = new int[4];
                Arrays.fill(this.f9830c, -1);
            } else {
                int length = obj.length;
                if (i3 >= length) {
                    this.f9830c = new int[(i3 + i3)];
                    System.arraycopy(obj, 0, this.f9830c, 0, length);
                }
            }
            int[] iArr = this.f9830c;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
            this.f9831d++;
        }
    }

    /* renamed from: a */
    final void mo11279a() {
        int[] iArr = this.f9830c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f9831d = 0;
    }

    /* renamed from: a */
    final void mo11281a(RecyclerView recyclerView, boolean z) {
        this.f9831d = 0;
        int[] iArr = this.f9830c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C0517ug c0517ug = recyclerView.f711k;
        if (recyclerView.f710j != null && c0517ug != null && c0517ug.f9821k) {
            if (z) {
                if (!recyclerView.f705e.mo11165b()) {
                    c0517ug.mo11223a(recyclerView.f710j.mo11186a(), this);
                }
            } else if (!recyclerView.mo1164j()) {
                c0517ug.mo11222a(this.f9828a, this.f9829b, recyclerView.f662A, this);
            }
            int i = this.f9831d;
            if (i > c0517ug.f9822l) {
                c0517ug.f9822l = i;
                c0517ug.f9823m = z;
                recyclerView.f704d.mo11300d();
            }
        }
    }

    /* renamed from: a */
    final boolean mo11282a(int i) {
        if (this.f9830c == null) {
            return false;
        }
        int i2 = this.f9831d;
        int i3 = i2 + i2;
        for (i2 = 0; i2 < i3; i2 += 2) {
            if (this.f9830c[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
