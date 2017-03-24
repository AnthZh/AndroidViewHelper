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

import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

@SuppressWarnings("unchecked")
public class RatingBarWrapper<W extends RatingBarWrapper<W>> extends AbsSeekBarWrapper<W> {
    protected RatingBar mView;

    public RatingBarWrapper(RatingBar view) {
        super(view);
        mView = view;
    }

    /**
    * @see RatingBar#setOnRatingBarChangeListener(OnRatingBarChangeListener)
    */
     public W setOnRatingBarChangeListener(OnRatingBarChangeListener listener) {
         mView.setOnRatingBarChangeListener(listener);
         return (W) this;
     }

    /**
    * @see RatingBar#setRating(float)
    */
     public W setRating(float rating) {
         mView.setRating(rating);
         return (W) this;
     }

    /**
    * @see RatingBar#setStepSize(float)
    */
     public W setStepSize(float stepSize) {
         mView.setStepSize(stepSize);
         return (W) this;
     }

    /**
    * @see RatingBar#setNumStars(int)
    */
     public W setNumStars(int numStars) {
         mView.setNumStars(numStars);
         return (W) this;
     }

    /**
    * @see RatingBar#setIsIndicator(boolean)
    */
     public W setIsIndicator(boolean isIndicator) {
         mView.setIsIndicator(isIndicator);
         return (W) this;
     }

}