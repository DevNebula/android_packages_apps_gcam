package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: awo */
public final class awo implements awm {
    /* renamed from: a */
    public static final String f10948a = bli.m887a("IntentLauncher");
    /* renamed from: b */
    public final Context f10949b;
    /* renamed from: c */
    public final Class f10950c;
    /* renamed from: d */
    public final kwk f10951d;
    /* renamed from: e */
    private final awr f10952e;
    /* renamed from: f */
    private final boolean f10953f;
    /* renamed from: g */
    private final Activity f10954g;

    public awo(awr awr, Context context, kwk kwk, awn awn) {
        this.f10952e = (awr) jri.m13404b((Object) awr);
        this.f10949b = (Context) jri.m13404b((Object) context);
        this.f10953f = awn.f1012c;
        this.f10954g = awn.f1010a;
        this.f10950c = awn.f1011b;
        this.f10951d = kwk;
    }

    /* renamed from: a */
    public final void mo1816a(Intent intent) {
        m7165a(intent, false);
    }

    /* renamed from: a */
    private final void m7165a(Intent intent, boolean z) {
        jri.m13404b((Object) intent);
        if (this.f10953f) {
            KeyguardManager keyguardManager = (KeyguardManager) this.f10949b.getSystemService("keyguard");
            int i = ((hny) this.f10951d.mo10566a()).f20213a;
            ((hny) this.f10951d.mo10566a()).mo13553a(C0252go.f5863bI);
            keyguardManager.requestDismissKeyguard(this.f10954g, new awp(this, intent, z, i));
            return;
        }
        this.f10952e.mo1823b(intent);
    }

    /* renamed from: b */
    public final void mo1817b(Intent intent) {
        m7165a(intent, true);
    }
}
