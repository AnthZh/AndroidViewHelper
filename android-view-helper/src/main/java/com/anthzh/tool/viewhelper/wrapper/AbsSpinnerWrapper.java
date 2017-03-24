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

import android.widget.AbsSpinner;
import android.widget.SpinnerAdapter;

@SuppressWarnings("unchecked")
public class AbsSpinnerWrapper<W extends AbsSpinnerWrapper<W>> extends AdapterViewWrapper<W> {
    protected AbsSpinner mView;

    public AbsSpinnerWrapper(AbsSpinner view) {
        super(view);
        mView = view;
    }

    /**
    * @see AbsSpinner#setSelection(int, boolean)
    */
     public W setSelection(int position, boolean animate) {
         mView.setSelection(position, animate);
         return (W) this;
     }

    /**
    * @see AbsSpinner#setSelection(int)
    */
     public W setSelection(int position) {
         mView.setSelection(position);
         return (W) this;
     }

    /**
    * @see AbsSpinner#setAdapter(SpinnerAdapter)
    */
     public W setAdapter(SpinnerAdapter adapter) {
         mView.setAdapter(adapter);
         return (W) this;
     }

}