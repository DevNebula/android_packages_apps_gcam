package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: aww */
public final class aww implements awv, emu, eol {
    /* renamed from: f */
    private static final String f10971f = bli.m887a("PermissionsChecker");
    /* renamed from: a */
    public final Activity f10972a;
    /* renamed from: b */
    public final awi f10973b;
    /* renamed from: c */
    public final Resources f10974c;
    /* renamed from: d */
    public final awr f10975d;
    /* renamed from: e */
    public OnClickListener f10976e = new awx(this);
    /* renamed from: g */
    private final KeyguardManager f10977g;
    /* renamed from: h */
    private final gos f10978h;
    /* renamed from: i */
    private final axc f10979i;
    /* renamed from: j */
    private final ikd f10980j;
    /* renamed from: k */
    private int f10981k;
    /* renamed from: l */
    private int f10982l;
    /* renamed from: m */
    private int f10983m;
    /* renamed from: n */
    private int f10984n;
    /* renamed from: o */
    private int f10985o;
    /* renamed from: p */
    private boolean f10986p;
    /* renamed from: q */
    private boolean f10987q;
    /* renamed from: r */
    private boolean f10988r;
    /* renamed from: s */
    private boolean f10989s;
    /* renamed from: t */
    private boolean f10990t;
    /* renamed from: u */
    private kpw f10991u;

    public aww(Activity activity, awi awi, gos gos, KeyguardManager keyguardManager, axc axc, Resources resources, awr awr, ikd ikd) {
        this.f10972a = activity;
        this.f10973b = awi;
        this.f10978h = gos;
        this.f10977g = keyguardManager;
        this.f10979i = axc;
        this.f10974c = resources;
        this.f10975d = awr;
        this.f10985o = 0;
        this.f10980j = ikd;
    }

    /* renamed from: a */
    public final kpk mo1829a() {
        int i = 0;
        this.f10985o = 0;
        bli.m894c(f10971f, "Checking for critical permissions.");
        if (this.f10991u == null) {
            this.f10991u = kpw.m18486d();
        }
        this.f10986p = m7182a("android.permission.CAMERA");
        this.f10987q = m7182a("android.permission.RECORD_AUDIO");
        this.f10988r = m7182a("android.permission.READ_EXTERNAL_STORAGE");
        this.f10989s = m7182a("android.permission.WRITE_EXTERNAL_STORAGE");
        if (m7184c()) {
            this.f10990t = true;
        } else {
            this.f10990t = false;
            this.f10985o += 2;
        }
        if (this.f10986p && this.f10988r && this.f10989s && this.f10987q && this.f10990t) {
            return kow.m13873a(Boolean.valueOf(true));
        }
        if (!this.f10977g.isKeyguardLocked()) {
            Object obj = new String[this.f10985o];
            if (!this.f10986p) {
                obj[0] = "android.permission.CAMERA";
                i = 1;
            }
            if (!this.f10987q) {
                obj[i] = "android.permission.RECORD_AUDIO";
                this.f10981k = i;
                i++;
            }
            if (!this.f10988r) {
                obj[i] = "android.permission.READ_EXTERNAL_STORAGE";
                this.f10982l = i;
                i++;
            }
            if (!this.f10989s) {
                obj[i] = "android.permission.WRITE_EXTERNAL_STORAGE";
                this.f10982l = i;
                i++;
            }
            if (!(this.f10990t || m7184c())) {
                obj[i] = "android.permission.ACCESS_COARSE_LOCATION";
                this.f10983m = i;
                i++;
                obj[i] = "android.permission.ACCESS_FINE_LOCATION";
                this.f10984n = i;
            }
            axc axc = this.f10979i;
            jri.m13404b(obj);
            axc.f1024a.requestPermissions(obj, 1);
            return this.f10991u;
        } else if (this.f10986p && this.f10987q && this.f10988r && this.f10989s) {
            knk knk = this.f10991u;
            if (knk != null) {
                knk.mo15641a(Boolean.valueOf(true));
                this.f10991u = null;
            }
            return kow.m13873a(Boolean.valueOf(true));
        } else {
            m7181a((int) R.string.error_permissions_keyguard_updated, true);
            return this.f10991u;
        }
    }

    /* renamed from: a */
    private final boolean m7182a(String str) {
        if (this.f10972a.checkSelfPermission(str) == 0) {
            return true;
        }
        this.f10985o++;
        return false;
    }

    /* renamed from: a */
    private static boolean m7183a(int[] iArr, int i) {
        return iArr[i] == 0;
    }

    /* renamed from: b */
    final void mo12326b() {
        jri.m13404b(this.f10991u);
        this.f10991u.mo15641a(Boolean.valueOf(false));
        this.f10973b.mo1814a("Required camera permissions were not granted.");
    }

    /* renamed from: c */
    private final boolean m7184c() {
        boolean a = this.f10978h.mo7293a("default_scope", "pref_has_seen_permissions_dialogs");
        boolean z;
        if (this.f10972a.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2;
        if (this.f10972a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (a && z == z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo6341a(int i, String[] strArr, int[] iArr) {
        jri.m13404b((Object) strArr);
        jri.m13404b((Object) iArr);
        if (i == 1) {
            int length = strArr.length;
            if (length != 0) {
                int length2 = iArr.length;
                if (length2 != 0) {
                    boolean z;
                    if (length == length2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jri.m13405b(z);
                    if (!this.f10986p) {
                        this.f10986p = aww.m7183a(iArr, 0);
                    }
                    if (!this.f10987q) {
                        this.f10987q = aww.m7183a(iArr, this.f10981k);
                    }
                    if (!this.f10988r) {
                        this.f10988r = aww.m7183a(iArr, this.f10982l);
                    }
                    if (!this.f10989s) {
                        this.f10989s = aww.m7183a(iArr, this.f10982l);
                    }
                    if (!(m7184c() || this.f10990t)) {
                        this.f10978h.mo7298b("default_scope", "pref_has_seen_permissions_dialogs", true);
                        if (!aww.m7183a(iArr, this.f10984n)) {
                            z = false;
                        } else if (aww.m7183a(iArr, this.f10983m)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f10990t = z;
                        this.f10978h.mo7298b("default_scope", "pref_camera_recordlocation_key", this.f10990t);
                    }
                    if (this.f10986p && this.f10987q && this.f10988r && this.f10989s) {
                        jri.m13404b(this.f10991u);
                        this.f10991u.mo15641a(Boolean.valueOf(true));
                        return;
                    }
                    m7181a((int) R.string.error_permissions_updated, false);
                    return;
                }
            }
            mo1829a();
        }
    }

    /* renamed from: a */
    private final void m7181a(int i, boolean z) {
        this.f10980j.execute(new awy(this, i, z));
    }
}
