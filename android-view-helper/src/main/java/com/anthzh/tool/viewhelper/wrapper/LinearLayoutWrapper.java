/*
* Copyright (C) 2017 anthzh89@gmail.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.anthzh.tool.viewhelper.wrapper;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;

@SuppressWarnings("unchecked")
public class LinearLayoutWrapper<W extends LinearLayoutWrapper<W>> extends ViewGroupWrapper<W> {
    protected LinearLayout mView;

    public LinearLayoutWrapper(LinearLayout view) {
        super(view);
        mView = view;
    }

    /**
    * @see LinearLayout#setHorizontalGravity(int)
    */
     public W setHorizontalGravity(int horizontalGravity) {
         mView.setHorizontalGravity(horizontalGravity);
         return (W) this;
     }

    /**
    * @see LinearLayout#setDividerDrawable(Drawable)
    */
     public W setDividerDrawable(Drawable divider) {
         mView.setDividerDrawable(divider);
         return (W) this;
     }

    /**
    * @see LinearLayout#setBaselineAligned(boolean)
    */
     public W setBaselineAligned(boolean baselineAligned) {
         mView.setBaselineAligned(baselineAligned);
         return (W) this;
     }

    /**
    * @see LinearLayout#setVerticalGravity(int)
    */
     public W setVerticalGravity(int verticalGravity) {
         mView.setVerticalGravity(verticalGravity);
         return (W) this;
     }

    /**
    * @see LinearLayout#setDividerPadding(int)
    */
     public W setDividerPadding(int padding) {
         mView.setDividerPadding(padding);
         return (W) this;
     }

    /**
    * @see LinearLayout#setBaselineAlignedChildIndex(int)
    */
     public W setBaselineAlignedChildIndex(int i) {
         mView.setBaselineAlignedChildIndex(i);
         return (W) this;
     }

    /**
    * @see LinearLayout#setGravity(int)
    */
     public W setGravity(int gravity) {
         mView.setGravity(gravity);
         return (W) this;
     }

    /**
    * @see LinearLayout#setMeasureWithLargestChildEnabled(boolean)
    */
     public W setMeasureWithLargestChildEnabled(boolean enabled) {
         mView.setMeasureWithLargestChildEnabled(enabled);
         return (W) this;
     }

    /**
    * @see LinearLayout#setWeightSum(float)
    */
     public W setWeightSum(float weightSum) {
         mView.setWeightSum(weightSum);
         return (W) this;
     }

    /**
    * @see LinearLayout#setOrientation(int)
    */
     public W setOrientation(int orientation) {
         mView.setOrientation(orientation);
         return (W) this;
     }

    /**
    * @see LinearLayout#setShowDividers(int)
    */
     public W setShowDividers(int showDividers) {
         mView.setShowDividers(showDividers);
         return (W) this;
     }

}