package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: eze */
public final class eze implements ezi {
    /* renamed from: a */
    public final String mo6686a() {
        return "crop region";
    }

    /* renamed from: a */
    public final boolean mo6687a(gid gid, gid gid2) {
        Rect rect = gid.f19192i;
        Rect rect2 = gid2.f19192i;
        if (rect == null || rect2 == null || ((float) Math.hypot((double) (rect.width() - rect2.width()), (double) (rect.height() - rect2.height()))) > 1.0E-6f) {
            return true;
        }
        return false;
    }
}
