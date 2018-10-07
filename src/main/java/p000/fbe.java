package p000;

import android.view.View.OnClickListener;
import java.util.Date;

/* compiled from: PG */
/* renamed from: fbe */
public final class fbe implements Comparable {
    /* renamed from: a */
    public boolean f4661a;
    /* renamed from: b */
    public int f4662b;
    /* renamed from: c */
    public int f4663c;
    /* renamed from: d */
    public Date f4664d;
    /* renamed from: e */
    public OnClickListener f4665e;
    /* renamed from: f */
    public final String f4666f;

    public fbe(String str) {
        this.f4666f = str;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        fbe fbe = (fbe) obj;
        int i = this.f4662b;
        int i2 = fbe.f4662b;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return -this.f4664d.compareTo(fbe.f4664d);
    }
}
