package p000;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gxo */
public final /* synthetic */ class gxo implements OnClickListener {
    /* renamed from: a */
    private final gxn f6141a;
    /* renamed from: b */
    private final Handler f6142b;

    public gxo(gxn gxn, Handler handler) {
        this.f6141a = gxn;
        this.f6142b = handler;
    }

    public final void onClick(View view) {
        this.f6142b.post(new gxp(this.f6141a));
    }
}
