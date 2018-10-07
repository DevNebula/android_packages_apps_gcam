package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* renamed from: ght */
public class ght extends ghs {
    /* renamed from: d */
    public ProgressOverlay f26402d;
    /* renamed from: e */
    public boolean f26403e;
    /* renamed from: f */
    public AnimatedVectorDrawable f26404f;

    /* renamed from: a */
    public void mo15537a(ghz ghz, ProgressOverlay progressOverlay) {
        this.f26402d = progressOverlay;
        this.f26404f = this.f26402d.f2582a;
        this.f26404f.registerAnimationCallback(new ghu(this));
        this.f26403e = false;
    }
}
