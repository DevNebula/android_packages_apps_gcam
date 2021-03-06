package android.support.p001v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import p000.C0299iv;

/* compiled from: PG */
/* renamed from: android.support.v4.app.ActivityOptionsCompat */
public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.ActivityOptionsCompat$ActivityOptionsCompatImpl */
    class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        public final ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        public Rect getLaunchBounds() {
            return this.mActivityOptions.getLaunchBounds();
        }

        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            this.mActivityOptions.requestUsageTimeReport(pendingIntent);
        }

        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            return new ActivityOptionsCompatImpl(this.mActivityOptions.setLaunchBounds(rect));
        }

        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }
    }

    protected ActivityOptionsCompat() {
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public static ActivityOptionsCompat makeBasic() {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeBasic());
    }

    public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i2) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, C0299iv... c0299ivArr) {
        Pair[] pairArr;
        if (c0299ivArr != null) {
            Pair[] pairArr2 = new Pair[c0299ivArr.length];
            for (int i = 0; i < c0299ivArr.length; i++) {
                C0299iv c0299iv = c0299ivArr[i];
                pairArr2[i] = Pair.create(c0299iv.f7858a, c0299iv.f7859b);
            }
            pairArr = pairArr2;
        } else {
            pairArr = null;
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public ActivityOptionsCompat setLaunchBounds(Rect rect) {
        return this;
    }

    public Bundle toBundle() {
        return null;
    }

    public void update(ActivityOptionsCompat activityOptionsCompat) {
    }
}
