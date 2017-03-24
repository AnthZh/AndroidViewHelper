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
import android.widget.CheckedTextView;

@SuppressWarnings("unchecked")
public class CheckedTextViewWrapper<W extends CheckedTextViewWrapper<W>> extends TextViewWrapper<W> {
    protected CheckedTextView mView;

    public CheckedTextViewWrapper(CheckedTextView view) {
        super(view);
        mView = view;
    }

    /**
    * @see CheckedTextView#setChecked(boolean)
    */
     public W setChecked(boolean checked) {
         mView.setChecked(checked);
         return (W) this;
     }

    /**
    * @see CheckedTextView#toggle()
    */
     public W toggle() {
         mView.toggle();
         return (W) this;
     }

    /**
    * @see CheckedTextView#setCheckMarkDrawable(Drawable)
    */
     public W setCheckMarkDrawable(Drawable d) {
         mView.setCheckMarkDrawable(d);
         return (W) this;
     }

    /**
    * @see CheckedTextView#setCheckMarkDrawable(int)
    */
     public W setCheckMarkDrawable(int resid) {
         mView.setCheckMarkDrawable(resid);
         return (W) this;
     }

}