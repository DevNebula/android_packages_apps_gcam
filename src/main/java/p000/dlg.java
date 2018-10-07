package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: dlg */
final class dlg implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ dlf f3326a;

    dlg(dlf dlf) {
        this.f3326a = dlf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3326a.f3325a.f26139h = null;
        dialogInterface.dismiss();
        this.f3326a.f3325a.f26142k.mo12474a("Storage full");
    }
}
