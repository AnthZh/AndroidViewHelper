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

import android.widget.EditText;

@SuppressWarnings("unchecked")
public class EditTextWrapper<W extends EditTextWrapper<W>> extends TextViewWrapper<W> {
    protected EditText mView;

    public EditTextWrapper(EditText view) {
        super(view);
        mView = view;
    }

    /**
     * @see EditText#extendSelection(int)
     */
    public W extendSelection(int arg0) {
        mView.extendSelection(arg0);
        return (W) this;
    }

    /**
     * @see EditText#setSelection(int)
     */
    public W setSelection(int arg0) {
        mView.setSelection(arg0);
        return (W) this;
    }

    /**
     * @see EditText#setSelection(int, int)
     */
    public W setSelection(int arg0, int arg1) {
        mView.setSelection(arg0, arg1);
        return (W) this;
    }

    /**
     * @see EditText#selectAll()
     */
    public W selectAll() {
        mView.selectAll();
        return (W) this;
    }

}