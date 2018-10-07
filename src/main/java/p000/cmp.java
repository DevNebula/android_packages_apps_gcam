package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.support.p001v4.view.ViewPager;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cmp */
public final class cmp {
    /* renamed from: n */
    private static final String f2344n = bli.m887a("GridZoomMgr");
    /* renamed from: a */
    public final cmy f2345a;
    /* renamed from: b */
    public List f2346b = new ArrayList();
    /* renamed from: c */
    public boolean f2347c;
    /* renamed from: d */
    public Animator f2348d;
    /* renamed from: e */
    public ViewGroup f2349e;
    /* renamed from: f */
    public RecyclerView f2350f;
    /* renamed from: g */
    public cnb f2351g;
    /* renamed from: h */
    public cmg f2352h;
    /* renamed from: i */
    public Context f2353i;
    /* renamed from: j */
    public View f2354j;
    /* renamed from: k */
    public boolean f2355k;
    /* renamed from: l */
    public final Map f2356l = new HashMap();
    /* renamed from: m */
    public ViewPager f2357m;

    public cmp(cmy cmy) {
        this.f2345a = cmy;
    }

    /* renamed from: a */
    private static Rect m1215a(Rect rect, Rect rect2) {
        double width;
        if (rect.height() == 0 || rect2.height() == 0) {
            bli.m891b(f2344n, "Invalid sizes for centerUncrop Rects.");
            return rect;
        } else if (((float) rect.width()) / ((float) rect.height()) <= ((float) rect2.width()) / ((float) rect2.height())) {
            width = (double) ((((float) ((rect2.width() * rect.height()) / rect2.height())) - ((float) rect.width())) / 2.0f);
            return new Rect(rect.left - ((int) Math.floor(width)), rect.top, ((int) Math.ceil(width)) + rect.right, rect.bottom);
        } else {
            width = (double) ((((float) ((rect2.height() * rect.width()) / rect2.width())) - ((float) rect.height())) / 2.0f);
            return new Rect(rect.left, rect.top - ((int) Math.floor(width)), rect.right, ((int) Math.ceil(width)) + rect.bottom);
        }
    }

    /* renamed from: c */
    private static Rect m1218c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    static void m1216a(View view) {
        view.setPivotX((float) (view.getWidth() / 2));
        view.setPivotY((float) (view.getHeight() / 2));
    }

    /* renamed from: b */
    static void m1217b(View view) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
    }

    /* renamed from: a */
    public final void mo2389a(int i) {
        float f;
        ViewPager viewPager = this.f2357m;
        if (i == 0) {
            f = 255.0f;
        } else {
            f = 0.0f;
        }
        viewPager.setAlpha(f);
        this.f2357m.setVisibility(i);
        this.f2354j.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo2390a(Uri uri) {
        ImageButton imageButton = (ImageButton) this.f2349e.findViewById(R.id.share);
        ImageButton imageButton2 = (ImageButton) this.f2349e.findViewById(R.id.edit);
        ImageButton imageButton3 = (ImageButton) this.f2349e.findViewById(R.id.delete);
        if (uri != null) {
            if (this.f2355k) {
                imageButton.setOnClickListener(null);
                imageButton.setClickable(false);
                imageButton.setVisibility(8);
            } else {
                imageButton.setOnClickListener(new cmv(this, uri));
            }
            if (this.f2355k) {
                imageButton2.setOnClickListener(null);
                imageButton2.setClickable(false);
                imageButton2.setVisibility(8);
            } else {
                imageButton2.setOnClickListener(new cmw(this, uri));
            }
            imageButton3.setOnClickListener(new cmx(this, uri));
            return;
        }
        imageButton.setOnClickListener(null);
        imageButton.setClickable(false);
        imageButton2.setOnClickListener(null);
        imageButton2.setClickable(false);
        imageButton3.setOnClickListener(null);
        imageButton3.setClickable(false);
    }

    /* renamed from: a */
    final cnb mo2387a(BurstImageView burstImageView, kvr kvr) {
        Rect c = cmp.m1218c(burstImageView);
        Rect c2 = cmp.m1218c(kvr);
        cot cot = (cot) this.f2346b.get(this.f2357m.f591e);
        Rect a = cmp.m1215a(cmp.m1215a(c, new Rect(0, 0, cot.f13151c.mo6542h().f7695a, cot.f13151c.mo6542h().f7696b)), c2);
        float width = ((float) a.width()) / ((float) c2.width());
        int i = a.left;
        int i2 = c2.left;
        int i3 = a.top;
        int i4 = c2.top;
        Rect rect = new Rect(c);
        rect.offset(-a.left, -a.top);
        rect.left = (int) (((float) rect.left) / width);
        rect.top = (int) (((float) rect.top) / width);
        rect.right = (int) (((float) rect.right) / width);
        rect.bottom = (int) (((float) rect.bottom) / width);
        Rect rect2 = new Rect(c2);
        rect2.offset(-c2.left, -c2.top);
        return new cnb(burstImageView, (float) (i - i2), (float) (i3 - i4), width, rect, rect2);
    }

    /* renamed from: a */
    public final void mo2388a() {
        if (this.f2351g != null) {
            Animator animator = this.f2348d;
            if (animator != null) {
                animator.cancel();
            }
            this.f2350f.setVisibility(0);
            mo2390a(null);
            this.f2347c = false;
            if (this.f2346b.isEmpty()) {
                this.f2350f.setAlpha(1.0f);
                mo2389a(4);
                this.f2345a.mo2399a();
                this.f2351g = null;
                return;
            }
            cng b;
            cnb cnb;
            cmy cmy = this.f2345a;
            cot cot = (cot) this.f2346b.get(this.f2357m.f591e);
            cmg cmg = this.f2352h;
            for (int i = 0; i < cmy.f2372a.f12715m.mo2373b(); i++) {
                cmf a = cmy.f2372a.f12715m.mo2371a(i);
                if (a.f2322b == cmg && kbf.m16778b(a.f2321a.f13151c.f13139e.f4384h, cot.f13151c.f13139e.f4384h)) {
                    b = cmy.f2372a.f12712j.mo2403b(i);
                    break;
                }
            }
            b = null;
            kvr kvr = (kvr) this.f2356l.get(((cot) this.f2346b.get(this.f2357m.f591e)).f13151c.f13139e.f4384h);
            if (b == null) {
                cnb = this.f2351g;
            } else {
                cnb = mo2387a(b.f23220s, kvr);
            }
            BurstImageView burstImageView = cnb.f2379a;
            burstImageView.setAlpha(0.0f);
            kvr.mo10536e();
            cmp.m1217b(kvr);
            Animator animatorSet = new AnimatorSet();
            Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new cmo(kvr, cnb));
            animatorSet.play(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_X, new float[]{0.0f, cnb.f2380b})).with(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_Y, new float[]{0.0f, cnb.f2381c})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_X, new float[]{1.0f, cnb.f2382d})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_Y, new float[]{1.0f, cnb.f2382d})).with(ObjectAnimator.ofFloat(this.f2350f, View.ALPHA, new float[]{0.0f, 1.0f})).with(ObjectAnimator.ofFloat(this.f2354j, View.ALPHA, new float[]{1.0f, 0.0f})).with(ofFloat);
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(axl.f1036a);
            animatorSet.addListener(new cmu(this, burstImageView, kvr));
            animatorSet.start();
            this.f2348d = animatorSet;
            this.f2351g = null;
        }
    }
}
