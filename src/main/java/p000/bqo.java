package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bqo */
public final class bqo extends ImageView {
    /* renamed from: a */
    public bqp f1476a;
    /* renamed from: b */
    public boolean f1477b = true;
    /* renamed from: c */
    private final Drawable f1478c;
    /* renamed from: d */
    private final Drawable f1479d;

    public bqo(Context context) {
        super(context);
        this.f1478c = context.getResources().getDrawable(R.drawable.ic_afae_unlock_24px, null);
        this.f1479d = context.getResources().getDrawable(R.drawable.ic_afae_lock_24px, null);
        int dimension = (int) getResources().getDimension(R.dimen.evCompLockIconPadding);
        setPadding(dimension, dimension, dimension, dimension);
        mo2087a(false);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1477b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    final void mo2087a(boolean z) {
        if (z) {
            setImageDrawable(this.f1479d);
            setContentDescription(getResources().getString(R.string.lock_closed_label));
        } else {
            setImageDrawable(this.f1478c);
            setContentDescription(getResources().getString(R.string.lock_open_label));
        }
        bqp bqp = this.f1476a;
        if (bqp != null) {
            bpt bpt = bqp.f1480a;
            if (z) {
                bpt.f1446b.mo13439f();
            }
        }
    }
}
