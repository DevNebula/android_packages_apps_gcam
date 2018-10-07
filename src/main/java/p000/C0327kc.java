package p000;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: kc */
public final class C0327kc implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0322jv c0322jv = (C0322jv) ((View) obj).getLayoutParams();
        C0322jv c0322jv2 = (C0322jv) ((View) obj2).getLayoutParams();
        boolean z = c0322jv.f8360a;
        if (z != c0322jv2.f8360a) {
            return !z ? -1 : 1;
        } else {
            return c0322jv.f8364e - c0322jv2.f8364e;
        }
    }
}
