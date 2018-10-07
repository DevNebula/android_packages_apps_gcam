package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.p006io.ByteStreams;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: dap */
public final class dap implements gkr {
    /* renamed from: a */
    private static final String f23726a = bli.m887a("CapIntSession");
    /* renamed from: b */
    private final grg f23727b;
    /* renamed from: c */
    private final gnh f23728c;
    /* renamed from: d */
    private final String f23729d;
    /* renamed from: e */
    private final long f23730e;
    /* renamed from: f */
    private Location f23731f;

    public dap(String str, long j, Location location, gnh gnh, grg grg) {
        this.f23729d = str;
        this.f23730e = j;
        this.f23731f = location;
        this.f23728c = gnh;
        this.f23727b = grg;
    }

    /* renamed from: a */
    public final void mo13369a(glm glm) {
    }

    /* renamed from: a */
    public final void mo13367a(bnl bnl) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo13360a() {
    }

    /* renamed from: b */
    public final void mo13373b() {
    }

    /* renamed from: c */
    public final gob mo13375c() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: d */
    public final synchronized void mo13376d() {
    }

    /* renamed from: a */
    public final void mo13368a(gft gft) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final void mo13377e() {
    }

    /* renamed from: f */
    public final void mo13378f() {
    }

    /* renamed from: a */
    public final void mo7076a(hec hec, boolean z, String str) {
    }

    /* renamed from: g */
    public final void mo13379g() {
    }

    /* renamed from: h */
    public final grg mo7077h() {
        return this.f23727b;
    }

    /* renamed from: i */
    public final synchronized int mo13380i() {
        return 0;
    }

    /* renamed from: j */
    public final synchronized hec mo13381j() {
        return hci.m11977a();
    }

    /* renamed from: k */
    public final glw mo13382k() {
        return glw.NORMAL;
    }

    /* renamed from: l */
    public final long mo13383l() {
        return this.f23730e;
    }

    /* renamed from: m */
    public final goe mo13384m() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: n */
    public final String mo13385n() {
        return this.f23729d;
    }

    /* renamed from: o */
    public final Uri mo13386o() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final kpk mo7074a(InputStream inputStream, glz glz) {
        try {
            int intValue;
            byte[] toByteArray;
            if (glz.f5644c.mo9709b()) {
                intValue = ((Integer) glz.f5644c.mo9706a()).intValue();
            } else {
                bli.m891b(f23726a, "Orientation not set");
                intValue = 0;
            }
            ExifInterface exifInterface = (ExifInterface) glz.f5645d.mo9706a();
            if (exifInterface != null) {
                if (this.f23731f != null) {
                    itg itg = new itg(exifInterface);
                    itg.mo8999a(this.f23731f);
                    exifInterface = itg.f7821a;
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                exifInterface.mo12675b(inputStream, byteArrayOutputStream);
                toByteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } else {
                toByteArray = ByteStreams.toByteArray(inputStream);
            }
            gnh gnh = this.f23728c;
            gnh.f5737b.execute(new gnk(gnh, toByteArray, intValue));
        } catch (Throwable e) {
            bli.m892b(f23726a, "Could not read image bytes.", e);
        }
        return kow.m13873a(kau.f21835a);
    }

    /* renamed from: a */
    public final void mo13361a(int i) {
    }

    /* renamed from: a */
    public final void mo13364a(Location location) {
        this.f23731f = location;
    }

    /* renamed from: b */
    public final synchronized void mo13374b(int i) {
    }

    /* renamed from: a */
    public final void mo7075a(gew gew) {
    }

    /* renamed from: a */
    public final synchronized void mo13370a(hec hec) {
    }

    /* renamed from: a */
    public final synchronized void mo13371a(iqp iqp, glw glw) {
    }

    /* renamed from: a */
    public final void mo13366a(anq anq, hec hec, glw glw) {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final void mo13372a(byte[] bArr, hec hec, glw glw) {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final void mo13363a(Bitmap bitmap, int i) {
    }

    /* renamed from: p */
    public final void mo13387p() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final void mo13362a(Bitmap bitmap) {
        this.f23728c.mo7242a(bitmap);
    }

    /* renamed from: a */
    public final void mo13365a(anq anq) {
        this.f23728c.mo7242a(hid.m3223a(anq.mo262b()));
    }
}
