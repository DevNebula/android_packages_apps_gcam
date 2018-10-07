package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.service.voice.VoiceInteractionService;
import android.util.Log;

/* compiled from: PG */
/* renamed from: azy */
public final class azy implements baf {
    /* renamed from: a */
    private static final ComponentName f11098a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");
    /* renamed from: b */
    private final Context f11099b;
    /* renamed from: c */
    private final ilp f11100c;

    public azy(Context context, ilp ilp) {
        this.f11099b = context;
        this.f11100c = ilp;
    }

    /* renamed from: a */
    public final void mo1872a() {
        boolean z;
        boolean z2 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent();
        intent.addFlags(268468224);
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromDeeplink"));
        if (this.f11099b.getPackageManager().resolveActivity(intent, 0) != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append("Assistant available:");
        stringBuilder.append(z);
        Log.i("AgsaAvailibility", stringBuilder.toString());
        if (z) {
            z = VoiceInteractionService.isActiveService(this.f11099b, f11098a);
            stringBuilder = new StringBuilder(24);
            stringBuilder.append("Assistant selected:");
            stringBuilder.append(z);
            Log.i("AgsaAvailibility", stringBuilder.toString());
            if (z) {
                z2 = true;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        stringBuilder = new StringBuilder(53);
        stringBuilder.append("Enabled property is:");
        stringBuilder.append(z2);
        stringBuilder.append(", Took: ");
        stringBuilder.append(currentTimeMillis2 - currentTimeMillis);
        Log.i("AgsaAvailibility", stringBuilder.toString());
        this.f11100c.mo8826a(Boolean.valueOf(z2));
    }
}
