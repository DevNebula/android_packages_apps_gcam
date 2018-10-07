package p000;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: ye */
final class C0792ye extends abu {
    /* renamed from: a */
    public C0625zy f22406a;
    /* renamed from: b */
    public int f22407b;
    /* renamed from: c */
    public String f22408c;
    /* renamed from: d */
    public CameraDevice f22409d;
    /* renamed from: e */
    public C0788xt f22410e;
    /* renamed from: f */
    public aca f22411f;
    /* renamed from: g */
    public Rect f22412g;
    /* renamed from: h */
    public boolean f22413h;
    /* renamed from: i */
    public CameraCaptureSession f22414i;
    /* renamed from: j */
    public ImageReader f22415j;
    /* renamed from: k */
    public aat f22416k;
    /* renamed from: l */
    public C0623zw f22417l;
    /* renamed from: m */
    public C0596yl f22418m;
    /* renamed from: n */
    public C0624zx f22419n;
    /* renamed from: o */
    public int f22420o = 0;
    /* renamed from: p */
    public C0595yk f22421p = new C0793yj(this);
    /* renamed from: q */
    public final /* synthetic */ C0785xq f22422q;
    /* renamed from: s */
    private int f22423s = 0;
    /* renamed from: t */
    private abw f22424t;
    /* renamed from: u */
    private abw f22425u;
    /* renamed from: v */
    private SurfaceTexture f22426v;
    /* renamed from: w */
    private Surface f22427w;
    /* renamed from: x */
    private StateCallback f22428x = new C0593yh(this);
    /* renamed from: y */
    private CameraCaptureSession.StateCallback f22429y = new C0594yi(this);

    C0792ye(C0785xq c0785xq, Looper looper) {
        this.f22422q = c0785xq;
        super(looper);
    }

    /* renamed from: a */
    public final abo mo14467a() {
        try {
            return new C0795yn(this.f22409d, this.f22412g, this.f22424t, this.f22425u);
        } catch (CameraAccessException e) {
            abx.m87b(C0785xq.f22379a, "Unable to query camera device to build settings representation");
            return null;
        }
    }

    /* renamed from: a */
    final void mo14468a(int i) {
        if (this.f22422q.f22381c.mo77a() != i) {
            this.f22422q.f22381c.mo78a(i);
            if (i < 16) {
                this.f22420o = 0;
                this.f22421p.mo11565a();
            }
        }
    }

    /* renamed from: b */
    private final void m14821b() {
        try {
            this.f22414i.abortCaptures();
            this.f22414i = null;
        } catch (Throwable e) {
            abx.m85a(C0785xq.f22379a, "Failed to close existing camera capture session", e);
        }
        mo14468a(4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A:{Catch:{ Exception -> 0x0048, all -> 0x00f1 }} */
    public final void handleMessage(android.os.Message r12) {
        /*
        r11 = this;
        r10 = 16;
        r9 = 2;
        r0 = 0;
        r8 = 1;
        r2 = 0;
        super.handleMessage(r12);
        r1 = p000.C0785xq.f22379a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "handleMessage - action = '";
        r3.append(r4);
        r4 = r12.what;
        r4 = p000.C0509tz.m5938a(r4);
        r3.append(r4);
        r4 = "'";
        r3.append(r4);
        r3 = r3.toString();
        p000.abx.m90d(r1, r3);
        r4 = r12.what;
        switch(r4) {
            case 1: goto L_0x06a9;
            case 2: goto L_0x0650;
            case 3: goto L_0x06a9;
            case 101: goto L_0x05c9;
            case 102: goto L_0x0580;
            case 103: goto L_0x0561;
            case 204: goto L_0x0246;
            case 301: goto L_0x01cc;
            case 302: goto L_0x0177;
            case 303: goto L_0x016f;
            case 305: goto L_0x0167;
            case 502: goto L_0x014b;
            case 503: goto L_0x013c;
            case 601: goto L_0x0076;
            default: goto L_0x002f;
        };
    L_0x002f:
        r0 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x0048 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r1.<init>();	 Catch:{ Exception -> 0x0048 }
        r2 = "Unimplemented CameraProxy message=";
        r1.append(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r12.what;	 Catch:{ Exception -> 0x0048 }
        r1.append(r2);	 Catch:{ Exception -> 0x0048 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x0048 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0048 }
        throw r0;	 Catch:{ Exception -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        if (r4 == r9) goto L_0x0706;
    L_0x004b:
        r1 = r11.f22409d;	 Catch:{ all -> 0x00f1 }
        if (r1 == 0) goto L_0x0706;
    L_0x004f:
        r1.close();	 Catch:{ all -> 0x00f1 }
        r1 = 0;
        r11.f22409d = r1;	 Catch:{ all -> 0x00f1 }
    L_0x0055:
        r1 = r0 instanceof java.lang.RuntimeException;	 Catch:{ all -> 0x00f1 }
        if (r1 == 0) goto L_0x0072;
    L_0x0059:
        r1 = r11.f22408c;	 Catch:{ all -> 0x00f1 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ all -> 0x00f1 }
        r1 = r11.mo86b(r1);	 Catch:{ all -> 0x00f1 }
        r2 = r11.f22422q;	 Catch:{ all -> 0x00f1 }
        r3 = r2.f22385g;	 Catch:{ all -> 0x00f1 }
        r0 = (java.lang.RuntimeException) r0;	 Catch:{ all -> 0x00f1 }
        r2 = r2.f22381c;	 Catch:{ all -> 0x00f1 }
        r2 = r2.mo77a();	 Catch:{ all -> 0x00f1 }
        r3.mo60a(r0, r1, r4, r2);	 Catch:{ all -> 0x00f1 }
    L_0x0072:
        p000.aaw.m27a(r12);
    L_0x0075:
        return;
    L_0x0076:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r0 >= r10) goto L_0x008b;
    L_0x0080:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Photos may only be taken when a preview is active";
        p000.abx.m87b(r0, r1);	 Catch:{ Exception -> 0x0048 }
    L_0x0087:
        p000.aaw.m27a(r12);
        goto L_0x0075;
    L_0x008b:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        r1 = 32;
        if (r0 != r1) goto L_0x0133;
    L_0x0097:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (p000.C0596yl) r0;	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22413h;	 Catch:{ Exception -> 0x0048 }
        if (r1 != 0) goto L_0x00c1;
    L_0x009f:
        r1 = r11.f22420o;	 Catch:{ Exception -> 0x0048 }
        if (r1 != r9) goto L_0x00f6;
    L_0x00a3:
        r1 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE;	 Catch:{ Exception -> 0x0048 }
        r3 = 3;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r1.mo105a(r2, r3);	 Catch:{ Exception -> 0x0048 }
        if (r1 != 0) goto L_0x00f6;
    L_0x00b2:
        r1 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE;	 Catch:{ Exception -> 0x0048 }
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r1.mo105a(r2, r3);	 Catch:{ Exception -> 0x0048 }
        if (r1 != 0) goto L_0x00f6;
    L_0x00c1:
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Skipping pre-capture autoexposure convergence";
        p000.abx.m89c(r1, r2);	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22415j;	 Catch:{ Exception -> 0x0048 }
        r1.setOnImageAvailableListener(r0, r11);	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22414i;	 Catch:{ CameraAccessException -> 0x00e8 }
        r2 = r11.f22411f;	 Catch:{ CameraAccessException -> 0x00e8 }
        r3 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x00e8 }
        r5 = 1;
        r5 = new android.view.Surface[r5];	 Catch:{ CameraAccessException -> 0x00e8 }
        r6 = r11.f22415j;	 Catch:{ CameraAccessException -> 0x00e8 }
        r6 = r6.getSurface();	 Catch:{ CameraAccessException -> 0x00e8 }
        r7 = 0;
        r5[r7] = r6;	 Catch:{ CameraAccessException -> 0x00e8 }
        r6 = 2;
        r2 = r2.mo104a(r3, r6, r5);	 Catch:{ CameraAccessException -> 0x00e8 }
        r1.capture(r2, r0, r11);	 Catch:{ CameraAccessException -> 0x00e8 }
        goto L_0x0087;
    L_0x00e8:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Unable to initiate immediate capture";
        p000.abx.m85a(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x00f1:
        r0 = move-exception;
        p000.aaw.m27a(r12);
        throw r0;
    L_0x00f6:
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Forcing pre-capture autoexposure convergence";
        p000.abx.m89c(r1, r2);	 Catch:{ Exception -> 0x0048 }
        r1 = new yg;	 Catch:{ Exception -> 0x0048 }
        r1.<init>(r11, r0);	 Catch:{ Exception -> 0x0048 }
        r0 = new aca;	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;	 Catch:{ Exception -> 0x0048 }
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo106b(r2, r3);	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22414i;	 Catch:{ CameraAccessException -> 0x0129 }
        r3 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x0129 }
        r5 = 1;
        r5 = new android.view.Surface[r5];	 Catch:{ CameraAccessException -> 0x0129 }
        r6 = r11.f22427w;	 Catch:{ CameraAccessException -> 0x0129 }
        r7 = 0;
        r5[r7] = r6;	 Catch:{ CameraAccessException -> 0x0129 }
        r6 = 1;
        r0 = r0.mo104a(r3, r6, r5);	 Catch:{ CameraAccessException -> 0x0129 }
        r2.capture(r0, r1, r11);	 Catch:{ CameraAccessException -> 0x0129 }
        goto L_0x0087;
    L_0x0129:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Unable to run autoexposure and perform capture";
        p000.abx.m85a(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0133:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Taking a (likely blurry) photo without the lens locked";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0097;
    L_0x013c:
        r0 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION;	 Catch:{ Exception -> 0x0048 }
        r2 = r12.arg1;	 Catch:{ Exception -> 0x0048 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0048 }
        r0.mo106b(r1, r2);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x014b:
        r1 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r2 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION;	 Catch:{ Exception -> 0x0048 }
        r3 = r12.arg2;	 Catch:{ Exception -> 0x0048 }
        if (r3 <= 0) goto L_0x015e;
    L_0x0153:
        r0 = r11.f22410e;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22393a;	 Catch:{ Exception -> 0x0048 }
        r3 = r12.arg1;	 Catch:{ Exception -> 0x0048 }
        r5 = 0;
        r0 = r0.mo55a(r3, r5);	 Catch:{ Exception -> 0x0048 }
    L_0x015e:
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Exception -> 0x0048 }
        r1.mo106b(r2, r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0167:
        r0 = r11.f22423s;	 Catch:{ Exception -> 0x0048 }
        r0 = r0 + -1;
        r11.f22423s = r0;	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x016f:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (p000.C0624zx) r0;	 Catch:{ Exception -> 0x0048 }
        r11.f22419n = r0;	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0177:
        r0 = r11.f22423s;	 Catch:{ Exception -> 0x0048 }
        r0 = r0 + 1;
        r11.f22423s = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r0 < r10) goto L_0x01c3;
    L_0x0187:
        r0 = 16;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        r0 = new aca;	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER;	 Catch:{ Exception -> 0x0048 }
        r2 = 2;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0048 }
        r0.mo106b(r1, r2);	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22414i;	 Catch:{ CameraAccessException -> 0x01b4 }
        r2 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x01b4 }
        r3 = 1;
        r3 = new android.view.Surface[r3];	 Catch:{ CameraAccessException -> 0x01b4 }
        r5 = r11.f22427w;	 Catch:{ CameraAccessException -> 0x01b4 }
        r6 = 0;
        r3[r6] = r5;	 Catch:{ CameraAccessException -> 0x01b4 }
        r5 = 1;
        r0 = r0.mo104a(r2, r5, r3);	 Catch:{ CameraAccessException -> 0x01b4 }
        r2 = 0;
        r1.capture(r0, r2, r11);	 Catch:{ CameraAccessException -> 0x01b4 }
        goto L_0x0087;
    L_0x01b4:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Unable to cancel autofocus";
        p000.abx.m85a(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        r0 = 32;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x01c3:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Ignoring attempt to release focus lock without preview";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x01cc:
        r0 = r11.f22423s;	 Catch:{ Exception -> 0x0048 }
        if (r0 <= 0) goto L_0x01ef;
    L_0x01d0:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r1.<init>();	 Catch:{ Exception -> 0x0048 }
        r2 = "handleMessage - Ignored AUTO_FOCUS because there was ";
        r1.append(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22423s;	 Catch:{ Exception -> 0x0048 }
        r1.append(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = " pending CANCEL_AUTO_FOCUS messages";
        r1.append(r2);	 Catch:{ Exception -> 0x0048 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x0048 }
        p000.abx.m90d(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x01ef:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r0 < r10) goto L_0x023d;
    L_0x01f9:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (p000.C0623zw) r0;	 Catch:{ Exception -> 0x0048 }
        r1 = new yf;	 Catch:{ Exception -> 0x0048 }
        r1.<init>(r11, r0);	 Catch:{ Exception -> 0x0048 }
        r0 = 32;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        r0 = new aca;	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER;	 Catch:{ Exception -> 0x0048 }
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo106b(r2, r3);	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22414i;	 Catch:{ CameraAccessException -> 0x022e }
        r3 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x022e }
        r5 = 1;
        r5 = new android.view.Surface[r5];	 Catch:{ CameraAccessException -> 0x022e }
        r6 = r11.f22427w;	 Catch:{ CameraAccessException -> 0x022e }
        r7 = 0;
        r5[r7] = r6;	 Catch:{ CameraAccessException -> 0x022e }
        r6 = 1;
        r0 = r0.mo104a(r3, r6, r5);	 Catch:{ CameraAccessException -> 0x022e }
        r2.capture(r0, r1, r11);	 Catch:{ CameraAccessException -> 0x022e }
        goto L_0x0087;
    L_0x022e:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Unable to lock autofocus";
        p000.abx.m85a(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        r0 = 16;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x023d:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Ignoring attempt to autofocus without preview";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0246:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (p000.C0795yn) r0;	 Catch:{ Exception -> 0x0048 }
        r5 = r11.f22411f;	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f138d;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.mo14473a(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f139e;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.mo14473a(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;	 Catch:{ Exception -> 0x0048 }
        r3 = new android.util.Range;	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f141g;	 Catch:{ Exception -> 0x0048 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x0048 }
        r7 = r0.f142h;	 Catch:{ Exception -> 0x0048 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x0048 }
        r3.<init>(r6, r7);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f146l;	 Catch:{ Exception -> 0x0048 }
        r3 = java.lang.Byte.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r3 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION;	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f22438c;	 Catch:{ Exception -> 0x0048 }
        r1.mo106b(r3, r6);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f149o;	 Catch:{ Exception -> 0x0048 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f150p;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x055d;
    L_0x029b:
        r1 = r0.f150p;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.ordinal();	 Catch:{ Exception -> 0x0048 }
        switch(r1) {
            case 1: goto L_0x0554;
            case 2: goto L_0x0548;
            case 3: goto L_0x053c;
            case 4: goto L_0x0534;
            case 5: goto L_0x052b;
            default: goto L_0x02a4;
        };	 Catch:{ Exception -> 0x0048 }
    L_0x02a4:
        r1 = p000.C0795yn.f22435a;	 Catch:{ Exception -> 0x0048 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r3.<init>();	 Catch:{ Exception -> 0x0048 }
        r6 = "Unable to convert to API 2 flash mode: ";
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f150p;	 Catch:{ Exception -> 0x0048 }
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0048 }
        p000.abx.m91e(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r2;
        r3 = r2;
    L_0x02be:
        r6 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE;	 Catch:{ Exception -> 0x0048 }
        r6.mo106b(r7, r3);	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r6 = android.hardware.camera2.CaptureRequest.FLASH_MODE;	 Catch:{ Exception -> 0x0048 }
        r3.mo106b(r6, r1);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f151q;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x0528;
    L_0x02d0:
        r1 = r0.f151q;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.ordinal();	 Catch:{ Exception -> 0x0048 }
        switch(r1) {
            case 0: goto L_0x0521;
            case 1: goto L_0x051a;
            case 2: goto L_0x0513;
            case 3: goto L_0x050c;
            case 4: goto L_0x0505;
            case 5: goto L_0x02d9;
            case 6: goto L_0x04fe;
            default: goto L_0x02d9;
        };	 Catch:{ Exception -> 0x0048 }
    L_0x02d9:
        r1 = p000.C0795yn.f22435a;	 Catch:{ Exception -> 0x0048 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r3.<init>();	 Catch:{ Exception -> 0x0048 }
        r6 = "Unable to convert to API 2 focus mode: ";
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f151q;	 Catch:{ Exception -> 0x0048 }
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0048 }
        p000.abx.m91e(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r2;
    L_0x02f2:
        r3 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE;	 Catch:{ Exception -> 0x0048 }
        r3.mo106b(r6, r1);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f152r;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x04fb;
    L_0x02fd:
        r1 = r0.f152r;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.ordinal();	 Catch:{ Exception -> 0x0048 }
        switch(r1) {
            case 1: goto L_0x04f4;
            case 2: goto L_0x04ed;
            case 3: goto L_0x04e5;
            case 4: goto L_0x04dd;
            case 5: goto L_0x04d5;
            case 6: goto L_0x04cd;
            case 7: goto L_0x04c5;
            case 8: goto L_0x04be;
            case 9: goto L_0x04b7;
            case 10: goto L_0x0306;
            case 11: goto L_0x04af;
            case 12: goto L_0x04a8;
            case 13: goto L_0x04a0;
            case 14: goto L_0x0498;
            case 15: goto L_0x0490;
            case 16: goto L_0x0488;
            case 17: goto L_0x0481;
            default: goto L_0x0306;
        };	 Catch:{ Exception -> 0x0048 }
    L_0x0306:
        r1 = p000.C0795yn.f22435a;	 Catch:{ Exception -> 0x0048 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r3.<init>();	 Catch:{ Exception -> 0x0048 }
        r6 = "Unable to convert to API 2 scene mode: ";
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f152r;	 Catch:{ Exception -> 0x0048 }
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0048 }
        p000.abx.m91e(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r2;
    L_0x031f:
        r3 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE;	 Catch:{ Exception -> 0x0048 }
        r3.mo106b(r6, r1);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f153s;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x047e;
    L_0x032a:
        r1 = r0.f153s;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.ordinal();	 Catch:{ Exception -> 0x0048 }
        switch(r1) {
            case 0: goto L_0x0477;
            case 1: goto L_0x0470;
            case 2: goto L_0x0469;
            case 3: goto L_0x0462;
            case 4: goto L_0x045b;
            case 5: goto L_0x0453;
            case 6: goto L_0x044c;
            case 7: goto L_0x0445;
            default: goto L_0x0333;
        };	 Catch:{ Exception -> 0x0048 }
    L_0x0333:
        r1 = p000.C0795yn.f22435a;	 Catch:{ Exception -> 0x0048 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r3.<init>();	 Catch:{ Exception -> 0x0048 }
        r6 = "Unable to convert to API 2 white balance: ";
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f153s;	 Catch:{ Exception -> 0x0048 }
        r3.append(r6);	 Catch:{ Exception -> 0x0048 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0048 }
        p000.abx.m91e(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r2;
    L_0x034c:
        r3 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r6 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE;	 Catch:{ Exception -> 0x0048 }
        r3.mo106b(r6, r1);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f154t;	 Catch:{ Exception -> 0x0048 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r3);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r3 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f154t;	 Catch:{ Exception -> 0x0048 }
        if (r6 == 0) goto L_0x036b;
    L_0x0366:
        r2 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0048 }
    L_0x036b:
        r1.mo106b(r3, r2);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK;	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f155u;	 Catch:{ Exception -> 0x0048 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r2);	 Catch:{ Exception -> 0x0048 }
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK;	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f156v;	 Catch:{ Exception -> 0x0048 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r2);	 Catch:{ Exception -> 0x0048 }
        r1 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x038e;
    L_0x0388:
        r1 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.f164e;	 Catch:{ Exception -> 0x0048 }
        if (r1 != 0) goto L_0x0417;
    L_0x038e:
        r1 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r2 = android.hardware.camera2.CaptureRequest.JPEG_GPS_LOCATION;	 Catch:{ Exception -> 0x0048 }
        r3 = 0;
        r1.mo106b(r2, r3);	 Catch:{ Exception -> 0x0048 }
    L_0x0396:
        r1 = r0.f159y;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x0410;
    L_0x039a:
        r1 = android.hardware.camera2.CaptureRequest.JPEG_THUMBNAIL_SIZE;	 Catch:{ Exception -> 0x0048 }
        r2 = new android.util.Size;	 Catch:{ Exception -> 0x0048 }
        r3 = r0.f159y;	 Catch:{ Exception -> 0x0048 }
        r3 = r3.f178a;	 Catch:{ Exception -> 0x0048 }
        r3 = r3.x;	 Catch:{ Exception -> 0x0048 }
        r6 = r0.f159y;	 Catch:{ Exception -> 0x0048 }
        r6 = r6.f178a;	 Catch:{ Exception -> 0x0048 }
        r6 = r6.y;	 Catch:{ Exception -> 0x0048 }
        r2.<init>(r3, r6);	 Catch:{ Exception -> 0x0048 }
        r0.mo14472a(r1, r2);	 Catch:{ Exception -> 0x0048 }
    L_0x03b0:
        r1 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x03c4;
    L_0x03b4:
        if (r1 == r5) goto L_0x03c4;
    L_0x03b6:
        r2 = r5.f183a;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.f183a;	 Catch:{ Exception -> 0x0048 }
        r2.putAll(r1);	 Catch:{ Exception -> 0x0048 }
        r2 = r5.f184b;	 Catch:{ Exception -> 0x0048 }
        r6 = 1;
        r2 = r2 + r6;
        r5.f184b = r2;	 Catch:{ Exception -> 0x0048 }
    L_0x03c4:
        r1 = r0.mo74c();	 Catch:{ Exception -> 0x0048 }
        r11.f22424t = r1;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo72b();	 Catch:{ Exception -> 0x0048 }
        r11.f22425u = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r0 < r10) goto L_0x03fe;
    L_0x03da:
        r0 = r11.f22414i;	 Catch:{ CameraAccessException -> 0x03f4 }
        r1 = r11.f22411f;	 Catch:{ CameraAccessException -> 0x03f4 }
        r2 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x03f4 }
        r3 = 1;
        r3 = new android.view.Surface[r3];	 Catch:{ CameraAccessException -> 0x03f4 }
        r5 = r11.f22427w;	 Catch:{ CameraAccessException -> 0x03f4 }
        r6 = 0;
        r3[r6] = r5;	 Catch:{ CameraAccessException -> 0x03f4 }
        r5 = 1;
        r1 = r1.mo104a(r2, r5, r3);	 Catch:{ CameraAccessException -> 0x03f4 }
        r2 = r11.f22421p;	 Catch:{ CameraAccessException -> 0x03f4 }
        r0.setRepeatingRequest(r1, r2, r11);	 Catch:{ CameraAccessException -> 0x03f4 }
        goto L_0x0087;
    L_0x03f4:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Failed to apply updated request settings";
        p000.abx.m85a(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x03fe:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        r1 = 8;
        if (r0 >= r1) goto L_0x0087;
    L_0x040a:
        r0 = 4;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0410:
        r1 = android.hardware.camera2.CaptureRequest.JPEG_THUMBNAIL_SIZE;	 Catch:{ Exception -> 0x0048 }
        r2 = 0;
        r0.mo14472a(r1, r2);	 Catch:{ Exception -> 0x0048 }
        goto L_0x03b0;
    L_0x0417:
        r1 = new android.location.Location;	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.f164e;	 Catch:{ Exception -> 0x0048 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.f163d;	 Catch:{ Exception -> 0x0048 }
        r1.setTime(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.f162c;	 Catch:{ Exception -> 0x0048 }
        r1.setAltitude(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.f160a;	 Catch:{ Exception -> 0x0048 }
        r1.setLatitude(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f158x;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.f161b;	 Catch:{ Exception -> 0x0048 }
        r1.setLongitude(r2);	 Catch:{ Exception -> 0x0048 }
        r2 = r0.f22437b;	 Catch:{ Exception -> 0x0048 }
        r3 = android.hardware.camera2.CaptureRequest.JPEG_GPS_LOCATION;	 Catch:{ Exception -> 0x0048 }
        r2.mo106b(r3, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0396;
    L_0x0445:
        r1 = 4;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x044c:
        r1 = 7;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x0453:
        r1 = 8;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x045b:
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x0462:
        r1 = 3;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x0469:
        r1 = 5;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x0470:
        r1 = 6;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x0477:
        r1 = 1;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x034c;
    L_0x047e:
        r1 = r2;
        goto L_0x034c;
    L_0x0481:
        r1 = 7;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x0488:
        r1 = 10;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x0490:
        r1 = 11;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x0498:
        r1 = 13;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04a0:
        r1 = 9;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04a8:
        r1 = 3;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04af:
        r1 = 14;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04b7:
        r1 = 5;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04be:
        r1 = 4;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04c5:
        r1 = p000.abv.f177a;	 Catch:{ Exception -> 0x0048 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04cd:
        r1 = 12;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04d5:
        r1 = 15;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04dd:
        r1 = 8;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04e5:
        r1 = 16;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04ed:
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04f4:
        r1 = 0;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x031f;
    L_0x04fb:
        r1 = r2;
        goto L_0x031f;
    L_0x04fe:
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02f2;
    L_0x0505:
        r1 = 0;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02f2;
    L_0x050c:
        r1 = 5;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02f2;
    L_0x0513:
        r1 = 3;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02f2;
    L_0x051a:
        r1 = 4;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02f2;
    L_0x0521:
        r1 = 1;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02f2;
    L_0x0528:
        r1 = r2;
        goto L_0x02f2;
    L_0x052b:
        r1 = 4;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        r3 = r1;
        r1 = r2;
        goto L_0x02be;
    L_0x0534:
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        r3 = r2;
        goto L_0x02be;
    L_0x053c:
        r1 = 3;
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        r1 = 1;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02be;
    L_0x0548:
        r1 = 1;
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        r1 = 0;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x02be;
    L_0x0554:
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        r3 = r1;
        r1 = r2;
        goto L_0x02be;
    L_0x055d:
        r1 = r2;
        r3 = r2;
        goto L_0x02be;
    L_0x0561:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r0 < r10) goto L_0x0577;
    L_0x056b:
        r0 = r11.f22414i;	 Catch:{ Exception -> 0x0048 }
        r0.stopRepeating();	 Catch:{ Exception -> 0x0048 }
        r0 = 8;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0577:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Refusing to stop preview at inappropriate time";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0580:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        r1 = 8;
        if (r0 != r1) goto L_0x05c0;
    L_0x058c:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (p000.aat) r0;	 Catch:{ Exception -> 0x0048 }
        r11.f22416k = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 16;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22414i;	 Catch:{ CameraAccessException -> 0x05b1 }
        r1 = r11.f22411f;	 Catch:{ CameraAccessException -> 0x05b1 }
        r2 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x05b1 }
        r3 = 1;
        r3 = new android.view.Surface[r3];	 Catch:{ CameraAccessException -> 0x05b1 }
        r5 = r11.f22427w;	 Catch:{ CameraAccessException -> 0x05b1 }
        r6 = 0;
        r3[r6] = r5;	 Catch:{ CameraAccessException -> 0x05b1 }
        r5 = 1;
        r1 = r1.mo104a(r2, r5, r3);	 Catch:{ CameraAccessException -> 0x05b1 }
        r2 = r11.f22421p;	 Catch:{ CameraAccessException -> 0x05b1 }
        r0.setRepeatingRequest(r1, r2, r11);	 Catch:{ CameraAccessException -> 0x05b1 }
        goto L_0x0087;
    L_0x05b1:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Unable to start preview";
        p000.abx.m88b(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        r0 = 8;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x05c0:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Refusing to start preview at inappropriate time";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x05c9:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (android.graphics.SurfaceTexture) r0;	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.f22381c;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.mo77a();	 Catch:{ Exception -> 0x0048 }
        r2 = 4;
        if (r1 < r2) goto L_0x0647;
    L_0x05d8:
        r1 = r11.f22426v;	 Catch:{ Exception -> 0x0048 }
        if (r0 == r1) goto L_0x063e;
    L_0x05dc:
        r1 = r11.f22414i;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x05e3;
    L_0x05e0:
        r11.m14821b();	 Catch:{ Exception -> 0x0048 }
    L_0x05e3:
        r11.f22426v = r0;	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22424t;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.f178a;	 Catch:{ Exception -> 0x0048 }
        r2 = r1.x;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.y;	 Catch:{ Exception -> 0x0048 }
        r0.setDefaultBufferSize(r2, r1);	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22427w;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x05f7;
    L_0x05f4:
        r1.release();	 Catch:{ Exception -> 0x0048 }
    L_0x05f7:
        r1 = new android.view.Surface;	 Catch:{ Exception -> 0x0048 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0048 }
        r11.f22427w = r1;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22415j;	 Catch:{ Exception -> 0x0048 }
        if (r0 == 0) goto L_0x0605;
    L_0x0602:
        r0.close();	 Catch:{ Exception -> 0x0048 }
    L_0x0605:
        r0 = r11.f22425u;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f178a;	 Catch:{ Exception -> 0x0048 }
        r1 = r0.x;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.y;	 Catch:{ Exception -> 0x0048 }
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3 = 1;
        r0 = android.media.ImageReader.newInstance(r1, r0, r2, r3);	 Catch:{ Exception -> 0x0048 }
        r11.f22415j = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22409d;	 Catch:{ CameraAccessException -> 0x0634 }
        r1 = 2;
        r1 = new android.view.Surface[r1];	 Catch:{ CameraAccessException -> 0x0634 }
        r2 = r11.f22427w;	 Catch:{ CameraAccessException -> 0x0634 }
        r3 = 0;
        r1[r3] = r2;	 Catch:{ CameraAccessException -> 0x0634 }
        r2 = r11.f22415j;	 Catch:{ CameraAccessException -> 0x0634 }
        r2 = r2.getSurface();	 Catch:{ CameraAccessException -> 0x0634 }
        r3 = 1;
        r1[r3] = r2;	 Catch:{ CameraAccessException -> 0x0634 }
        r1 = java.util.Arrays.asList(r1);	 Catch:{ CameraAccessException -> 0x0634 }
        r2 = r11.f22429y;	 Catch:{ CameraAccessException -> 0x0634 }
        r0.createCaptureSession(r1, r2, r11);	 Catch:{ CameraAccessException -> 0x0634 }
        goto L_0x0087;
    L_0x0634:
        r0 = move-exception;
        r1 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Failed to create camera capture session";
        p000.abx.m85a(r1, r2, r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x063e:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Optimizing out redundant preview texture setting";
        p000.abx.m89c(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0647:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Ignoring texture setting at inappropriate time";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0650:
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22381c;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r0 == r8) goto L_0x06a0;
    L_0x065a:
        r0 = r11.f22414i;	 Catch:{ Exception -> 0x0048 }
        if (r0 == 0) goto L_0x0664;
    L_0x065e:
        r11.m14821b();	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22414i = r0;	 Catch:{ Exception -> 0x0048 }
    L_0x0664:
        r0 = r11.f22409d;	 Catch:{ Exception -> 0x0048 }
        if (r0 == 0) goto L_0x066e;
    L_0x0668:
        r0.close();	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22409d = r0;	 Catch:{ Exception -> 0x0048 }
    L_0x066e:
        r0 = 0;
        r11.f22410e = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22411f = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22412g = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22427w;	 Catch:{ Exception -> 0x0048 }
        if (r0 == 0) goto L_0x0681;
    L_0x067b:
        r0.release();	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22427w = r0;	 Catch:{ Exception -> 0x0048 }
    L_0x0681:
        r0 = 0;
        r11.f22426v = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22415j;	 Catch:{ Exception -> 0x0048 }
        if (r0 == 0) goto L_0x068e;
    L_0x0688:
        r0.close();	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22415j = r0;	 Catch:{ Exception -> 0x0048 }
    L_0x068e:
        r0 = 0;
        r11.f22424t = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22425u = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22407b = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 0;
        r11.f22408c = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = 1;
        r11.mo14468a(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x06a0:
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r1 = "Ignoring release at inappropriate time";
        p000.abx.m91e(r0, r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x06a9:
        r0 = r12.obj;	 Catch:{ Exception -> 0x0048 }
        r0 = (p000.C0625zy) r0;	 Catch:{ Exception -> 0x0048 }
        r1 = r12.arg1;	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.f22381c;	 Catch:{ Exception -> 0x0048 }
        r2 = r2.mo77a();	 Catch:{ Exception -> 0x0048 }
        if (r2 <= r8) goto L_0x06c2;
    L_0x06b9:
        r2 = r11.mo86b(r1);	 Catch:{ Exception -> 0x0048 }
        r0.mo11606b(r1, r2);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x06c2:
        r11.f22406a = r0;	 Catch:{ Exception -> 0x0048 }
        r11.f22407b = r1;	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.f22386h;	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22407b;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.get(r2);	 Catch:{ Exception -> 0x0048 }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x0048 }
        r11.f22408c = r0;	 Catch:{ Exception -> 0x0048 }
        r0 = p000.C0785xq.f22379a;	 Catch:{ Exception -> 0x0048 }
        r2 = "Opening camera index %d (id %s) with camera2 API";
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0048 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0048 }
        r5 = 0;
        r3[r5] = r1;	 Catch:{ Exception -> 0x0048 }
        r1 = r11.f22408c;	 Catch:{ Exception -> 0x0048 }
        r5 = 1;
        r3[r5] = r1;	 Catch:{ Exception -> 0x0048 }
        r1 = java.lang.String.format(r2, r3);	 Catch:{ Exception -> 0x0048 }
        p000.abx.m89c(r0, r1);	 Catch:{ Exception -> 0x0048 }
        r0 = r11.f22408c;	 Catch:{ Exception -> 0x0048 }
        if (r0 != 0) goto L_0x06fb;
    L_0x06f2:
        r0 = r11.f22406a;	 Catch:{ Exception -> 0x0048 }
        r1 = r12.arg1;	 Catch:{ Exception -> 0x0048 }
        r0.mo11602a(r1);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x06fb:
        r1 = r11.f22422q;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.f22383e;	 Catch:{ Exception -> 0x0048 }
        r2 = r11.f22428x;	 Catch:{ Exception -> 0x0048 }
        r1.openCamera(r0, r2, r11);	 Catch:{ Exception -> 0x0048 }
        goto L_0x0087;
    L_0x0706:
        r1 = r11.f22409d;	 Catch:{ all -> 0x00f1 }
        if (r1 != 0) goto L_0x0055;
    L_0x070a:
        if (r4 != r8) goto L_0x071e;
    L_0x070c:
        r0 = r11.f22406a;	 Catch:{ all -> 0x00f1 }
        if (r0 == 0) goto L_0x0719;
    L_0x0710:
        r1 = r11.f22407b;	 Catch:{ all -> 0x00f1 }
        r2 = r11.mo86b(r1);	 Catch:{ all -> 0x00f1 }
        r0.mo11603a(r1, r2);	 Catch:{ all -> 0x00f1 }
    L_0x0719:
        p000.aaw.m27a(r12);
        goto L_0x0075;
    L_0x071e:
        r0 = p000.C0785xq.f22379a;	 Catch:{ all -> 0x00f1 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f1 }
        r1.<init>();	 Catch:{ all -> 0x00f1 }
        r2 = "Cannot handle message ";
        r1.append(r2);	 Catch:{ all -> 0x00f1 }
        r2 = r12.what;	 Catch:{ all -> 0x00f1 }
        r1.append(r2);	 Catch:{ all -> 0x00f1 }
        r2 = ", mCamera is null";
        r1.append(r2);	 Catch:{ all -> 0x00f1 }
        r1 = r1.toString();	 Catch:{ all -> 0x00f1 }
        p000.abx.m91e(r0, r1);	 Catch:{ all -> 0x00f1 }
        goto L_0x0719;
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.handleMessage(android.os.Message):void");
    }
}
