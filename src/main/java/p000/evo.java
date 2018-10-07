package p000;

import android.media.MediaCodec.BufferInfo;
import android.util.Pair;
import com.google.android.libraries.micro.proto.nano.Micro$Data;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: evo */
public final class evo implements exf {
    /* renamed from: a */
    public final ezn f17868a = new ezn();
    /* renamed from: b */
    private final Executor f17869b;
    /* renamed from: c */
    private final bmb f17870c;
    /* renamed from: d */
    private final ccr f17871d;
    /* renamed from: e */
    private final exd f17872e;
    /* renamed from: f */
    private final boolean f17873f;
    /* renamed from: g */
    private final iqp f17874g;

    public evo(ccr ccr, exd exd, Executor executor, boolean z, iqp iqp, bmb bmb) {
        this.f17871d = ccr;
        this.f17869b = executor;
        this.f17870c = bmb;
        this.f17872e = exd;
        this.f17873f = z;
        this.f17874g = iqp;
    }

    /* renamed from: a */
    final /* synthetic */ void mo13192a() {
        while (this.f17868a.mo6691b() > 0) {
            evn evn = (evn) this.f17868a.mo6689a();
            if (evn == null) {
                return;
            }
            if (this.f17871d != null) {
                long j;
                List arrayList;
                int i;
                int i2;
                int i3;
                int i4;
                eto.m2161a();
                ccr ccr;
                List arrayList2;
                if (this.f17873f) {
                    ccr = this.f17871d;
                    j = evn.f4506b;
                    gid gid = (gid) kow.m13881c(evn.f4508d);
                    bwy bwy = ccr.f12172b;
                    if (gid == null || bwy == null) {
                        StringBuilder stringBuilder;
                        if (gid == null) {
                            stringBuilder = new StringBuilder(51);
                            stringBuilder.append("Camera metadata not valid at : ");
                            stringBuilder.append(j);
                            bli.m891b("GyroBasedME", stringBuilder.toString());
                        } else {
                            stringBuilder = new StringBuilder(61);
                            stringBuilder.append("Gyro transform calculator not valid at : ");
                            stringBuilder.append(j);
                            bli.m891b("GyroBasedME", stringBuilder.toString());
                        }
                        arrayList = new ArrayList();
                        bwy = ccr.f12172b;
                        if (bwy == null) {
                            bli.m891b("GyroBasedME", "Gyro transform calculator not valid.");
                        } else {
                            i = bwy.f1698b;
                            for (i2 = 0; i2 < i; i2++) {
                                arrayList.add(jdf.m4476a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
                            }
                        }
                    } else {
                        ccr.mo12448a((gid.f19184a + gid.f19185b) + gid.f19186c);
                        List<jdf> a = bwy.mo2198a(gid);
                        gid.close();
                        arrayList2 = new ArrayList();
                        for (jdf jdf : a) {
                            i3 = ccr.f12173c;
                            if (ccr.f12171a) {
                            }
                            arrayList2.add(jdf);
                        }
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList2 = new ArrayList();
                    i4 = 0;
                    while (true) {
                        ccr = this.f17871d;
                        if (ccr.f12172b == null) {
                            bli.m891b("GyroBasedME", "Error (null pointer) in getting strip count for gyro based motion estimation.");
                            i = 0;
                        } else {
                            i = ccr.f12172b.f1698b;
                        }
                        if (i4 >= i) {
                            break;
                        }
                        arrayList2.add(jdf.m4476a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
                        i4++;
                    }
                    arrayList = arrayList2;
                }
                eto.m2161a();
                eto.m2164d();
                try {
                    Micro$Data micro$Data = new Micro$Data();
                    float[] fArr = new float[(arrayList.size() * 9)];
                    ArrayList arrayList3 = (ArrayList) arrayList;
                    int size = arrayList3.size();
                    i = 0;
                    int i5 = 0;
                    while (true) {
                        if ((i5 >= size ? null : 1) == null) {
                            break;
                        }
                        i3 = i5 + 1;
                        float[] a2 = ((jdf) arrayList3.get(i5)).mo9329a();
                        i2 = 0;
                        while (i2 < 9) {
                            i5 = i + 1;
                            fArr[i] = a2[i2];
                            i2++;
                            i = i5;
                        }
                        i5 = i3;
                    }
                    micro$Data.motionHomographyData = fArr;
                    iqp iqp = evn.f4505a;
                    micro$Data.frameWidth = iqp.f7695a;
                    micro$Data.frameHeight = iqp.f7696b;
                    micro$Data.deviceTimestampUs = TimeUnit.MICROSECONDS.convert(evn.f4506b, TimeUnit.NANOSECONDS);
                    if ((((BufferInfo) kow.m13881c(evn.f4509e)).flags & 1) == 0) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    micro$Data.isKeyFrame = i4;
                    byte[] bArr = new byte[micro$Data.getSerializedSize()];
                    i = bArr.length;
                    micro$Data.writeTo(kvd.m5482a(bArr, 0, i));
                    j = evn.f4507c;
                    int i6 = ((BufferInfo) kow.m13881c(evn.f4509e)).flags;
                    BufferInfo bufferInfo = new BufferInfo();
                    bufferInfo.set(0, i, j, i6);
                    evn.f4510f.mo15641a(Pair.create(ByteBuffer.wrap(bArr), bufferInfo));
                } catch (Throwable e) {
                    bli.m892b("MotionDataProcessorImpl", "Cannot serialize gyro data.", e);
                    evn.f4510f.mo15642a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6668a(gid gid) {
        long convert = TimeUnit.MICROSECONDS.convert(gid.f19184a, TimeUnit.NANOSECONDS);
        if (this.f17868a.mo6691b() > 0) {
            this.f17868a.mo6690a(convert, new evr(gid));
        }
        long j = gid.f19184a;
        for (ezl ezl : this.f17868a.f4613a.mo9157b()) {
            evn evn = ezl.f18071a;
            if (j <= evn.f4506b) {
                break;
            } else if (!evn.f4511g) {
                evn.f4511g = true;
            }
        }
        this.f17869b.execute(new evs(this));
    }

    /* renamed from: a */
    public final kpk mo13191a(long j, long j2) {
        ccr ccr = this.f17871d;
        if (ccr == null || !ccr.mo12450b()) {
            return kow.m13880b();
        }
        ezl ezl = new ezl(new evn(this.f17874g, j, j2));
        ezn ezn = this.f17868a;
        synchronized (ezn.f4613a) {
            ezl ezl2 = ezn.f4614b;
            if (ezl2 == null || !ezl.mo13204a(ezl2)) {
                ezn.f4613a.mo9155a(ezl.f18071a.f4507c, ezl);
            } else {
                ezl.mo13203a();
                ezl.close();
            }
        }
        Object obj = (gid) this.f17872e.f4555a.mo9154a(euh.m2174a(j));
        if (obj != null) {
            ezl.f18071a.f4508d.mo15641a(obj);
        }
        this.f17869b.execute(new evp(this));
        return ezl.f18071a.f4510f;
    }
}
