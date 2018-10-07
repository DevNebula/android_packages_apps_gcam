package p000;

import android.support.p002v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: sm */
final class C0755sm extends C0521um {
    /* renamed from: a */
    private final /* synthetic */ C0754sk f22292a;

    C0755sm(C0754sk c0754sk) {
        this.f22292a = c0754sk;
    }

    /* renamed from: a */
    public final void mo11286a(RecyclerView recyclerView) {
        boolean z;
        C0754sk c0754sk = this.f22292a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = c0754sk.f22277j.computeVerticalScrollRange();
        int i = c0754sk.f22276i;
        if (computeVerticalScrollRange - i <= 0) {
            z = false;
        } else if (i >= c0754sk.f22268a) {
            z = true;
        } else {
            z = false;
        }
        c0754sk.f22278k = z;
        int computeHorizontalScrollRange = c0754sk.f22277j.computeHorizontalScrollRange();
        int i2 = c0754sk.f22275h;
        if (computeHorizontalScrollRange - i2 <= 0) {
            z = false;
        } else if (i2 >= c0754sk.f22268a) {
            z = true;
        } else {
            z = false;
        }
        c0754sk.f22279l = z;
        z = c0754sk.f22278k;
        if (z || c0754sk.f22279l) {
            float f;
            if (z) {
                f = (float) i;
                c0754sk.f22272e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                c0754sk.f22271d = Math.min(i, (i * i) / computeVerticalScrollRange);
            }
            if (c0754sk.f22279l) {
                f = (float) i2;
                c0754sk.f22274g = (int) ((f * (((float) computeHorizontalScrollOffset) + (f / 2.0f))) / ((float) computeHorizontalScrollRange));
                c0754sk.f22273f = Math.min(i2, (i2 * i2) / computeHorizontalScrollRange);
            }
            int i3 = c0754sk.f22280m;
            if (i3 == 0 || i3 == 1) {
                c0754sk.mo14417a(1);
            }
        } else if (c0754sk.f22280m != 0) {
            c0754sk.mo14417a(0);
        }
    }
}
