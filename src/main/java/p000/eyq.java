package p000;

import android.widget.Toast;

/* renamed from: eyq */
final /* synthetic */ class eyq implements Runnable {
    /* renamed from: a */
    private final eyp f4594a;
    /* renamed from: b */
    private final eyx f4595b;

    eyq(eyp eyp, eyx eyx) {
        this.f4594a = eyp;
        this.f4595b = eyx;
    }

    public final void run() {
        eyx eyx = this.f4595b;
        String str = eyx.f4598a;
        String str2 = eyx.f4599b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length());
        stringBuilder.append("Started: ");
        stringBuilder.append(str);
        stringBuilder.append(", ended: ");
        stringBuilder.append(str2);
        Toast.makeText(null, stringBuilder.toString(), 0).show();
    }
}
