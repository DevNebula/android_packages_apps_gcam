package p000;

import android.widget.TextView;

/* compiled from: PG */
/* renamed from: ely */
public final class ely implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ TextView f4186a;

    public ely(TextView textView) {
        this.f4186a = textView;
    }

    public final void run() {
        this.f4186a.setVisibility(4);
    }
}
