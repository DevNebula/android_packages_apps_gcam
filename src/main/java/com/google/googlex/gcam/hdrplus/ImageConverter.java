package com.google.googlex.gcam.hdrplus;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.Buffer;
import java.util.List;
import p000.iwz;
import p000.ixa;
import p000.jri;
import p000.kau;
import p000.kbg;

/* compiled from: PG */
public class ImageConverter {
    public static final int GCAM_YUV_PIXEL_DISTANCE_UV = 1;
    public static final int GCAM_YUV_PIXEL_STRIDE_U = 2;
    public static final int GCAM_YUV_PIXEL_STRIDE_V = 2;
    public static final int IMAGE_FORMAT_RAW_DEPTH = 4098;
    public static final int PD_DEPTH_POINT_CLOUD_HEIGHT1 = 756;
    public static final int PD_DEPTH_POINT_CLOUD_HEIGHT2 = 758;
    public static final int PD_DEPTH_POINT_CLOUD_ROW_PADDING = 0;
    public static final int PD_DEPTH_POINT_CLOUD_WIDTH = 2016;
    public static final int PD_NUM_CHANNELS = 2;
    public static final int PD_PLANE = 0;
    public static final int PD_PLANE_COUNT = 1;
    public static final int RAW10_PIXEL_STRIDE = 0;
    public static final int RAW12_PIXEL_STRIDE = 0;
    public static final int RAW_PLANE = 0;
    public static final int RAW_PLANE_COUNT = 1;
    public static final int RAW_SENSOR_PIXEL_STRIDE = 2;
    public static final int SIZE_OF_UINT16 = 2;
    public static final String TAG = ImageConverter.class.getSimpleName();
    public static final int YUV_420_888_CHROMA_SUBSAMPLE = 2;
    public static final int YUV_420_888_LUMA_SUBSAMPLE = 1;
    public static final int YUV_420_888_PIXEL_STRIDE_Y = 1;
    public static final int YUV_420_888_PLANE_COUNT = 3;
    public static final int YUV_420_888_PLANE_U = 1;
    public static final int YUV_420_888_PLANE_V = 2;
    public static final int YUV_420_888_PLANE_Y = 0;

    private ImageConverter() {
    }

    public static boolean isCompatiblePdFormat(int i) {
        return i == 257 || i == IMAGE_FORMAT_RAW_DEPTH;
    }

    public static boolean isCompatibleRawFormat(int i) {
        return i == 37 || i == 38 || i == 32;
    }

    private static int validateAndConvertToGcamYuvFormat(iwz iwz) {
        boolean z;
        boolean z2;
        int g = iwz.mo13745g();
        int d = iwz.mo13742d();
        if (g % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "A YUV image must have even width.");
        if (d % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "A YUV image must have even height.");
        if (iwz.mo13741c() == 35) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Format is not YUV_420_888");
        List e = iwz.mo13743e();
        if (e.size() == 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13397a(z, "A YUV image must have %s planes.", 3);
        ixa ixa = (ixa) e.get(0);
        ixa ixa2 = (ixa) e.get(1);
        ixa ixa3 = (ixa) e.get(2);
        long directBufferAddress = BufferUtils.getDirectBufferAddress(ixa.mo9144a());
        long directBufferAddress2 = BufferUtils.getDirectBufferAddress(ixa2.mo9144a());
        long directBufferAddress3 = BufferUtils.getDirectBufferAddress(ixa3.mo9144a());
        if (ixa.mo9145b() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13396a(z2, (Object) "Y plane's pixel stride is not 1");
        if (ixa.mo9146c() >= iwz.mo13745g()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Y plane's row stride smaller than image width");
        if (ixa2.mo9146c() >= iwz.mo13745g()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "U plane's row stride smaller than image width");
        if (ixa2.mo9146c() == ixa3.mo9146c()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "U and V planes have different row strides");
        if (directBufferAddress != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "luma plane address cannot be 0 (NULL).");
        if (directBufferAddress2 != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "chroma U plane address cannot be 0 (NULL).");
        if (directBufferAddress3 != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "chroma V plane address cannot be 0 (NULL).");
        if (ixa2.mo9145b() != 2) {
            z = false;
        } else if (ixa3.mo9145b() != 2) {
            z = false;
        } else if (Math.abs(directBufferAddress2 - directBufferAddress3) == 1) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "UV planes not tightly interleaved");
        if (directBufferAddress2 < directBufferAddress3) {
            return 1;
        }
        return 2;
    }

    public static kbg wrapPdWriteView(iwz iwz) {
        boolean z;
        int i;
        int i2;
        boolean z2 = true;
        int c = iwz.mo13741c();
        List e = iwz.mo13743e();
        if (e.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        int size = e.size();
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Should have a single PD plane, has: ");
        stringBuilder.append(size);
        jri.m13396a(z, stringBuilder.toString());
        z = isCompatiblePdFormat(c);
        StringBuilder stringBuilder2 = new StringBuilder(34);
        stringBuilder2.append("Unsupported PD format: ");
        stringBuilder2.append(c);
        jri.m13396a(z, stringBuilder2.toString());
        Buffer a = ((ixa) e.get(0)).mo9144a();
        int remaining = a.remaining();
        String str;
        StringBuilder stringBuilder3;
        if (c != 257) {
            if (iwz.mo13745g() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13396a(z, (Object) "Image width should be divisible by the number of channels.");
            int b = ((ixa) e.get(0)).mo9145b();
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            jri.m13396a(z, (Object) "Pixel stride should be two bytes.");
            int g = iwz.mo13745g() / 2;
            c = iwz.mo13742d();
            int c2 = ((ixa) e.get(0)).mo9146c();
            b *= g + g;
            if (c2 >= b) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder stringBuilder4 = new StringBuilder(99);
            stringBuilder4.append("The row stride (");
            stringBuilder4.append(c2);
            stringBuilder4.append(" bytes) should be greater than or equal to the width (");
            stringBuilder4.append(b);
            stringBuilder4.append(" bytes)");
            jri.m13396a(z, stringBuilder4.toString());
            i = c2 - b;
            if (remaining != c2 * c) {
                z2 = false;
            }
            StringBuilder stringBuilder5 = new StringBuilder(ScriptIntrinsicBLAS.RsBlas_ctrsm);
            stringBuilder5.append("The buffer capacity (");
            stringBuilder5.append(remaining);
            stringBuilder5.append(") should be equal to the row stride in bytes (");
            stringBuilder5.append(c2);
            stringBuilder5.append(") multiplied by the height (");
            stringBuilder5.append(c);
            stringBuilder5.append(").");
            jri.m13396a(z2, stringBuilder5.toString());
            i2 = g;
        } else if (remaining % 8064 != 0) {
            str = TAG;
            stringBuilder3 = new StringBuilder(96);
            stringBuilder3.append("The row stride in bytes (");
            stringBuilder3.append(8064);
            stringBuilder3.append(") should evenly divide the PD buffer capacity (");
            stringBuilder3.append(remaining);
            stringBuilder3.append(").");
            Log.e(str, stringBuilder3.toString());
            return kau.f21835a;
        } else {
            c = remaining / 8064;
            if (c == PD_DEPTH_POINT_CLOUD_HEIGHT1) {
                i = 0;
                i2 = PD_DEPTH_POINT_CLOUD_WIDTH;
            } else if (c == PD_DEPTH_POINT_CLOUD_HEIGHT2) {
                i = 0;
                i2 = PD_DEPTH_POINT_CLOUD_WIDTH;
            } else {
                str = TAG;
                stringBuilder3 = new StringBuilder(114);
                stringBuilder3.append("The inferred PD data height for DEPTH_POINT_CLOUD formatted Images should be one of 756 or 758, but is ");
                stringBuilder3.append(c);
                Log.e(str, stringBuilder3.toString());
                return kau.f21835a;
            }
        }
        return kbg.m4804c(new InterleavedWriteViewU16(i2, c, 2, BufferUtils.wrapNativePointerWithSwigUnsignedShort(BufferUtils.getDirectBufferAddress(a)), (long) i));
    }

    public static RawWriteView wrapRawWriteView(iwz iwz) {
        boolean z;
        int i;
        int i2 = 2;
        int g = iwz.mo13745g();
        int d = iwz.mo13742d();
        int c = iwz.mo13741c();
        List e = iwz.mo13743e();
        int b = ((ixa) e.get(0)).mo9145b();
        int c2 = ((ixa) e.get(0)).mo9146c();
        jri.m13396a(isCompatibleRawFormat(c), (Object) "Should must be a compatible image format.");
        if (g % 2 != 0) {
            z = false;
        } else if (d % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("Should have even dimensions, but was: ");
        stringBuilder.append(g);
        stringBuilder.append("x");
        stringBuilder.append(d);
        jri.m13396a(z, stringBuilder.toString());
        if (e.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        int size = e.size();
        StringBuilder stringBuilder2 = new StringBuilder(55);
        stringBuilder2.append("Should have a single RAW_SENSOR plane, has: ");
        stringBuilder2.append(size);
        jri.m13396a(z, stringBuilder2.toString());
        if (c == 32) {
            z = true;
        } else if (c == 37) {
            z = true;
        } else if (c != 38) {
            z = false;
        } else {
            z = true;
        }
        stringBuilder = new StringBuilder(35);
        stringBuilder.append("Unsupported raw format: ");
        stringBuilder.append(c);
        jri.m13396a(z, stringBuilder.toString());
        if (c == 32) {
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(47);
            stringBuilder.append("Unexpected RAW_SENSOR pixel stride: ");
            stringBuilder.append(b);
            jri.m13396a(z, stringBuilder.toString());
        } else if (c == 37) {
            if (g % 4 == 0) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(76);
            stringBuilder.append("RAW10 image width should be divisible by 4, but was: ");
            stringBuilder.append(g);
            stringBuilder.append("x");
            stringBuilder.append(d);
            jri.m13396a(z, stringBuilder.toString());
            if (b == 0) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(42);
            stringBuilder.append("Unexpected RAW10 pixel stride: ");
            stringBuilder.append(b);
            jri.m13396a(z, stringBuilder.toString());
            b = (g * 5) / 4;
            if (c2 >= b) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(58);
            stringBuilder.append("RAW10 row stride ");
            stringBuilder.append(c2);
            stringBuilder.append("should be at least ");
            stringBuilder.append(b);
            jri.m13396a(z, stringBuilder.toString());
        } else if (c == 38) {
            if (g % 4 == 0) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(76);
            stringBuilder.append("RAW12 image width should be divisible by 4, but was: ");
            stringBuilder.append(g);
            stringBuilder.append("x");
            stringBuilder.append(d);
            jri.m13396a(z, stringBuilder.toString());
            if (b == 0) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(42);
            stringBuilder.append("Unexpected RAW12 pixel stride: ");
            stringBuilder.append(b);
            jri.m13396a(z, stringBuilder.toString());
            b = (g * 3) / 2;
            if (c2 >= b) {
                z = true;
            } else {
                z = false;
            }
            stringBuilder = new StringBuilder(58);
            stringBuilder.append("RAW12 row stride ");
            stringBuilder.append(c2);
            stringBuilder.append("should be at least ");
            stringBuilder.append(b);
            jri.m13396a(z, stringBuilder.toString());
        }
        SWIGTYPE_p_unsigned_char wrapNativePointerWithSwigUnsignedChar = BufferUtils.wrapNativePointerWithSwigUnsignedChar(BufferUtils.getDirectBufferAddress(((ixa) e.get(0)).mo9144a()));
        if (c == 37) {
            i = c2 - ((g * 5) / 4);
            i2 = 0;
        } else if (iwz.mo13741c() == 38) {
            i = c2 - ((g * 3) / 2);
            i2 = 1;
        } else {
            i = (c2 / 2) - g;
        }
        return new RawWriteView(g, d, (long) i, i2, wrapNativePointerWithSwigUnsignedChar);
    }

    public static YuvWriteView wrapYuvWriteView(iwz iwz) {
        int i;
        int g = iwz.mo13745g();
        int d = iwz.mo13742d();
        int validateAndConvertToGcamYuvFormat = validateAndConvertToGcamYuvFormat(iwz);
        List e = iwz.mo13743e();
        SWIGTYPE_p_unsigned_char wrapNativePointerWithSwigUnsignedChar = BufferUtils.wrapNativePointerWithSwigUnsignedChar(BufferUtils.getDirectBufferAddress(((ixa) e.get(0)).mo9144a()));
        if (validateAndConvertToGcamYuvFormat == 1) {
            i = 1;
        } else {
            i = 2;
        }
        SWIGTYPE_p_unsigned_char wrapNativePointerWithSwigUnsignedChar2 = BufferUtils.wrapNativePointerWithSwigUnsignedChar(BufferUtils.getDirectBufferAddress(((ixa) e.get(i)).mo9144a()));
        return new YuvWriteView(g, d, ((ixa) e.get(0)).mo9146c(), wrapNativePointerWithSwigUnsignedChar, g / 2, d / 2, ((ixa) e.get(i)).mo9146c(), wrapNativePointerWithSwigUnsignedChar2, validateAndConvertToGcamYuvFormat);
    }
}
