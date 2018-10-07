package com.google.android.apps.refocus.processing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p003v8.renderscript.Allocation;
import android.support.p003v8.renderscript.FieldPacker;
import android.support.p003v8.renderscript.RSRuntimeException;
import android.support.p003v8.renderscript.RenderScript;
import android.support.p003v8.renderscript.Script.LaunchOptions;
import com.google.android.apps.refocus.image.DepthTransform;
import java.util.ArrayList;
import p000.bli;
import p000.hrz;
import p000.hsa;
import p000.hsb;
import p000.hsc;
import p000.hsd;
import p000.hse;
import p000.hsf;
import p000.hsg;

/* compiled from: PG */
public class Renderer {
    public static final String TAG = bli.m887a("Renderer");
    public final Context context;
    public final Priority priority;

    /* compiled from: PG */
    public enum Priority {
        NORMAL,
        LOW
    }

    public Renderer(Context context, Priority priority) {
        this.context = context;
        this.priority = priority;
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions) {
        return render(depthOfFieldOptions, null, null);
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions, ProgressCallback progressCallback) {
        return render(depthOfFieldOptions, progressCallback, null);
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions, ProgressCallback progressCallback, Bitmap bitmap) {
        RenderScript a = hse.m3391a(this.context);
        int i;
        int i2;
        long currentTimeMillis;
        if (a != null) {
            int i3;
            if (this.priority == Priority.LOW) {
                a.setPriority(android.support.p003v8.renderscript.RenderScript.Priority.LOW);
            } else {
                a.setPriority(android.support.p003v8.renderscript.RenderScript.Priority.NORMAL);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            hsf hsf = new hsf(a);
            long currentTimeMillis3 = System.currentTimeMillis();
            DepthTransform depthTransform = depthOfFieldOptions.rgbz.getDepthTransform();
            float f = depthOfFieldOptions.focalDepth;
            float f2 = depthOfFieldOptions.depthOfField;
            float f3 = depthOfFieldOptions.blurInfinity;
            hrz hrz = new hrz();
            if (f2 < 0.0f) {
                f2 = -f2;
                bli.m891b(hrz.f6900a, "Negative depth of field");
            }
            int c = hrz.m3379c(depthTransform.quantize((1.0f - f2) * f));
            int c2 = hrz.m3379c(depthTransform.quantize((f2 + 1.0f) * f));
            hrz.f6901b = new float[64];
            float reconstruct = depthTransform.reconstruct(hrz.m3380d(c));
            float reconstruct2 = depthTransform.reconstruct(hrz.m3380d(c2));
            int i4 = 1;
            while (true) {
                i3 = i4;
                if (i3 > 64) {
                    break;
                }
                f2 = depthTransform.reconstruct(hrz.m3380d(i3));
                if (f2 < reconstruct) {
                    f2 = ((reconstruct - f2) * f3) / f2;
                } else if (f2 > reconstruct2) {
                    f2 = ((f2 - reconstruct2) * f3) / f2;
                } else {
                    f2 = 0.0f;
                }
                hrz.f6901b[i3 - 1] = Math.min(f2, 25.0f);
                i4 = i3 + 1;
            }
            f3 = Math.max((hrz.mo8077a(1) + hrz.mo8077a(64)) / 8.0f, 2.0f);
            ArrayList arrayList = new ArrayList(hrz.f6901b.length);
            if (c2 != 1) {
                i3 = c2 - 1;
                arrayList.add(new hsc(i3));
                i4 = i3;
                f = hrz.mo8077a(i3) + f3;
                while (i4 > 1) {
                    i = i4 - 1;
                    if (hrz.mo8077a(i) <= f) {
                        ((hsc) arrayList.get(arrayList.size() - 1)).f6926b = i;
                        i4 = i;
                    } else {
                        arrayList.add(new hsc(i));
                        f = hrz.mo8077a(i) + f3;
                        i4 = i;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hrz.f6901b.length);
            if (c != 64) {
                i3 = c + 1;
                arrayList2.add(new hsc(i3));
                i4 = i3;
                f = hrz.mo8077a(i3) + f3;
                while (i4 < 64) {
                    i = i4 + 1;
                    if (hrz.mo8077a(i) <= f) {
                        ((hsc) arrayList2.get(arrayList2.size() - 1)).f6925a = i;
                        i4 = i;
                    } else {
                        arrayList2.add(new hsc(i));
                        f = hrz.mo8077a(i) + f3;
                        i4 = i;
                    }
                }
            }
            i = (arrayList2.size() + 1) + arrayList.size();
            hrz.f6902c = new hsc[i];
            hrz.f6903d = arrayList2.size();
            for (i3 = 0; i3 < i; i3++) {
                if (i3 < arrayList2.size()) {
                    hrz.f6902c[i3] = (hsc) arrayList2.get((arrayList2.size() - 1) - i3);
                } else if (i3 == arrayList2.size()) {
                    hrz.f6902c[i3] = new hsc(c, c2);
                } else {
                    hrz.f6902c[i3] = (hsc) arrayList.get(i3 - (arrayList2.size() + 1));
                }
            }
            hsf.f6938b = hrz;
            hsf.f6939c = depthOfFieldOptions.rgbz.getBitmap();
            hsd hsd = new hsd(hsf.f6940d, (byte) 0);
            Bitmap bitmap2 = hsf.f6939c;
            hrz hrz2 = hsf.f6938b;
            hsc hsc = hrz2.f6902c[hrz2.f6903d];
            hsd.f6929c = new hsg(hsd.f6928b);
            hsd.f6931e = new hsa(bitmap2, hsb.f6922a + 1, hsd.f6928b, (hsg) hsd.f6929c);
            hsa hsa = hsd.f6931e;
            hsg hsg = (hsg) hsd.f6929c;
            i2 = hsa.f6916e;
            int i5 = hsa.f6917f;
            int i6 = hsa.f6918g;
            c = hsc.f6925a;
            i = hsc.f6926b;
            FieldPacker fieldPacker = new FieldPacker(20);
            fieldPacker.addI32(i2);
            fieldPacker.addI32(i5);
            fieldPacker.addI32(i6);
            fieldPacker.addI32(c);
            fieldPacker.addI32(i);
            hsg.invoke(3, fieldPacker);
            Allocation allocation = hsa.f6914c;
            if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                Object obj;
                hsc hsc2;
                LaunchOptions launchOptions;
                Bitmap bitmap3;
                hsg.forEach(1, allocation, null, null, null);
                i4 = hrz2.f6902c.length - 1;
                while (true) {
                    c = i4;
                    if (c >= hrz2.f6903d) {
                        if (progressCallback != null && progressCallback.wasCancelled()) {
                            obj = null;
                            break;
                        }
                        hsc2 = hrz2.f6902c[c];
                        hsd.mo8084a(hsc2);
                        hsd.mo8083a(hsd.m3387a(hsc2.f6926b, hrz2));
                        hsd.mo8085b(c, hrz2);
                        hsg = (hsg) hsd.f6929c;
                        allocation = hsd.f6931e.f6914c;
                        if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                            hsg.forEach(2, allocation, null, null, null);
                            hsg = (hsg) hsd.f6929c;
                            allocation = hsd.f6931e.f6914c;
                            if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                hsg.forEach(3, allocation, null, null, null);
                                if (hsd.f6930d) {
                                    ((hsg) hsd.f6929c).mo15549a(1);
                                    launchOptions = new LaunchOptions();
                                    launchOptions.setX(0, 1);
                                    launchOptions.setY(0, hsd.f6931e.f6912a.getHeight());
                                    hsg = (hsg) hsd.f6929c;
                                    allocation = hsd.f6931e.f6914c;
                                    if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                        hsg.forEach(5, allocation, null, null, launchOptions);
                                    } else {
                                        throw new RSRuntimeException("Type mismatch with U8_4!");
                                    }
                                }
                                ((hsg) hsd.f6929c).mo15549a(0);
                                hsg = (hsg) hsd.f6929c;
                                allocation = hsd.f6931e.f6914c;
                                if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                    hsg.forEach(7, allocation, null, null, null);
                                    hsg = (hsg) hsd.f6929c;
                                    allocation = hsd.f6931e.f6914c;
                                    if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                        hsg.forEach(9, allocation, null, null, null);
                                        if (progressCallback != null) {
                                            i4 = hrz2.f6902c.length;
                                            progressCallback.setProgress(((float) (i4 - c)) / ((float) i4));
                                        }
                                        i4 = c - 1;
                                    } else {
                                        throw new RSRuntimeException("Type mismatch with U8_4!");
                                    }
                                }
                                throw new RSRuntimeException("Type mismatch with U8_4!");
                            }
                            throw new RSRuntimeException("Type mismatch with U8_4!");
                        }
                        throw new RSRuntimeException("Type mismatch with U8_4!");
                    }
                    obj = 1;
                    break;
                }
                if (obj == null) {
                    bitmap3 = null;
                } else {
                    i4 = 0;
                    while (true) {
                        c = i4;
                        if (c < hrz2.f6903d) {
                            if (progressCallback != null && progressCallback.wasCancelled()) {
                                obj = null;
                                break;
                            }
                            hsc2 = hrz2.f6902c[c];
                            hsd.mo8084a(hsc2);
                            hsd.mo8083a(hsd.m3387a(hsc2.f6925a, hrz2));
                            hsd.mo8085b(c, hrz2);
                            hsg = (hsg) hsd.f6929c;
                            allocation = hsd.f6931e.f6914c;
                            if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                hsg.forEach(2, allocation, null, null, null);
                                hsg = (hsg) hsd.f6929c;
                                allocation = hsd.f6931e.f6914c;
                                if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                    hsg.forEach(4, allocation, null, null, null);
                                    if (hsd.f6930d) {
                                        ((hsg) hsd.f6929c).mo15549a(1);
                                        launchOptions = new LaunchOptions();
                                        launchOptions.setX(0, 1);
                                        launchOptions.setY(0, hsd.f6931e.f6912a.getHeight());
                                        hsg = (hsg) hsd.f6929c;
                                        allocation = hsd.f6931e.f6914c;
                                        if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                            hsg.forEach(6, allocation, null, null, launchOptions);
                                        } else {
                                            throw new RSRuntimeException("Type mismatch with U8_4!");
                                        }
                                    }
                                    ((hsg) hsd.f6929c).mo15549a(0);
                                    hsg = (hsg) hsd.f6929c;
                                    allocation = hsd.f6931e.f6914c;
                                    if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                                        hsg.forEach(8, allocation, null, null, null);
                                        if (progressCallback != null) {
                                            i4 = hrz2.f6902c.length;
                                            progressCallback.setProgress(((float) (((i4 - hrz2.f6903d) + 1) + c)) / ((float) i4));
                                        }
                                        i4 = c + 1;
                                    } else {
                                        throw new RSRuntimeException("Type mismatch with U8_4!");
                                    }
                                }
                                throw new RSRuntimeException("Type mismatch with U8_4!");
                            }
                            throw new RSRuntimeException("Type mismatch with U8_4!");
                        }
                        hsg = (hsg) hsd.f6929c;
                        allocation = hsd.f6931e.f6914c;
                        if (allocation.getType().getElement().isCompatible(hsg.f26500a)) {
                            hsg.forEach(10, allocation, null, null, null);
                            obj = 1;
                        } else {
                            throw new RSRuntimeException("Type mismatch with U8_4!");
                        }
                    }
                    if (obj != null) {
                        hsg = (hsg) hsd.f6929c;
                        Allocation allocation2 = hsd.f6931e.f6915d;
                        if (allocation2.getType().getElement().isCompatible(hsg.f26500a)) {
                            hsg.forEach(11, null, allocation2, null, null);
                            hsa hsa2 = hsd.f6931e;
                            hsa2.f6915d.copyTo(hsa2.f6913b);
                            bitmap3 = hsd.f6931e.f6913b;
                            hsd.f6928b.finish();
                            bli.m888a(hsd.f6927a, "filterAndBlendAllLayersUsingKernel is finished");
                        } else {
                            throw new RSRuntimeException("Type mismatch with U8_4!");
                        }
                    }
                    bitmap3 = null;
                }
                currentTimeMillis = System.currentTimeMillis();
                String str = hsf.f6937a;
                StringBuilder stringBuilder = new StringBuilder(57);
                stringBuilder.append("applyRefocusFilter is finished in ");
                stringBuilder.append(((float) (currentTimeMillis - currentTimeMillis3)) / 1000.0f);
                stringBuilder.append(" seconds");
                bli.m888a(str, stringBuilder.toString());
                currentTimeMillis = System.currentTimeMillis();
                str = TAG;
                stringBuilder = new StringBuilder(55);
                stringBuilder.append("using RenderScript, finishes in ");
                stringBuilder.append(((float) (currentTimeMillis - currentTimeMillis2)) / 1000.0f);
                stringBuilder.append(" seconds");
                bli.m888a(str, stringBuilder.toString());
                hse.f6932a.unlock();
                return bitmap3;
            }
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        i = depthOfFieldOptions.rgbz.getWidth();
        i2 = depthOfFieldOptions.rgbz.getHeight();
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        if (!ProcessingNative.DepthOfField(depthOfFieldOptions, progressCallback, bitmap)) {
            return null;
        }
        currentTimeMillis = System.currentTimeMillis();
        String str2 = TAG;
        StringBuilder stringBuilder2 = new StringBuilder(49);
        stringBuilder2.append("using Native, finishes in ");
        stringBuilder2.append(((float) (currentTimeMillis - currentTimeMillis4)) / 1000.0f);
        stringBuilder2.append(" seconds");
        bli.m888a(str2, stringBuilder2.toString());
        return bitmap;
    }
}
