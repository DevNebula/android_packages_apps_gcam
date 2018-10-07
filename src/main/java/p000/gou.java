package p000;

import android.app.backup.BackupManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: gou */
final class gou implements gol {
    /* renamed from: a */
    private final /* synthetic */ Context f19434a;

    gou(Context context) {
        this.f19434a = context;
    }

    /* renamed from: a */
    public final void mo7276a(String str) {
        BackupManager.dataChanged(this.f19434a.getPackageName());
    }
}
