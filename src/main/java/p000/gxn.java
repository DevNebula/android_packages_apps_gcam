package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxn */
public class gxn {
    /* renamed from: a */
    public final String f6132a;
    /* renamed from: b */
    public final String f6133b;
    /* renamed from: c */
    public final Drawable f6134c;
    /* renamed from: d */
    public boolean f6135d = false;
    /* renamed from: e */
    public View f6136e;
    /* renamed from: f */
    public PopupWindow f6137f = null;
    /* renamed from: g */
    public Runnable f6138g = null;
    /* renamed from: h */
    public Runnable f6139h = null;
    /* renamed from: i */
    public Runnable f6140i = null;

    /* renamed from: a */
    public synchronized void mo7505a() {
        mo7508a(false);
    }

    /* renamed from: a */
    public synchronized gxn mo7504a(Runnable runnable) {
        this.f6138g = runnable;
        return this;
    }

    /* renamed from: b */
    public synchronized gxn mo7509b(Runnable runnable) {
        this.f6139h = runnable;
        return this;
    }

    /* renamed from: c */
    public synchronized gxn mo7510c(Runnable runnable) {
        this.f6140i = runnable;
        return this;
    }

    /* renamed from: a */
    public synchronized void mo7507a(View view, Rect rect) {
        View view2 = view;
        mo7506a(view2, rect.left, rect.top, rect.width(), rect.height(), new Rect(0, 0, rect.width(), rect.height()));
    }

    public gxn(String str, String str2, Drawable drawable) {
        this.f6132a = str;
        this.f6133b = str2;
        this.f6134c = drawable;
    }

    /* renamed from: a */
    public synchronized PopupWindow mo7503a(Context context, int i, int i2, Rect rect) {
        PopupWindow popupWindow;
        if (!this.f6135d) {
            CharSequence charSequence = this.f6132a;
            CharSequence charSequence2 = this.f6133b;
            Drawable drawable = this.f6134c;
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            Handler handler = new Handler(Looper.getMainLooper());
            View inflate = layoutInflater.inflate(R.layout.info_view, null);
            TextView textView = (TextView) inflate.findViewById(R.id.textContent);
            TextView textView2 = (TextView) inflate.findViewById(R.id.textGotIt);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.imageBackground);
            ((TextView) inflate.findViewById(R.id.textTitle)).setText(charSequence);
            textView.setText(charSequence2);
            textView2.setOnClickListener(new gxo(this, handler));
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            this.f6136e = inflate;
            this.f6136e.setPadding(rect.left, rect.top, i - rect.right, i2 - rect.bottom);
            this.f6135d = true;
        }
        popupWindow = new PopupWindow(this.f6136e, i, i2);
        popupWindow.setAnimationStyle(R.style.PopupAnimation);
        popupWindow.setOverlapAnchor(true);
        popupWindow.setClippingEnabled(false);
        return popupWindow;
    }

    /* renamed from: a */
    public synchronized void mo7508a(boolean z) {
        PopupWindow popupWindow = this.f6137f;
        if (popupWindow != null) {
            popupWindow.dismiss();
            Runnable runnable;
            if (z) {
                runnable = this.f6138g;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                runnable = this.f6139h;
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.f6137f = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo7506a(View view, int i, int i2, int i3, int i4, Rect rect) {
        PopupWindow a = mo7503a(view.getContext(), i3, i4, rect);
        a.showAtLocation(view, 0, i, i2);
        Runnable runnable = this.f6140i;
        if (runnable != null) {
            runnable.run();
        }
        this.f6137f = a;
    }
}
