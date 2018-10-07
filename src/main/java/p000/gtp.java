package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gtp */
final class gtp implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ gtm f6054a;

    gtp(gtm gtm) {
        this.f6054a = gtm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6054a.f19582b.startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
    }
}
