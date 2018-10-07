package p000;

import android.animation.Animator;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: cnh */
final class cnh implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ cne f2393a;
    /* renamed from: b */
    private final /* synthetic */ cng f2394b;

    cnh(cng cng, cne cne) {
        this.f2394b = cng;
        this.f2393a = cne;
    }

    public final void onClick(View view) {
        if (this.f2394b.f23217p.mo2407a()) {
            cng cng = this.f2394b;
            cng.f23217p.mo2409b(cng.f23218q);
            return;
        }
        Collection c;
        cne cne = this.f2393a;
        cng cng2 = this.f2394b;
        cmg cmg = cng2.f23219r;
        if (cmg == cmg.ALL_ELEMENTS_THUMBNAIL) {
            c = ((cov) cne.f2392a.mo12533c().f13139e).mo12885c();
        } else if (cmg == cmg.BEST_ELEMENTS_THUMBNAIL) {
            c = ((cov) cne.f2392a.mo12533c().f13139e).mo12884b();
        } else {
            throw new RuntimeException("Can't zoom in on non-thumbnail section elements.");
        }
        cmp cmp = cne.f2392a.f12713k;
        cmp.f2346b = new ArrayList(c);
        cmp.f2357m.f590d.notifyDataSetChanged();
        cmp.f2352h = cmg;
        BurstImageView burstImageView = cng2.f23220s;
        Animator animator = cmp.f2348d;
        if (animator != null) {
            animator.cancel();
        }
        cmp.f2347c = true;
        int i = 0;
        for (cot cot : cmp.f2346b) {
            if (cot.f13151c.f13139e.f4384h.equals(cng2.f23218q)) {
                cmp.f2357m.mo1056a(i, false);
                break;
            }
            i++;
        }
        cmp.mo2390a(cng2.f23218q);
        cmp.f2345a.f2372a.f12705c.mo2358b();
        burstImageView.setAlpha(0.0f);
        cmp.f2354j.setAlpha(0.0f);
        cmp.mo2389a(0);
        cmp.f2357m.getViewTreeObserver().addOnPreDrawListener(new cms(cmp, burstImageView));
    }
}
