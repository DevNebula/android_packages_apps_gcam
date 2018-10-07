package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: dfc */
final class dfc implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ dfb f3231a;

    dfc(dfb dfb) {
        this.f3231a = dfb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        des des = this.f3231a.f3230a;
        ejy ejy = des.f25987v;
        if (ejy == null || ejy.f3949t) {
            bli.m898e(des.f25916c, "Photo is being taken, ignoring user's request for cancel.");
        } else {
            des.mo15497n();
        }
    }
}
