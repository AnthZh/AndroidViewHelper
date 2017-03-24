# AndroidViewHelper

[English Document](README.md)

提供一种链式调用的方法来调用View的set方法。

## 安装
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
dependencies {
    compile 'com.github.AnthZh:AndroidViewHelper:0.2'
}
```
## 用法
### 例子
```
AndroidViewHelper.listView(activity,R.id.listview)
                .setDivider(divider)
                .setDividerHeight(height)
                .setOnItemClickListener(onItemClickListener)
                .setOnItemSelectedListener(onItemSelectedListener)
                .setEmptyView(emptyView)
                .setAdapter(listAdapter);
```

## 已支持的View
* View
* TextView
* EditText
* Button
* CompoundButton
* ToggleButton
* CheckBox
* RadioButton
* CheckedTextView
* AbsSpinner
* Spinner
* ProgressBar
* AbsSeekBar
* SeekBar
* RatingBar
* Switch
* AdapterView
* AbsListView
* ListView
* GridView
* ExpandableListView
* ScrollView
* HorizontalScrollView
* ViewGroup
* FrameLayout
* LinearLayout
* RelativeLayout
* TableLayout
* RadioGroup

将来会支持更多,或者提交你需要支持的View。

## License

	Copyright (C) 2017 anthzh89@gmail.com

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
