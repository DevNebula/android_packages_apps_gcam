package p000;

import android.widget.Toast;

/* renamed from: eyr */
final /* synthetic */ class eyr implements Runnable {
    /* renamed from: a */
    private final eyp f4596a;
    /* renamed from: b */
    private final eyx f4597b;

    eyr(eyp eyp, eyx eyx) {
        this.f4596a = eyp;
        this.f4597b = eyx;
    }

    public final void run() {
        eyx eyx = this.f4597b;
        String str = eyx.f4598a;
        String str2 = eyx.f4599b;
        String str3 = eyx.f4600c;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 28) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("Started: ");
        stringBuilder.append(str);
        stringBuilder.append(", ended: ");
        stringBuilder.append(str2);
        stringBuilder.append(", CANCEL: ");
        stringBuilder.append(str3);
        Toast.makeText(null, stringBuilder.toString(), 0).show();
    }
}
