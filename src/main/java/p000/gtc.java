package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: gtc */
public final class gtc implements gtb, ijk {
    /* renamed from: a */
    private static final String f19568a = bli.m887a("DcimFolderStartTask");
    /* renamed from: b */
    private final WeakReference f19569b;
    /* renamed from: c */
    private final awi f19570c;
    /* renamed from: d */
    private final gsx f19571d = new gte(gtu.m2875a());
    /* renamed from: e */
    private final kpw f19572e = kpw.m18486d();

    public gtc(WeakReference weakReference, awi awi) {
        this.f19569b = weakReference;
        this.f19570c = awi;
    }

    /* renamed from: b */
    public final void mo7434b() {
        if (this.f19571d.mo7427c()) {
            this.f19572e.mo15641a(Boolean.valueOf(true));
            return;
        }
        this.f19572e.mo15641a(Boolean.valueOf(false));
        awi awi = this.f19570c;
        String valueOf = String.valueOf(this.f19571d.mo7426b());
        String str = "Abort startup because camera folder doesn't exist and cannot be created: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        awi.mo1814a(valueOf);
    }

    /* renamed from: a */
    public final kpk mo8560a() {
        boolean z = true;
        if (this.f19571d.mo7427c()) {
            this.f19572e.mo15641a(Boolean.valueOf(true));
        } else {
            String str = f19568a;
            String valueOf = String.valueOf(this.f19571d.mo7426b());
            String str2 = "Informing user camera folder doesn't exist and cannot be created: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
            Activity activity = (Activity) this.f19569b.get();
            if (activity == null || activity.isFinishing()) {
                bli.m898e(f19568a, "Could not display error dialog for Camera Storage Access Failure.");
            } else {
                gsz gsz = new gsz();
                if (gsz.f6046a != null) {
                    z = false;
                }
                jri.m13406b(z, (Object) "Setting listener twice!");
                gsz.f6046a = this;
                gsz.show(activity.getFragmentManager(), "CameraStorageAccessFailureDialog");
            }
        }
        return this.f19572e;
    }
}
