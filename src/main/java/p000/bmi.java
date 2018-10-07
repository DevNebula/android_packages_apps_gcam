package p000;

import android.widget.Toast;

/* compiled from: PG */
/* renamed from: bmi */
final class bmi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f1343a;
    /* renamed from: b */
    private final /* synthetic */ int f1344b;
    /* renamed from: c */
    private final /* synthetic */ bmh f1345c;

    bmi(bmh bmh, String str, int i) {
        this.f1345c = bmh;
        this.f1343a = str;
        this.f1344b = i;
    }

    public final void run() {
        Toast.makeText(this.f1345c.f1341a, this.f1343a, this.f1344b).show();
    }
}
