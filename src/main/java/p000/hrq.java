package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: hrq */
final class hrq implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ hrm f6880a;

    hrq(hrm hrm) {
        this.f6880a = hrm;
    }

    public final void onClick(View view) {
        hrm hrm = this.f6880a;
        int i = hrm.f20786b + 1;
        if (i >= hrm.f20787i.length) {
            hrm.mo7755a();
        } else {
            hrm.mo13559a(i);
        }
    }
}
