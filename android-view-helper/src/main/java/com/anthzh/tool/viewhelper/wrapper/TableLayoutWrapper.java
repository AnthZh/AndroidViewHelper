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

import android.widget.TableLayout;

@SuppressWarnings("unchecked")
public class TableLayoutWrapper<W extends TableLayoutWrapper<W>> extends LinearLayoutWrapper<W> {
    protected TableLayout mView;

    public TableLayoutWrapper(TableLayout view) {
        super(view);
        mView = view;
    }

    /**
    * @see TableLayout#setColumnCollapsed(int, boolean)
    */
     public W setColumnCollapsed(int columnIndex, boolean isCollapsed) {
         mView.setColumnCollapsed(columnIndex, isCollapsed);
         return (W) this;
     }

    /**
    * @see TableLayout#setShrinkAllColumns(boolean)
    */
     public W setShrinkAllColumns(boolean shrinkAllColumns) {
         mView.setShrinkAllColumns(shrinkAllColumns);
         return (W) this;
     }

    /**
    * @see TableLayout#setColumnStretchable(int, boolean)
    */
     public W setColumnStretchable(int columnIndex, boolean isStretchable) {
         mView.setColumnStretchable(columnIndex, isStretchable);
         return (W) this;
     }

    /**
    * @see TableLayout#setStretchAllColumns(boolean)
    */
     public W setStretchAllColumns(boolean stretchAllColumns) {
         mView.setStretchAllColumns(stretchAllColumns);
         return (W) this;
     }

    /**
    * @see TableLayout#setColumnShrinkable(int, boolean)
    */
     public W setColumnShrinkable(int columnIndex, boolean isShrinkable) {
         mView.setColumnShrinkable(columnIndex, isShrinkable);
         return (W) this;
     }

}