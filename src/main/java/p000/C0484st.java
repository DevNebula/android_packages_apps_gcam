package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: st */
final class C0484st implements Comparator {
    C0484st() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C0527uu c0527uu = (C0527uu) obj;
        C0527uu c0527uu2 = (C0527uu) obj2;
        RecyclerView recyclerView = c0527uu.f9853d;
        if (recyclerView != null) {
            i = 0;
        } else {
            i = 1;
        }
        if (c0527uu2.f9853d != null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i == i2) {
            boolean z = c0527uu.f9850a;
            if (z == c0527uu2.f9850a) {
                int i3 = c0527uu2.f9851b - c0527uu.f9851b;
                if (i3 != 0) {
                    return i3;
                }
                i3 = c0527uu.f9852c - c0527uu2.f9852c;
                if (i3 == 0) {
                    return 0;
                }
                return i3;
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        } else if (recyclerView == null) {
            return 1;
        } else {
            return -1;
        }
    }
}
