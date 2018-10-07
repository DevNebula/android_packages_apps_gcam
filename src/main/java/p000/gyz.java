package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.modeswitch.ViewfinderCover;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: gyz */
public final class gyz {
    /* renamed from: a */
    public final BottomBarController f6193a;
    /* renamed from: b */
    public gyr f6194b;
    /* renamed from: c */
    public ViewfinderCover f6195c;
    /* renamed from: d */
    public gza f6196d;
    /* renamed from: e */
    public boolean f6197e;
    /* renamed from: f */
    public hhx f6198f;
    /* renamed from: g */
    public final boolean f6199g;
    /* renamed from: h */
    public final kbg f6200h;
    /* renamed from: i */
    private final aws f6201i;
    /* renamed from: j */
    private final hdm f6202j;
    /* renamed from: k */
    private final hcd f6203k;
    /* renamed from: l */
    private final hny f6204l;
    /* renamed from: m */
    private final ArrayList f6205m = new ArrayList();
    /* renamed from: n */
    private int f6206n;
    /* renamed from: o */
    private final HashMap f6207o = new HashMap();

    public gyz(het het, WindowManager windowManager, ilp ilp, irs irs, BottomBarController bottomBarController, aws aws, hdm hdm, hcd hcd, hny hny, kbg kbg) {
        this.f6196d = new gza(this, windowManager, ilp);
        this.f6195c = (ViewfinderCover) het.f6491e;
        this.f6193a = bottomBarController;
        this.f6201i = aws;
        this.f6202j = hdm;
        this.f6203k = hcd;
        this.f6204l = hny;
        this.f6200h = kbg;
        this.f6205m.add(hhx.PHOTO);
        this.f6205m.add(hhx.VIDEO);
        this.f6206n = 0;
        this.f6207o.put(hhx.PHOTO, Integer.valueOf(0));
        this.f6207o.put(hhx.VIDEO, Integer.valueOf(1));
        this.f6198f = (hhx) this.f6205m.get(this.f6206n);
        this.f6199g = this.f6200h.mo9709b();
        bottomBarController.addListener(new gyw(this, irs));
    }

    /* renamed from: d */
    private final void m2979d() {
        this.f6193a.setClickable(true);
        this.f6203k.mo7672b(true);
        this.f6193a.setSwitchButtonClickEnabled(true);
        this.f6204l.mo13553a(C0252go.f5861bG);
    }

    /* renamed from: a */
    final hhx mo7563a(int i) {
        if (i != C0252go.f5894bn || mo7570b()) {
            return (i != C0252go.f5895bo || mo7567a()) ? null : (hhx) this.f6205m.get(this.f6206n - 1);
        } else {
            return (hhx) this.f6205m.get(this.f6206n + 1);
        }
    }

    /* renamed from: a */
    public final boolean mo7567a() {
        return this.f6206n == 0;
    }

    /* renamed from: b */
    public final boolean mo7570b() {
        return this.f6206n == this.f6205m.size() + -1;
    }

    /* renamed from: b */
    final boolean mo7571b(int i) {
        if ((i == C0252go.f5895bo && mo7567a()) || (i == C0252go.f5894bn && mo7570b())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    final void mo7572c() {
        m2979d();
        mo7566a(true);
        gyr gyr = this.f6194b;
        if (gyr != null) {
            gyr.mo7553M();
        }
    }

    /* renamed from: a */
    final void mo7565a(hhx hhx) {
        this.f6193a.setClickable(false);
        this.f6203k.mo7672b(false);
        this.f6193a.setSwitchButtonClickEnabled(false);
        this.f6204l.mo13553a(C0252go.f5862bH);
        gyr gyr = this.f6194b;
        if (gyr != null && gyr.mo7556r() == hhx.PHOTO && hhx == hhx.VIDEO) {
            this.f6194b.mo7555b(hhx);
        }
    }

    /* renamed from: b */
    public final void mo7569b(hhx hhx) {
        if (hhx != null) {
            this.f6198f = hhx;
            this.f6206n = ((Integer) this.f6207o.get(hhx)).intValue();
        }
        gza gza = this.f6196d;
        if (gza != null) {
            gza.f6211d = 0;
            gza.f6208a = 0.0f;
            gza.f6209b = 0.0f;
            gyz gyz = gza.f6210c;
            gyz.m2979d();
            gyz.mo7566a(true);
        }
    }

    /* renamed from: a */
    public final void mo7566a(boolean z) {
        this.f6196d.f6212e = z;
        this.f6193a.setSwitchButtonClickEnabled(z);
        this.f6202j.mo13526a(z);
    }

    /* renamed from: a */
    public final void mo7564a(float f, int i) {
        if (mo7571b(i)) {
            hhx a = mo7563a(i);
            if (a != null && this.f6207o.containsKey(a)) {
                int intValue = ((Integer) this.f6207o.get(a)).intValue();
                int i2 = this.f6206n;
                if (intValue < i2) {
                    intValue = C0252go.f5895bo;
                } else if (intValue > i2) {
                    intValue = C0252go.f5894bn;
                } else {
                    return;
                }
                mo7566a(false);
                this.f6195c.mo12642a();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 1.0f});
                ofFloat.setDuration(250);
                ofFloat.addUpdateListener(new gys(this, intValue));
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) ((1.0f - f) * 250.0f), 0});
                ofInt.setDuration(250);
                ofInt.addUpdateListener(new gyt(this, a, intValue));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
                animatorSet.addListener(new gyx(this, a));
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public final void mo7568b(float f, int i) {
        if (f == 0.0f) {
            this.f6195c.setVisibility(8);
            this.f6197e = false;
        } else if (mo7571b(i)) {
            hhx a = mo7563a(i);
            if (a != null) {
                mo7566a(false);
                this.f6195c.mo12642a();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
                ofFloat.setDuration(250);
                ofFloat.addUpdateListener(new gyu(this, i));
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) ((1.0f - f) * 250.0f), ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS});
                ofInt.setDuration(250);
                ofInt.addUpdateListener(new gyv(this, a, i));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
                animatorSet.addListener(new gyy(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: c */
    final void mo7573c(hhx hhx) {
        gyr gyr = this.f6194b;
        if (!(gyr == null || hhx == null)) {
            this.f6198f = gyr.mo7556r();
            if (!this.f6201i.mo1826c()) {
                mo7566a(false);
                if (this.f6198f != hhx) {
                    this.f6194b.mo7554a(hhx);
                    this.f6206n = ((Integer) jri.m13404b((Integer) this.f6207o.get(hhx))).intValue();
                    this.f6198f = hhx;
                    if (this.f6199g) {
                        ((gzf) this.f6200h.mo9706a()).mo7581c();
                    }
                }
            } else if (!this.f6199g) {
                if (this.f6198f == hhx.PHOTO) {
                    this.f6193a.setProgress(1.0f, true);
                    return;
                } else {
                    this.f6193a.setProgress(1.0f, false);
                    return;
                }
            } else {
                return;
            }
        }
        this.f6197e = false;
    }
}
