package p000;

import android.util.Log;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* renamed from: ghp */
public final class ghp implements gho {
    /* renamed from: a */
    private final ghz f19177a = new ghl(this.f19178b);
    /* renamed from: b */
    private final ght f19178b = new ghi();

    /* renamed from: b */
    public final void mo7133b() {
        this.f19177a.mo13436c();
        boolean z = this.f19177a.f26407e;
        boolean z2 = this.f19178b.f26403e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }

    /* renamed from: c */
    public final void mo7134c() {
        this.f19177a.mo14907O();
        boolean z = this.f19177a.f26407e;
        boolean z2 = this.f19178b.f26403e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }

    /* renamed from: d */
    public final void mo7135d() {
        this.f19178b.mo13438e();
        boolean z = this.f19177a.f26407e;
        boolean z2 = this.f19178b.f26403e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo7132a(ProgressOverlay progressOverlay) {
        this.f19177a.mo15538a(progressOverlay);
        this.f19178b.mo15537a(this.f19177a, progressOverlay);
        this.f19177a.mo7343a();
    }

    /* renamed from: e */
    public final void mo7136e() {
        this.f19178b.mo14906y_();
        boolean z = this.f19177a.f26407e;
        boolean z2 = this.f19178b.f26403e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }
}
