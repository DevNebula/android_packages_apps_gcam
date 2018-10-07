package com.google.android.apps.camera.p005ui.wirers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import p000.C0252go;
import p000.bli;
import p000.hhy;
import p000.hnn;
import p000.hnp;
import p000.hnu;

@Deprecated
/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.wirers.PreviewOverlay */
public class PreviewOverlay extends View {
    /* renamed from: a */
    public GestureDetector f2632a = null;
    /* renamed from: b */
    public OnTouchListener f2633b = null;
    /* renamed from: c */
    public hhy f2634c;
    /* renamed from: d */
    public boolean f2635d = true;
    /* renamed from: e */
    public boolean f2636e = true;
    /* renamed from: f */
    private final int[] f2637f = new int[]{0, 0};

    static {
        bli.m887a("PreviewOverlay");
    }

    public PreviewOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f2637f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2635d) {
            if (this.f2636e) {
                hhy hhy = this.f2634c;
                if (hhy != null) {
                    hnu hnu = hhy.f6583a;
                    switch (motionEvent.getActionMasked()) {
                        case 0:
                            hnp hnp = hnu.f6756g;
                            hnu.mo7977a(motionEvent);
                            hnp.mo13550a();
                            break;
                        case 1:
                            hnu.mo7978a().mo7972b();
                            hnu.f6756g.mo7972b();
                            hnu.f6766q = 0.0f;
                            hnu.f6765p = 0.0f;
                            hnu.f6762m = C0252go.f5858bD;
                            hnu.f6763n = false;
                            hnu.f6764o = false;
                            hnu.f6767r = 0;
                            break;
                        case 3:
                            hnn hnn;
                            hnu.mo7978a().mo7973c();
                            if (hnu.f6764o) {
                                hnn = hnu.f6756g;
                            } else {
                                hnn = hnn.f6748a;
                            }
                            hnn.mo7973c();
                            hnu.f6767r = 0;
                            break;
                        case 5:
                            hnu.f6767r++;
                            break;
                        case 6:
                            hnu.f6767r--;
                            break;
                    }
                    if (hnu.f6763n) {
                        if (motionEvent.getPointerCount() >= 2) {
                            Math.atan2((double) (-(motionEvent.getY(1) - motionEvent.getY(0))), (double) (motionEvent.getX(1) - motionEvent.getX(0)));
                        }
                        hnu.f6752c.onTouchEvent(motionEvent);
                    } else if (hnu.f6762m != C0252go.f5858bD || hnu.f6764o) {
                        hnu.f6751b.onTouchEvent(motionEvent);
                    } else {
                        hnu.f6752c.onTouchEvent(motionEvent);
                        hnu.f6751b.onTouchEvent(motionEvent);
                    }
                }
            }
            GestureDetector gestureDetector = this.f2632a;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            OnTouchListener onTouchListener = this.f2633b;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
        return true;
    }
}
