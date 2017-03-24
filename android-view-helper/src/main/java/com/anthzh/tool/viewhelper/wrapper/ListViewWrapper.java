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
import android.view.View;
import android.widget.ListView;

@SuppressWarnings("unchecked")
public class ListViewWrapper<W extends ListViewWrapper<W>> extends AbsListViewWrapper<W> {
    protected ListView mView;

    public ListViewWrapper(ListView view) {
        super(view);
        mView = view;
    }

    /**
    * @see ListView#setSelectionFromTop(int, int)
    */
     public W setSelectionFromTop(int position, int y) {
         mView.setSelectionFromTop(position, y);
         return (W) this;
     }

    /**
    * @see ListView#setHeaderDividersEnabled(boolean)
    */
     public W setHeaderDividersEnabled(boolean headerDividersEnabled) {
         mView.setHeaderDividersEnabled(headerDividersEnabled);
         return (W) this;
     }

    /**
    * @see ListView#smoothScrollByOffset(int)
    */
     public W smoothScrollByOffset(int offset) {
         mView.smoothScrollByOffset(offset);
         return (W) this;
     }

    /**
    * @see ListView#setSelectionAfterHeaderView()
    */
     public W setSelectionAfterHeaderView() {
         mView.setSelectionAfterHeaderView();
         return (W) this;
     }

    /**
    * @see ListView#setOverscrollHeader(Drawable)
    */
     public W setOverscrollHeader(Drawable header) {
         mView.setOverscrollHeader(header);
         return (W) this;
     }

    /**
    * @see ListView#setFooterDividersEnabled(boolean)
    */
     public W setFooterDividersEnabled(boolean footerDividersEnabled) {
         mView.setFooterDividersEnabled(footerDividersEnabled);
         return (W) this;
     }

    /**
    * @see ListView#setOverscrollFooter(Drawable)
    */
     public W setOverscrollFooter(Drawable footer) {
         mView.setOverscrollFooter(footer);
         return (W) this;
     }

    /**
    * @see ListView#addFooterView(View)
    */
     public W addFooterView(View v) {
         mView.addFooterView(v);
         return (W) this;
     }

    /**
    * @see ListView#addFooterView(View, Object, boolean)
    */
     public W addFooterView(View v, Object data, boolean isSelectable) {
         mView.addFooterView(v, data, isSelectable);
         return (W) this;
     }

    /**
    * @see ListView#addHeaderView(View, Object, boolean)
    */
     public W addHeaderView(View v, Object data, boolean isSelectable) {
         mView.addHeaderView(v, data, isSelectable);
         return (W) this;
     }

    /**
    * @see ListView#addHeaderView(View)
    */
     public W addHeaderView(View v) {
         mView.addHeaderView(v);
         return (W) this;
     }

    /**
    * @see ListView#setItemsCanFocus(boolean)
    */
     public W setItemsCanFocus(boolean itemsCanFocus) {
         mView.setItemsCanFocus(itemsCanFocus);
         return (W) this;
     }

    /**
    * @see ListView#setDivider(Drawable)
    */
     public W setDivider(Drawable divider) {
         mView.setDivider(divider);
         return (W) this;
     }

    /**
    * @see ListView#setDividerHeight(int)
    */
     public W setDividerHeight(int height) {
         mView.setDividerHeight(height);
         return (W) this;
     }

    /**
    * @see ListView#setSelection(int)
    */
     public W setSelection(int position) {
         mView.setSelection(position);
         return (W) this;
     }

}