package p000;

import android.app.Activity;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: hyp */
final class hyp extends hym {
    /* renamed from: a */
    private final /* synthetic */ hyo f24525a;

    hyp(hyo hyo) {
        this.f24525a = hyo;
        super((byte) 0);
    }

    /* renamed from: a */
    public final void mo13602a(GoogleHelp googleHelp) {
        long nanoTime = System.nanoTime();
        hyo hyo = this.f24525a;
        if (!(hyo.f26693b == null && hyo.f26694c == null)) {
            hyo.m18361a(hyo, googleHelp, nanoTime);
        }
        TogglingData togglingData = googleHelp.f23479c;
        if (togglingData != null) {
            String str;
            Activity activity = this.f24525a.f26695d;
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0) {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(identifier);
                if (viewGroup != null) {
                    identifier = 0;
                    while (true) {
                        int i = identifier;
                        if (i >= viewGroup.getChildCount()) {
                            str = charSequence;
                            break;
                        }
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof TextView) {
                            str = ((TextView) childAt).getText().toString();
                            break;
                        }
                        identifier = i + 1;
                    }
                } else {
                    str = charSequence;
                }
            } else {
                str = charSequence;
            }
            togglingData.f23510a = str;
        }
        this.f24525a.f26692a.putExtra("EXTRA_GOOGLE_HELP", googleHelp).putExtra("EXTRA_START_TICK", nanoTime);
        hyo = this.f24525a;
        hyo.f26695d.startActivityForResult(hyo.f26692a, ScriptIntrinsicBLAS.RsBlas_dtrmm);
        this.f24525a.mo8364a(Status.f23355a);
    }
}
