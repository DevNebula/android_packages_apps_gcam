package p000;

import android.content.Context;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bqq */
public final class bqq {
    /* renamed from: a */
    public static final String f1481a = bli.m887a("FaceAnnouncer");
    /* renamed from: b */
    public final Context f1482b;
    /* renamed from: c */
    public final View f1483c;
    /* renamed from: d */
    public final ixz f1484d;
    /* renamed from: e */
    public final int[][] f1485e;
    /* renamed from: f */
    public long f1486f = -1;
    /* renamed from: g */
    public int f1487g = -1;

    public bqq(Context context, View view, ixz ixz) {
        r0 = new int[3][];
        r0[0] = new int[]{R.string.top_left, R.string.top_center, R.string.top_right};
        r0[1] = new int[]{R.string.left, R.string.center, R.string.right};
        r0[2] = new int[]{R.string.bottom_left, R.string.bottom_center, R.string.bottom_right};
        this.f1485e = r0;
        this.f1482b = (Context) jri.m13404b((Object) context);
        this.f1483c = (View) jri.m13404b((Object) view);
        this.f1484d = (ixz) jri.m13404b((Object) ixz);
    }

    /* renamed from: a */
    public static int m967a(int i, int i2, int i3) {
        if (i2 == 0) {
            return 0;
        }
        int i4 = (i * i3) / i2;
        return i4 == i3 ? i4 - 1 : i4;
    }
}
