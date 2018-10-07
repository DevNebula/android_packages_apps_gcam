package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: csn */
final class csn implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ csl f2862a;

    csn(csl csl) {
        this.f2862a = csl;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        this.f2862a.mo12901b(true);
        csl csl = this.f2862a;
        csl.f13235d.announceForAccessibility(csl.f13233b.getString(R.string.filmstrip_item_undeleted));
        this.f2862a.mo12900a(true);
        return true;
    }
}
