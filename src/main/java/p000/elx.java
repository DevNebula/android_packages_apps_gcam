package p000;

import android.widget.TextView;

/* compiled from: PG */
/* renamed from: elx */
public final class elx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ TextView f4184a;
    /* renamed from: b */
    private final /* synthetic */ int f4185b;

    public elx(TextView textView, int i) {
        this.f4184a = textView;
        this.f4185b = i;
    }

    public final void run() {
        this.f4184a.setText(this.f4185b);
        this.f4184a.setVisibility(0);
    }
}
