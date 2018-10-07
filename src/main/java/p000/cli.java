package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.design.widget.FloatingActionButton;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: cli */
public final class cli {
    /* renamed from: a */
    public static final String f2298a = bli.m887a("AddCreationFabMenu");
    /* renamed from: l */
    private static final clr f2299l = new clj();
    /* renamed from: b */
    public FloatingActionButton f2300b;
    /* renamed from: c */
    public View f2301c;
    /* renamed from: d */
    public boolean f2302d = false;
    /* renamed from: e */
    public LinearLayout f2303e;
    /* renamed from: f */
    public boolean f2304f;
    /* renamed from: g */
    public Interpolator f2305g;
    /* renamed from: h */
    public volatile boolean f2306h = false;
    /* renamed from: i */
    public final Map f2307i = new ConcurrentHashMap();
    /* renamed from: j */
    public clr f2308j = f2299l;
    /* renamed from: k */
    private final clq f2309k;

    public cli(clq clq) {
        this.f2309k = clq;
    }

    /* renamed from: a */
    final View mo2355a(jiy jiy, int i, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f2303e.getContext()).inflate(R.layout.burst_editor_speed_dial_item, this.f2303e, false);
        this.f2303e.addView(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.speed_dial_text);
        textView.setText(i);
        textView.requestLayout();
        ((ImageView) linearLayout.findViewById(R.id.speed_dial_button)).setImageResource(i2);
        linearLayout.setVisibility(8);
        this.f2307i.put(jiy, linearLayout);
        linearLayout.setOnClickListener(new clo(this, jiy));
        return linearLayout;
    }

    /* renamed from: a */
    final void mo2357a(boolean z) {
        float f;
        float f2;
        long j;
        Collection arrayList = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2300b.setImageResource(R.drawable.ic_clear_white);
        arrayList.add(ObjectAnimator.ofFloat(this.f2300b, View.ROTATION, new float[]{-90.0f, 0.0f}));
        FloatingActionButton floatingActionButton;
        if (z) {
            floatingActionButton = this.f2300b;
            floatingActionButton.setContentDescription(floatingActionButton.getResources().getString(R.string.burst_editor_close_speed_dial_description));
        } else {
            floatingActionButton = this.f2300b;
            floatingActionButton.setContentDescription(floatingActionButton.getResources().getString(R.string.burst_editor_open_speed_dial_description));
        }
        View view = this.f2301c;
        float[] fArr = new float[2];
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        arrayList.add(ObjectAnimator.ofFloat(view, "alpha", fArr));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f2303e.getChildCount()) {
                break;
            }
            int childCount;
            float f3;
            float f4;
            View childAt = this.f2303e.getChildAt(i2);
            int height = childAt.getHeight() / 2;
            ImageView imageView = (ImageView) childAt.findViewById(R.id.speed_dial_button);
            if (z) {
                childAt.setAlpha(0.0f);
            }
            if (z) {
                childCount = (this.f2303e.getChildCount() - i2) * 30;
            } else {
                childCount = i2 * 20;
            }
            Property property = View.TRANSLATION_Y;
            float[] fArr2 = new float[2];
            if (z) {
                f3 = (float) height;
            } else {
                f3 = 0.0f;
            }
            fArr2[0] = f3;
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = (float) height;
            }
            fArr2[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, fArr2);
            long j2 = (long) childCount;
            ofFloat.setStartDelay(j2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, View.ALPHA, new float[]{f, f2});
            ofFloat2.setStartDelay(j2);
            if (z) {
                f3 = 0.5f;
            } else {
                f3 = 1.0f;
            }
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, new float[]{f3, f4});
            ofFloat3.setStartDelay(j2);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, new float[]{f3, f4});
            ofFloat4.setStartDelay(j2);
            if (!z && i2 == 0) {
                ofFloat2.addListener(new cln(this));
            }
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            arrayList.add(ofFloat3);
            arrayList.add(ofFloat4);
            i = i2 + 1;
        }
        animatorSet.setInterpolator(this.f2305g);
        if (z) {
            j = 218;
        } else {
            j = 150;
        }
        animatorSet.setDuration(j);
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new clm(this));
        animatorSet.start();
    }

    /* renamed from: a */
    final void mo2356a() {
        if (this.f2303e.getVisibility() != 8) {
            this.f2302d = false;
            mo2357a(this.f2302d);
            this.f2300b.setImageResource(R.drawable.ic_auto_awesome);
        }
    }

    /* renamed from: b */
    public final void mo2358b() {
        mo2356a();
        this.f2300b.setVisibility(8);
        this.f2301c.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo2359c() {
        kpk a;
        cop cop = this.f2309k.f2316a.f12708f;
        if (cop == null) {
            a = kow.m13873a(ken.m13719e());
        } else {
            a = cop.mo5650a();
        }
        kow.m13878a(a, new clp(this), new ikd());
    }
}
