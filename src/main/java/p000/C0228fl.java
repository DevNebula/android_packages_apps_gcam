package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fl */
public final class C0228fl {
    /* renamed from: a */
    public final Map f4836a = new HashMap();
    /* renamed from: b */
    public View f4837b;
    /* renamed from: c */
    public final ArrayList f4838c = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj instanceof C0228fl) {
            C0228fl c0228fl = (C0228fl) obj;
            if (this.f4837b == c0228fl.f4837b && this.f4836a.equals(c0228fl.f4836a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4837b.hashCode() * 31) + this.f4836a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.f4837b);
        stringBuilder3.append("\n");
        stringBuilder2 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    values:");
        stringBuilder2 = stringBuilder3.toString();
        Iterator it = this.f4836a.keySet().iterator();
        while (true) {
            String str = stringBuilder2;
            if (!it.hasNext()) {
                return str;
            }
            stringBuilder2 = (String) it.next();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append(GraphFactorySource.INDENT);
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(": ");
            stringBuilder4.append(this.f4836a.get(stringBuilder2));
            stringBuilder4.append("\n");
            stringBuilder2 = stringBuilder4.toString();
        }
    }
}
