package p000;

import android.app.KeyguardManager.KeyguardDismissCallback;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: awp */
final class awp extends KeyguardDismissCallback {
    /* renamed from: a */
    private final /* synthetic */ Intent f1013a;
    /* renamed from: b */
    private final /* synthetic */ boolean f1014b;
    /* renamed from: c */
    private final /* synthetic */ int f1015c;
    /* renamed from: d */
    private final /* synthetic */ awo f1016d;

    awp(awo awo, Intent intent, boolean z, int i) {
        this.f1016d = awo;
        this.f1013a = intent;
        this.f1014b = z;
        this.f1015c = i;
    }

    public final void onDismissCancelled() {
        ((hny) this.f1016d.f10951d.mo10566a()).mo13553a(this.f1015c);
    }

    public final void onDismissError() {
        ((hny) this.f1016d.f10951d.mo10566a()).mo13553a(this.f1015c);
    }

    public final void onDismissSucceeded() {
        awo awo = this.f1016d;
        Context context = awo.f10949b;
        Intent intent = this.f1013a;
        boolean z = this.f1014b;
        bli.m894c(awo.f10948a, "Device unlocked, firing target intent.");
        Intent intent2 = new Intent(context, awo.f10950c);
        intent2.setFlags(intent2.getFlags() | 67108864).setAction("android.intent.action.MAIN");
        TaskStackBuilder create = TaskStackBuilder.create(context);
        if (z) {
            create.addNextIntent(intent2);
        }
        create.addNextIntent(intent).startActivities();
        ((hny) this.f1016d.f10951d.mo10566a()).mo13553a(this.f1015c);
    }
}
