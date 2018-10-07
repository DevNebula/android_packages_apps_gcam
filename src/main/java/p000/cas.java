package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.imageio.JpgHelper;

/* compiled from: PG */
/* renamed from: cas */
final class cas implements Runnable {
    /* renamed from: a */
    private final InterleavedReadViewU8 f1845a;
    /* renamed from: b */
    private final kpw f1846b;
    /* renamed from: c */
    private final int f1847c;
    /* renamed from: d */
    private final ExifMetadata f1848d;
    /* renamed from: e */
    private final int f1849e;
    /* renamed from: f */
    private final /* synthetic */ car f1850f;

    public cas(car car, InterleavedReadViewU8 interleavedReadViewU8, kpw kpw, GoudaRequest goudaRequest, ExifMetadata exifMetadata, int i) {
        this.f1850f = car;
        this.f1845a = interleavedReadViewU8;
        this.f1846b = kpw;
        this.f1847c = goudaRequest.getImage_rotation();
        this.f1848d = exifMetadata;
        this.f1849e = i;
    }

    public final void run() {
        int width = this.f1845a.width();
        int height = this.f1845a.height();
        kbg encodeToJpegAsByteArray = JpgHelper.encodeToJpegAsByteArray(this.f1845a);
        if (encodeToJpegAsByteArray.mo9709b()) {
            int i;
            bli.m888a(car.f22871a, "Gouda image encoded successfully");
            switch (this.f1847c) {
                case 0:
                    i = MediaDecoder.ROTATE_90_LEFT;
                    break;
                case 1:
                    i = MediaDecoder.ROTATE_180;
                    break;
                case 2:
                    i = 90;
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    i = 0;
                    break;
            }
            itg itg = new itg(itg.m4252a((byte[]) encodeToJpegAsByteArray.mo9706a()));
            itg.mo8998a(width, height, iqm.m4095a(i), kau.f21835a);
            long timestamp_unix_us = this.f1848d.getTimestamp_unix_us();
            this.f1846b.mo15641a(foz.m2410a(((long) this.f1849e) + (timestamp_unix_us / 1000), (byte[]) encodeToJpegAsByteArray.mo9706a(), new iqp(width, height), i, itg.f7821a, this.f1850f.f22872b, false));
            return;
        }
        bli.m891b(car.f22871a, "Error encoding gouda image");
        this.f1846b.mo15642a(new RuntimeException("Image couldn't be encoded."));
    }
}
