package p000;

import com.google.android.apps.camera.jni.gyro.GyroQueueNative;

/* compiled from: PG */
/* renamed from: cdf */
public final class cdf implements cde {
    /* renamed from: a */
    private static final String f12206a = bli.m887a("GyroQueue");
    /* renamed from: b */
    private static final float[] f12207b = cdf.m8134b();
    /* renamed from: f */
    private static final int[] f12208f = new int[]{1, 0, 2};
    /* renamed from: g */
    private static final int[] f12209g = new int[]{1, 1, 1};
    /* renamed from: c */
    private final long f12210c;
    /* renamed from: d */
    private boolean f12211d;
    /* renamed from: e */
    private long f12212e;

    public cdf() {
        cdh cdh = new cdh();
        this((byte) 0);
    }

    private cdf(byte b) {
        this.f12212e = 0;
        this.f12210c = GyroQueueNative.createHandle(f12208f, f12209g);
        this.f12211d = false;
    }

    public final synchronized void close() {
        if (!this.f12211d) {
            GyroQueueNative.releaseHandle(this.f12210c);
            this.f12211d = true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo2262a(float f, float f2, float f3, long j) {
        boolean z = false;
        synchronized (this) {
            if (!this.f12211d) {
                if (this.f12212e < j) {
                    this.f12212e = j;
                    z = GyroQueueNative.processAndEnqueueGyro(this.f12210c, f, f2, f3, j);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized boolean mo2263a(long j, float f, float f2, float f3, long j2, float[] fArr) {
        boolean z;
        System.arraycopy(f12207b, 0, fArr, 0, fArr.length);
        if (this.f12211d) {
            z = false;
        } else if (GyroQueueNative.getProjectionMatrix(this.f12210c, j, f, f2, f3, j2, fArr)) {
            z = true;
        } else {
            String str = f12206a;
            StringBuilder stringBuilder = new StringBuilder(76);
            stringBuilder.append("Projection matrix could not be computed for timestamp = ");
            stringBuilder.append(j);
            bli.m898e(str, stringBuilder.toString());
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized float[] mo2264a(long j, float f, float f2, float f3, long j2, float f4, float f5, float f6, long j3) {
        float[] b;
        b = cdf.m8134b();
        if (!this.f12211d) {
            if (!GyroQueueNative.getTransformBetweenTime(this.f12210c, j, f, f2, f3, j2, f4, f5, f6, j3, b)) {
                String str = f12206a;
                StringBuilder stringBuilder = new StringBuilder(102);
                stringBuilder.append("Transformation matrix could not be computed for timestamps ");
                stringBuilder.append(j);
                stringBuilder.append(" - ");
                stringBuilder.append(j2);
                bli.m898e(str, stringBuilder.toString());
            }
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized long mo2261a() {
        return this.f12212e;
    }

    /* renamed from: b */
    private static final float[] m8134b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
