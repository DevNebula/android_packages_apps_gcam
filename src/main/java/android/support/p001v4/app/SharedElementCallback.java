package android.support.p001v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: android.support.v4.app.SharedElementCallback */
public class SharedElementCallback {
    public static final String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    public static final String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    public static final String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    public static final int MAX_IMAGE_SIZE = 1048576;
    public Matrix mTempMatrix;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.SharedElementCallback$OnSharedElementsReadyListener */
    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    private static Bitmap createDrawableBitmap(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        intrinsicHeight = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, intrinsicHeight, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawable.setBounds(0, 0, i, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                Parcelable createDrawableBitmap = SharedElementCallback.createDrawableBitmap(drawable);
                if (createDrawableBitmap != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(BUNDLE_SNAPSHOT_BITMAP, createDrawableBitmap);
                    bundle.putString(BUNDLE_SNAPSHOT_IMAGE_SCALETYPE, imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray(BUNDLE_SNAPSHOT_IMAGE_MATRIX, fArr);
                    }
                    return bundle;
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0) {
            return null;
        }
        if (round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        round = (int) (((float) round) * min);
        round2 = (int) (((float) round2) * min);
        if (this.mTempMatrix == null) {
            this.mTempMatrix = new Matrix();
        }
        this.mTempMatrix.set(matrix);
        this.mTempMatrix.postTranslate(-rectF.left, -rectF.top);
        this.mTempMatrix.postScale(min, min);
        Parcelable createBitmap = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.mTempMatrix);
        view.draw(canvas);
        return createBitmap;
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        View view;
        View imageView;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(BUNDLE_SNAPSHOT_BITMAP);
            if (bitmap == null) {
                return null;
            }
            imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ScaleType.valueOf(bundle.getString(BUNDLE_SNAPSHOT_IMAGE_SCALETYPE)));
            if (imageView.getScaleType() != ScaleType.MATRIX) {
                view = imageView;
            } else {
                float[] floatArray = bundle.getFloatArray(BUNDLE_SNAPSHOT_IMAGE_MATRIX);
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
                return imageView;
            }
        } else if (parcelable instanceof Bitmap) {
            Bitmap bitmap2 = (Bitmap) parcelable;
            imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap2);
            return imageView;
        } else {
            view = null;
        }
        return view;
    }

    public void onMapSharedElements(List list, Map map) {
    }

    public void onRejectSharedElements(List list) {
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
    }

    public void onSharedElementStart(List list, List list2, List list3) {
    }

    public void onSharedElementsArrived(List list, List list2, OnSharedElementsReadyListener onSharedElementsReadyListener) {
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}