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
import android.widget.FrameLayout;

@SuppressWarnings("unchecked")
public class FrameLayoutWrapper<W extends FrameLayoutWrapper<W>> extends ViewGroupWrapper<W> {
    protected FrameLayout mView;

    public FrameLayoutWrapper(FrameLayout view) {
        super(view);
        mView = view;
    }

    /**
    * @see FrameLayout#setMeasureAllChildren(boolean)
    */
     public W setMeasureAllChildren(boolean measureAll) {
         mView.setMeasureAllChildren(measureAll);
         return (W) this;
     }

    /**
    * @see FrameLayout#setForegroundGravity(int)
    */
     public W setForegroundGravity(int foregroundGravity) {
         mView.setForegroundGravity(foregroundGravity);
         return (W) this;
     }

    /**
    * @see FrameLayout#setForeground(Drawable)
    */
     public W setForeground(Drawable drawable) {
         mView.setForeground(drawable);
         return (W) this;
     }

}