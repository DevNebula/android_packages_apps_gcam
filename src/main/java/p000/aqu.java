package p000;

import android.util.Log;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: aqu */
public final class aqu implements OnPreDrawListener {
    /* renamed from: a */
    private final WeakReference f920a;

    public aqu(aza aza) {
        this.f920a = new WeakReference(aza);
    }

    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            String valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
            stringBuilder.append("OnGlobalLayoutListener called attachStateListener=");
            stringBuilder.append(valueOf);
            Log.v("ViewTarget", stringBuilder.toString());
        }
        aza aza = (aza) this.f920a.get();
        if (!(aza == null || aza.f11067b.isEmpty())) {
            int c = aza.mo12342c();
            int b = aza.mo12341b();
            if (aza.m7262a(c, b)) {
                ArrayList arrayList = new ArrayList(aza.f11067b);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    ((aqr) arrayList.get(i)).mo1717a(c, b);
                    i = i2;
                }
                aza.mo12340a();
            }
        }
        return true;
    }
}
