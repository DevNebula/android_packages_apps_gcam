package com.google.android.vision.face;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class ImmediateDetectorFuture implements Future {
    /* renamed from: a */
    private Detector f2667a;

    public ImmediateDetectorFuture(Detector detector) {
        this.f2667a = detector;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public /* synthetic */ Object get() {
        return this.f2667a;
    }

    public /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return this.f2667a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
