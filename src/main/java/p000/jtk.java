package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jtk */
final class jtk implements kbn {
    /* renamed from: a */
    private final /* synthetic */ String f21734a;
    /* renamed from: b */
    private final /* synthetic */ jtj f21735b;

    jtk(jtj jtj, String str) {
        this.f21735b = jtj;
        this.f21734a = str;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo9715b() {
        Object a = this.f21735b.f8327a.mo9552a(this.f21734a);
        if (a != null) {
            return a;
        }
        String str = this.f21734a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
        stringBuilder.append("Feature ");
        stringBuilder.append(str);
        stringBuilder.append(" not found. Defaulting to 0.");
        Log.d("ExplicitNonlinearScorer", stringBuilder.toString());
        return new jth(0.0f);
    }
}
