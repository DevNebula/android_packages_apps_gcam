package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.VectorDrawable;
import android.widget.ImageButton;

/* renamed from: hgw */
final /* synthetic */ class hgw implements Runnable {
    /* renamed from: a */
    private final hgo f6560a;

    hgw(hgo hgo) {
        this.f6560a = hgo;
    }

    public final void run() {
        fzh fzh = this.f6560a.f20083g.f5222b.f23290d;
        ImageButton imageButton = fzh.f5076i;
        VectorDrawable vectorDrawable = fzh.f5078k;
        AnimatedVectorDrawable animatedVectorDrawable = fzh.f5077j;
        if (imageButton != null && vectorDrawable != null && animatedVectorDrawable != null) {
            animatedVectorDrawable.reset();
            animatedVectorDrawable.start();
            if (fzh.f5079l) {
                fzh.f5075h.cancel();
            } else {
                if (fzh.f5075h.isRunning()) {
                    fzh.f5075h.cancel();
                }
                fzh.f5074g.setTarget(vectorDrawable);
                fzh.f5074g.start();
            }
            fzh.f5079l = true;
        }
    }
}
