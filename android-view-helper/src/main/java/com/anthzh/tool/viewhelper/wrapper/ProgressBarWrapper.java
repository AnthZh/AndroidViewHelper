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

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

@SuppressWarnings("unchecked")
public class ProgressBarWrapper<W extends ProgressBarWrapper<W>> extends ViewWrapper<W> {
    protected ProgressBar mView;

    public ProgressBarWrapper(ProgressBar view) {
        super(view);
        mView = view;
    }

    /**
    * @see ProgressBar#setProgress(int)
    */
     public synchronized W setProgress(int progress) {
         mView.setProgress(progress);
         return (W) this;
     }

    /**
    * @see ProgressBar#setIndeterminate(boolean)
    */
     public synchronized W setIndeterminate(boolean indeterminate) {
         mView.setIndeterminate(indeterminate);
         return (W) this;
     }

    /**
    * @see ProgressBar#setInterpolator(Interpolator)
    */
     public W setInterpolator(Interpolator interpolator) {
         mView.setInterpolator(interpolator);
         return (W) this;
     }

    /**
    * @see ProgressBar#setInterpolator(Context, int)
    */
     public W setInterpolator(Context context, int resID) {
         mView.setInterpolator(context, resID);
         return (W) this;
     }

    /**
    * @see ProgressBar#setMax(int)
    */
     public synchronized W setMax(int max) {
         mView.setMax(max);
         return (W) this;
     }

    /**
    * @see ProgressBar#incrementSecondaryProgressBy(int)
    */
     public  synchronized W incrementSecondaryProgressBy(int diff) {
         mView.incrementSecondaryProgressBy(diff);
         return (W) this;
     }

    /**
    * @see ProgressBar#setProgressDrawable(Drawable)
    */
     public W setProgressDrawable(Drawable d) {
         mView.setProgressDrawable(d);
         return (W) this;
     }

    /**
    * @see ProgressBar#setIndeterminateDrawable(Drawable)
    */
     public W setIndeterminateDrawable(Drawable d) {
         mView.setIndeterminateDrawable(d);
         return (W) this;
     }

    /**
    * @see ProgressBar#setSecondaryProgress(int)
    */
     public synchronized W setSecondaryProgress(int secondaryProgress) {
         mView.setSecondaryProgress(secondaryProgress);
         return (W) this;
     }

    /**
    * @see ProgressBar#incrementProgressBy(int)
    */
     public  synchronized W incrementProgressBy(int diff) {
         mView.incrementProgressBy(diff);
         return (W) this;
     }

}