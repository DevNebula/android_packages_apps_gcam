package p000;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: xq */
final class C0785xq extends C0619zs {
    /* renamed from: a */
    public static final aby f22379a = new aby("AndCam2AgntImp");
    /* renamed from: b */
    public final C0792ye f22380b;
    /* renamed from: c */
    public final abq f22381c;
    /* renamed from: d */
    public final abs f22382d;
    /* renamed from: e */
    public final CameraManager f22383e;
    /* renamed from: f */
    public final MediaActionSound f22384f;
    /* renamed from: g */
    public abi f22385g;
    /* renamed from: h */
    public final List f22386h;
    /* renamed from: j */
    private final HandlerThread f22387j = new HandlerThread("Camera2 Handler Thread");
    /* renamed from: k */
    private int f22388k;

    C0785xq(Context context) {
        this.f22387j.start();
        this.f22380b = new C0792ye(this, this.f22387j.getLooper());
        this.f22385g = new abi(this.f22380b);
        this.f22381c = new abq();
        this.f22382d = new abs(this.f22380b, this.f22387j);
        this.f22382d.start();
        this.f22383e = (CameraManager) context.getSystemService("camera");
        this.f22384f = new MediaActionSound();
        this.f22384f.load(0);
        this.f22388k = 0;
        this.f22386h = new ArrayList();
        m14787g();
    }

    /* renamed from: a */
    public final abg mo11589a() {
        m14787g();
        return new C0786xr(this.f22383e, (String[]) this.f22386h.toArray(new String[0]));
    }

    /* renamed from: b */
    protected final abi mo11592b() {
        return this.f22385g;
    }

    /* renamed from: c */
    protected final Handler mo11593c() {
        return this.f22380b;
    }

    /* renamed from: d */
    protected final abq mo11594d() {
        return this.f22381c;
    }

    /* renamed from: e */
    protected final abs mo11595e() {
        return this.f22382d;
    }

    /* renamed from: f */
    public final void mo11596f() {
    }

    /* renamed from: a */
    public final void mo11590a(abi abi) {
        this.f22385g = abi;
    }

    /* renamed from: g */
    private final boolean m14787g() {
        try {
            int i;
            String[] cameraIdList = this.f22383e.getCameraIdList();
            Set hashSet = new HashSet(Arrays.asList(cameraIdList));
            for (i = 0; i < this.f22386h.size(); i++) {
                if (!hashSet.contains(this.f22386h.get(i))) {
                    this.f22386h.set(i, null);
                    this.f22388k--;
                }
            }
            hashSet.removeAll(this.f22386h);
            for (Object obj : cameraIdList) {
                if (hashSet.contains(obj)) {
                    this.f22386h.add(obj);
                    this.f22388k++;
                }
            }
            return true;
        } catch (Throwable e) {
            abx.m85a(f22379a, "Could not get device listing from camera subsystem", e);
            return false;
        }
    }
}
