package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmw */
final class cmw implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Uri f2368a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2369b;

    cmw(cmp cmp, Uri uri) {
        this.f2369b = cmp;
        this.f2368a = uri;
    }

    public final void onClick(View view) {
        cmy cmy = this.f2369b.f2345a;
        cot a = cmy.f2372a.mo12530a(this.f2368a);
        synchronized (cmy.f2372a) {
            cls cls = cmy.f2372a;
            if (cls.f12707e == null) {
                cls.f12707e = new cmn(a);
                cmn cmn = cmy.f2372a.f12707e;
                Intent intent = new Intent("android.intent.action.EDIT");
                eru eru = cmn.f2341a.f13151c.f13139e;
                Intent flags = intent.setDataAndType(eru.f4384h, eru.f4380d).setFlags(1);
                try {
                    cmy.f2372a.startActivityForResult(flags, 1);
                } catch (ActivityNotFoundException e) {
                    cls cls2 = cmy.f2372a;
                    cls2.startActivityForResult(Intent.createChooser(flags, cls2.getResources().getString(R.string.edit_with)), 1);
                }
            } else {
                bli.m891b(cls.f12703a, "Edit request already in progress");
            }
        }
        return;
    }
}
