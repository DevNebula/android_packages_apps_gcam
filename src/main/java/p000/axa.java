package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* renamed from: axa */
final /* synthetic */ class axa implements OnClickListener {
    /* renamed from: a */
    private final aww f1023a;

    axa(aww aww) {
        this.f1023a = aww;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aww aww = this.f1023a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        String valueOf = String.valueOf(aww.f10972a.getPackageName());
        String str = "package:";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        intent.setData(Uri.parse(valueOf));
        aww.f10975d.mo1823b(intent);
        aww.f10973b.mo1814a("Closing until required permissions are granted.");
    }
}
