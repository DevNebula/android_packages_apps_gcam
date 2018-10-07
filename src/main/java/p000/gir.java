package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gir */
final class gir extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ gip f5494a;

    gir(gip gip) {
        this.f5494a = gip;
    }

    public final void onReceive(Context context, Intent intent) {
        gip gip = this.f5494a;
        String valueOf = String.valueOf(intent);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Received UserPresent broadcast: ");
        stringBuilder.append(valueOf);
        valueOf = stringBuilder.toString();
        gip.mo13358b();
        gip.f19204a.mo1814a(valueOf);
    }
}
