package p000;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.p001v4.app.NavUtils;
import android.support.p002v7.view.menu.ExpandedMenuView;
import android.support.p002v7.widget.ActionBarContextView;
import android.support.p002v7.widget.ContentFrameLayout;
import android.support.p002v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.LogLevel;

/* compiled from: PG */
/* renamed from: mg */
public final class C0713mg extends C0370mf implements Factory2, C0406oq {
    /* renamed from: q */
    private static final int[] f22039q = new int[]{16842836};
    /* renamed from: A */
    private TextView f22040A;
    /* renamed from: B */
    private View f22041B;
    /* renamed from: C */
    private boolean f22042C;
    /* renamed from: D */
    private boolean f22043D;
    /* renamed from: E */
    private boolean f22044E;
    /* renamed from: F */
    private boolean f22045F;
    /* renamed from: G */
    private boolean f22046G;
    /* renamed from: H */
    private boolean f22047H;
    /* renamed from: I */
    private boolean f22048I;
    /* renamed from: J */
    private C0375mt[] f22049J;
    /* renamed from: K */
    private boolean f22050K;
    /* renamed from: L */
    private int f22051L = -100;
    /* renamed from: M */
    private boolean f22052M;
    /* renamed from: N */
    private C0373mq f22053N;
    /* renamed from: O */
    private final Runnable f22054O = new C0371mh(this);
    /* renamed from: P */
    private boolean f22055P;
    /* renamed from: Q */
    private Rect f22056Q;
    /* renamed from: R */
    private Rect f22057R;
    /* renamed from: S */
    private C0376mw f22058S;
    /* renamed from: b */
    public final Context f22059b;
    /* renamed from: c */
    public final Window f22060c;
    /* renamed from: d */
    public final C0369me f22061d;
    /* renamed from: e */
    public C0461rt f22062e;
    /* renamed from: f */
    public C0387nn f22063f;
    /* renamed from: g */
    public ActionBarContextView f22064g;
    /* renamed from: h */
    public PopupWindow f22065h;
    /* renamed from: i */
    public Runnable f22066i;
    /* renamed from: j */
    public C0328kd f22067j = null;
    /* renamed from: k */
    public boolean f22068k = true;
    /* renamed from: l */
    public boolean f22069l;
    /* renamed from: m */
    public C0375mt f22070m;
    /* renamed from: n */
    public boolean f22071n;
    /* renamed from: o */
    public boolean f22072o;
    /* renamed from: p */
    public int f22073p;
    /* renamed from: r */
    private final Callback f22074r;
    /* renamed from: s */
    private final Callback f22075s;
    /* renamed from: t */
    private C0359lt f22076t;
    /* renamed from: u */
    private MenuInflater f22077u;
    /* renamed from: v */
    private CharSequence f22078v;
    /* renamed from: w */
    private C0715mm f22079w;
    /* renamed from: x */
    private C0719mu f22080x;
    /* renamed from: y */
    private boolean f22081y;
    /* renamed from: z */
    private ViewGroup f22082z;

    C0713mg(Context context, Window window, C0369me c0369me) {
        this.f22059b = context;
        this.f22060c = window;
        this.f22061d = c0369me;
        this.f22074r = this.f22060c.getCallback();
        Callback callback = this.f22074r;
        if (callback instanceof C0717mp) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f22075s = new C0717mp(this, callback);
        this.f22060c.setCallback(this.f22075s);
        C0540vk a = C0540vk.m6108a(context, null, f22039q);
        Drawable c = a.mo11392c(0);
        if (c != null) {
            this.f22060c.setBackgroundDrawable(c);
        }
        a.f9927b.recycle();
    }

    /* renamed from: a */
    public final void mo10673a(View view, LayoutParams layoutParams) {
        m14312p();
        ((ViewGroup) this.f22082z.findViewById(16908290)).addView(view, layoutParams);
        this.f22074r.onContentChanged();
    }

    /* renamed from: a */
    public final boolean mo10675a() {
        boolean z;
        int z2;
        int i = this.f22051L;
        if (i == -100) {
            i = C0370mf.f9193a;
        }
        switch (i) {
            case 0:
                if (((UiModeManager) this.f22059b.getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    m14311o();
                    C0373mq c0373mq = this.f22053N;
                    c0373mq.f9197b = c0373mq.f9196a.mo10702a();
                    if (!c0373mq.f9197b) {
                        z2 = true;
                        break;
                    }
                    z2 = 2;
                    break;
                }
            case LogLevel.kLogNever /*-100*/:
                z2 = -1;
                break;
            default:
                z2 = i;
                break;
        }
        if (z2 == -1) {
            z2 = false;
        } else {
            Resources resources = this.f22059b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            if (z2 == 2) {
                z2 = 32;
            } else {
                z2 = 16;
            }
            if (i2 == z2) {
                z2 = false;
            } else if (m14315s()) {
                ((Activity) this.f22059b).recreate();
                z2 = true;
            } else {
                Configuration configuration2 = new Configuration(configuration);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                configuration2.uiMode = z2 | (configuration2.uiMode & -49);
                resources.updateConfiguration(configuration2, displayMetrics);
                z2 = true;
            }
        }
        if (i == 0) {
            m14311o();
            C0373mq c0373mq2 = this.f22053N;
            c0373mq2.mo10692a();
            if (c0373mq2.f9198c == null) {
                c0373mq2.f9198c = new C0374mr(c0373mq2);
            }
            if (c0373mq2.f9199d == null) {
                c0373mq2.f9199d = new IntentFilter();
                c0373mq2.f9199d.addAction("android.intent.action.TIME_SET");
                c0373mq2.f9199d.addAction("android.intent.action.TIMEZONE_CHANGED");
                c0373mq2.f9199d.addAction("android.intent.action.TIME_TICK");
            }
            c0373mq2.f9200e.f22059b.registerReceiver(c0373mq2.f9198c, c0373mq2.f9199d);
        }
        this.f22052M = true;
        return z2;
    }

    /* renamed from: a */
    final void mo14215a(int i, C0375mt c0375mt, Menu menu) {
        if (menu == null) {
            if (c0375mt == null && i >= 0) {
                C0375mt[] c0375mtArr = this.f22049J;
                if (i < c0375mtArr.length) {
                    c0375mt = c0375mtArr[i];
                }
            }
            if (c0375mt != null) {
                menu = c0375mt.f9209h;
            }
        }
        if ((c0375mt == null || c0375mt.f9214m) && !this.f22071n) {
            this.f22074r.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    final void mo14217a(C0734op c0734op) {
        if (!this.f22048I) {
            this.f22048I = true;
            this.f22062e.mo11056b();
            Callback callback = this.f22060c.getCallback();
            if (!(callback == null || this.f22071n)) {
                callback.onPanelClosed(108, c0734op);
            }
            this.f22048I = false;
        }
    }

    /* renamed from: a */
    final void mo14216a(C0375mt c0375mt, boolean z) {
        if (z && c0375mt.f9202a == 0) {
            C0461rt c0461rt = this.f22062e;
            if (c0461rt != null && c0461rt.mo11059f()) {
                mo14217a(c0375mt.f9209h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f22059b.getSystemService("window");
        if (windowManager != null && c0375mt.f9214m) {
            View view = c0375mt.f9206e;
            if (view != null) {
                windowManager.removeView(view);
                if (z) {
                    mo14215a(c0375mt.f9202a, c0375mt, null);
                }
            }
        }
        c0375mt.f9212k = false;
        c0375mt.f9213l = false;
        c0375mt.f9214m = false;
        c0375mt.f9207f = null;
        c0375mt.f9216o = true;
        if (this.f22070m == c0375mt) {
            this.f22070m = null;
        }
    }

    /* renamed from: a */
    private final android.view.View m14308a(java.lang.String r6, android.content.Context r7, android.util.AttributeSet r8) {
        /*
        r5 = this;
        r1 = 0;
        r0 = r5.f22058S;
        if (r0 != 0) goto L_0x0028;
    L_0x0005:
        r0 = r5.f22059b;
        r2 = p000.C0382ni.f9303aj;
        r0 = r0.obtainStyledAttributes(r2);
        r2 = p000.C0382ni.f9307an;
        r2 = r0.getString(r2);
        if (r2 == 0) goto L_0x0021;
    L_0x0015:
        r0 = p000.C0376mw.class;
        r0 = r0.getName();
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0144;
    L_0x0021:
        r0 = new mw;
        r0.<init>();
        r5.f22058S = r0;
    L_0x0028:
        r2 = r5.f22058S;
        r3 = p000.C0376mw.m5670n(r7, r8);
        r0 = r6.hashCode();
        switch(r0) {
            case -1946472170: goto L_0x0138;
            case -1455429095: goto L_0x012c;
            case -1346021293: goto L_0x0120;
            case -938935918: goto L_0x0115;
            case -937446323: goto L_0x010a;
            case -658531749: goto L_0x00fe;
            case -339785223: goto L_0x00f3;
            case 776382189: goto L_0x00e8;
            case 1125864064: goto L_0x00dd;
            case 1413872058: goto L_0x00d1;
            case 1601505219: goto L_0x00c6;
            case 1666676343: goto L_0x00bb;
            case 2001146706: goto L_0x00b0;
            default: goto L_0x0035;
        };
    L_0x0035:
        r0 = -1;
    L_0x0036:
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x00a8;
            case 2: goto L_0x00a0;
            case 3: goto L_0x0098;
            case 4: goto L_0x0090;
            case 5: goto L_0x0088;
            case 6: goto L_0x0080;
            case 7: goto L_0x0078;
            case 8: goto L_0x0070;
            case 9: goto L_0x0068;
            case 10: goto L_0x0060;
            case 11: goto L_0x0058;
            case 12: goto L_0x0050;
            default: goto L_0x0039;
        };
    L_0x0039:
        r0 = 0;
    L_0x003a:
        if (r0 != 0) goto L_0x0042;
    L_0x003c:
        if (r7 == r3) goto L_0x0042;
    L_0x003e:
        r0 = r2.mo10695a(r3, r6, r8);
    L_0x0042:
        if (r0 == 0) goto L_0x0047;
    L_0x0044:
        p000.C0376mw.m5657a(r0, r8);
    L_0x0047:
        return r0;
    L_0x0048:
        r0 = p000.C0376mw.m5669m(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0050:
        r0 = p000.C0376mw.m5667k(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0058:
        r0 = p000.C0376mw.m5666j(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0060:
        r0 = p000.C0376mw.m5664h(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0068:
        r0 = p000.C0376mw.m5658b(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0070:
        r0 = p000.C0376mw.m5660d(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0078:
        r0 = p000.C0376mw.m5665i(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0080:
        r0 = p000.C0376mw.m5659c(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0088:
        r0 = p000.C0376mw.m5662f(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0090:
        r0 = p000.C0376mw.m5668l(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x0098:
        r0 = p000.C0376mw.m5661e(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x00a0:
        r0 = r2.mo10696a(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x00a8:
        r0 = p000.C0376mw.m5663g(r3, r8);
        r2.mo10697a(r0, r6);
        goto L_0x003a;
    L_0x00b0:
        r0 = "Button";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00b8:
        r0 = 2;
        goto L_0x0036;
    L_0x00bb:
        r0 = "EditText";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00c3:
        r0 = 3;
        goto L_0x0036;
    L_0x00c6:
        r0 = "CheckBox";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00ce:
        r0 = 6;
        goto L_0x0036;
    L_0x00d1:
        r0 = "AutoCompleteTextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00d9:
        r0 = 9;
        goto L_0x0036;
    L_0x00dd:
        r0 = "ImageView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00e5:
        r0 = 1;
        goto L_0x0036;
    L_0x00e8:
        r0 = "RadioButton";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00f0:
        r0 = 7;
        goto L_0x0036;
    L_0x00f3:
        r0 = "Spinner";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x00fb:
        r0 = 4;
        goto L_0x0036;
    L_0x00fe:
        r0 = "SeekBar";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0106:
        r0 = 12;
        goto L_0x0036;
    L_0x010a:
        r0 = "ImageButton";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0112:
        r0 = 5;
        goto L_0x0036;
    L_0x0115:
        r0 = "TextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x011d:
        r0 = r1;
        goto L_0x0036;
    L_0x0120:
        r0 = "MultiAutoCompleteTextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0128:
        r0 = 10;
        goto L_0x0036;
    L_0x012c:
        r0 = "CheckedTextView";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0134:
        r0 = 8;
        goto L_0x0036;
    L_0x0138:
        r0 = "RatingBar";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x0140:
        r0 = 11;
        goto L_0x0036;
    L_0x0144:
        r0 = java.lang.Class.forName(r2);	 Catch:{ all -> 0x015c }
        r3 = 0;
        r3 = new java.lang.Class[r3];	 Catch:{ all -> 0x015c }
        r0 = r0.getDeclaredConstructor(r3);	 Catch:{ all -> 0x015c }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x015c }
        r0 = r0.newInstance(r3);	 Catch:{ all -> 0x015c }
        r0 = (p000.C0376mw) r0;	 Catch:{ all -> 0x015c }
        r5.f22058S = r0;	 Catch:{ all -> 0x015c }
        goto L_0x0028;
    L_0x015c:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Failed to instantiate custom view inflater ";
        r3.append(r4);
        r3.append(r2);
        r2 = ". Falling back to default.";
        r3.append(r2);
        r2 = "AppCompatDelegate";
        r3 = r3.toString();
        android.util.Log.i(r2, r3, r0);
        r0 = new mw;
        r0.<init>();
        r5.f22058S = r0;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.a(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: a */
    final boolean mo14218a(KeyEvent keyEvent) {
        boolean z = false;
        this.f22060c.getDecorView();
        C0315jm.m4625b();
        if (keyEvent.getKeyCode() == 82 && this.f22074r.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2;
        if (keyEvent.getAction() != 0) {
            C0375mt e;
            switch (keyCode) {
                case 4:
                    z2 = this.f22050K;
                    this.f22050K = false;
                    e = mo14222e(0);
                    if (e != null && e.f9214m) {
                        if (!z2) {
                            mo14216a(e, true);
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    }
                    C0387nn c0387nn = this.f22063f;
                    if (c0387nn != null) {
                        c0387nn.mo10741b();
                        z2 = true;
                    } else {
                        C0359lt c = mo10680c();
                        if (c == null) {
                            z2 = false;
                        } else if (c.mo10648b()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                    break;
                case 82:
                    if (this.f22063f != null) {
                        z = true;
                        break;
                    }
                    e = mo14222e(0);
                    C0461rt c0461rt = this.f22062e;
                    if (c0461rt == null || !c0461rt.mo11055a() || ViewConfiguration.get(this.f22059b).hasPermanentMenuKey()) {
                        z2 = e.f9214m;
                        if (z2 || e.f9213l) {
                            mo14216a(e, true);
                        } else if (e.f9212k) {
                            if (e.f9217p) {
                                e.f9212k = false;
                                z2 = mo14220a(e, keyEvent);
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                m14309b(e, keyEvent);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else if (this.f22062e.mo11059f()) {
                        z2 = this.f22062e.mo11057d();
                    } else if (this.f22071n) {
                        z2 = false;
                    } else if (mo14220a(e, keyEvent)) {
                        z2 = this.f22062e.mo11061i();
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z = true;
                        break;
                    }
                    AudioManager audioManager = (AudioManager) this.f22059b.getSystemService("audio");
                    if (audioManager == null) {
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        z = true;
                        break;
                    }
                    audioManager.playSoundEffect(0);
                    z = true;
                    break;
                    break;
            }
            if (z) {
                return true;
            }
        }
        switch (keyCode) {
            case 4:
                if ((keyEvent.getFlags() & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f22050K = z2;
                break;
            case 82:
                if (keyEvent.getRepeatCount() != 0) {
                    z = true;
                    break;
                }
                C0375mt e2 = mo14222e(0);
                if (!e2.f9214m) {
                    mo14220a(e2, keyEvent);
                    z = true;
                    break;
                }
                z = true;
                break;
        }
        if (z) {
            return true;
        }
        return C0315jm.m4621a();
    }

    /* renamed from: d */
    final void mo14221d(int i) {
        C0375mt e = mo14222e(i);
        if (e.f9209h != null) {
            Bundle bundle = new Bundle();
            e.f9209h.mo14312b(bundle);
            if (bundle.size() > 0) {
                e.f9218q = bundle;
            }
            e.f9209h.mo14332l();
            e.f9209h.clear();
        }
        e.f9217p = true;
        e.f9216o = true;
        if ((i == 108 || i == 0) && this.f22062e != null) {
            e = mo14222e(0);
            if (e != null) {
                e.f9212k = false;
                mo14220a(e, null);
            }
        }
    }

    /* renamed from: l */
    public final void mo14224l() {
        C0328kd c0328kd = this.f22067j;
        if (c0328kd != null) {
            c0328kd.mo9762a();
        }
    }

    /* renamed from: o */
    private final void m14311o() {
        if (this.f22053N == null) {
            Context context = this.f22059b;
            if (C0380nc.f9235a == null) {
                Context applicationContext = context.getApplicationContext();
                C0380nc.f9235a = new C0380nc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f22053N = new C0373mq(this, C0380nc.f9235a);
        }
    }

    /* renamed from: p */
    private final void m14312p() {
        if (!this.f22081y) {
            TypedArray obtainStyledAttributes = this.f22059b.obtainStyledAttributes(C0382ni.f9303aj);
            if (obtainStyledAttributes.hasValue(C0382ni.f9308ao)) {
                View view;
                if (obtainStyledAttributes.getBoolean(C0382ni.f9315av, false)) {
                    mo10679b(1);
                } else if (obtainStyledAttributes.getBoolean(C0382ni.f9308ao, false)) {
                    mo10679b(108);
                }
                if (obtainStyledAttributes.getBoolean(C0382ni.f9309ap, false)) {
                    mo10679b(109);
                }
                if (obtainStyledAttributes.getBoolean(C0382ni.f9310aq, false)) {
                    mo10679b(10);
                }
                this.f22046G = obtainStyledAttributes.getBoolean(C0382ni.f9305al, false);
                obtainStyledAttributes.recycle();
                this.f22060c.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f22059b);
                View view2;
                if (this.f22047H) {
                    if (this.f22045F) {
                        view2 = (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, null);
                    } else {
                        ViewGroup view22 = (ViewGroup) from.inflate(R.layout.abc_screen_simple, null);
                    }
                    C0315jm.m4619a(view22, new C0714mi(this));
                    view = view22;
                } else if (this.f22046G) {
                    view22 = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, null);
                    this.f22044E = false;
                    this.f22069l = false;
                    view = view22;
                } else if (this.f22069l) {
                    Context c0390nq;
                    TypedValue typedValue = new TypedValue();
                    this.f22059b.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        c0390nq = new C0390nq(this.f22059b, typedValue.resourceId);
                    } else {
                        c0390nq = this.f22059b;
                    }
                    view22 = (ViewGroup) LayoutInflater.from(c0390nq).inflate(R.layout.abc_screen_toolbar, null);
                    this.f22062e = (C0461rt) view22.findViewById(R.id.decor_content_parent);
                    this.f22062e.mo11053a(this.f22060c.getCallback());
                    if (this.f22044E) {
                        this.f22062e.mo11051a(109);
                    }
                    if (this.f22042C) {
                        this.f22062e.mo11051a(2);
                    }
                    if (this.f22043D) {
                        this.f22062e.mo11051a(5);
                        view = view22;
                    } else {
                        view = view22;
                    }
                } else {
                    view = null;
                }
                if (view == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
                    stringBuilder.append(this.f22069l);
                    stringBuilder.append(", windowActionBarOverlay: ");
                    stringBuilder.append(this.f22044E);
                    stringBuilder.append(", android:windowIsFloating: ");
                    stringBuilder.append(this.f22046G);
                    stringBuilder.append(", windowActionModeOverlay: ");
                    stringBuilder.append(this.f22045F);
                    stringBuilder.append(", windowNoTitle: ");
                    stringBuilder.append(this.f22047H);
                    stringBuilder.append(" }");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                CharSequence title;
                if (this.f22062e == null) {
                    this.f22040A = (TextView) view.findViewById(R.id.title);
                }
                C0549vx.m6139b(view);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup = (ViewGroup) this.f22060c.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.f22060c.setContentView(view);
                contentFrameLayout.f655h = new C0460rs(this);
                this.f22082z = view;
                Callback callback = this.f22074r;
                if (callback instanceof Activity) {
                    title = ((Activity) callback).getTitle();
                } else {
                    title = this.f22078v;
                }
                if (!TextUtils.isEmpty(title)) {
                    C0461rt c0461rt = this.f22062e;
                    if (c0461rt != null) {
                        c0461rt.mo11054a(title);
                    } else {
                        C0359lt c0359lt = this.f22076t;
                        if (c0359lt != null) {
                            c0359lt.mo10646b(title);
                        } else {
                            TextView textView = this.f22040A;
                            if (textView != null) {
                                textView.setText(title);
                            }
                        }
                    }
                }
                contentFrameLayout = (ContentFrameLayout) this.f22082z.findViewById(16908290);
                View decorView = this.f22060c.getDecorView();
                contentFrameLayout.f654g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                if (C0315jm.m4649x(contentFrameLayout)) {
                    contentFrameLayout.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.f22059b.obtainStyledAttributes(C0382ni.f9303aj);
                if (contentFrameLayout.f648a == null) {
                    contentFrameLayout.f648a = new TypedValue();
                }
                obtainStyledAttributes2.getValue(10, contentFrameLayout.f648a);
                if (contentFrameLayout.f649b == null) {
                    contentFrameLayout.f649b = new TypedValue();
                }
                obtainStyledAttributes2.getValue(11, contentFrameLayout.f649b);
                if (obtainStyledAttributes2.hasValue(C0382ni.f9313at)) {
                    if (contentFrameLayout.f650c == null) {
                        contentFrameLayout.f650c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(6, contentFrameLayout.f650c);
                }
                if (obtainStyledAttributes2.hasValue(C0382ni.f9314au)) {
                    if (contentFrameLayout.f651d == null) {
                        contentFrameLayout.f651d = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(8, contentFrameLayout.f651d);
                }
                if (obtainStyledAttributes2.hasValue(C0382ni.f9311ar)) {
                    if (contentFrameLayout.f652e == null) {
                        contentFrameLayout.f652e = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(9, contentFrameLayout.f652e);
                }
                if (obtainStyledAttributes2.hasValue(C0382ni.f9312as)) {
                    if (contentFrameLayout.f653f == null) {
                        contentFrameLayout.f653f = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(7, contentFrameLayout.f653f);
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout.requestLayout();
                this.f22081y = true;
                C0375mt e = mo14222e(0);
                if (!this.f22071n) {
                    if (e == null || e.f9209h == null) {
                        m14310g(108);
                        return;
                    }
                    return;
                }
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: a */
    final C0375mt mo14213a(Menu menu) {
        int length;
        C0375mt[] c0375mtArr = this.f22049J;
        if (c0375mtArr != null) {
            length = c0375mtArr.length;
        } else {
            length = 0;
        }
        for (int i = 0; i < length; i++) {
            C0375mt c0375mt = c0375mtArr[i];
            if (c0375mt != null && c0375mt.f9209h == menu) {
                return c0375mt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final View mo10670a(int i) {
        m14312p();
        return this.f22060c.findViewById(i);
    }

    /* renamed from: q */
    private final Context m14313q() {
        Context d;
        C0359lt c = mo10680c();
        if (c != null) {
            d = c.mo10651d();
        } else {
            d = null;
        }
        if (d == null) {
            return this.f22059b;
        }
        return d;
    }

    /* renamed from: b */
    public final MenuInflater mo10676b() {
        if (this.f22077u == null) {
            Context context;
            m14314r();
            C0359lt c0359lt = this.f22076t;
            if (c0359lt == null) {
                context = this.f22059b;
            } else {
                context = c0359lt.mo10651d();
            }
            this.f22077u = new C0392nu(context);
        }
        return this.f22077u;
    }

    /* renamed from: e */
    public final C0375mt mo14222e(int i) {
        Object obj = this.f22049J;
        if (obj == null || obj.length <= i) {
            Object obj2 = new C0375mt[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f22049J = obj2;
            obj = obj2;
        }
        C0375mt c0375mt = obj[i];
        if (c0375mt != null) {
            return c0375mt;
        }
        c0375mt = new C0375mt(i);
        obj[i] = c0375mt;
        return c0375mt;
    }

    /* renamed from: c */
    public final C0359lt mo10680c() {
        m14314r();
        return this.f22076t;
    }

    /* renamed from: r */
    private final void m14314r() {
        m14312p();
        if (this.f22069l && this.f22076t == null) {
            Callback callback = this.f22074r;
            if (callback instanceof Activity) {
                this.f22076t = new C0724ne((Activity) callback, this.f22044E);
            } else if (callback instanceof Dialog) {
                this.f22076t = new C0724ne((Dialog) callback);
            }
            C0359lt c0359lt = this.f22076t;
            if (c0359lt != null) {
                c0359lt.mo10647b(this.f22055P);
            }
        }
    }

    /* renamed from: d */
    public final void mo10682d() {
        LayoutInflater from = LayoutInflater.from(this.f22059b);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof C0713mg)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: e */
    public final void mo10683e() {
        C0359lt c = mo10680c();
        if (c != null) {
            c.mo10653e();
        }
        m14310g(0);
    }

    /* renamed from: g */
    private final void m14310g(int i) {
        this.f22073p |= 1 << i;
        if (!this.f22072o) {
            C0315jm.m4615a(this.f22060c.getDecorView(), this.f22054O);
            this.f22072o = true;
        }
    }

    /* renamed from: f */
    public final void mo10684f() {
        if (this.f22069l && this.f22081y) {
            C0359lt c = mo10680c();
            if (c != null) {
                c.mo10654f();
            }
        }
        C0436qq a = C0436qq.m5787a();
        Context context = this.f22059b;
        synchronized (a.f9580a) {
            C0291in c0291in = (C0291in) a.f9581b.get(context);
            if (c0291in != null) {
                c0291in.mo8625a();
            }
        }
        mo10675a();
    }

    /* renamed from: a */
    public final void mo10671a(Bundle bundle) {
        Callback callback = this.f22074r;
        if ((callback instanceof Activity) && NavUtils.getParentActivityName((Activity) callback) != null) {
            C0359lt c0359lt = this.f22076t;
            if (c0359lt == null) {
                this.f22055P = true;
            } else {
                c0359lt.mo10647b(true);
            }
        }
        if (bundle != null && this.f22051L == -100) {
            this.f22051L = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m14308a(str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: g */
    public final void mo10685g() {
        if (this.f22072o) {
            this.f22060c.getDecorView().removeCallbacks(this.f22054O);
        }
        this.f22071n = true;
        C0359lt c0359lt = this.f22076t;
        if (c0359lt != null) {
            c0359lt.mo10655g();
        }
        C0373mq c0373mq = this.f22053N;
        if (c0373mq != null) {
            c0373mq.mo10692a();
        }
    }

    /* renamed from: a */
    public final boolean mo10834a(C0734op c0734op, MenuItem menuItem) {
        Callback callback = this.f22060c.getCallback();
        if (!(callback == null || this.f22071n)) {
            C0375mt a = mo14213a(c0734op.mo14320d());
            if (a != null) {
                return callback.onMenuItemSelected(a.f9202a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void mo10835m() {
        C0461rt c0461rt = this.f22062e;
        if (c0461rt == null || !c0461rt.mo11055a() || (ViewConfiguration.get(this.f22059b).hasPermanentMenuKey() && !this.f22062e.mo11058e())) {
            C0375mt e = mo14222e(0);
            e.f9216o = true;
            mo14216a(e, false);
            m14309b(e, null);
            return;
        }
        Callback callback = this.f22060c.getCallback();
        if (this.f22062e.mo11059f()) {
            this.f22062e.mo11057d();
            if (!this.f22071n) {
                callback.onPanelClosed(108, mo14222e(0).f9209h);
            }
        } else if (callback != null && !this.f22071n) {
            if (this.f22072o && (this.f22073p & 1) != 0) {
                this.f22060c.getDecorView().removeCallbacks(this.f22054O);
                this.f22054O.run();
            }
            C0375mt e2 = mo14222e(0);
            Menu menu = e2.f9209h;
            if (menu != null && !e2.f9217p && callback.onPreparePanel(0, e2.f9208g, menu)) {
                callback.onMenuOpened(108, e2.f9209h);
                this.f22062e.mo11061i();
            }
        }
    }

    /* renamed from: h */
    public final void mo10686h() {
        m14312p();
    }

    /* renamed from: i */
    public final void mo10687i() {
        C0359lt c = mo10680c();
        if (c != null) {
            c.mo10652d(true);
        }
    }

    /* renamed from: b */
    public final void mo10677b(Bundle bundle) {
        int i = this.f22051L;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: j */
    public final void mo10688j() {
        mo10675a();
    }

    /* renamed from: k */
    public final void mo10689k() {
        C0359lt c = mo10680c();
        if (c != null) {
            c.mo10652d(false);
        }
        C0373mq c0373mq = this.f22053N;
        if (c0373mq != null) {
            c0373mq.mo10692a();
        }
    }

    /* renamed from: b */
    private final void m14309b(C0375mt c0375mt, KeyEvent keyEvent) {
        int i = -1;
        if (!c0375mt.f9214m && !this.f22071n) {
            if (c0375mt.f9202a != 0 || (this.f22059b.getResources().getConfiguration().screenLayout & 15) != 4) {
                Callback callback = this.f22060c.getCallback();
                if (callback == null || callback.onMenuOpened(c0375mt.f9202a, c0375mt.f9209h)) {
                    WindowManager windowManager = (WindowManager) this.f22059b.getSystemService("window");
                    if (windowManager != null && mo14220a(c0375mt, keyEvent)) {
                        LayoutParams layoutParams;
                        ViewGroup viewGroup = c0375mt.f9206e;
                        View view;
                        if (viewGroup == null || c0375mt.f9216o) {
                            boolean z;
                            if (viewGroup == null) {
                                Context q = m14313q();
                                TypedValue typedValue = new TypedValue();
                                Theme newTheme = q.getResources().newTheme();
                                newTheme.setTo(q.getTheme());
                                newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                }
                                newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                } else {
                                    newTheme.applyStyle(R.style.Theme.AppCompat.CompactMenu, true);
                                }
                                Context c0390nq = new C0390nq(q, 0);
                                c0390nq.getTheme().setTo(newTheme);
                                c0375mt.f9211j = c0390nq;
                                TypedArray obtainStyledAttributes = c0390nq.obtainStyledAttributes(C0382ni.f9303aj);
                                c0375mt.f9203b = obtainStyledAttributes.getResourceId(C0382ni.f9306am, 0);
                                c0375mt.f9205d = obtainStyledAttributes.getResourceId(C0382ni.f9304ak, 0);
                                obtainStyledAttributes.recycle();
                                c0375mt.f9206e = new C0718ms(this, c0375mt.f9211j);
                                c0375mt.f9204c = 81;
                                if (c0375mt.f9206e == null) {
                                    return;
                                }
                            } else if (c0375mt.f9216o && viewGroup.getChildCount() > 0) {
                                c0375mt.f9206e.removeAllViews();
                            }
                            view = c0375mt.f9208g;
                            if (view != null) {
                                c0375mt.f9207f = view;
                                z = true;
                            } else if (c0375mt.f9209h == null) {
                                z = false;
                            } else {
                                ExpandedMenuView expandedMenuView;
                                if (this.f22080x == null) {
                                    this.f22080x = new C0719mu(this);
                                }
                                C0411pf c0411pf = this.f22080x;
                                if (c0375mt.f9209h != null) {
                                    if (c0375mt.f9210i == null) {
                                        c0375mt.f9210i = new C0733om(c0375mt.f9211j);
                                        C0410pe c0410pe = c0375mt.f9210i;
                                        c0410pe.f22172e = c0411pf;
                                        c0375mt.f9209h.mo14296a(c0410pe);
                                    }
                                    Object obj = c0375mt.f9210i;
                                    viewGroup = c0375mt.f9206e;
                                    if (obj.f22170c == null) {
                                        obj.f22170c = (ExpandedMenuView) obj.f22168a.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
                                        if (obj.f22173f == null) {
                                            obj.f22173f = new C0404on(obj);
                                        }
                                        obj.f22170c.setAdapter(obj.f22173f);
                                        obj.f22170c.setOnItemClickListener(obj);
                                    }
                                    expandedMenuView = obj.f22170c;
                                } else {
                                    expandedMenuView = null;
                                }
                                c0375mt.f9207f = expandedMenuView;
                                if (c0375mt.f9207f != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                if (c0375mt.f9207f == null) {
                                    z = false;
                                } else if (c0375mt.f9208g != null) {
                                    z = true;
                                } else if (c0375mt.f9210i.mo14290b().getCount() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    LayoutParams layoutParams2;
                                    layoutParams = c0375mt.f9207f.getLayoutParams();
                                    if (layoutParams == null) {
                                        layoutParams2 = new LayoutParams(-2, -2);
                                    } else {
                                        layoutParams2 = layoutParams;
                                    }
                                    c0375mt.f9206e.setBackgroundResource(c0375mt.f9203b);
                                    ViewParent parent = c0375mt.f9207f.getParent();
                                    if (parent != null && (parent instanceof ViewGroup)) {
                                        ((ViewGroup) parent).removeView(c0375mt.f9207f);
                                    }
                                    c0375mt.f9206e.addView(c0375mt.f9207f, layoutParams2);
                                    if (c0375mt.f9207f.hasFocus()) {
                                        i = -2;
                                    } else {
                                        c0375mt.f9207f.requestFocus();
                                        i = -2;
                                    }
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        view = c0375mt.f9208g;
                        if (view == null) {
                            i = -2;
                        } else {
                            layoutParams = view.getLayoutParams();
                            if (layoutParams == null) {
                                i = -2;
                            } else if (layoutParams.width != -1) {
                                i = -2;
                            }
                        }
                        c0375mt.f9213l = false;
                        layoutParams = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                        layoutParams.gravity = c0375mt.f9204c;
                        layoutParams.windowAnimations = c0375mt.f9205d;
                        windowManager.addView(c0375mt.f9206e, layoutParams);
                        c0375mt.f9214m = true;
                        return;
                    }
                    return;
                }
                mo14216a(c0375mt, true);
            }
        }
    }

    /* renamed from: a */
    final boolean mo14219a(C0375mt c0375mt, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if (!c0375mt.f9212k && !mo14220a(c0375mt, keyEvent)) {
            return false;
        }
        C0734op c0734op = c0375mt.f9209h;
        if (c0734op != null) {
            return c0734op.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: a */
    final boolean mo14220a(C0375mt c0375mt, KeyEvent keyEvent) {
        if (this.f22071n) {
            return false;
        }
        if (c0375mt.f9212k) {
            return true;
        }
        C0461rt c0461rt;
        C0375mt c0375mt2 = this.f22070m;
        if (!(c0375mt2 == null || c0375mt2 == c0375mt)) {
            mo14216a(c0375mt2, false);
        }
        Callback callback = this.f22060c.getCallback();
        if (callback != null) {
            c0375mt.f9208g = callback.onCreatePanelView(c0375mt.f9202a);
        }
        int i = c0375mt.f9202a;
        boolean z = i == 0 ? true : i == 108;
        if (z) {
            c0461rt = this.f22062e;
            if (c0461rt != null) {
                c0461rt.mo11060g();
            }
        }
        if (c0375mt.f9208g == null && !(z && (this.f22076t instanceof C0721my))) {
            C0734op c0734op = c0375mt.f9209h;
            if (c0734op == null || c0375mt.f9217p) {
                if (c0734op == null) {
                    Context context;
                    Context context2 = this.f22059b;
                    i = c0375mt.f9202a;
                    if (i != 0 && i != 108) {
                        context = context2;
                    } else if (this.f22062e != null) {
                        Theme newTheme;
                        Theme theme;
                        TypedValue typedValue = new TypedValue();
                        Theme theme2 = context2.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme = context2.getResources().newTheme();
                            newTheme.setTo(theme2);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            newTheme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            newTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (newTheme == null) {
                                newTheme = context2.getResources().newTheme();
                                newTheme.setTo(theme2);
                            }
                            newTheme.applyStyle(typedValue.resourceId, true);
                            theme = newTheme;
                        } else {
                            theme = newTheme;
                        }
                        if (theme != null) {
                            context = new C0390nq(context2, 0);
                            context.getTheme().setTo(theme);
                        } else {
                            context = context2;
                        }
                    } else {
                        context = context2;
                    }
                    C0734op c0734op2 = new C0734op(context);
                    c0734op2.mo14295a((C0406oq) this);
                    c0375mt.mo10694a(c0734op2);
                    if (c0375mt.f9209h == null) {
                        return false;
                    }
                }
                if (z && this.f22062e != null) {
                    if (this.f22079w == null) {
                        this.f22079w = new C0715mm(this);
                    }
                    this.f22062e.mo11052a(c0375mt.f9209h, this.f22079w);
                }
                c0375mt.f9209h.mo14332l();
                if (callback.onCreatePanelMenu(c0375mt.f9202a, c0375mt.f9209h)) {
                    c0375mt.f9217p = false;
                } else {
                    c0375mt.mo10694a(null);
                    if (!z) {
                        return false;
                    }
                    c0461rt = this.f22062e;
                    if (c0461rt == null) {
                        return false;
                    }
                    c0461rt.mo11052a(null, this.f22079w);
                    return false;
                }
            }
            c0375mt.f9209h.mo14332l();
            Bundle bundle = c0375mt.f9218q;
            if (bundle != null) {
                c0375mt.f9209h.mo14294a(bundle);
                c0375mt.f9218q = null;
            }
            if (callback.onPreparePanel(0, c0375mt.f9208g, c0375mt.f9209h)) {
                boolean z2;
                if (keyEvent == null) {
                    i = -1;
                } else {
                    i = keyEvent.getDeviceId();
                }
                if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0375mt.f9215n = z2;
                c0375mt.f9209h.setQwertyMode(c0375mt.f9215n);
                c0375mt.f9209h.mo14331k();
            } else {
                if (z) {
                    c0461rt = this.f22062e;
                    if (c0461rt != null) {
                        c0461rt.mo11052a(null, this.f22079w);
                    }
                }
                c0375mt.f9209h.mo14331k();
                return false;
            }
        }
        c0375mt.f9212k = true;
        c0375mt.f9213l = false;
        this.f22070m = c0375mt;
        return true;
    }

    /* renamed from: b */
    public final boolean mo10679b(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f22047H && i == 108) {
            return false;
        }
        if (this.f22069l && i == 1) {
            this.f22069l = false;
        }
        switch (i) {
            case 1:
                m14316t();
                this.f22047H = true;
                return true;
            case 2:
                m14316t();
                this.f22042C = true;
                return true;
            case 5:
                m14316t();
                this.f22043D = true;
                return true;
            case 10:
                m14316t();
                this.f22045F = true;
                return true;
            case 108:
                m14316t();
                this.f22069l = true;
                return true;
            case 109:
                m14316t();
                this.f22044E = true;
                return true;
            default:
                return this.f22060c.requestFeature(i);
        }
    }

    /* renamed from: c */
    public final void mo10681c(int i) {
        m14312p();
        ViewGroup viewGroup = (ViewGroup) this.f22082z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f22059b).inflate(i, viewGroup);
        this.f22074r.onContentChanged();
    }

    /* renamed from: a */
    public final void mo10672a(View view) {
        m14312p();
        ViewGroup viewGroup = (ViewGroup) this.f22082z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f22074r.onContentChanged();
    }

    /* renamed from: b */
    public final void mo10678b(View view, LayoutParams layoutParams) {
        m14312p();
        ViewGroup viewGroup = (ViewGroup) this.f22082z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f22074r.onContentChanged();
    }

    /* renamed from: a */
    public final void mo10674a(CharSequence charSequence) {
        this.f22078v = charSequence;
        C0461rt c0461rt = this.f22062e;
        if (c0461rt != null) {
            c0461rt.mo11054a(charSequence);
            return;
        }
        C0359lt c0359lt = this.f22076t;
        if (c0359lt != null) {
            c0359lt.mo10646b(charSequence);
            return;
        }
        TextView textView = this.f22040A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: n */
    final boolean mo14225n() {
        if (this.f22081y) {
            View view = this.f22082z;
            if (view != null && C0315jm.m4649x(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    private final boolean m14315s() {
        if (this.f22052M) {
            Context context = this.f22059b;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f22059b;
                    if ((packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (Throwable e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    final C0387nn mo14214a(C0388no c0388no) {
        mo14224l();
        C0387nn c0387nn = this.f22063f;
        if (c0387nn != null) {
            c0387nn.mo10741b();
        }
        C0369me c0369me = this.f22061d;
        if (!(c0369me == null || this.f22071n)) {
            try {
                c0369me.mo10669d();
            } catch (AbstractMethodError e) {
            }
        }
        if (this.f22064g == null) {
            if (this.f22046G) {
                Context c0390nq;
                TypedValue typedValue = new TypedValue();
                Theme theme = this.f22059b.getTheme();
                theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Theme newTheme = this.f22059b.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    c0390nq = new C0390nq(this.f22059b, 0);
                    c0390nq.getTheme().setTo(newTheme);
                } else {
                    c0390nq = this.f22059b;
                }
                this.f22064g = new ActionBarContextView(c0390nq);
                this.f22065h = new PopupWindow(c0390nq, null, R.attr.actionModePopupWindowStyle);
                this.f22065h.setWindowLayoutType(2);
                this.f22065h.setContentView(this.f22064g);
                this.f22065h.setWidth(-1);
                c0390nq.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                this.f22064g.f9538d = TypedValue.complexToDimensionPixelSize(typedValue.data, c0390nq.getResources().getDisplayMetrics());
                this.f22065h.setHeight(-2);
                this.f22066i = new C0372mj(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f22082z.findViewById(R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.f764a = LayoutInflater.from(m14313q());
                    this.f22064g = (ActionBarContextView) viewStubCompat.mo1222a();
                }
            }
        }
        if (this.f22064g != null) {
            mo14224l();
            this.f22064g.mo12099b();
            c0387nn = new C0726nr(this.f22064g.getContext(), this.f22064g, c0388no);
            if (c0388no.mo10752a(c0387nn, c0387nn.mo10745d())) {
                c0387nn.mo10749h();
                this.f22064g.mo12097a(c0387nn);
                this.f22063f = c0387nn;
                if (mo14225n()) {
                    this.f22064g.setAlpha(0.0f);
                    this.f22067j = C0315jm.m4606a(this.f22064g).mo9758a(1.0f);
                    this.f22067j.mo9760a(new C0824ml(this));
                } else {
                    this.f22064g.setAlpha(1.0f);
                    this.f22064g.setVisibility(0);
                    this.f22064g.sendAccessibilityEvent(32);
                    if (this.f22064g.getParent() instanceof View) {
                        C0315jm.m4602B((View) this.f22064g.getParent());
                    }
                }
                if (this.f22065h != null) {
                    this.f22060c.getDecorView().post(this.f22066i);
                }
            } else {
                this.f22063f = null;
            }
        }
        if (this.f22063f != null) {
            c0369me = this.f22061d;
            if (c0369me != null) {
                c0369me.mo10668c();
            }
        }
        return this.f22063f;
    }

    /* renamed from: t */
    private final void m14316t() {
        if (this.f22081y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: f */
    public final int mo14223f(int i) {
        int i2;
        View view;
        int i3 = 1;
        int i4 = 0;
        ActionBarContextView actionBarContextView = this.f22064g;
        if (actionBarContextView == null) {
            i2 = 0;
        } else if (actionBarContextView.getLayoutParams() instanceof MarginLayoutParams) {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22064g.getLayoutParams();
            if (this.f22064g.isShown()) {
                if (this.f22056Q == null) {
                    this.f22056Q = new Rect();
                    this.f22057R = new Rect();
                }
                Rect rect = this.f22056Q;
                Rect rect2 = this.f22057R;
                rect.set(0, i, 0, 0);
                C0549vx.m6137a(this.f22082z, rect, rect2);
                if (rect2.top == 0) {
                    i5 = i;
                } else {
                    i5 = 0;
                }
                if (marginLayoutParams.topMargin != i5) {
                    marginLayoutParams.topMargin = i;
                    view = this.f22041B;
                    if (view == null) {
                        this.f22041B = new View(this.f22059b);
                        this.f22041B.setBackgroundColor(this.f22059b.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.f22082z.addView(this.f22041B, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f22041B.setLayoutParams(layoutParams);
                            i5 = 1;
                        } else {
                            i5 = 1;
                        }
                    }
                } else {
                    i5 = 0;
                }
                if (this.f22041B == null) {
                    i3 = 0;
                }
                if (!(this.f22045F || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.f22064g.setLayoutParams(marginLayoutParams);
                i2 = i5;
            } else {
                i2 = i5;
            }
        } else {
            i2 = 0;
        }
        view = this.f22041B;
        if (view != null) {
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }
}
