package p000;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: dq */
public final class C0195dq implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj2;
        float r = C0315jm.m4643r((View) obj);
        float r2 = C0315jm.m4643r(view);
        if (r > r2) {
            return -1;
        }
        if (r < r2) {
            return 1;
        }
        return 0;
    }
}
