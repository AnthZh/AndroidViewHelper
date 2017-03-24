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

import android.widget.GridView;

@SuppressWarnings("unchecked")
public class GridViewWrapper<W extends GridViewWrapper<W>> extends AbsListViewWrapper<W> {
    protected GridView mView;

    public GridViewWrapper(GridView view) {
        super(view);
        mView = view;
    }

    /**
    * @see GridView#smoothScrollByOffset(int)
    */
     public W smoothScrollByOffset(int offset) {
         mView.smoothScrollByOffset(offset);
         return (W) this;
     }

    /**
    * @see GridView#setHorizontalSpacing(int)
    */
     public W setHorizontalSpacing(int horizontalSpacing) {
         mView.setHorizontalSpacing(horizontalSpacing);
         return (W) this;
     }

    /**
    * @see GridView#setVerticalSpacing(int)
    */
     public W setVerticalSpacing(int verticalSpacing) {
         mView.setVerticalSpacing(verticalSpacing);
         return (W) this;
     }

    /**
    * @see GridView#setSelection(int)
    */
     public W setSelection(int position) {
         mView.setSelection(position);
         return (W) this;
     }

    /**
    * @see GridView#setGravity(int)
    */
     public W setGravity(int gravity) {
         mView.setGravity(gravity);
         return (W) this;
     }

    /**
    * @see GridView#setNumColumns(int)
    */
     public W setNumColumns(int numColumns) {
         mView.setNumColumns(numColumns);
         return (W) this;
     }

    /**
    * @see GridView#setStretchMode(int)
    */
     public W setStretchMode(int stretchMode) {
         mView.setStretchMode(stretchMode);
         return (W) this;
     }

    /**
    * @see GridView#setColumnWidth(int)
    */
     public W setColumnWidth(int columnWidth) {
         mView.setColumnWidth(columnWidth);
         return (W) this;
     }

}