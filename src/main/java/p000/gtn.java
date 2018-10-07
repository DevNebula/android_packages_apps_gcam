package p000;

import android.app.AlertDialog;

/* compiled from: PG */
/* renamed from: gtn */
final class gtn implements kov {
    /* renamed from: a */
    public final /* synthetic */ AlertDialog f19585a;
    /* renamed from: b */
    private final /* synthetic */ gtm f19586b;

    gtn(gtm gtm, AlertDialog alertDialog) {
        this.f19586b = gtm;
        this.f19585a = alertDialog;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (((Long) obj).longValue() < 0) {
            AlertDialog alertDialog = this.f19585a;
            if (!(alertDialog == null || alertDialog.isShowing())) {
                this.f19586b.f19583c.execute(new gto(this));
            }
            bli.m894c(gtm.f19581a, "Available storage space is too low.");
        }
    }
}
