package p000;

import android.location.Location;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: ios */
public final class ios implements iqo {
    /* renamed from: a */
    public final Object f21139a = new Object();
    /* renamed from: b */
    public ipr f21140b;
    /* renamed from: c */
    public final File f21141c;
    /* renamed from: d */
    public final FileDescriptor f21142d;
    /* renamed from: e */
    public final ioo f21143e;
    /* renamed from: f */
    public final ior f21144f;
    /* renamed from: g */
    public final iow f21145g;
    /* renamed from: h */
    public final int f21146h;
    /* renamed from: i */
    public iop f21147i = null;
    /* renamed from: j */
    public AudioRecord f21148j;
    /* renamed from: k */
    public iov f21149k;
    /* renamed from: l */
    private final kpm f21150l;
    /* renamed from: m */
    private final Location f21151m;
    /* renamed from: n */
    private final ExecutorService f21152n;

    public ios(iot iot) {
        float latitude;
        float longitude;
        Throwable e;
        this.f21150l = iot.f7610a;
        this.f21141c = iot.f7620k;
        this.f21142d = iot.f7621l;
        this.f21146h = iot.f7619j;
        this.f21151m = iot.f7625p;
        this.f21152n = khx.m5000a();
        int i = iot.f7613d.mo8643a().f7509g;
        Location location = this.f21151m;
        if (location != null) {
            latitude = (float) location.getLatitude();
            longitude = (float) this.f21151m.getLongitude();
        } else {
            latitude = 0.0f;
            longitude = 0.0f;
        }
        try {
            int i2;
            String path;
            boolean z;
            boolean z2;
            inp inp = iot.f7613d;
            if (inp == null) {
                i2 = 0;
            } else {
                i2 = inp.mo8648f().f7515b;
            }
            File file = this.f21141c;
            if (file != null) {
                path = file.getPath();
            } else {
                path = null;
            }
            FileDescriptor fileDescriptor = iot.f7621l;
            int i3 = iot.f7619j;
            long j = iot.f7618i;
            long j2 = (long) iot.f7617h;
            if (iot.f7612c != null) {
                z = true;
            } else {
                z = false;
            }
            if (iot.f7613d != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f21143e = new ioo(path, fileDescriptor, i2, i3, latitude, longitude, j, j2, z, z2, iot.f7623n, iot.f7616g, this.f21152n);
            inp inp2 = iot.f7613d;
            if (inp2 != null) {
                this.f21144f = new ior(inp2, iot.f7614e, this.f21143e, kbg.m4803b(iot.f7624o), iot.f7611b);
            } else {
                this.f21144f = null;
            }
            inm inm = iot.f7612c;
            if (inm == null) {
                this.f21145g = null;
            } else {
                int i4;
                inr inr = iot.f7615f;
                String valueOf = String.valueOf(inm);
                String valueOf2 = String.valueOf(inr);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(valueOf2).length());
                stringBuilder.append("profile ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" source ");
                stringBuilder.append(valueOf2);
                Log.v("AudioRecordFactory", stringBuilder.toString());
                if (inm.f7533d == 2) {
                    i4 = 12;
                } else {
                    i4 = 16;
                }
                i3 = AudioRecord.getMinBufferSize(inm.f7532c, i4, 2) * 10;
                valueOf = String.valueOf(inr);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(i3);
                stringBuilder.append("x");
                stringBuilder.append(i4);
                Log.v("AudioRecordFactory", stringBuilder.toString());
                this.f21148j = new AudioRecord(inr.f7547b, inm.f7532c, i4, 2, i3);
                valueOf = String.valueOf(iot.f7612c);
                String valueOf3 = String.valueOf(iot.f7615f);
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf3).length());
                stringBuilder2.append("Create a AudioRecorder object with profile=");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" and source=");
                stringBuilder2.append(valueOf3);
                Log.v("VideoRecorderImpl", stringBuilder2.toString());
                this.f21145g = new iow(iot.f7612c, this.f21148j, this.f21143e, iot.f7611b);
            }
            iov iov = iot.f7626q;
            if (iov != null) {
                this.f21149k = iov;
            }
            this.f21140b = ipr.READY;
            return;
        } catch (iom e2) {
            e = e2;
        } catch (IllegalArgumentException e3) {
            e = e3;
        }
        Log.e("VideoRecorderImpl", "Fail to create muxer processor", e);
        throw e;
    }

    /* renamed from: a */
    public final int mo13689a(float f) {
        int i = -1;
        synchronized (this.f21139a) {
            if (this.f21140b == ipr.CLOSED) {
            } else {
                ior ior = this.f21144f;
                if (ior == null) {
                    Log.w("VideoRecorderImpl", "video encoder is not enabled here, so ignored.");
                } else {
                    i = ior.mo13687a(f);
                }
            }
        }
        return i;
    }

    public final void close() {
        try {
            mo13695e().get();
            return;
        } catch (ExecutionException e) {
        } catch (InterruptedException e2) {
        }
        Log.e("VideoRecorderImpl", "Fail to stop the video recorder at close");
    }

    /* renamed from: a */
    public final kbg mo13690a() {
        kbg c;
        synchronized (this.f21139a) {
            boolean z;
            Object obj;
            if (this.f21140b != ipr.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            jri.m13405b(z);
            ior ior = this.f21144f;
            if (ior != null) {
                obj = ior.f21127c;
            } else {
                obj = null;
            }
            if (obj != null) {
                c = kbg.m4804c(obj);
            } else {
                c = kau.f21835a;
            }
        }
        return c;
    }

    /* renamed from: b */
    public final /* synthetic */ kpk mo13692b() {
        synchronized (this.f21139a) {
            this.f21140b = ipr.STARTED;
        }
        return kow.m13873a(this.f21141c);
    }

    /* renamed from: c */
    public final kpk mo13693c() {
        kpk a;
        synchronized (this.f21139a) {
            if (this.f21140b != ipr.STARTED) {
                String valueOf = String.valueOf(ipr.STARTED);
                String valueOf2 = String.valueOf(this.f21140b);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" is expected but we get ");
                stringBuilder.append(valueOf2);
                Log.e("VideoRecorderImpl", stringBuilder.toString());
                a = kow.m13873a(null);
            } else {
                long uptimeMillis = SystemClock.uptimeMillis() * 1000;
                StringBuilder stringBuilder2 = new StringBuilder(39);
                stringBuilder2.append("pause at timestamp=");
                stringBuilder2.append(uptimeMillis);
                Log.d("VideoRecorderImpl", stringBuilder2.toString());
                ior ior = this.f21144f;
                if (ior != null) {
                    synchronized (ior.f21125a) {
                        if (ior.f21134j != ipk.STARTED) {
                            Log.e("VideoEncoder", "VideoEncoder is not recording now");
                        } else {
                            if (ior.f21127c != null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("drop-input-frames", 1);
                                bundle.putLong("drop-start-time-us", uptimeMillis);
                                ior.f21126b.setParameters(bundle);
                            }
                            ior.f21131g = uptimeMillis;
                            ior.f21134j = ipk.PAUSED;
                        }
                    }
                }
                iow iow = this.f21145g;
                if (iow != null) {
                    synchronized (iow.f21183a) {
                        if (iow.f21196n != ipa.STARTED) {
                            Log.e("AudioEncoder", "It is not recording now");
                        } else {
                            iow.f21196n = ipa.PAUSED;
                            iow.f21189g.add(kge.m13749a(Long.valueOf(uptimeMillis)));
                        }
                    }
                }
                this.f21140b = ipr.PAUSED;
                a = kow.m13873a(null);
            }
        }
        return a;
    }

    /* renamed from: d */
    public final kpk mo13694d() {
        kpk a;
        synchronized (this.f21139a) {
            if (this.f21140b != ipr.PAUSED) {
                String valueOf = String.valueOf(ipr.PAUSED);
                String valueOf2 = String.valueOf(this.f21140b);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" is expected but we get ");
                stringBuilder.append(valueOf2);
                Log.e("VideoRecorderImpl", stringBuilder.toString());
                a = kow.m13873a(null);
            } else {
                long uptimeMillis = 1000 * SystemClock.uptimeMillis();
                StringBuilder stringBuilder2 = new StringBuilder(40);
                stringBuilder2.append("resume at timestamp=");
                stringBuilder2.append(uptimeMillis);
                Log.d("VideoRecorderImpl", stringBuilder2.toString());
                ior ior = this.f21144f;
                if (ior != null) {
                    synchronized (ior.f21125a) {
                        if (ior.f21134j != ipk.PAUSED) {
                            Log.e("VideoEncoder", "It is not recording now");
                        } else {
                            ior.f21130f += ((float) (uptimeMillis - ior.f21131g)) * ior.f21132h;
                            float f = ior.f21130f;
                            StringBuilder stringBuilder3 = new StringBuilder(33);
                            stringBuilder3.append("Total paused time ");
                            stringBuilder3.append(f);
                            Log.d("VideoEncoder", stringBuilder3.toString());
                            if (ior.f21127c != null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("drop-input-frames", 0);
                                bundle.putLong("drop-start-time-us", uptimeMillis);
                                bundle.putLong("time-offset-us", (long) (-ior.f21130f));
                                ior.f21126b.setParameters(bundle);
                            }
                            ior.f21134j = ipk.STARTED;
                        }
                    }
                }
                iow iow = this.f21145g;
                if (iow != null) {
                    synchronized (iow.f21183a) {
                        if (iow.f21196n != ipa.PAUSED) {
                            Log.e("AudioEncoder", "It is not recording now");
                        } else {
                            iow.f21196n = ipa.STARTED;
                            kge kge = (kge) iow.f21189g.removeLast();
                            iow.f21189g.add(kge.m13750a((Long) kge.f21895a.mo9812a(), Long.valueOf(uptimeMillis)));
                            iow.f21192j = (uptimeMillis - ((Long) kge.f21895a.mo9812a()).longValue()) + iow.f21192j;
                            uptimeMillis = iow.f21192j;
                            stringBuilder2 = new StringBuilder(38);
                            stringBuilder2.append("Total paused time ");
                            stringBuilder2.append(uptimeMillis);
                            Log.d("AudioEncoder", stringBuilder2.toString());
                        }
                    }
                }
                this.f21140b = ipr.STARTED;
                a = kow.m13873a(null);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final kpk mo13691a(iop iop) {
        kpk a;
        synchronized (this.f21139a) {
            boolean z;
            if (this.f21140b == ipr.READY) {
                z = true;
            } else {
                z = false;
            }
            jri.m13405b(z);
            this.f21147i = iop;
            ioo ioo = this.f21143e;
            ioo.f21108d.add(this.f21147i);
            SystemClock.elapsedRealtime();
            a = iel.m3774a(this.f21150l.mo10202a(new ipl(this)), this.f21150l.mo10202a(new ipm(this)), new ipn(this), this.f21150l);
        }
        return a;
    }

    /* renamed from: e */
    public final kpk mo13695e() {
        kpk a;
        synchronized (this.f21139a) {
            if (this.f21140b == ipr.STARTED || this.f21140b == ipr.PAUSED) {
                long uptimeMillis = SystemClock.uptimeMillis() * 1000;
                a = iel.m3774a(this.f21150l.mo10202a(new ipo(this, uptimeMillis)), this.f21150l.mo10202a(new ipp(this, uptimeMillis)), new ipq(this), this.f21150l);
            } else {
                String valueOf = String.valueOf(ipr.STARTED);
                String valueOf2 = String.valueOf(ipr.PAUSED);
                String valueOf3 = String.valueOf(this.f21140b);
                StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(" or ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(" is expected but we get ");
                stringBuilder.append(valueOf3);
                Log.e("VideoRecorderImpl", stringBuilder.toString());
                a = kow.m13873a(null);
            }
        }
        return a;
    }
}
