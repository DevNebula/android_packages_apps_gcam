package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientYuvAllocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.YuvAllocation;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import p000.jri;
import p000.kau;
import p000.kbg;

/* compiled from: PG */
public class UniqueYuvClientAllocator extends ClientYuvAllocator {
    public kbg allocatedImage;
    public final long uniqueAllocationId;

    public UniqueYuvClientAllocator() {
        this(0);
    }

    public UniqueYuvClientAllocator(long j) {
        boolean z;
        this.allocatedImage = kau.f21835a;
        if (j != GcamModule.getKInvalidAllocationId()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.uniqueAllocationId = j;
    }

    public YuvAllocation Allocate(int i, int i2, int i3) {
        jri.m13406b(this.allocatedImage.mo9709b() ^ 1, (Object) "Allocate() should be called at most once.");
        YuvAllocation yuvAllocation = new YuvAllocation();
        YuvWriteView yuvImage = new YuvImage(i, i2, i3);
        this.allocatedImage = kbg.m4804c(yuvImage);
        yuvAllocation.setId(this.uniqueAllocationId);
        yuvAllocation.setView(yuvImage);
        return yuvAllocation;
    }

    public void Release(long j) {
        boolean z;
        if (j == this.uniqueAllocationId) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jri.m13406b(this.allocatedImage.mo9709b(), (Object) "Release() was called before Allocate().");
    }

    public kbg getImage() {
        return this.allocatedImage;
    }
}
