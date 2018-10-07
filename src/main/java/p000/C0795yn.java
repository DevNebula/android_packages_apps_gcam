package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera.Area;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: yn */
public final class C0795yn extends abo {
    /* renamed from: a */
    public static final aby f22435a = new aby("AndCam2Set");
    /* renamed from: A */
    private final Rect f22436A;
    /* renamed from: b */
    public final aca f22437b;
    /* renamed from: c */
    public final Rect f22438c;
    /* renamed from: z */
    private final Builder f22439z;

    public C0795yn(CameraDevice cameraDevice, Rect rect, abw abw, abw abw2) {
        if (cameraDevice == null) {
            throw new NullPointerException("camera must not be null");
        } else if (rect == null) {
            throw new NullPointerException("activeArray must not be null");
        } else {
            abb abb;
            boolean z;
            this.f22439z = cameraDevice.createCaptureRequest(1);
            this.f22437b = new aca();
            this.f22436A = rect;
            this.f22438c = new Rect(0, 0, rect.width(), rect.height());
            this.f140f = false;
            Range range = (Range) this.f22439z.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (range != null) {
                mo70a(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue());
            }
            mo73b(abw);
            mo71a(abw2);
            this.f146l = ((Byte) m14830b(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) 0))).byteValue();
            this.f148n = 1.0f;
            Key key = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            Integer valueOf = Integer.valueOf(0);
            this.f149o = ((Integer) m14830b(key, valueOf)).intValue();
            Integer num = (Integer) this.f22439z.get(CaptureRequest.CONTROL_AE_MODE);
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        abb = abb.OFF;
                        break;
                    case 2:
                        abb = abb.AUTO;
                        break;
                    case 3:
                        if (((Integer) this.f22439z.get(CaptureRequest.FLASH_MODE)).intValue() != 2) {
                            abb = abb.ON;
                            break;
                        } else {
                            abb = abb.TORCH;
                            break;
                        }
                    case 4:
                        abb = abb.RED_EYE;
                        break;
                    default:
                        abb = null;
                        break;
                }
            }
            abb = null;
            this.f150p = abb;
            num = (Integer) this.f22439z.get(CaptureRequest.CONTROL_AF_MODE);
            if (num != null) {
                this.f151q = C0794ym.m14826a(num.intValue());
            }
            num = (Integer) this.f22439z.get(CaptureRequest.CONTROL_SCENE_MODE);
            if (num != null) {
                this.f152r = C0794ym.m14827b(num.intValue());
            }
            num = (Integer) this.f22439z.get(CaptureRequest.CONTROL_AWB_MODE);
            if (num != null) {
                this.f153s = C0794ym.m14828c(num.intValue());
            }
            if (((Integer) m14830b(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, valueOf)).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f154t = z;
            key = CaptureRequest.CONTROL_AE_LOCK;
            Boolean valueOf2 = Boolean.valueOf(false);
            this.f155u = ((Boolean) m14830b(key, valueOf2)).booleanValue();
            this.f156v = ((Boolean) m14830b(CaptureRequest.CONTROL_AWB_LOCK, valueOf2)).booleanValue();
            Size size = (Size) this.f22439z.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
            if (size != null) {
                this.f159y = new abw(size.getWidth(), size.getHeight());
            }
        }
    }

    private C0795yn(C0795yn c0795yn) {
        super(c0795yn);
        this.f22439z = c0795yn.f22439z;
        this.f22437b = new aca(c0795yn.f22437b);
        this.f22436A = c0795yn.f22436A;
        this.f22438c = new Rect(c0795yn.f22438c);
    }

    /* renamed from: a */
    public final abo mo67a() {
        return new C0795yn(this);
    }

    /* renamed from: a */
    final MeteringRectangle[] mo14473a(List list) {
        if (list.size() <= 0) {
            return null;
        }
        MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return meteringRectangleArr;
            }
            Area area = (Area) list.get(i2);
            Rect rect = area.rect;
            int i3 = rect.left;
            int i4 = rect.top;
            int i5 = rect.right;
            i = rect.bottom;
            Rect rect2 = this.f22438c;
            i3 = C0795yn.m14829a(((double) rect2.width()) * (((double) (i3 + 1000)) / 2000.0d), this.f22438c.width() - 1) + rect2.left;
            rect2 = this.f22438c;
            i4 = C0795yn.m14829a(((double) rect2.height()) * (((double) (i4 + 1000)) / 2000.0d), this.f22438c.height() - 1) + rect2.top;
            rect2 = this.f22438c;
            int i6 = rect2.left;
            i5 = C0795yn.m14829a(((double) rect2.width()) * (((double) (i5 + 1000)) / 2000.0d), this.f22438c.width() - 1);
            rect2 = this.f22438c;
            meteringRectangleArr[i2] = new MeteringRectangle(i3, i4, (i5 + i6) - i3, (C0795yn.m14829a(((double) rect2.height()) * (((double) (i + 1000)) / 2000.0d), this.f22438c.height() - 1) + rect2.top) - i4, area.weight);
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    private final Object m14830b(Key key, Object obj) {
        Object obj2 = this.f22439z.get(key);
        if (obj2 != null) {
            return obj2;
        }
        this.f22439z.set(key, obj);
        return obj;
    }

    /* renamed from: a */
    public final void mo68a(float f) {
        float height;
        float f2;
        super.mo68a(f);
        this.f22438c.set(0, 0, C0795yn.m14829a((double) (((float) this.f22436A.width()) / this.f148n), this.f22436A.width()), C0795yn.m14829a((double) (((float) this.f22436A.height()) / this.f148n), this.f22436A.height()));
        this.f22438c.offsetTo((this.f22436A.width() - this.f22438c.width()) / 2, (this.f22436A.height() - this.f22438c.height()) / 2);
        Rect rect = this.f22438c;
        abw abw = this.f144j;
        int width = rect.width();
        int height2 = rect.height();
        Point point = abw.f178a;
        float f3 = ((float) point.x) / ((float) point.y);
        if (f3 < ((float) width) / ((float) height2)) {
            height = (float) rect.height();
            f2 = height * f3;
        } else {
            f2 = (float) rect.width();
            height = f2 / f3;
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, f2, height);
        matrix.setTranslate(rect.exactCenterX(), rect.exactCenterY());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.mapRect(rectF);
        rectF.roundOut(new Rect());
    }

    /* renamed from: a */
    private static int m14829a(double d, int i) {
        return (int) Math.min(Math.max(d, 0.0d), (double) i);
    }

    /* renamed from: a */
    final void mo14472a(Key key, Object obj) {
        boolean z;
        aca aca = this.f22437b;
        if (key == CaptureRequest.CONTROL_AE_REGIONS) {
            if (this.f138d.size() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.CONTROL_AF_REGIONS) {
            if (this.f139e.size() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE) {
            Range range = (Range) this.f22439z.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (this.f141g == 0 && this.f142h == 0) {
                z = true;
            } else if (range == null) {
                z = false;
            } else if (this.f141g != ((Integer) range.getLower()).intValue()) {
                z = false;
            } else if (this.f142h == ((Integer) range.getUpper()).intValue()) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.JPEG_QUALITY) {
            z = Objects.equals(Byte.valueOf(this.f146l), this.f22439z.get(CaptureRequest.JPEG_QUALITY));
        } else if (key == CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION) {
            z = Objects.equals(Integer.valueOf(this.f149o), this.f22439z.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        } else if (key == CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE) {
            Integer num = (Integer) this.f22439z.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
            if (num != null && this.f154t && num.intValue() == 1) {
                z = true;
            } else if (this.f154t) {
                z = false;
            } else if (num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.CONTROL_AE_LOCK) {
            z = Objects.equals(Boolean.valueOf(this.f155u), this.f22439z.get(CaptureRequest.CONTROL_AE_LOCK));
        } else if (key == CaptureRequest.CONTROL_AWB_LOCK) {
            z = Objects.equals(Boolean.valueOf(this.f156v), this.f22439z.get(CaptureRequest.CONTROL_AWB_LOCK));
        } else if (key != CaptureRequest.JPEG_THUMBNAIL_SIZE) {
            abx.m91e(f22435a, "Settings implementation checked default of unhandled option key");
            z = true;
        } else if (this.f159y != null) {
            Size size = (Size) this.f22439z.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
            if (this.f159y.f178a.x == 0 && this.f159y.f178a.y == 0) {
                z = true;
            } else if (size == null) {
                z = false;
            } else if (this.f159y.f178a.x != size.getWidth()) {
                z = false;
            } else if (this.f159y.f178a.y == size.getHeight()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            obj = null;
        }
        aca.mo106b(key, obj);
    }
}
