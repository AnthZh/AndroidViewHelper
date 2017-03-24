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

import android.animation.LayoutTransition;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LayoutAnimationController;

@SuppressWarnings("unchecked")
public class ViewGroupWrapper<W extends ViewGroupWrapper<W>> extends ViewWrapper<W> {
    protected ViewGroup mView;

    public ViewGroupWrapper(ViewGroup view) {
        super(view);
        mView = view;
    }

    /**
    * @see ViewGroup#removeViews(int, int)
    */
     public W removeViews(int start, int count) {
         mView.removeViews(start, count);
         return (W) this;
     }

    /**
    * @see ViewGroup#invalidateChild(View, Rect)
    */
     public  W invalidateChild(View child, Rect dirty) {
         mView.invalidateChild(child, dirty);
         return (W) this;
     }

    /**
    * @see ViewGroup#setClipToPadding(boolean)
    */
     public W setClipToPadding(boolean clipToPadding) {
         mView.setClipToPadding(clipToPadding);
         return (W) this;
     }

    /**
    * @see ViewGroup#clearChildFocus(View)
    */
     public W clearChildFocus(View child) {
         mView.clearChildFocus(child);
         return (W) this;
     }

    /**
    * @see ViewGroup#updateViewLayout(View, LayoutParams)
    */
     public W updateViewLayout(View view, LayoutParams params) {
         mView.updateViewLayout(view, params);
         return (W) this;
     }

    /**
    * @see ViewGroup#setClipChildren(boolean)
    */
     public W setClipChildren(boolean clipChildren) {
         mView.setClipChildren(clipChildren);
         return (W) this;
     }

    /**
    * @see ViewGroup#childDrawableStateChanged(View)
    */
     public W childDrawableStateChanged(View child) {
         mView.childDrawableStateChanged(child);
         return (W) this;
     }

    /**
    * @see ViewGroup#endViewTransition(View)
    */
     public W endViewTransition(View view) {
         mView.endViewTransition(view);
         return (W) this;
     }

    /**
    * @see ViewGroup#startViewTransition(View)
    */
     public W startViewTransition(View view) {
         mView.startViewTransition(view);
         return (W) this;
     }

    /**
    * @see ViewGroup#setAddStatesFromChildren(boolean)
    */
     public W setAddStatesFromChildren(boolean addsStates) {
         mView.setAddStatesFromChildren(addsStates);
         return (W) this;
     }

    /**
    * @see ViewGroup#requestTransparentRegion(View)
    */
     public W requestTransparentRegion(View child) {
         mView.requestTransparentRegion(child);
         return (W) this;
     }

    /**
    * @see ViewGroup#setPersistentDrawingCache(int)
    */
     public W setPersistentDrawingCache(int drawingCacheToKeep) {
         mView.setPersistentDrawingCache(drawingCacheToKeep);
         return (W) this;
     }

    /**
    * @see ViewGroup#setLayoutAnimationListener(AnimationListener)
    */
     public W setLayoutAnimationListener(AnimationListener animationListener) {
         mView.setLayoutAnimationListener(animationListener);
         return (W) this;
     }

    /**
    * @see ViewGroup#clearDisappearingChildren()
    */
     public W clearDisappearingChildren() {
         mView.clearDisappearingChildren();
         return (W) this;
     }

    /**
    * @see ViewGroup#bringChildToFront(View)
    */
     public W bringChildToFront(View child) {
         mView.bringChildToFront(child);
         return (W) this;
     }

    /**
    * @see ViewGroup#setDescendantFocusability(int)
    */
     public W setDescendantFocusability(int focusability) {
         mView.setDescendantFocusability(focusability);
         return (W) this;
     }

    /**
    * @see ViewGroup#focusableViewAvailable(View)
    */
     public W focusableViewAvailable(View v) {
         mView.focusableViewAvailable(v);
         return (W) this;
     }

    /**
    * @see ViewGroup#recomputeViewAttributes(View)
    */
     public W recomputeViewAttributes(View child) {
         mView.recomputeViewAttributes(child);
         return (W) this;
     }

    /**
    * @see ViewGroup#requestChildFocus(View, View)
    */
     public W requestChildFocus(View child, View focused) {
         mView.requestChildFocus(child, focused);
         return (W) this;
     }

    /**
    * @see ViewGroup#setAnimationCacheEnabled(boolean)
    */
     public W setAnimationCacheEnabled(boolean enabled) {
         mView.setAnimationCacheEnabled(enabled);
         return (W) this;
     }

    /**
    * @see ViewGroup#setAlwaysDrawnWithCacheEnabled(boolean)
    */
     public W setAlwaysDrawnWithCacheEnabled(boolean always) {
         mView.setAlwaysDrawnWithCacheEnabled(always);
         return (W) this;
     }

    /**
    * @see ViewGroup#setMotionEventSplittingEnabled(boolean)
    */
     public W setMotionEventSplittingEnabled(boolean split) {
         mView.setMotionEventSplittingEnabled(split);
         return (W) this;
     }

    /**
    * @see ViewGroup#removeViewInLayout(View)
    */
     public W removeViewInLayout(View view) {
         mView.removeViewInLayout(view);
         return (W) this;
     }

    /**
    * @see ViewGroup#setLayoutTransition(LayoutTransition)
    */
     public W setLayoutTransition(LayoutTransition transition) {
         mView.setLayoutTransition(transition);
         return (W) this;
     }

    /**
    * @see ViewGroup#removeAllViewsInLayout()
    */
     public W removeAllViewsInLayout() {
         mView.removeAllViewsInLayout();
         return (W) this;
     }

    /**
    * @see ViewGroup#offsetDescendantRectToMyCoords(View, Rect)
    */
     public  W offsetDescendantRectToMyCoords(View descendant, Rect rect) {
         mView.offsetDescendantRectToMyCoords(descendant, rect);
         return (W) this;
     }

    /**
    * @see ViewGroup#setOnHierarchyChangeListener(OnHierarchyChangeListener)
    */
     public W setOnHierarchyChangeListener(OnHierarchyChangeListener listener) {
         mView.setOnHierarchyChangeListener(listener);
         return (W) this;
     }

    /**
    * @see ViewGroup#startLayoutAnimation()
    */
     public W startLayoutAnimation() {
         mView.startLayoutAnimation();
         return (W) this;
     }

    /**
    * @see ViewGroup#scheduleLayoutAnimation()
    */
     public W scheduleLayoutAnimation() {
         mView.scheduleLayoutAnimation();
         return (W) this;
     }

    /**
    * @see ViewGroup#offsetRectIntoDescendantCoords(View, Rect)
    */
     public  W offsetRectIntoDescendantCoords(View descendant, Rect rect) {
         mView.offsetRectIntoDescendantCoords(descendant, rect);
         return (W) this;
     }

    /**
    * @see ViewGroup#setLayoutAnimation(LayoutAnimationController)
    */
     public W setLayoutAnimation(LayoutAnimationController controller) {
         mView.setLayoutAnimation(controller);
         return (W) this;
     }

    /**
    * @see ViewGroup#removeViewsInLayout(int, int)
    */
     public W removeViewsInLayout(int start, int count) {
         mView.removeViewsInLayout(start, count);
         return (W) this;
     }

    /**
    * @see ViewGroup#addView(View)
    */
     public W addView(View child) {
         mView.addView(child);
         return (W) this;
     }

    /**
    * @see ViewGroup#addView(View, LayoutParams)
    */
     public W addView(View child, LayoutParams params) {
         mView.addView(child, params);
         return (W) this;
     }

    /**
    * @see ViewGroup#addView(View, int, int)
    */
     public W addView(View child, int width, int height) {
         mView.addView(child, width, height);
         return (W) this;
     }

    /**
    * @see ViewGroup#addView(View, int)
    */
     public W addView(View child, int index) {
         mView.addView(child, index);
         return (W) this;
     }

    /**
    * @see ViewGroup#addView(View, int, LayoutParams)
    */
     public W addView(View child, int index, LayoutParams params) {
         mView.addView(child, index, params);
         return (W) this;
     }

    /**
    * @see ViewGroup#removeView(View)
    */
     public W removeView(View view) {
         mView.removeView(view);
         return (W) this;
     }

    /**
    * @see ViewGroup#removeAllViews()
    */
     public W removeAllViews() {
         mView.removeAllViews();
         return (W) this;
     }

    /**
    * @see ViewGroup#removeViewAt(int)
    */
     public W removeViewAt(int index) {
         mView.removeViewAt(index);
         return (W) this;
     }

    /**
    * @see ViewGroup#layout(int, int, int, int)
    */
     public  W layout(int l, int t, int r, int b) {
         mView.layout(l, t, r, b);
         return (W) this;
     }

    /**
    * @see ViewGroup#dispatchSetActivated(boolean)
    */
     public W dispatchSetActivated(boolean activated) {
         mView.dispatchSetActivated(activated);
         return (W) this;
     }

    /**
    * @see ViewGroup#dispatchSetSelected(boolean)
    */
     public W dispatchSetSelected(boolean selected) {
         mView.dispatchSetSelected(selected);
         return (W) this;
     }

    /**
    * @see ViewGroup#requestDisallowInterceptTouchEvent(boolean)
    */
     public W requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
         mView.requestDisallowInterceptTouchEvent(disallowIntercept);
         return (W) this;
     }

}