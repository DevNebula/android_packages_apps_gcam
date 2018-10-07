package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: giq */
final class giq extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ gip f5493a;

    giq(gip gip) {
        this.f5493a = gip;
    }

    public final void onReceive(Context context, Intent intent) {
        gip gip = this.f5493a;
        if (gip.f19206c) {
            gip.f19205b.mo8836d("Ignoring ScreenOff shutdown behavior, the activity is still started.");
            return;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
        stringBuilder.append("Received ScreenOff broadcast after onStop: ");
        stringBuilder.append(valueOf);
        valueOf = stringBuilder.toString();
        gip.mo13358b();
        gip.f19204a.mo1814a(valueOf);
    }
}
