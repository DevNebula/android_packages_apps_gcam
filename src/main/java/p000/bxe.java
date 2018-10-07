package p000;

import android.os.Build;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.SWIGTYPE_p_p_unsigned_char;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: bxe */
public final class bxe {
    /* renamed from: a */
    private static final String f1713a = bli.m887a("GcamUtils");

    /* renamed from: a */
    public static iqp m1059a(iqp iqp, float f) {
        int i = iqp.f7695a;
        int i2 = iqp.f7696b;
        if (i > i2) {
            i2 = Math.round(((float) i) / 6.0f);
            i = Math.round((((float) i2) / f) * 1.05f);
        } else {
            i = Math.round(((float) i2) / 6.0f);
            i2 = Math.round((((float) i) * f) * 1.05f);
        }
        return new iqp((i2 + 1) & -2, (i + 1) & -2);
    }

    /* renamed from: a */
    public static DebugParams m1058a(fgw fgw, boolean z) {
        DebugParams debugParams = new DebugParams();
        long gcam_save_none = GcamModule.getGCAM_SAVE_NONE();
        if (fgw.mo6781a()) {
            gcam_save_none |= GcamModule.getGCAM_SAVE_INPUT_METERING();
        }
        if (fgw.mo6784b()) {
            gcam_save_none |= GcamModule.getGCAM_SAVE_INPUT_PAYLOAD();
        }
        if (fgw.mo6785c()) {
            gcam_save_none |= GcamModule.getGCAM_SAVE_TEXT();
        }
        debugParams.setSave_bitmask((long) ((int) gcam_save_none));
        return debugParams;
    }

    /* renamed from: a */
    public static ExifInterface m1057a(int i, int i2, ExifMetadata exifMetadata) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        GcamModule.EncodeGcamExif(i, i2, exifMetadata, new_uint8_p_p, jArr);
        int i3 = (int) jArr[0];
        SWIGTYPE_p_unsigned_char uint8_p_p_value = GcamModule.uint8_p_p_value(new_uint8_p_p);
        ByteBuffer byteBufferViewOfNativePointer = BufferUtils.byteBufferViewOfNativePointer(uint8_p_p_value, i3);
        byte[] bArr = new byte[(i3 + 4)];
        int i4 = i3 + 2;
        bArr[0] = (byte) -1;
        bArr[1] = (byte) -31;
        bArr[2] = (byte) (i4 >> 8);
        bArr[3] = (byte) i4;
        byteBufferViewOfNativePointer.get(bArr, 4, i3);
        GcamModule.delete_uint8_p(uint8_p_p_value);
        GcamModule.delete_uint8_p_p(new_uint8_p_p);
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.mo12673a(bArr);
        } catch (IOException e) {
            String str = f1713a;
            String valueOf = String.valueOf(e.getMessage());
            String str2 = "Unable to parse EXIF: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        }
        if (exifMetadata.getIcc_profile() == 1 || exifMetadata.getIcc_profile() == 0 || exifMetadata.getIcc_profile() == 3) {
            exifInterface.f13037N = 1;
        } else {
            exifInterface.f13037N = 2;
        }
        return exifInterface;
    }

    /* renamed from: a */
    public static ive m1060a(ffc ffc) {
        List b = ffc.mo9063b(37);
        List b2 = ffc.mo9063b(38);
        List b3 = ffc.mo9063b(32);
        if (!b.isEmpty()) {
            return new ive(37, ion.m3998a(b));
        }
        if (!b2.isEmpty()) {
            return new ive(38, ion.m3998a(b2));
        }
        if (!b3.isEmpty()) {
            return new ive(32, ion.m3998a(b3));
        }
        throw new IllegalStateException("No HDR+ compatible raw format supported.");
    }

    /* renamed from: a */
    public static int m1055a(int i) {
        switch (i) {
            case 0:
                return 3;
            case 90:
                return 0;
            case MediaDecoder.ROTATE_180 /*180*/:
                return 1;
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return 2;
            default:
                StringBuilder stringBuilder = new StringBuilder(36);
                stringBuilder.append("Invalid device rotation: ");
                stringBuilder.append(i);
                throw new AssertionError(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static int m1056a(fgw fgw, bkw bkw) {
        int kDebugFullMeteringSweepFrameCount;
        if (fgw.mo6781a()) {
            kDebugFullMeteringSweepFrameCount = GcamModule.getKDebugFullMeteringSweepFrameCount();
        } else {
            kDebugFullMeteringSweepFrameCount = GcamModule.getKDefaultFullMeteringSweepFrameCount();
        }
        return Math.min(kDebugFullMeteringSweepFrameCount, bkw.mo2001d());
    }

    /* renamed from: a */
    public static String m1062a(File file, String str, long j) {
        jri.m13404b((Object) file);
        if (file.exists() && file.isDirectory()) {
            File file2 = new File(new File(file, str), bxe.m1061a(j));
            if (file2.mkdirs()) {
                return file2.getAbsolutePath();
            }
            throw new RuntimeException("Could not create Gcam debug data folder.");
        }
        String valueOf = String.valueOf(file.getAbsolutePath());
        String str2 = "Gcam debug directory not valid or doesn't exist: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        throw new RuntimeException(valueOf);
    }

    /* renamed from: a */
    public static String m1061a(long j) {
        String serial;
        try {
            serial = Build.getSerial();
        } catch (Throwable e) {
            bli.m889a(f1713a, "Don't have permissions to getSerial()", e);
            serial = null;
        }
        String str = "XXXX";
        if (serial != null) {
            int length = serial.length();
            if (length > 4) {
                serial = serial.substring(length - 4, length);
            }
        } else {
            serial = str;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        str = simpleDateFormat.format(Long.valueOf(j));
        return String.format("%s_%s", new Object[]{serial, str});
    }
}
