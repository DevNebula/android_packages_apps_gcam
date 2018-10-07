package p000;

import android.graphics.RectF;
import android.widget.FrameLayout.LayoutParams;

/* compiled from: PG */
/* renamed from: dam */
final class dam implements ham {
    /* renamed from: a */
    private final /* synthetic */ dak f13664a;

    dam(dak dak) {
        this.f13664a = dak;
    }

    /* renamed from: a */
    public final void mo7598a(RectF rectF) {
        LayoutParams layoutParams = (LayoutParams) this.f13664a.f3113d.getLayoutParams();
        layoutParams.width = (int) Math.ceil((double) rectF.width());
        layoutParams.height = Math.round(rectF.height());
        layoutParams.setMargins(Math.round(rectF.left), Math.round(rectF.top), 0, 0);
        this.f13664a.f3113d.setLayoutParams(layoutParams);
        this.f13664a.f3114e.setLayoutParams(layoutParams);
        this.f13664a.f3115f.f2615b.set(new RectF(rectF));
    }
}
